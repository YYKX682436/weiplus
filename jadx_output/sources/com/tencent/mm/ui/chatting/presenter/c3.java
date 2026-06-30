package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f202145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.d3 f202146e;

    public c3(com.tencent.mm.ui.chatting.presenter.d3 d3Var, java.util.LinkedList linkedList) {
        this.f202146e = d3Var;
        this.f202145d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.d3 d3Var = this.f202146e;
        java.util.ArrayList arrayList = d3Var.f202169f.f202357e;
        java.util.LinkedList linkedList = this.f202145d;
        arrayList.addAll(0, linkedList);
        com.tencent.mm.ui.chatting.presenter.n3 n3Var = d3Var.f202169f;
        n3Var.f202368s = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] %s", java.lang.Integer.valueOf(n3Var.f202357e.size()));
        zb5.g gVar = d3Var.f202169f.f202356d;
        if (gVar != null) {
            boolean z17 = d3Var.f202167d;
            int size = linkedList.size();
            com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI = (com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) gVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryUI", "[onDataLoaded] isFirst:%s addCount:%s mIntentPos:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(mediaHistoryGalleryUI.f200752p));
            if (z17) {
                mediaHistoryGalleryUI.W6(false, null);
                mediaHistoryGalleryUI.f200745f.getAdapter().notifyDataSetChanged();
                int i17 = mediaHistoryGalleryUI.f200752p;
                if (i17 > 0) {
                    if (i17 % 4 == 0) {
                        mediaHistoryGalleryUI.f200752p = i17 + 1;
                    }
                    int itemCount = mediaHistoryGalleryUI.f200745f.getAdapter().getItemCount();
                    androidx.recyclerview.widget.RecyclerView recyclerView = mediaHistoryGalleryUI.f200745f;
                    int min = java.lang.Math.min(itemCount - 1, mediaHistoryGalleryUI.f200752p);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(min));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(recyclerView, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
                } else {
                    int itemCount2 = mediaHistoryGalleryUI.f200745f.getAdapter().getItemCount();
                    androidx.recyclerview.widget.RecyclerView recyclerView2 = mediaHistoryGalleryUI.f200745f;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(java.lang.Integer.valueOf(itemCount2 - 1));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(recyclerView2, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView2.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(recyclerView2, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
                }
                if (size <= 0) {
                    mediaHistoryGalleryUI.f200749m.setVisibility(0);
                    mediaHistoryGalleryUI.f200745f.setVisibility(8);
                    mediaHistoryGalleryUI.f200749m.setTextColor(i65.a.d(mediaHistoryGalleryUI, com.tencent.mm.R.color.aaw));
                    mediaHistoryGalleryUI.f200749m.setText(mediaHistoryGalleryUI.getString(com.tencent.mm.R.string.b5e));
                } else {
                    mediaHistoryGalleryUI.f200749m.setVisibility(8);
                    mediaHistoryGalleryUI.f200745f.setVisibility(0);
                }
            } else if (mediaHistoryGalleryUI.f200745f.E0()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MediaHistoryGalleryUI", "[onDataLoaded] isComputingLayout ");
            } else if (size > 0) {
                mediaHistoryGalleryUI.f200745f.getAdapter().notifyItemRangeInserted(0, size);
                mediaHistoryGalleryUI.f200745f.getAdapter().notifyItemRangeChanged(size, mediaHistoryGalleryUI.f200760x + size);
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryUI", "onDataLoading notifyItemRangeChanged:%s", java.lang.Integer.valueOf(mediaHistoryGalleryUI.f200760x + size));
            } else {
                mediaHistoryGalleryUI.f200745f.getAdapter().notifyItemChanged(0);
            }
        }
        d3Var.f202169f.f202361i.f198392o = false;
    }
}
