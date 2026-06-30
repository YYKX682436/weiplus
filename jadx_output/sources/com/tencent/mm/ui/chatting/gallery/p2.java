package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public class p2 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f201260d = new com.tencent.mm.ui.chatting.gallery.o2(this);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI f201261e;

    public p2(com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI) {
        this.f201261e = imageGalleryGridUI;
    }

    public void a(boolean z17) {
        java.lang.Runnable runnable = this.f201260d;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI = this.f201261e;
        if (!z17) {
            imageGalleryGridUI.f200575o.removeCallbacks(runnable);
            imageGalleryGridUI.f200575o.postDelayed(runnable, 256L);
            return;
        }
        imageGalleryGridUI.f200575o.removeCallbacks(runnable);
        if (imageGalleryGridUI.f200575o.getVisibility() != 0) {
            imageGalleryGridUI.f200575o.clearAnimation();
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(imageGalleryGridUI.getContext(), com.tencent.mm.R.anim.f477783bc);
            imageGalleryGridUI.f200575o.setVisibility(0);
            imageGalleryGridUI.f200575o.startAnimation(loadAnimation);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.lang.String d17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI = this.f201261e;
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) imageGalleryGridUI.f200572i.getItem(i17);
        if (f9Var == null) {
            d17 = null;
        } else {
            d17 = com.tencent.mm.ui.gridviewheaders.a.e().d(new java.util.Date(f9Var.getCreateTime()), imageGalleryGridUI);
        }
        imageGalleryGridUI.f200575o.setText(d17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (1 == i17) {
            a(true);
        } else if (i17 == 0) {
            a(false);
        }
        n11.a.b().n(i17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
