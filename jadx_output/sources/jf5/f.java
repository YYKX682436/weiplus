package jf5;

/* loaded from: classes14.dex */
public final class f implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jf5.h f299451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout f299452b;

    public f(jf5.h hVar, com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout) {
        this.f299451a = hVar;
        this.f299452b = nativeSelectableLayout;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (g4Var == null) {
            return;
        }
        g4Var.clear();
        jf5.h hVar = this.f299451a;
        jf5.m0 m0Var = hVar.f299458b;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout = this.f299452b;
        boolean z17 = (m0Var == null || m0Var.c(nativeSelectableLayout)) ? false : true;
        android.content.Context context = hVar.f299457a;
        if (!z17) {
            g4Var.c(0, 1, 0, context.getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
        }
        boolean p17 = nativeSelectableLayout.p();
        jf5.m0 m0Var2 = hVar.f299458b;
        if (!p17) {
            if (!((m0Var2 == null || m0Var2.b(nativeSelectableLayout)) ? false : true)) {
                g4Var.c(0, 2, 1, context.getString(com.tencent.mm.R.string.f492532gv1), com.tencent.mm.R.raw.icons_filled_allselect);
            }
        }
        if (!((m0Var2 == null || m0Var2.d(nativeSelectableLayout)) ? false : true)) {
            g4Var.c(0, 3, 2, context.getString(com.tencent.mm.R.string.guy), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (!((m0Var2 == null || m0Var2.e(nativeSelectableLayout)) ? false : true)) {
            g4Var.c(0, 4, 3, context.getString(com.tencent.mm.R.string.c__), com.tencent.mm.R.raw.icons_filled_favorites);
        }
        if (m0Var2 != null) {
            return;
        }
        g4Var.c(0, 5, 4, context.getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo);
    }
}
