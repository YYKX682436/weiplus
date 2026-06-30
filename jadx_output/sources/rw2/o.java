package rw2;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.t f400619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rw2.t tVar) {
        super(0);
        this.f400619d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        is0.c cVar = new is0.c(false, 15L);
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar.f294395e);
        rw2.t tVar = this.f400619d;
        tVar.f400632i = surfaceTexture;
        tVar.f400631h = new android.view.Surface(tVar.f400632i);
        android.graphics.SurfaceTexture surfaceTexture2 = tVar.f400632i;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(new rw2.n(tVar));
        }
        com.tencent.mars.xlog.Log.i(tVar.f400626c, "createVideoTexture finished texId:" + cVar.f294395e);
        tVar.f400633j = cVar;
        return jz5.f0.f302826a;
    }
}
