package yg0;

/* loaded from: classes.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg0.s3 f462304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f462305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f462306f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(zg0.s3 s3Var, kotlin.jvm.internal.c0 c0Var, int i17) {
        super(0);
        this.f462304d = s3Var;
        this.f462305e = c0Var;
        this.f462306f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Qk(false, this.f462304d.f472780a.hashCode(), false);
        com.tencent.mm.autogen.events.WebSearchHalfScreenEnterFullScreenEvent webSearchHalfScreenEnterFullScreenEvent = new com.tencent.mm.autogen.events.WebSearchHalfScreenEnterFullScreenEvent();
        webSearchHalfScreenEnterFullScreenEvent.f54981g.f6896a = this.f462306f;
        webSearchHalfScreenEnterFullScreenEvent.e();
        this.f462305e.f310112d = true;
        return jz5.f0.f302826a;
    }
}
