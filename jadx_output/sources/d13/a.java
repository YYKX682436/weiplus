package d13;

/* loaded from: classes14.dex */
public final class a implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d13.c f225721d;

    public a(d13.c cVar) {
        this.f225721d = cVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        d13.b bVar;
        android.util.Size size = (android.util.Size) obj;
        if (size == null || (bVar = this.f225721d.f225723e) == null) {
            return;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        b13.g gVar = (b13.g) bVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "onSurfaceTextureSizeChanged: width=" + width + ", height=" + height);
        gVar.f17102a.j(gVar.f17103b, width, height, gVar.f17104c);
    }
}
