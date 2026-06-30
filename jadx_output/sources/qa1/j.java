package qa1;

/* loaded from: classes14.dex */
public class j implements qa1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa1.k f361002a;

    public j(qa1.k kVar) {
        this.f361002a = kVar;
    }

    @Override // qa1.o
    public void onDone() {
        qa1.k kVar = this.f361002a;
        qa1.m mVar = kVar.f361003a.f361004a;
        if (mVar.f361009h.f361011g.g(mVar.f361005d)) {
            kVar.f361003a.f361004a.f361007f.invoke(java.lang.Boolean.TRUE);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameGLSurfaceView", "switch record not support!");
            kVar.f361003a.f361004a.f361007f.invoke(java.lang.Boolean.FALSE);
        }
    }
}
