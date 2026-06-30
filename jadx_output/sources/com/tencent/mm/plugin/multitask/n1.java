package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class n1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.p1 f150473d;

    public n1(com.tencent.mm.plugin.multitask.p1 p1Var) {
        this.f150473d = p1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String str = this.f150473d.f150479d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportMultiTaskInfo invoker callback result:");
        sb6.append(bundle != null ? bundle.getBoolean("result") : false);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }
}
