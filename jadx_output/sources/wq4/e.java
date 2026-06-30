package wq4;

/* loaded from: classes13.dex */
public abstract class e implements wq4.i {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f448626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.video.GLTextureView f448627b;

    public e(com.tencent.mm.plugin.voip.video.GLTextureView gLTextureView, int[] iArr) {
        this.f448627b = gLTextureView;
        if (gLTextureView.f177038o == 2) {
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i17 = length - 1;
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i17);
            iArr2[i17] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            iArr = iArr2;
        }
        this.f448626a = iArr;
    }

    @Override // wq4.i
    public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay) {
        javax.microedition.khronos.egl.EGLConfig eGLConfig;
        int[] iArr = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, this.f448626a, null, 0, iArr)) {
            throw new java.lang.IllegalArgumentException("eglChooseConfig failed");
        }
        int i17 = 0;
        int i18 = iArr[0];
        if (i18 <= 0) {
            throw new java.lang.IllegalArgumentException("No configs match configSpec");
        }
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i18];
        if (!egl10.eglChooseConfig(eGLDisplay, this.f448626a, eGLConfigArr, i18, iArr)) {
            throw new java.lang.IllegalArgumentException("eglChooseConfig#2 failed");
        }
        wq4.f fVar = (wq4.f) this;
        while (true) {
            if (i17 >= i18) {
                eGLConfig = null;
                break;
            }
            eGLConfig = eGLConfigArr[i17];
            int a17 = fVar.a(egl10, eGLDisplay, eGLConfig, 12325, 0);
            int a18 = fVar.a(egl10, eGLDisplay, eGLConfig, 12326, 0);
            if (a17 >= fVar.f448634h && a18 >= fVar.f448635i) {
                int a19 = fVar.a(egl10, eGLDisplay, eGLConfig, 12324, 0);
                int a27 = fVar.a(egl10, eGLDisplay, eGLConfig, 12323, 0);
                int a28 = fVar.a(egl10, eGLDisplay, eGLConfig, 12322, 0);
                int a29 = fVar.a(egl10, eGLDisplay, eGLConfig, 12321, 0);
                if (a19 == fVar.f448630d && a27 == fVar.f448631e && a28 == fVar.f448632f && a29 == fVar.f448633g) {
                    break;
                }
            }
            i17++;
        }
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new java.lang.IllegalArgumentException("No config chosen");
    }
}
