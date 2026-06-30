package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class xa extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f201563d = new com.tencent.mm.ui.chatting.gallery.wa(this);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI f201564e;

    public xa(com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI) {
        this.f201564e = mediaHistoryGalleryUI;
    }

    public void b(boolean z17) {
        java.lang.Runnable runnable = this.f201563d;
        com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI = this.f201564e;
        if (!z17) {
            mediaHistoryGalleryUI.f200746g.removeCallbacks(runnable);
            mediaHistoryGalleryUI.f200746g.postDelayed(runnable, 256L);
            return;
        }
        mediaHistoryGalleryUI.f200746g.removeCallbacks(runnable);
        if (mediaHistoryGalleryUI.f200746g.getVisibility() != 0) {
            mediaHistoryGalleryUI.f200746g.clearAnimation();
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(mediaHistoryGalleryUI.getContext(), com.tencent.mm.R.anim.f477783bc);
            mediaHistoryGalleryUI.f200746g.setVisibility(0);
            mediaHistoryGalleryUI.f200746g.startAnimation(loadAnimation);
        }
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        zb5.f fVar;
        com.tencent.mm.ui.chatting.adapter.a0 a0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI = this.f201564e;
        if (1 == i17) {
            b(true);
            com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollEnable(), mediaHistoryGalleryUI.f200754r);
            mediaHistoryGalleryUI.f200754r = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollTimeout(), 703, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollAction(), "MicroMsg.MediaHistoryGalleryUI");
        } else if (i17 == 0) {
            b(false);
        }
        if (recyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            if (((androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager()).w() == 0 && !mediaHistoryGalleryUI.f200755s && (fVar = mediaHistoryGalleryUI.f200743d) != null && (a0Var = mediaHistoryGalleryUI.f200744e) != null && !a0Var.f198392o) {
                ((com.tencent.mm.ui.chatting.presenter.n3) fVar).j(false, -1);
            }
            mediaHistoryGalleryUI.f200755s = false;
            n11.a.b().n(i17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI = this.f201564e;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) ((com.tencent.mm.ui.chatting.presenter.n3) mediaHistoryGalleryUI.f200743d).d(mediaHistoryGalleryUI);
        com.tencent.mm.ui.chatting.adapter.a0 a0Var = ((com.tencent.mm.ui.chatting.presenter.n3) mediaHistoryGalleryUI.f200743d).f202361i;
        com.tencent.mm.ui.chatting.adapter.w x17 = a0Var.x(linearLayoutManager.w());
        if (x17 == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        java.lang.String d17 = com.tencent.mm.ui.gridviewheaders.a.e().d(new java.util.Date(x17.f198449d), a0Var.f198384d);
        android.widget.TextView textView = mediaHistoryGalleryUI.f200746g;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (d17 == null) {
            d17 = "";
        }
        textView.setText(d17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
