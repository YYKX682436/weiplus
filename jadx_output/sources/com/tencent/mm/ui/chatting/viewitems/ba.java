package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class ba implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f203471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f203472b;

    public ba(com.tencent.mm.ui.chatting.viewitems.ga gaVar, android.content.Context context, boolean z17) {
        this.f203471a = context;
        this.f203472b = z17;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        android.content.Context context = this.f203471a;
        g4Var.c(0, 0, 0, context.getResources().getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.icons_filled_copy);
        g4Var.c(0, 1, 0, context.getResources().getString(com.tencent.mm.R.string.f492532gv1), com.tencent.mm.R.raw.icons_filled_allselect);
        g4Var.c(0, 2, 0, context.getResources().getString(com.tencent.mm.R.string.guy), com.tencent.mm.R.raw.icons_filled_share);
        g4Var.c(0, 3, 0, context.getResources().getString(com.tencent.mm.R.string.c__), com.tencent.mm.R.raw.icons_filled_favorites);
        if (this.f203472b) {
            g4Var.c(0, 136, 0, view.getContext().getString(com.tencent.mm.R.string.b3v), com.tencent.mm.R.raw.icons_filled_quote);
        }
    }
}
