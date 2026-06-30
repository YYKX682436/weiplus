package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class g4 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f142837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI f142838b;

    public g4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI, java.lang.String str) {
        this.f142838b = iPCallShareCouponCardUI;
        this.f142837a = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            ot0.q qVar = new ot0.q();
            com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI = this.f142838b;
            qVar.f348654f = iPCallShareCouponCardUI.f142687x;
            qVar.f348674k = iPCallShareCouponCardUI.f142688y;
            qVar.f348658g = iPCallShareCouponCardUI.f142685v;
            qVar.f348734z = iPCallShareCouponCardUI.f142686w;
            qVar.f348666i = 5;
            com.tencent.mm.pluginsdk.model.app.k0.J(qVar, null, null, this.f142837a, "", null, null);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                am.mt mtVar = sendMsgEvent.f54752g;
                java.lang.String str2 = this.f142837a;
                mtVar.f7362a = str2;
                mtVar.f7363b = str;
                mtVar.f7364c = c01.e2.C(str2);
                mtVar.f7365d = 0;
                sendMsgEvent.e();
            }
            db5.e1.T(iPCallShareCouponCardUI.getContext(), iPCallShareCouponCardUI.getResources().getString(com.tencent.mm.R.string.f490560yi));
        }
    }
}
