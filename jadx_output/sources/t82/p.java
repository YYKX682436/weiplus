package t82;

/* loaded from: classes12.dex */
public final class p implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f416399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t82.r f416400b;

    public p(o72.r2 r2Var, t82.r rVar) {
        this.f416399a = r2Var;
        this.f416400b = rVar;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        o72.b3 b3Var = new o72.b3();
        o72.r2 r2Var = this.f416399a;
        boolean c17 = b3Var.c(r2Var, false, false);
        t82.r rVar = this.f416400b;
        if (!c17) {
            g4Var.c(0, 3, 0, rVar.getContext().getResources().getString(com.tencent.mm.R.string.ccj), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (c17 && o72.x1.l0(r2Var)) {
            g4Var.c(0, 3, 0, rVar.getContext().getResources().getString(com.tencent.mm.R.string.ccj), com.tencent.mm.R.raw.icons_filled_share);
        }
        g4Var.c(0, 2, 0, rVar.getContext().getResources().getString(com.tencent.mm.R.string.f491195ca4), com.tencent.mm.R.raw.tag_filled);
        g4Var.c(0, 0, 0, rVar.getContext().getResources().getString(com.tencent.mm.R.string.c_f), com.tencent.mm.R.raw.icons_filled_delete);
        g4Var.c(0, 1, 0, rVar.getContext().getResources().getString(com.tencent.mm.R.string.cbi), com.tencent.mm.R.raw.icons_filled_multiple_choice);
    }
}
