package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class e implements com.tencent.mm.plugin.flash.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashPreviewLayout f137216a;

    public e(com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout) {
        this.f137216a = faceFlashPreviewLayout;
    }

    @Override // com.tencent.mm.plugin.flash.b0
    public void a(java.lang.Boolean bool, com.tencent.mm.plugin.flash.d0 d0Var) {
        if (bool.booleanValue()) {
            com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout = this.f137216a;
            int i17 = com.tencent.mm.plugin.flash.FaceFlashPreviewLayout.P;
            faceFlashPreviewLayout.getClass();
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.f(faceFlashPreviewLayout, d0Var));
            this.f137216a.f137033u.b(d0Var.f137201d.c());
            d0Var.e(new com.tencent.mm.plugin.flash.d(this, d0Var.c()));
        }
    }
}
