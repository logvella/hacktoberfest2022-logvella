class Solution {
    StringBuilder sb = new StringBuilder();
    public String pushDominoes(String dominoes) {
    int count = 0; char last = 'L';
    for(char ch : dominoes.toCharArray()){
        if(ch!='.'){
			if(ch==last) 
                add(count, last);
			else if(last=='L') 
                add(count, '.');
			else {
				add(count/2, 'R');
				if(count%2!=0) 
                    sb.append('.');
				add(count/2, 'L');
			}
			sb.append(ch);
			last = ch; count = 0;
		}
		else count++;
    }
    add(count, last=='R'?'R':'.');
    return sb.toString();
}

void add(int count, char ch){
    for(int i=0; i<count; i++) sb.append(ch);
}
}
