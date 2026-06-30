package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class a2 extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView f151775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f151776b;

    public a2(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView, java.util.ArrayList arrayList) {
        this.f151775a = musicMvCommentView;
        this.f151776b = arrayList;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f151775a.f151659e;
        if (wxRecyclerAdapter != null) {
            return kotlin.jvm.internal.o.b(kz5.n0.a0(wxRecyclerAdapter.getData(), i17), kz5.n0.a0(this.f151776b, i18));
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f151775a.f151659e;
        if (wxRecyclerAdapter != null) {
            return kotlin.jvm.internal.o.b(kz5.n0.a0(wxRecyclerAdapter.getData(), i17), kz5.n0.a0(this.f151776b, i18));
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f151776b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f151775a.f151659e;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter.getData().size();
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }
}
