package um2;

/* loaded from: classes3.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f428772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f428773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(0);
        this.f428772d = h0Var;
        this.f428773e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = ((android.view.View) this.f428772d.f310123d).findViewById(com.tencent.mm.R.id.f6d);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.lv((com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer) findViewById, this.f428773e);
    }
}
