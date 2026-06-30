package com.tencent.mm.plugin.voip.model;

/* loaded from: classes.dex */
public final class u1 extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voip.model.t1 f176806d = new com.tencent.mm.plugin.voip.model.t1(null);

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f176807e = (lp0.b.h() + "voip") + "/Models";

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_02a59497";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        java.lang.String path = resource.getPath();
        java.lang.String name = resource.getName();
        com.tencent.mm.plugin.voip.model.t1 t1Var = f176806d;
        t1Var.a();
        kotlin.jvm.internal.o.d(name);
        java.lang.String b17 = t1Var.b(t1Var.c(name));
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("VoipModelUdrMgr", "No model matched for name: ".concat(name));
            return;
        }
        java.lang.String str = f176807e + '/' + b17;
        com.tencent.mars.xlog.Log.i("VoipModelUdrMgr", "activePath: " + path + " modelfile: " + str);
        long d17 = com.tencent.mm.vfs.w6.d(path, str, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("results ");
        sb6.append(d17);
        com.tencent.mars.xlog.Log.i("VoipModelUdrMgr", sb6.toString());
    }
}
