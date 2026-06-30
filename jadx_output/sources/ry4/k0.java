package ry4;

/* loaded from: classes.dex */
public final class k0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401657d;

    public k0(ry4.d1 d1Var) {
        this.f401657d = d1Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        ry4.d1 d1Var = this.f401657d;
        g4Var.i(1, d1Var.getActivity().getString(com.tencent.mm.R.string.pjv), d1Var.getActivity().getResources().getColor(com.tencent.mm.R.color.f478532ac), 0, 0);
    }
}
