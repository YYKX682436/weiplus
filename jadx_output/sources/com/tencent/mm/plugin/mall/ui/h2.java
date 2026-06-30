package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148390d;

    public h2(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2) {
        this.f148390d = mallIndexUIv2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2 = this.f148390d;
        int k17 = i65.a.k(mallIndexUIv2.getContext());
        int b17 = i65.a.b(mallIndexUIv2.getContext(), 53);
        int[] iArr = new int[2];
        mallIndexUIv2.f148254d.getLocationInWindow(iArr);
        int bottom = (mallIndexUIv2.f148266s.getBottom() + iArr[1]) - k17;
        int height = (mallIndexUIv2.f148254d.getHeight() - mallIndexUIv2.f148266s.getHeight()) + iArr[1];
        if (bottom > 0) {
            height += bottom;
        }
        int i17 = (k17 - height) - b17;
        int b18 = i65.a.b(mallIndexUIv2.getContext(), 33);
        mallIndexUIv2.f148266s.getHeight();
        if (i17 > b18) {
            mallIndexUIv2.f148266s.setPadding(i65.a.f(mallIndexUIv2.getContext(), com.tencent.mm.R.dimen.f479688cn), i17, i65.a.f(mallIndexUIv2.getContext(), com.tencent.mm.R.dimen.f479688cn), b18);
        } else {
            mallIndexUIv2.f148266s.setPadding(i65.a.f(mallIndexUIv2.getContext(), com.tencent.mm.R.dimen.f479688cn), b18, i65.a.f(mallIndexUIv2.getContext(), com.tencent.mm.R.dimen.f479688cn), b18);
        }
    }
}
