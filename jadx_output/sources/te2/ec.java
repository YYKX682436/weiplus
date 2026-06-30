package te2;

/* loaded from: classes.dex */
public final class ec implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f417986d;

    public ec(te2.hc hcVar) {
        this.f417986d = hcVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            te2.hc hcVar = this.f417986d;
            g4Var.d(4, hcVar.getActivity().getResources().getColor(com.tencent.mm.R.color.f478532ac), hcVar.getActivity().getResources().getString(com.tencent.mm.R.string.f491733e22));
        }
    }
}
