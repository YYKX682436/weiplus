package in2;

/* loaded from: classes10.dex */
public final class b implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f292807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292808e;

    public b(in2.s sVar, android.view.View view) {
        this.f292807d = sVar;
        this.f292808e = view;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            int i17 = this.f292807d.L;
            android.view.View view = this.f292808e;
            g4Var.d(i17, view.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), view.getContext().getResources().getString(com.tencent.mm.R.string.p1o));
        }
    }
}
