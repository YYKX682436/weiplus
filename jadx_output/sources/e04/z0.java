package e04;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f246167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f246168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(yz5.a aVar, long j17) {
        super(0);
        this.f246167d = aVar;
        this.f246168e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a aVar = this.f246167d;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraErrorHelper", "checkShowCameraOpenFailView doShow: " + this.f246168e);
        e04.a1.a(e04.y0.f246158g, java.lang.System.currentTimeMillis());
        return jz5.f0.f302826a;
    }
}
