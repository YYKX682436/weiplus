package p05;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f350512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f350513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f350514f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(long j17, long j18, yz5.a aVar) {
        super(0);
        this.f350512d = j17;
        this.f350513e = j18;
        this.f350514f = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("FinderLive.FallingGiftEffect", "#glThread overDelay=" + ((java.lang.System.currentTimeMillis() - this.f350512d) - this.f350513e));
        this.f350514f.invoke();
        return jz5.f0.f302826a;
    }
}
