package jb4;

/* loaded from: classes14.dex */
public abstract class c extends jb4.b {

    /* renamed from: c, reason: collision with root package name */
    public final int[] f298775c;

    /* renamed from: d, reason: collision with root package name */
    public final int f298776d;

    /* renamed from: e, reason: collision with root package name */
    public final int f298777e;

    /* renamed from: f, reason: collision with root package name */
    public final int f298778f;

    /* renamed from: g, reason: collision with root package name */
    public final int f298779g;

    /* renamed from: h, reason: collision with root package name */
    public final int f298780h;

    /* renamed from: i, reason: collision with root package name */
    public final int f298781i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView f298782j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView gLTextureView, int i17, int i18, int i19, int i27, int i28, int i29) {
        super(gLTextureView, new int[]{12324, i17, 12323, i18, 12322, i19, 12321, i27, 12325, i28, 12326, i29, 12344});
        this.f298782j = gLTextureView;
        this.f298775c = new int[1];
        this.f298776d = i17;
        this.f298777e = i18;
        this.f298778f = i19;
        this.f298779g = i27;
        this.f298780h = i28;
        this.f298781i = i29;
    }

    public final int a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findConfigAttrib", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser");
        int[] iArr = this.f298775c;
        if (!egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i17, iArr)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findConfigAttrib", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser");
            return i18;
        }
        int i19 = iArr[0];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findConfigAttrib", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser");
        return i19;
    }
}
