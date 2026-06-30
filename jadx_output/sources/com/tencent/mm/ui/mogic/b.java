package com.tencent.mm.ui.mogic;

/* loaded from: classes15.dex */
public class b implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.mogic.WxViewPager.LayoutParams layoutParams = (com.tencent.mm.ui.mogic.WxViewPager.LayoutParams) ((android.view.View) obj).getLayoutParams();
        com.tencent.mm.ui.mogic.WxViewPager.LayoutParams layoutParams2 = (com.tencent.mm.ui.mogic.WxViewPager.LayoutParams) ((android.view.View) obj2).getLayoutParams();
        boolean z17 = layoutParams.f209243a;
        return z17 != layoutParams2.f209243a ? z17 ? 1 : -1 : layoutParams.f209247e - layoutParams2.f209247e;
    }
}
