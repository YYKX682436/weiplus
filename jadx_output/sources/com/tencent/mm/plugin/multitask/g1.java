package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class g1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.i1 f150435d;

    public g1(com.tencent.mm.plugin.multitask.i1 i1Var) {
        this.f150435d = i1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String str = this.f150435d.f150445d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTaskInfoByBitmap invoker callback result:");
        sb6.append(bundle != null ? bundle.getBoolean("result") : false);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }
}
