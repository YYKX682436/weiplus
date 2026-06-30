package rw2;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f400616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rw2.t f400617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.graphics.SurfaceTexture surfaceTexture, rw2.t tVar) {
        super(0);
        this.f400616d = surfaceTexture;
        this.f400617e = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.SurfaceTexture surfaceTexture = this.f400616d;
        surfaceTexture.updateTexImage();
        rw2.t.a(this.f400617e, surfaceTexture.getTimestamp());
        return jz5.f0.f302826a;
    }
}
