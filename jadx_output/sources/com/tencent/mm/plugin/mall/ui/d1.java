package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUI f148354d;

    public d1(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI) {
        this.f148354d = mallIndexUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI = this.f148354d;
        int k17 = i65.a.k(mallIndexUI.getContext());
        int b17 = i65.a.b(mallIndexUI.getContext(), 53);
        int[] iArr = new int[2];
        mallIndexUI.f148239d.getLocationInWindow(iArr);
        int bottom = (mallIndexUI.f148251s.getBottom() + iArr[1]) - k17;
        int height = (mallIndexUI.f148239d.getHeight() - mallIndexUI.f148251s.getHeight()) + iArr[1];
        if (bottom > 0) {
            height += bottom;
        }
        int i17 = (k17 - height) - b17;
        int b18 = i65.a.b(mallIndexUI.getContext(), 33);
        mallIndexUI.f148251s.getHeight();
        if (i17 > b18) {
            mallIndexUI.f148251s.setPadding(0, i17, 0, b18);
        } else {
            mallIndexUI.f148251s.setPadding(0, b18, 0, b18);
        }
    }
}
