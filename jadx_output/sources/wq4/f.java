package wq4;

/* loaded from: classes13.dex */
public abstract class f extends wq4.e {

    /* renamed from: c, reason: collision with root package name */
    public final int[] f448629c;

    /* renamed from: d, reason: collision with root package name */
    public final int f448630d;

    /* renamed from: e, reason: collision with root package name */
    public final int f448631e;

    /* renamed from: f, reason: collision with root package name */
    public final int f448632f;

    /* renamed from: g, reason: collision with root package name */
    public final int f448633g;

    /* renamed from: h, reason: collision with root package name */
    public final int f448634h;

    /* renamed from: i, reason: collision with root package name */
    public final int f448635i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.video.GLTextureView f448636j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.voip.video.GLTextureView gLTextureView, int i17, int i18, int i19, int i27, int i28, int i29) {
        super(gLTextureView, new int[]{12324, i17, 12323, i18, 12322, i19, 12321, i27, 12325, i28, 12326, i29, 12344});
        this.f448636j = gLTextureView;
        this.f448629c = new int[1];
        this.f448630d = i17;
        this.f448631e = i18;
        this.f448632f = i19;
        this.f448633g = i27;
        this.f448634h = i28;
        this.f448635i = i29;
    }

    public final int a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17, int i18) {
        int[] iArr = this.f448629c;
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i17, iArr) ? iArr[0] : i18;
    }
}
