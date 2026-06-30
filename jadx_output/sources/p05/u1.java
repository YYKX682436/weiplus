package p05;

/* loaded from: classes.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f350695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f350696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f350697f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(long j17, long j18, yz5.a aVar) {
        super(0);
        this.f350695d = j17;
        this.f350696e = j18;
        this.f350697f = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#glThread overDelay=" + ((java.lang.System.currentTimeMillis() - this.f350695d) - this.f350696e));
        this.f350697f.invoke();
        return jz5.f0.f302826a;
    }
}
