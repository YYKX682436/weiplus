package com.tencent.mm.plugin.music.ui;

/* loaded from: classes5.dex */
public class o0 extends android.widget.Scroller {

    /* renamed from: a, reason: collision with root package name */
    public final int f150772a;

    public o0(com.tencent.mm.plugin.music.ui.MusicViewPager musicViewPager, android.content.Context context) {
        super(context);
        this.f150772a = 1000;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i17, int i18, int i19, int i27, int i28) {
        super.startScroll(i17, i18, i19, i27, this.f150772a);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i17, int i18, int i19, int i27) {
        super.startScroll(i17, i18, i19, i27, this.f150772a);
    }
}
