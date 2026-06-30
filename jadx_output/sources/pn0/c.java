package pn0;

/* loaded from: classes14.dex */
public class c extends pn0.a {

    /* renamed from: l, reason: collision with root package name */
    public final android.view.Surface f356948l;

    public c(nn0.o oVar, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        super(oVar);
        this.f356948l = new android.view.Surface(surfaceTexture);
        u(i17, i18);
    }

    @Override // pn0.b
    public android.view.Surface getSurface() {
        return this.f356948l;
    }

    @Override // pn0.b
    public void reset() {
    }

    @Override // pn0.b
    public void startPlay() {
    }

    @Override // pn0.b
    public void stopPlay(boolean z17) {
    }

    public c(nn0.o oVar, android.view.Surface surface, int i17, int i18) {
        super(oVar);
        this.f356948l = surface;
        u(i17, i18);
    }
}
