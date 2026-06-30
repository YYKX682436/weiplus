package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment f201186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f201187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f201188f;

    public m0(com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment, android.view.View view, float f17) {
        this.f201186d = emojiHistoryListFragment;
        this.f201187e = view;
        this.f201188f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = 4;
        com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment = this.f201186d;
        android.content.Context context = emojiHistoryListFragment.getContext();
        float f17 = this.f201188f;
        android.view.View view = this.f201187e;
        if (context != null) {
            f0Var.f310116d = (int) (((view.getWidth() / f17) + 2) / 98);
        }
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(emojiHistoryListFragment.getContext(), f0Var.f310116d);
        gridLayoutManager.B = new com.tencent.mm.ui.chatting.gallery.k0(emojiHistoryListFragment, f0Var);
        androidx.recyclerview.widget.RecyclerView recyclerView = emojiHistoryListFragment.f200547p;
        if (recyclerView != null) {
            recyclerView.i(new com.tencent.mm.ui.chatting.gallery.l0(gridLayoutManager, emojiHistoryListFragment));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = emojiHistoryListFragment.f200547p;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
        float width = view.getWidth() / f17;
        float height = view.getHeight() / f17;
        float f18 = (2 + width) / 98;
        float f19 = ((12 + height) / 76) + 1;
        float f27 = f18 * f19;
        int i17 = ((int) (f27 / 50)) + 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListFragment", "djq :: width: " + width + " | height: " + height + " | row: " + f18 + " | col: " + f19 + " | totalCount: " + f27 + " | batch:" + i17);
        com.tencent.mm.ui.chatting.presenter.h0 h0Var = emojiHistoryListFragment.f200550s;
        if (h0Var != null) {
            h0Var.f202239h = i17;
        }
        if (h0Var != null) {
            h0Var.c();
        }
    }
}
