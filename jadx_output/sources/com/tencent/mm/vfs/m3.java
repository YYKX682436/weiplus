package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class m3 implements com.tencent.mm.vfs.x5 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f213071b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f213072c = new java.util.HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f213073a;

    public m3(java.lang.String idEnvStr) {
        kotlin.jvm.internal.o.g(idEnvStr, "idEnvStr");
        this.f213073a = new com.tencent.mm.vfs.f1(idEnvStr);
    }

    @Override // com.tencent.mm.vfs.x5
    public com.tencent.mm.vfs.w5 b(java.util.Map env) {
        kotlin.jvm.internal.o.g(env, "env");
        java.lang.String a17 = this.f213073a.a(env);
        if (a17 == null) {
            return null;
        }
        com.tencent.mm.vfs.k3 k3Var = new com.tencent.mm.vfs.k3(a17);
        java.util.HashMap hashMap = f213071b;
        synchronized (hashMap) {
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(a17);
            if (arrayList != null) {
                kz5.h0.B(arrayList, com.tencent.mm.vfs.l3.f213065d);
                arrayList.add(new java.lang.ref.WeakReference(k3Var));
            } else {
                hashMap.put(a17, kz5.c0.d(new java.lang.ref.WeakReference(k3Var)));
            }
            if (f213072c.contains(a17)) {
                k3Var.f213028b = false;
            }
        }
        return k3Var;
    }
}
