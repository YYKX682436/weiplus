package km1;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f309020d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(km1.s sVar) {
        super(1);
        this.f309020d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f309020d.onFrameAvailable(it);
        return jz5.f0.f302826a;
    }
}
