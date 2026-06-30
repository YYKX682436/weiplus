package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes14.dex */
public final class d0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f159925d;

    public d0(com.tencent.mm.plugin.scanner.view.t0 t0Var) {
        this.f159925d = t0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        java.lang.String str;
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f159925d;
        android.animation.AnimatorSet animatorSet = t0Var.U;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        t0Var.f159995x0 = false;
        if (t0Var.L && t0Var.H != null && t0Var.K) {
            java.lang.String str2 = t0Var.f159985p;
            t0Var.x(21);
            t0Var.C = false;
            t0Var.G = false;
            t0Var.M = true;
            java.util.Map<java.lang.String, java.lang.String> scanDetailMsgMap = t0Var.getScanDetailMsgMap();
            str = scanDetailMsgMap != null ? scanDetailMsgMap.get("lean_back") : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = t0Var.getContext().getString(com.tencent.mm.R.string.f493659lk4);
            }
            android.widget.TextView textView = t0Var.T;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView2 = t0Var.T;
            if (textView2 != null) {
                textView2.setText(str);
            }
            t0Var.f159997y0 = true;
            android.widget.TextView textView3 = t0Var.f159991u;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            android.widget.TextView textView4 = t0Var.T;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            android.widget.RelativeLayout relativeLayout = t0Var.S;
            if (relativeLayout != null) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(relativeLayout, "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(1000L);
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(relativeLayout, "rotationX", 0.0f, -10.0f);
                ofFloat2.setDuration(2000L);
                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(relativeLayout, "rotationX", -10.0f);
                ofFloat3.setDuration(1000L);
                android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                animatorSet2.playSequentially(ofFloat, ofFloat2, ofFloat3);
                animatorSet2.addListener(new com.tencent.mm.plugin.scanner.view.o0(t0Var, relativeLayout, animatorSet2));
                animatorSet2.start();
            }
            t0Var.getClass();
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_passport_scan_lean_back_timeout_value, 10);
            com.tencent.mm.sdk.platformtools.b4 b4Var = t0Var.Q;
            if (b4Var != null) {
                long j17 = Ni * 1000;
                b4Var.c(j17, j17);
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = t0Var.f159983J;
            if (b4Var2 != null) {
                b4Var2.d();
            }
        } else {
            java.lang.String str3 = t0Var.f159985p;
            t0Var.x(20);
            t0Var.f159994x = false;
            android.animation.AnimatorSet animatorSet3 = t0Var.U;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            java.util.Map<java.lang.String, java.lang.String> scanDetailMsgMap2 = t0Var.getScanDetailMsgMap();
            str = scanDetailMsgMap2 != null ? scanDetailMsgMap2.get("scan_timeout") : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = t0Var.getContext().getString(com.tencent.mm.R.string.n3c);
            }
            com.tencent.mm.ui.widget.dialog.j0 A = db5.e1.A(t0Var.getContext(), str, "", t0Var.getContext().getString(com.tencent.mm.R.string.f493655n33), t0Var.getContext().getString(com.tencent.mm.R.string.n37), new com.tencent.mm.plugin.scanner.view.b0(t0Var), new com.tencent.mm.plugin.scanner.view.c0(t0Var));
            if (A != null) {
                A.setCanceledOnTouchOutside(false);
            }
        }
        return true;
    }
}
