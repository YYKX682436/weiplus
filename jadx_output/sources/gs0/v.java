package gs0;

/* loaded from: classes14.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.w f275025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.media.ImageReader f275026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rs0.h f275027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f275028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f275029h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f275030i;

    public v(gs0.w wVar, android.media.ImageReader imageReader, rs0.h hVar, int i17, int i18, int i19) {
        this.f275025d = wVar;
        this.f275026e = imageReader;
        this.f275027f = hVar;
        this.f275028g = i17;
        this.f275029h = i18;
        this.f275030i = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.g gVar = rs0.i.f399296a;
        android.view.Surface surface = this.f275026e.getSurface();
        rs0.h hVar = this.f275027f;
        rs0.h n17 = rs0.g.n(gVar, surface, null, 0, 0, hVar.f399294c, 14, null);
        gs0.w wVar = this.f275025d;
        wVar.f275039i = n17;
        wVar.f275038h = new os0.g(0, 0, 0, 0, 1, 15, null);
        os0.g gVar2 = wVar.f275038h;
        if (gVar2 != null) {
            gVar2.u(wVar.f275040j, wVar.f275041k);
        }
        os0.g gVar3 = wVar.f275038h;
        int i17 = this.f275028g;
        if (gVar3 != null) {
            gVar3.U = i17;
        }
        int i18 = this.f275030i;
        int i19 = this.f275029h;
        if (gVar3 != null) {
            gVar3.w(i19, i18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "create rgb2yuvEGLEnvironment:" + wVar.f275039i + ", shareEGLContext:" + hVar.f399294c + ", texId:" + i17 + ", texSize:[" + i19 + ", " + i18 + ']');
    }
}
