package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class b8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.n8 f180152d;

    public b8(com.tencent.mm.plugin.wallet_core.ui.n8 n8Var) {
        this.f180152d = n8Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = this.f180152d;
        int i17 = n8Var.R;
        if (i17 == 0) {
            if (n8Var.S == 0) {
                n8Var.M.setText(n8Var.getContext().getString(com.tencent.mm.R.string.kwy));
                n8Var.R = 1;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                n8Var.Y = android.os.SystemClock.elapsedRealtime();
                android.view.View view2 = n8Var.N;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                n8Var.Q.setVisibility(0);
                n8Var.P.setVisibility(8);
                n8Var.f180535t.setVisibility(8);
                android.view.View view3 = n8Var.f180524g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                n8Var.f180526i.setText(com.tencent.mm.R.string.kwq);
                com.tencent.mm.plugin.wallet_core.ui.n8.u(false);
                n8Var.X.f192125x = 1;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 1, 1, 0, 0, 0, 2);
                com.tencent.mm.wallet_core.ui.r1.q0(9, 1);
            } else {
                n8Var.M.setText(n8Var.getContext().getString(com.tencent.mm.R.string.kwy));
                n8Var.R = 2;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                n8Var.Y = android.os.SystemClock.elapsedRealtime();
                n8Var.D.setVisibility(0);
                n8Var.f180535t.setVisibility(8);
                android.view.View view4 = n8Var.f180524g;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFaceId", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFaceId", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                n8Var.f180526i.setText(com.tencent.mm.R.string.kwp);
                com.tencent.mm.plugin.wallet_core.ui.n8.u(false);
                n8Var.X.f192125x = 1;
            }
        } else if (i17 == 1) {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = n8Var.X;
            com.tencent.mm.wallet_core.model.a2.a(payInfo != null ? payInfo.f192109e : 0, payInfo == null ? "" : payInfo.f192114m, 19, "");
            n8Var.c();
        } else if (i17 == 2) {
            n8Var.c();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15817, 4);
        }
        if (n8Var.R == 1) {
            n8Var.h();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdDialog", "hy: is screen on: %b", java.lang.Boolean.valueOf(!n8Var.f180542y0));
            if (!n8Var.f180542y0) {
                n8Var.i();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
