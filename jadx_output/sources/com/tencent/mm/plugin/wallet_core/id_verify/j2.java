package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179399d;

    public j2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179399d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179399d;
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.U6(wcPayRealnameVerifyIdInputUI);
        wcPayRealnameVerifyIdInputUI.hideTenpayKB();
        wcPayRealnameVerifyIdInputUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "click next btn：do verify real name");
        java.lang.String string = wcPayRealnameVerifyIdInputUI.getInput().getString("key_realname_sessionid");
        java.lang.String str = wcPayRealnameVerifyIdInputUI.getString(com.tencent.mm.R.string.j1n).equals(wcPayRealnameVerifyIdInputUI.A.f179460e.getValue()) ? "1" : "2";
        boolean isShown = wcPayRealnameVerifyIdInputUI.f179286m.isShown();
        com.tenpay.android.wechat.TenpaySecureEncrypt tenpaySecureEncrypt = wcPayRealnameVerifyIdInputUI.T;
        wcPayRealnameVerifyIdInputUI.doSceneProgress(new ys4.g((java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179459d.getValue(), (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179462g.getValue(), wcPayRealnameVerifyIdInputUI.U, ((r45.mj5) wcPayRealnameVerifyIdInputUI.A.f179461f.getValue()).f380583d.f376866d, (com.tencent.mm.plugin.wallet_core.id_verify.model.Profession) wcPayRealnameVerifyIdInputUI.A.f179469q.getValue(), (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179464i.getValue(), (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179465m.getValue(), (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179466n.getValue(), isShown ? tenpaySecureEncrypt.desedeEncode(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(wcPayRealnameVerifyIdInputUI.L), java.lang.Integer.valueOf(wcPayRealnameVerifyIdInputUI.M), java.lang.Integer.valueOf(wcPayRealnameVerifyIdInputUI.N)), com.tencent.mm.wallet_core.ui.r1.B()) : "", ((java.lang.Integer) wcPayRealnameVerifyIdInputUI.A.f179473u.getValue()).intValue(), wcPayRealnameVerifyIdInputUI.f179289p.isShown() ? tenpaySecureEncrypt.desedeEncode(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(wcPayRealnameVerifyIdInputUI.P), java.lang.Integer.valueOf(wcPayRealnameVerifyIdInputUI.Q), java.lang.Integer.valueOf(wcPayRealnameVerifyIdInputUI.R)), com.tencent.mm.wallet_core.ui.r1.B()) : "", (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179475w.getValue(), string, (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179471s.getValue(), (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179468p.getValue(), str, wcPayRealnameVerifyIdInputUI.getInput().getBoolean("key_marketing_switch_closed", false), (java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179472t.getValue(), wcPayRealnameVerifyIdInputUI.V, wcPayRealnameVerifyIdInputUI.f179285i.isShown() ? tenpaySecureEncrypt.desedeEncode(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(wcPayRealnameVerifyIdInputUI.I), java.lang.Integer.valueOf(wcPayRealnameVerifyIdInputUI.f179279J), java.lang.Integer.valueOf(wcPayRealnameVerifyIdInputUI.K)), com.tencent.mm.wallet_core.ui.r1.B()) : ""), true);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
