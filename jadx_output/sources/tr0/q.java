package tr0;

/* loaded from: classes14.dex */
public final class q implements android.hardware.Camera.PictureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f421342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f421343c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f421344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f421345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f421346f;

    public q(tr0.t tVar, int i17, int i18, int i19, long j17, kotlin.coroutines.Continuation continuation) {
        this.f421341a = tVar;
        this.f421342b = i17;
        this.f421343c = i18;
        this.f421344d = i19;
        this.f421345e = j17;
        this.f421346f = continuation;
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, android.hardware.Camera camera) {
        android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(bArr);
        int i17 = this.f421342b;
        int i18 = this.f421343c;
        int i19 = this.f421344d;
        tr0.t tVar = this.f421341a;
        android.graphics.Bitmap y17 = tVar.y(i17, i18, i19, G, !tVar.v());
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f421345e;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera1Impl", "takePicture return >> " + currentTimeMillis);
        as0.a aVar = as0.a.f13425a;
        com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a17 = aVar.a(tVar.f411430d);
        if (a17 != null) {
            a17.X = 1;
        }
        com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a18 = aVar.a(tVar.f411430d);
        if (a18 != null) {
            a18.f55572u = currentTimeMillis;
        }
        this.f421346f.resumeWith(kotlin.Result.m521constructorimpl(y17));
    }
}
