package qp2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f365763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qp2.g f365764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f365765f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z17, qp2.g gVar, r45.qt2 qt2Var) {
        super(0);
        this.f365763d = z17;
        this.f365764e = gVar;
        this.f365765f = qt2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.w("NearbyLiveSquareTabLayoutUIC", "fetchLiveSquareTabs success:" + this.f365763d);
        this.f365764e.c(this.f365765f);
        return jz5.f0.f302826a;
    }
}
