package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class e1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.i1 f150430d;

    public e1(com.tencent.mm.plugin.multitask.i1 i1Var) {
        this.f150430d = i1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String str = this.f150430d.f150445d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideMultiTaskUIC invoker callback result:");
        sb6.append(bundle != null ? bundle.getBoolean("result") : false);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }
}
