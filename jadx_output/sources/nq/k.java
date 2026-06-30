package nq;

/* loaded from: classes13.dex */
public class k extends nq.j {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f338883b;

    /* renamed from: c, reason: collision with root package name */
    public final int f338884c;

    /* renamed from: d, reason: collision with root package name */
    public final int f338885d;

    /* renamed from: e, reason: collision with root package name */
    public final int f338886e;

    /* renamed from: f, reason: collision with root package name */
    public final int f338887f;

    /* renamed from: g, reason: collision with root package name */
    public final int f338888g;

    /* renamed from: h, reason: collision with root package name */
    public final int f338889h;

    public k(com.tencent.mm.dynamicbackground.view.GameGLSurfaceView gameGLSurfaceView, int i17, int i18, int i19, int i27, int i28, int i29) {
        super(gameGLSurfaceView, new int[]{12324, i17, 12323, i18, 12322, i19, 12321, i27, 12325, i28, 12326, i29, 12344});
        this.f338883b = new int[1];
        this.f338884c = i17;
        this.f338885d = i18;
        this.f338886e = i19;
        this.f338887f = i27;
        this.f338888g = i28;
        this.f338889h = i29;
    }

    public final int a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17, int i18) {
        int[] iArr = this.f338883b;
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i17, iArr) ? iArr[0] : i18;
    }
}
