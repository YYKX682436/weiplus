package um2;

/* loaded from: classes3.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f429012e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(0);
        this.f429011d = h0Var;
        this.f429012e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = ((android.view.View) this.f429011d.f310123d).findViewById(com.tencent.mm.R.id.f485624id5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.k80((android.view.ViewGroup) findViewById, this.f429012e);
    }
}
