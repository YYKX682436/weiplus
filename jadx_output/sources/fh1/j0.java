package fh1;

/* loaded from: classes7.dex */
public class j0 implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.g2 f262555a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.u1 f262556b;

    public j0(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String uin = kk.v.a(gm0.m.i());
        kotlin.jvm.internal.o.g(uin, "uin");
        if (str == null || str.length() == 0) {
            j3Var = new com.tencent.mm.plugin.appbrand.appstorage.j3(com.tencent.mm.plugin.appbrand.jsapi.file.l2.h(uin, "magicbrushframedata"), "wxfile://magicbrushframedata");
            j3Var.f76227f = 10485760L;
        } else {
            j3Var = new com.tencent.mm.plugin.appbrand.appstorage.j3((java.lang.String) new dh1.a(uin, str).invoke(), "wxfile://magicbrushframedata");
            j3Var.f76227f = 10485760L;
        }
        linkedList.add(j3Var);
        this.f262555a = new com.tencent.mm.plugin.appbrand.appstorage.g2(linkedList);
        this.f262556b = (com.tencent.mm.plugin.appbrand.appstorage.u1) java.lang.reflect.Proxy.newProxyInstance(fh1.j0.class.getClassLoader(), new java.lang.Class[]{com.tencent.mm.plugin.appbrand.appstorage.u1.class}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if (objArr != null && objArr.length >= 1) {
            java.lang.Object obj2 = objArr[0];
            if (obj2 instanceof java.lang.String) {
                java.lang.String i17 = com.tencent.mm.plugin.appbrand.appstorage.l1.i((java.lang.String) obj2);
                if (!i17.startsWith("wxfile://")) {
                    objArr[0] = "wxfile://magicbrushframedata/".concat(i17);
                }
            }
        }
        return method.invoke(this.f262555a, objArr);
    }
}
