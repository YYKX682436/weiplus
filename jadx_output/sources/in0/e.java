package in0;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in0.q f292747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(in0.q qVar, long j17) {
        super(1);
        this.f292747d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        go0.i0.b(this.f292747d.f420771r, surfaceTexture, false, 2, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        return jz5.f0.f302826a;
    }
}
