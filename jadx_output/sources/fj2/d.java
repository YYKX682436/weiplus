package fj2;

/* loaded from: classes.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f263163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263165f;

    public d(kotlin.jvm.internal.h0 h0Var, int i17, android.content.Context context, java.lang.String str) {
        this.f263163d = h0Var;
        this.f263164e = context;
        this.f263165f = str;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = (com.tencent.mm.ui.widget.dialog.k0) this.f263163d.f310123d;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        g4Var.d(0, this.f263164e.getResources().getColor(com.tencent.mm.R.color.f479323wd), this.f263165f);
    }
}
