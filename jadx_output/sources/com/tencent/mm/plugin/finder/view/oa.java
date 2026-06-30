package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class oa implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderGridGalleryView f132777a;

    public oa(com.tencent.mm.plugin.finder.view.FinderGridGalleryView finderGridGalleryView) {
        this.f132777a = finderGridGalleryView;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.finder.view.FinderGridGalleryView finderGridGalleryView = this.f132777a;
        finderGridGalleryView.f131114q = z17 ? finderGridGalleryView.f131116s : 1;
        e33.j2 j2Var = finderGridGalleryView.f131110m;
        if (j2Var == null) {
            kotlin.jvm.internal.o.o("albumAdapter");
            throw null;
        }
        if (((e33.b0) j2Var).J() > finderGridGalleryView.f131114q) {
            e33.j2 j2Var2 = finderGridGalleryView.f131110m;
            if (j2Var2 == null) {
                kotlin.jvm.internal.o.o("albumAdapter");
                throw null;
            }
            ((e33.b0) j2Var2).f247131g.clear();
            java.lang.Object obj = finderGridGalleryView.f131110m;
            if (obj == null) {
                kotlin.jvm.internal.o.o("albumAdapter");
                throw null;
            }
            ((androidx.recyclerview.widget.f2) obj).notifyDataSetChanged();
        }
        e33.j2 j2Var3 = finderGridGalleryView.f131110m;
        if (j2Var3 != null) {
            ((e33.b0) j2Var3).f247128d = finderGridGalleryView.f131114q;
        } else {
            kotlin.jvm.internal.o.o("albumAdapter");
            throw null;
        }
    }
}
