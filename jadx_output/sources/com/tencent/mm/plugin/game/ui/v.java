package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public final class v extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameBannerView f141792d;

    public v(com.tencent.mm.plugin.game.ui.GameBannerView gameBannerView, com.tencent.mm.plugin.game.ui.t tVar) {
        this.f141792d = gameBannerView;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        int size = i17 % this.f141792d.f140660i.size();
        viewGroup.removeView((android.view.View) obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameBannerView", "destroyItem : new positon = %d, now position = %d", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i17));
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        com.tencent.mm.plugin.game.ui.GameBannerView gameBannerView = this.f141792d;
        return gameBannerView.f140660i.size() <= 1 ? gameBannerView.f140660i.size() : gameBannerView.f140660i.size() * 1000 * 2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.game.ui.GameBannerView gameBannerView = this.f141792d;
        int size = i17 % gameBannerView.f140660i.size();
        android.view.View inflate = android.view.View.inflate(gameBannerView.f140655d, com.tencent.mm.R.layout.bdz, null);
        inflate.setTag(gameBannerView.f140660i.get(size));
        inflate.setOnClickListener(gameBannerView);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.gim);
        java.lang.String str = ((com.tencent.mm.plugin.game.ui.u) gameBannerView.f140660i.get(size)).f141776b;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable == null || !(drawable instanceof com.tencent.mm.plugin.game.ui.h3)) {
            imageView.setImageDrawable(new com.tencent.mm.plugin.game.ui.h3(str, null));
        } else {
            ((com.tencent.mm.plugin.game.ui.h3) drawable).a(str);
        }
        try {
            viewGroup.addView(inflate, 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameBannerView", "add view failed, " + e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameBannerView", "instantiateItem : new positon = %d, now position = %d", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i17));
        return inflate;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
