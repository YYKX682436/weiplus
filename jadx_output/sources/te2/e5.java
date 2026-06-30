package te2;

/* loaded from: classes.dex */
public final class e5 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f417975a;

    public e5(te2.p8 p8Var) {
        this.f417975a = p8Var;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        te2.p8 p8Var = this.f417975a;
        db5.t7.i(p8Var.getActivity(), p8Var.getActivity().getResources().getString(com.tencent.mm.R.string.e1i), com.tencent.mm.R.raw.icons_filled_done);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        te2.p8 p8Var = this.f417975a;
        db5.t7.i(p8Var.getActivity(), p8Var.getActivity().getResources().getString(com.tencent.mm.R.string.e1h), com.tencent.mm.R.raw.icons_filled_close);
    }
}
