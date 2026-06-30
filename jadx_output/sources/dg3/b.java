package dg3;

/* loaded from: classes3.dex */
public final class b implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f232317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dg3.k f232318e;

    public b(o25.y1 y1Var, dg3.k kVar) {
        this.f232317d = y1Var;
        this.f232318e = kVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var != null) {
            g4Var.clear();
        }
        dg3.k kVar = this.f232318e;
        androidx.appcompat.app.AppCompatActivity activity = kVar.getActivity();
        kotlin.jvm.internal.o.d(g4Var);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = kVar.f232332d;
        kotlin.jvm.internal.o.d(k0Var);
        ((com.tencent.mm.pluginsdk.forward.m) this.f232317d).wi(activity, g4Var, k0Var);
    }
}
