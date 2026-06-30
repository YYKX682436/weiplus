package hd2;

/* loaded from: classes.dex */
public final class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f280467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280468e;

    public e(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context) {
        this.f280467d = k0Var;
        this.f280468e = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f280467d.o(null);
        g4Var.clear();
        android.content.Context context = this.f280468e;
        g4Var.j(20002, context.getResources().getString(com.tencent.mm.R.string.o1q), com.tencent.mm.R.raw.finder_icons_filled_share, context.getResources().getColor(com.tencent.mm.R.color.f478502m, null), false);
        g4Var.j(20003, context.getResources().getString(com.tencent.mm.R.string.o1r), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, false);
    }
}
