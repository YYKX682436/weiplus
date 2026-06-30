package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class z2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys4.g f179538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179539e;

    public z2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI, ys4.g gVar) {
        this.f179539e = wcPayRealnameVerifyIdInputUI;
        this.f179538d = gVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "NetSceneRealNameVerify dialog lOk");
        int i18 = com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.X;
        this.f179539e.V6(this.f179538d);
        at4.y0.a(1);
    }
}
