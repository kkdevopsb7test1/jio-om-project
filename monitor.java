api Version:V1
kind: Pod
metadata:
  name: my-pod
  label:
  app:nginx
spec:
  containers:
  - name: nginx container
    image: nginx
    ports:
    - containerPort: 8080
         
