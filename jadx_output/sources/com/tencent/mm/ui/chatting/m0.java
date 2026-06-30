package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class m0 extends com.tencent.mm.ui.chatting.viewitems.r0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI f201939h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI, yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var) {
        super(dVar, a0Var);
        this.f201939h = appBrandServiceChattingFmUI;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.r0, com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
        java.lang.String str;
        if (f9Var.J2()) {
            super.a(view, dVar, f9Var);
            return;
        }
        if (!f9Var.k2()) {
            super.a(view, dVar, f9Var);
            return;
        }
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return;
        }
        com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = this.f201939h;
        if (appBrandServiceChattingFmUI.N == 2 && v17.f348666i == 33 && (str = appBrandServiceChattingFmUI.P.f77478d) != null && str.equals(v17.f348677k2)) {
            com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.n1(appBrandServiceChattingFmUI, v17.f348669i2);
        } else {
            super.a(view, dVar, f9Var);
        }
    }
}
