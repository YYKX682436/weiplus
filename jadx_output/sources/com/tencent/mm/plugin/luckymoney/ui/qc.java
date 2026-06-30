package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class qc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f147345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f147346e;

    public qc(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard, boolean z17) {
        this.f147345d = wcPayKeyboard;
        this.f147346e = z17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$setWPKeyboard$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        boolean z17 = this.f147346e;
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f147345d;
        wcPayKeyboard.setIsOnlySupportInteger(z17);
        wcPayKeyboard.u();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$setWPKeyboard$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
