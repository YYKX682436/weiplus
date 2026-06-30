package nv2;

/* loaded from: classes2.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nv2.w1 f340591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f340592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(nv2.w1 w1Var, int i17) {
        super(0);
        this.f340591d = w1Var;
        this.f340592e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nv2.n1 n1Var = nv2.n1.f340551h;
        nv2.w1 w1Var = this.f340591d;
        n1Var.n(w1Var, this.f340592e);
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        feedUpdateEvent.f54252g.f6918a = w1Var.f340612d;
        feedUpdateEvent.e();
        return jz5.f0.f302826a;
    }
}
