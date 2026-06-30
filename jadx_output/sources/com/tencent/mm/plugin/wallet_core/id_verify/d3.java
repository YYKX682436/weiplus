package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class d3 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f179360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ys4.g f179361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179362c;

    public d3(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI, com.tencent.mm.ui.widget.dialog.z2 z2Var, ys4.g gVar) {
        this.f179362c = wcPayRealnameVerifyIdInputUI;
        this.f179360a = z2Var;
        this.f179361b = gVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        this.f179360a.B();
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179362c;
        com.tencent.mm.wallet_core.ui.r1.r0(22, 1, i17, wcPayRealnameVerifyIdInputUI.U);
        wcPayRealnameVerifyIdInputUI.getClass();
        android.content.Intent intent = new android.content.Intent(wcPayRealnameVerifyIdInputUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.class);
        ys4.g gVar = this.f179361b;
        intent.putExtra("under_age_session_id", gVar.f465241p);
        intent.putExtra("under_age_msg_preview_text", gVar.f465242q);
        wcPayRealnameVerifyIdInputUI.startActivityForResult(intent, 5);
    }
}
