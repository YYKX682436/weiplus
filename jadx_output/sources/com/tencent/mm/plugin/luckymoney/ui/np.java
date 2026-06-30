package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class np implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter f147248d;

    public np(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter luckyMoneyWishFooter) {
        this.f147248d = luckyMoneyWishFooter;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyWishFooter$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter luckyMoneyWishFooter = this.f147248d;
        luckyMoneyWishFooter.f146686u = false;
        luckyMoneyWishFooter.f146683r.setVisibility(8);
        luckyMoneyWishFooter.f146683r.h();
        luckyMoneyWishFooter.f146680o.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
        luckyMoneyWishFooter.getClass();
        luckyMoneyWishFooter.f146684s = 0;
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyWishFooter$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
