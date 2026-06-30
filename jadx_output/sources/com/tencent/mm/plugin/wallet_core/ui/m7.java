package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class m7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.v7 f180500d;

    public m7(com.tencent.mm.plugin.wallet_core.ui.v7 v7Var) {
        this.f180500d = v7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.v7 v7Var = this.f180500d;
        int i17 = v7Var.E;
        if (i17 == 0) {
            v7Var.A.setText(v7Var.getContext().getString(com.tencent.mm.R.string.kwy));
            v7Var.E = 1;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            v7Var.f180672J = android.os.SystemClock.elapsedRealtime();
            android.view.View view2 = v7Var.B;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v7Var.D.setVisibility(0);
            v7Var.C.setVisibility(8);
            v7Var.f180683q.setVisibility(8);
            android.view.View view3 = v7Var.f180677h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v7Var.f180679m.setText(com.tencent.mm.R.string.kwq);
            com.tencent.mm.plugin.wallet_core.ui.v7.k(false);
            v7Var.K = 1;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 1, 1, 0, 0, 0, 2);
            com.tencent.mm.wallet_core.ui.r1.q0(9, 1);
        } else if (i17 == 1) {
            v7Var.c();
        }
        if (v7Var.E == 1) {
            v7Var.h();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: is screen on: %b", java.lang.Boolean.valueOf(!v7Var.N));
            if (!v7Var.N) {
                v7Var.i();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
