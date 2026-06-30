package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class ta implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderGridGalleryView f133096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f133097e;

    public ta(com.tencent.mm.plugin.finder.view.FinderGridGalleryView finderGridGalleryView, java.util.LinkedList linkedList) {
        this.f133096d = finderGridGalleryView;
        this.f133097e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderGridGalleryView finderGridGalleryView = this.f133096d;
        e33.j2 j2Var = finderGridGalleryView.f131110m;
        if (j2Var == null) {
            kotlin.jvm.internal.o.o("albumAdapter");
            throw null;
        }
        ((e33.b0) j2Var).f247130f.clear();
        e33.j2 j2Var2 = finderGridGalleryView.f131110m;
        if (j2Var2 == null) {
            kotlin.jvm.internal.o.o("albumAdapter");
            throw null;
        }
        e33.b0 b0Var = (e33.b0) j2Var2;
        java.util.ArrayList arrayList = b0Var.f247130f;
        arrayList.clear();
        arrayList.addAll(this.f133097e);
        b0Var.notifyDataSetChanged();
        java.lang.Object obj = finderGridGalleryView.f131110m;
        if (obj != null) {
            ((androidx.recyclerview.widget.f2) obj).notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("albumAdapter");
            throw null;
        }
    }
}
