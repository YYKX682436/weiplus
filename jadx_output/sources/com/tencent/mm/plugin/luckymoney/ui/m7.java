package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class m7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.h5 f147168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f147169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147170g;

    public m7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, com.tencent.mm.plugin.luckymoney.model.h5 h5Var, android.widget.TextView textView, java.lang.String str) {
        this.f147167d = luckyMoneyNewDetailUI;
        this.f147168e = h5Var;
        this.f147169f = textView;
        this.f147170g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147167d;
        java.util.Set set = luckyMoneyNewDetailUI.f146219r2;
        com.tencent.mm.plugin.luckymoney.model.h5 h5Var = this.f147168e;
        ((java.util.HashSet) set).remove(h5Var != null ? h5Var.f145319n : null);
        android.widget.TextView textView = this.f147169f;
        if ((textView != null ? textView.getTag() : null) != null) {
            java.lang.Object tag = textView.getTag();
            if (kotlin.jvm.internal.o.b(this.f147170g, tag instanceof java.lang.String ? (java.lang.String) tag : null)) {
                com.tencent.mm.plugin.luckymoney.model.m5.E(luckyMoneyNewDetailUI.getContext(), textView, h5Var != null ? h5Var.f145312d : null);
            }
        }
    }
}
