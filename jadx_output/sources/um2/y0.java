package um2;

/* loaded from: classes3.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f429094e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(0);
        this.f429093d = h0Var;
        this.f429094e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = ((android.view.View) this.f429093d.f310123d).findViewById(com.tencent.mm.R.id.f484560eo0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.ha((android.view.ViewGroup) findViewById, this.f429094e);
    }
}
