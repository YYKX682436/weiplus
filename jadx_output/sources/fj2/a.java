package fj2;

/* loaded from: classes.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f263158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263159e;

    public a(kotlin.jvm.internal.h0 h0Var, int i17, android.content.Context context) {
        this.f263158d = h0Var;
        this.f263159e = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = (com.tencent.mm.ui.widget.dialog.k0) this.f263158d.f310123d;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        android.content.Context context = this.f263159e;
        g4Var.d(0, context.getResources().getColor(com.tencent.mm.R.color.f479323wd), context.getResources().getString(com.tencent.mm.R.string.d6o));
    }
}
