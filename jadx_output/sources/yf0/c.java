package yf0;

/* loaded from: classes12.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf0.f f461511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f461512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p25.e f461513f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yf0.f fVar, boolean z17, p25.e eVar) {
        super(1);
        this.f461511d = fVar;
        this.f461512e = z17;
        this.f461513f = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f461511d.d());
        sb6.append(' ');
        sb6.append(this.f461512e ? ya.b.ORIGIN : "");
        sb6.append(" invokeOnCancellation");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoCGISendApi", sb6.toString());
        ((z25.d) this.f461513f).f();
        return jz5.f0.f302826a;
    }
}
