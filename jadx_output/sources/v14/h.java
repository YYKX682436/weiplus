package v14;

/* loaded from: classes.dex */
public final class h implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v14.p f432545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432546b;

    public h(v14.p pVar, java.lang.String str) {
        this.f432545a = pVar;
        this.f432546b = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        v14.p pVar = this.f432545a;
        q75.c.f(destPath, pVar.getActivity());
        dp.a.makeText(pVar.getActivity(), pVar.getActivity().getString(com.tencent.mm.R.string.frx, q75.c.d()), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        boolean j17 = com.tencent.mm.vfs.w6.j(this.f432546b);
        v14.p pVar = this.f432545a;
        dp.a.makeText(pVar.getActivity(), j17 ? pVar.getActivity().getString(com.tencent.mm.R.string.i87) : pVar.getActivity().getString(com.tencent.mm.R.string.ipv), 1).show();
    }
}
