package so1;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po1.d f410233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f410234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ro1.h f410235f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(po1.d dVar, boolean z17, ro1.h hVar) {
        super(0);
        this.f410233d = dVar;
        this.f410234e = z17;
        this.f410235f = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[addUDiskDevice] device=");
        po1.d dVar = this.f410233d;
        sb6.append(dVar);
        sb6.append(", isSuccess=");
        boolean z17 = this.f410234e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("DirectDiskDeviceDelegate", sb6.toString());
        ro1.h hVar = this.f410235f;
        if (z17) {
            hVar.a(dVar.f357295a);
        } else {
            hVar.onFailed(-1);
        }
        return jz5.f0.f302826a;
    }
}
