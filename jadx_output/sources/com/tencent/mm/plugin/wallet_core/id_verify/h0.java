package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public final class h0 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.fo f179385a;

    public h0(r45.fo foVar) {
        this.f179385a = foVar;
    }

    @Override // l81.e1
    public void a() {
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mars.xlog.Log.e("MicroMsg.RealnameVerifySelectGuardianUI", "failed jump to: " + this.f179385a.f374478i + " after send msg");
        com.tencent.mm.plugin.wallet_core.id_verify.x xVar = com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.E;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.wallet_core.id_verify.x.a(xVar, context);
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
    }

    @Override // l81.e1
    public void f(boolean z17) {
    }
}
