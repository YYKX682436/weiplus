package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class t9 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f205569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.q9 f205570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f205571c;

    public t9(com.tencent.mm.ui.chatting.viewitems.y9 y9Var, android.content.Context context, com.tencent.mm.ui.chatting.viewitems.q9 q9Var, boolean z17) {
        this.f205569a = context;
        this.f205570b = q9Var;
        this.f205571c = z17;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        android.content.Context context = this.f205569a;
        g4Var.c(0, 0, 0, context.getResources().getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.icons_filled_copy);
        com.tencent.mm.ui.chatting.viewitems.q9 q9Var = this.f205570b;
        java.lang.CharSequence a17 = q9Var.f205329b.a();
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) q9Var.f205329b.getTag();
        int i17 = erVar != null ? c01.ia.i(erVar.c()) : 0;
        if (i17 <= 0 || i17 >= a17.length()) {
            g4Var.c(0, 1, 0, context.getResources().getString(com.tencent.mm.R.string.f492532gv1), com.tencent.mm.R.raw.icons_filled_allselect);
        }
        g4Var.c(0, 2, 0, context.getResources().getString(com.tencent.mm.R.string.guy), com.tencent.mm.R.raw.icons_filled_share);
        g4Var.c(0, 3, 0, context.getResources().getString(com.tencent.mm.R.string.c__), com.tencent.mm.R.raw.icons_filled_favorites);
        if (this.f205571c) {
            g4Var.c(0, 136, 0, view.getContext().getString(com.tencent.mm.R.string.b3v), com.tencent.mm.R.raw.icons_filled_quote);
        }
    }
}
