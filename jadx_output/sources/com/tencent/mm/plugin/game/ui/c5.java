package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class c5 extends com.tencent.mm.plugin.game.ui.e {
    public c5(android.content.Context context, int i17) {
        super(context, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX);
        this.f141369e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (view.getTag() instanceof com.tencent.mm.plugin.game.model.e1) {
            com.tencent.mm.plugin.game.model.e1 e1Var = (com.tencent.mm.plugin.game.model.e1) view.getTag();
            int i17 = e1Var.field_msgType;
            android.content.Context context = this.f141368d;
            if (i17 == 6) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f140273a2)) {
                    return;
                }
                com.tencent.mm.game.report.l.d(this.f141368d, 13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, 5, r53.f.v(context, e1Var.f140273a2, null, null), 0, e1Var.field_appId, this.f141369e, e1Var.field_msgType, e1Var.field_gameMsgId, e1Var.T2, com.tencent.mm.game.report.l.a(null, null, e1Var.U2, null));
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("game_app_id", e1Var.field_appId);
            bundle.putInt("game_report_from_scene", com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX);
            com.tencent.mm.game.report.l.d(this.f141368d, 13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, 5, r53.f.o(context, e1Var.field_appId, null, bundle, 0), 0, e1Var.field_appId, this.f141369e, e1Var.field_msgType, e1Var.field_gameMsgId, e1Var.T2, com.tencent.mm.game.report.l.a(null, null, e1Var.U2, null));
        }
    }
}
