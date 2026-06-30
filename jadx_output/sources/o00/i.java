package o00;

/* loaded from: classes9.dex */
public final class i implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI f341864d;

    public i(com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI) {
        this.f341864d = ecsGiftSendThanksLogicUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.storage.k4 Bi;
        bw5.df0 df0Var = (bw5.df0) obj;
        if (df0Var == null) {
            com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI = this.f341864d;
            int i17 = com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI.f65617h;
            java.lang.String string = ecsGiftSendThanksLogicUI.getString(com.tencent.mm.R.string.f490604zq);
            o00.w wVar = new o00.w();
            wVar.f341888c = 500L;
            new java.lang.ref.WeakReference(ecsGiftSendThanksLogicUI);
            o00.s sVar = new o00.s();
            if (string != null) {
                sVar.f341882c = string;
            }
            sVar.f341883a = new java.lang.ref.WeakReference(ecsGiftSendThanksLogicUI);
            wVar.f341887b = sVar;
            ecsGiftSendThanksLogicUI.f65620g = wVar;
            synchronized (wVar) {
                wu5.c cVar = wVar.f341886a;
                if (cVar != null) {
                    cVar.cancel(false);
                }
                ku5.u0 u0Var = ku5.t0.f312615d;
                o00.u uVar = new o00.u(wVar);
                long j17 = wVar.f341888c;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                wVar.f341886a = t0Var.z(uVar, j17, false);
            }
            return;
        }
        com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI2 = this.f341864d;
        o00.w wVar2 = ecsGiftSendThanksLogicUI2.f65620g;
        if (wVar2 != null) {
            synchronized (wVar2) {
                wu5.c cVar2 = wVar2.f341886a;
                if (cVar2 != null) {
                    cVar2.cancel(false);
                }
                pm0.v.X(new o00.v(wVar2));
            }
        }
        com.tencent.mm.storage.z3 z3Var = null;
        ecsGiftSendThanksLogicUI2.f65620g = null;
        com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI3 = this.f341864d;
        ecsGiftSendThanksLogicUI3.getClass();
        int i18 = df0Var.f26478g;
        boolean[] zArr = df0Var.f26481m;
        if (i18 != 0) {
            str2 = zArr[6] ? df0Var.f26479h : "";
            kotlin.jvm.internal.o.f(str2, "getReplyWording(...)");
            com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(ecsGiftSendThanksLogicUI3);
            y1Var.j(com.tencent.mm.R.layout.dyp);
            android.widget.TextView textView = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.vfi);
            if (textView != null) {
                textView.setText(str2);
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            }
            android.view.View findViewById = y1Var.f212027f.findViewById(com.tencent.mm.R.id.vff);
            if (findViewById != null) {
                findViewById.setOnClickListener(new o00.q(y1Var));
            }
            y1Var.f212037s = new o00.r(ecsGiftSendThanksLogicUI3);
            y1Var.s();
            return;
        }
        if (df0Var.f26477f == 0) {
            if (zArr[2]) {
                str = df0Var.f26475d;
            }
            str = "";
        } else {
            if (zArr[3]) {
                str = df0Var.f26476e;
            }
            str = "";
        }
        str2 = zArr[7] ? df0Var.f26480i : "";
        if (str2 == null || str2.length() == 0) {
            ecsGiftSendThanksLogicUI3.P6();
            return;
        }
        kotlin.jvm.internal.o.d(str);
        kotlin.jvm.internal.o.d(str2);
        o00.p pVar = new o00.p(ecsGiftSendThanksLogicUI3, str, str2);
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI.a.class, new o00.e(pVar));
            return;
        }
        vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
        if (x3Var != null && (Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) x3Var).Bi()) != null) {
            z3Var = Bi.n(str, true);
        }
        pVar.invoke(java.lang.Boolean.valueOf(z3Var != null ? com.tencent.mm.storage.z3.R4(z3Var.d1()) ? true : z3Var.r2() : false));
    }
}
