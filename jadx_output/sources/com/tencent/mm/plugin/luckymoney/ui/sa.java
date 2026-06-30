package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class sa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147415d;

    public sa(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147415d = luckyMoneyNewPrepareUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.app.AppCompatActivity context = this.f147415d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.luckymoney.ui.jd) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.luckymoney.ui.jd.class)).O6(true);
    }
}
