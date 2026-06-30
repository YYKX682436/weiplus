package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class m2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179419d;

    public m2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179419d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.mj5 mj5Var = (r45.mj5) obj;
        if (mj5Var == null) {
            return;
        }
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179419d;
        rp5.b logicDelegate = wcPayRealnameVerifyIdInputUI.f179282f.getLogicDelegate();
        if (logicDelegate instanceof qp5.n) {
            ((qp5.n) logicDelegate).f(mj5Var.f380583d.f376866d);
        }
        int i17 = mj5Var.f380583d.f376866d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "change cre type: %s", java.lang.Integer.valueOf(i17));
        wcPayRealnameVerifyIdInputUI.f179282f.setText("");
        rp5.b logicDelegate2 = wcPayRealnameVerifyIdInputUI.f179282f.getLogicDelegate();
        if (logicDelegate2 instanceof qp5.n) {
            ((qp5.n) logicDelegate2).f(i17);
        }
        com.tencent.mm.plugin.wallet_core.id_verify.p3 p3Var = wcPayRealnameVerifyIdInputUI.A;
        p3Var.f179471s.setValue("");
        p3Var.f179472t.setValue("");
        p3Var.f179473u.setValue(0);
        p3Var.f179474v.setValue("");
        p3Var.f179475w.setValue("");
        p3Var.f179476x.setValue("");
        wcPayRealnameVerifyIdInputUI.f179281e.setText(mj5Var.f380583d.f376867e);
        if (mj5Var.f380590n) {
            wcPayRealnameVerifyIdInputUI.f179285i.setVisibility(0);
        } else {
            wcPayRealnameVerifyIdInputUI.f179285i.setVisibility(8);
        }
        if (mj5Var.f380588i) {
            wcPayRealnameVerifyIdInputUI.f179289p.setVisibility(0);
        } else {
            wcPayRealnameVerifyIdInputUI.f179289p.setVisibility(8);
        }
        if (mj5Var.f380587h) {
            wcPayRealnameVerifyIdInputUI.f179287n.setVisibility(0);
        } else {
            wcPayRealnameVerifyIdInputUI.f179287n.setVisibility(8);
        }
        if (mj5Var.f380589m) {
            wcPayRealnameVerifyIdInputUI.f179288o.setVisibility(0);
        } else {
            wcPayRealnameVerifyIdInputUI.f179288o.setVisibility(8);
        }
        if (mj5Var.f380584e) {
            wcPayRealnameVerifyIdInputUI.f179283g.setVisibility(0);
        } else {
            wcPayRealnameVerifyIdInputUI.f179283g.setVisibility(8);
        }
        if (mj5Var.f380586g) {
            wcPayRealnameVerifyIdInputUI.f179286m.setVisibility(0);
        } else {
            wcPayRealnameVerifyIdInputUI.f179286m.setVisibility(8);
        }
        if (mj5Var.f380591o) {
            wcPayRealnameVerifyIdInputUI.f179290q.setVisibility(0);
        } else {
            wcPayRealnameVerifyIdInputUI.f179290q.setVisibility(8);
        }
        if (mj5Var.f380592p) {
            wcPayRealnameVerifyIdInputUI.f179291r.setVisibility(0);
        } else {
            wcPayRealnameVerifyIdInputUI.f179291r.setVisibility(8);
        }
        if (mj5Var.f380585f) {
            wcPayRealnameVerifyIdInputUI.f179299z = true;
            wcPayRealnameVerifyIdInputUI.f179284h.setVisibility(0);
        } else {
            wcPayRealnameVerifyIdInputUI.f179284h.setVisibility(8);
        }
        if (i17 == 1) {
            wcPayRealnameVerifyIdInputUI.setEditFocusListener(wcPayRealnameVerifyIdInputUI.f179282f, 1, false, false, false);
            return;
        }
        if (i17 == 2) {
            wcPayRealnameVerifyIdInputUI.setEditFocusListener(wcPayRealnameVerifyIdInputUI.f179282f, 1, true, false, false);
            return;
        }
        if (i17 == 5) {
            wcPayRealnameVerifyIdInputUI.setEditFocusListener(wcPayRealnameVerifyIdInputUI.f179282f, 1, true, false, false);
        } else if (i17 != 9) {
            wcPayRealnameVerifyIdInputUI.setEditFocusListener(wcPayRealnameVerifyIdInputUI.f179282f, 1, true, false, false);
        } else {
            wcPayRealnameVerifyIdInputUI.setEditFocusListener(wcPayRealnameVerifyIdInputUI.f179282f, 1, true, false, false);
        }
    }
}
