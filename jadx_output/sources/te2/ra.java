package te2;

/* loaded from: classes.dex */
public final class ra implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418388a;

    public ra(te2.hc hcVar) {
        this.f418388a = hcVar;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        te2.hc hcVar = this.f418388a;
        db5.t7.i(hcVar.getActivity(), hcVar.getActivity().getResources().getString(com.tencent.mm.R.string.e1i), com.tencent.mm.R.raw.icons_filled_done);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        te2.hc hcVar = this.f418388a;
        db5.t7.i(hcVar.getActivity(), hcVar.getActivity().getResources().getString(com.tencent.mm.R.string.e1h), com.tencent.mm.R.raw.icons_filled_close);
    }
}
