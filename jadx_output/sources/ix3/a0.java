package ix3;

/* loaded from: classes.dex */
public final class a0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.e0 f295356d;

    public a0(ix3.e0 e0Var) {
        this.f295356d = e0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        ix3.e0 e0Var = this.f295356d;
        android.content.res.Resources resources = e0Var.getContext().getResources();
        g4Var.j(1, resources != null ? resources.getString(com.tencent.mm.R.string.f490559yh) : null, com.tencent.mm.R.raw.icons_filled_share, i65.a.d(e0Var.getActivity(), com.tencent.mm.R.color.f478502m), false);
    }
}
