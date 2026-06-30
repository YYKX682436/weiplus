package t36;

/* loaded from: classes13.dex */
public class h implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f415450a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f415451b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f415452c;

    public h(java.util.List list) {
        this.f415450a = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        java.lang.Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = m36.e.f323387b;
        }
        if (name.equals("supports") && java.lang.Boolean.TYPE == returnType) {
            return java.lang.Boolean.TRUE;
        }
        if (name.equals("unsupported") && java.lang.Void.TYPE == returnType) {
            this.f415451b = true;
            return null;
        }
        boolean equals = name.equals("protocols");
        java.util.List list = this.f415450a;
        if (equals && objArr.length == 0) {
            return list;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && java.lang.String.class == returnType && objArr.length == 1) {
            java.lang.Object obj2 = objArr[0];
            if (obj2 instanceof java.util.List) {
                java.util.List list2 = (java.util.List) obj2;
                int size = list2.size();
                for (int i17 = 0; i17 < size; i17++) {
                    if (list.contains(list2.get(i17))) {
                        java.lang.String str = (java.lang.String) list2.get(i17);
                        this.f415452c = str;
                        return str;
                    }
                }
                java.lang.String str2 = (java.lang.String) list.get(0);
                this.f415452c = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f415452c = (java.lang.String) objArr[0];
        return null;
    }
}
