package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class o1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.p1 f150478d;

    public o1(com.tencent.mm.plugin.multitask.p1 p1Var) {
        this.f150478d = p1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String str = this.f150478d.f150479d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideMultiTaskUIC invoker callback result:");
        sb6.append(bundle != null ? bundle.getBoolean("result") : false);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }
}
