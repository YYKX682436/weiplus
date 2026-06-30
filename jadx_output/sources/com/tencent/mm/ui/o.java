package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class o implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AlbumUI f209433d;

    public o(com.tencent.mm.ui.AlbumUI albumUI) {
        this.f209433d = albumUI;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.tencent.mm.ui.DoubleTabView doubleTabView = this.f209433d.f196552d;
        float f18 = doubleTabView.f196632d * (i17 + f17);
        android.graphics.Matrix matrix = doubleTabView.f196637i;
        matrix.setTranslate(f18, 0.0f);
        doubleTabView.f196636h.setImageMatrix(matrix);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.ui.AlbumUI albumUI = this.f209433d;
        albumUI.f196552d.setTo(i17);
        if (i17 == 0) {
            mf4.d.f326161b.f60916d = 3L;
        } else {
            mf4.d.f326161b.f60916d = 2L;
            if (albumUI.f196555g) {
                com.tencent.mm.ui.DoubleTabView doubleTabView = albumUI.f196552d;
                doubleTabView.f196644s = false;
                com.tencent.mm.ui.MMTabView mMTabView = doubleTabView.f196639n;
                if (mMTabView != null) {
                    mMTabView.f196914e.setVisibility(4);
                }
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_STORY_NEED_DISPLAY_ALBUM_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            }
        }
        mf4.d.f326160a.b();
        if (!bi4.v1.g() || i17 != 1) {
            albumUI.showOptionMenu(false);
            return;
        }
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).fj(13L, albumUI.f196552d.f196644s ? "1" : "0");
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(37);
        albumUI.showOptionMenu(true);
    }
}
