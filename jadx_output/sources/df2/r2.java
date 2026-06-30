package df2;

/* loaded from: classes.dex */
public final class r2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f231215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f231216e;

    public r2(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context) {
        this.f231215d = k0Var;
        this.f231216e = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f231215d.o(null);
        g4Var.clear();
        android.content.Context context = this.f231216e;
        g4Var.d(1, context.getResources().getColor(com.tencent.mm.R.color.f479323wd), context.getResources().getString(com.tencent.mm.R.string.f491605dn1));
    }
}
