package um2;

/* loaded from: classes3.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f428972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f428973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(0);
        this.f428972d = h0Var;
        this.f428973e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = ((android.view.View) this.f428972d.f310123d).findViewById(com.tencent.mm.R.id.f484711f85);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new pn2.f((android.view.ViewGroup) findViewById, this.f428973e);
    }
}
