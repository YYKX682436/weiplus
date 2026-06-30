package um2;

/* loaded from: classes3.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f429000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f429001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429002f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(um2.x5 x5Var, com.tencent.mm.plugin.finder.live.view.k0 k0Var, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f429000d = x5Var;
        this.f429001e = k0Var;
        this.f429002f = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f429000d;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f429001e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) x5Var.e(com.tencent.mm.R.id.f_u, k0Var);
        android.view.View findViewById = k0Var.findViewById(com.tencent.mm.R.id.f484804fl0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new zi2.w(viewGroup, k0Var, (com.tencent.mm.plugin.finder.live.view.FinderLiveShadeView) findViewById, (android.view.ViewGroup) ((android.view.View) this.f429002f.f310123d).findViewById(com.tencent.mm.R.id.f_x));
    }
}
