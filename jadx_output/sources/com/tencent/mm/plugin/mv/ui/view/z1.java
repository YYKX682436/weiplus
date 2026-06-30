package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class z1 implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView f152000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f152001b;

    public z1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView, java.util.ArrayList arrayList) {
        this.f152000a = musicMvCommentView;
        this.f152001b = arrayList;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView = this.f152000a;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = musicMvCommentView.f151659e;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.getData().clear();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = musicMvCommentView.f151659e;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter2.getData().addAll(this.f152001b);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = musicMvCommentView.f151659e;
        if (wxRecyclerAdapter3 != null) {
            wxRecyclerAdapter3.notifyItemRangeChanged(i17, i18);
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView = this.f152000a;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = musicMvCommentView.f151659e;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.getData().clear();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = musicMvCommentView.f151659e;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter2.getData().addAll(this.f152001b);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = musicMvCommentView.f151659e;
        if (wxRecyclerAdapter3 != null) {
            wxRecyclerAdapter3.notifyItemRangeInserted(i17, i18);
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView = this.f152000a;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = musicMvCommentView.f151659e;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.getData().clear();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = musicMvCommentView.f151659e;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter2.getData().addAll(this.f152001b);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = musicMvCommentView.f151659e;
        if (wxRecyclerAdapter3 != null) {
            wxRecyclerAdapter3.notifyItemRangeRemoved(i17, i18);
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f152000a.f151659e;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemMoved(i17, i18);
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }
}
