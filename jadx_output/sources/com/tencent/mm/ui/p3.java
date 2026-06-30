package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.DoubleTabView f209491d;

    public p3(com.tencent.mm.ui.DoubleTabView doubleTabView) {
        this.f209491d = doubleTabView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.ui.base.CustomViewPager customViewPager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/DoubleTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.ui.q3 q3Var = this.f209491d.f196642q;
        if (q3Var != null) {
            customViewPager = ((com.tencent.mm.ui.n) q3Var).f209389a.mViewPager;
            customViewPager.setCurrentItem(intValue, true);
        }
        yj0.a.h(this, "com/tencent/mm/ui/DoubleTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
