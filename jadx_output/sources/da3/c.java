package da3;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean[] f227762e = {false};

    /* renamed from: f, reason: collision with root package name */
    public static final boolean[] f227763f = {false};

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.libwxaudio.WxAudioNative f227764a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f227765b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f227766c;

    /* renamed from: d, reason: collision with root package name */
    public final long f227767d;

    public c(java.lang.String str, long j17, long j18, long j19, long j27) {
        boolean[] zArr = f227762e;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
                    try {
                        com.tencent.mm.libwxaudio.c.f68533a.loadLibrary("mmmedia");
                        com.tencent.mm.libwxaudio.c.f68533a.loadLibrary("wxaudio");
                        com.tencent.mm.libwxaudio.WxAudioNative.initAndroidAssetMgr(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets());
                        f227763f[0] = true;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppAudioBinding", e17, "init WxAudioFailed", new java.lang.Object[0]);
                    }
                    f227762e[0] = true;
                }
            }
        }
        this.f227765b = str;
        this.f227767d = j17;
        if (f227763f[0]) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new da3.a(this));
            com.tencent.mm.libwxaudio.WxAudioNative wxAudioNative = new com.tencent.mm.libwxaudio.WxAudioNative(j19, j18, 0L);
            this.f227764a = wxAudioNative;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAudioBinding", "create wxaudio appId:%s ret:%d", str, java.lang.Integer.valueOf(wxAudioNative.InitCallBack(new da3.b(this))));
            this.f227764a.setJsAsyncCall(j27);
        }
    }
}
