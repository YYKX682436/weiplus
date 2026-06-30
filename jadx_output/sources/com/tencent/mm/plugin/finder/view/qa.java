package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class qa implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderGridGalleryView f132885d;

    public qa(com.tencent.mm.plugin.finder.view.FinderGridGalleryView finderGridGalleryView) {
        this.f132885d = finderGridGalleryView;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.view.FinderGridGalleryView finderGridGalleryView = this.f132885d;
        android.widget.TextView textView = finderGridGalleryView.f131107g;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mediaTypeTv");
            throw null;
        }
        textView.setText(finderGridGalleryView.f131105e[i17]);
        e60.f1 f1Var = finderGridGalleryView.f131111n;
        if (f1Var == null) {
            kotlin.jvm.internal.o.o("queryService");
            throw null;
        }
        ((t23.x1) f1Var).g(finderGridGalleryView.f131106f[i17]);
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
        e60.f1 f1Var2 = finderGridGalleryView.f131111n;
        if (f1Var2 == null) {
            kotlin.jvm.internal.o.o("queryService");
            throw null;
        }
        ((e33.b0) j2Var2).f247134m = ((t23.x1) f1Var2).f415298g;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        finderGridGalleryView.f131115r = currentTimeMillis;
        e60.f1 f1Var3 = finderGridGalleryView.f131111n;
        if (f1Var3 == null) {
            kotlin.jvm.internal.o.o("queryService");
            throw null;
        }
        t23.x1 x1Var = (t23.x1) f1Var3;
        x1Var.e("", x1Var.f415298g, currentTimeMillis);
    }
}
