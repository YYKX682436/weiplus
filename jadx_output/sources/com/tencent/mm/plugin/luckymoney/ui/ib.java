package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ib implements android.view.View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View v17, boolean z17) {
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[wishTv-onFocusChange] " + z17);
        if (z17) {
            gb3.p.f270042a.a(6);
        }
    }
}
