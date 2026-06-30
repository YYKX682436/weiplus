package tz0;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f423203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1.n f423204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f423205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f423206g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17, g1.n nVar, float f17, long j18) {
        super(1);
        this.f423203d = j17;
        this.f423204e = nVar;
        this.f423205f = f17;
        this.f423206g = j18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.i Canvas = (g1.i) obj;
        kotlin.jvm.internal.o.g(Canvas, "$this$Canvas");
        tz0.q.b(Canvas, 0.0f, 360.0f, this.f423203d, this.f423204e, 0.0f, 16, null);
        tz0.q.b(Canvas, 270.0f, 360.0f * this.f423205f, this.f423206g, this.f423204e, 0.0f, 16, null);
        return jz5.f0.f302826a;
    }
}
