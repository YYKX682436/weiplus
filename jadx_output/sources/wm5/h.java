package wm5;

/* loaded from: classes10.dex */
public final class h extends wm5.a {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.xeffect.VLogDirector f447355e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.xeffect.effect.EffectManager f447356f;

    /* renamed from: g, reason: collision with root package name */
    public volatile wm5.f f447357g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f447358h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f447359i;

    /* renamed from: k, reason: collision with root package name */
    public int f447361k;

    /* renamed from: l, reason: collision with root package name */
    public int f447362l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.tav.coremedia.TextureInfo f447363m;

    /* renamed from: q, reason: collision with root package name */
    public wm5.c f447367q;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f447354d = "VLogDirectorMultiVideoCompositionEffect";

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Rect f447360j = new android.graphics.Rect();

    /* renamed from: n, reason: collision with root package name */
    public final wm5.e f447364n = new wm5.e("renderTracks");

    /* renamed from: o, reason: collision with root package name */
    public boolean f447365o = true;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f447366p = true;

    @Override // wm5.a
    public void b(int i17, int i18) {
        xm5.b.c("BaseMultiVideoCompositionEffect", "updateRenderSize width:" + i17 + ", height:" + i18, new java.lang.Object[0]);
        this.f447342b = new android.util.Size(i17, i18);
        if (this.f447361k == i17 && this.f447362l == i18) {
            return;
        }
        this.f447361k = i17;
        this.f447362l = i18;
        com.tencent.mm.xeffect.VLogDirector vLogDirector = this.f447355e;
        if (vLogDirector != null) {
            vLogDirector.g(0, 0, i17, i18);
        }
        com.tencent.mm.xeffect.VLogDirector vLogDirector2 = this.f447355e;
        if (vLogDirector2 != null) {
            int i19 = this.f447361k;
            int i27 = this.f447362l;
            vLogDirector2.f214799c = i19;
            vLogDirector2.f214800d = i27;
        }
        this.f447359i = true;
    }

    @Override // wm5.a, com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter
    public void release() {
        java.lang.String str;
        super.release();
        if (this.f447366p) {
            com.tencent.mm.xeffect.VLogDirector vLogDirector = this.f447355e;
            if (vLogDirector != null) {
                vLogDirector.b();
            }
            com.tencent.tav.coremedia.TextureInfo textureInfo = this.f447363m;
            if (textureInfo != null) {
                textureInfo.release();
            }
            this.f447363m = null;
            wm5.f fVar = this.f447357g;
            if (fVar != null) {
                fVar.b();
            }
            if (this.f447365o) {
                java.lang.String str2 = this.f447354d;
                wm5.e eVar = this.f447364n;
                if (eVar.f447350c <= 0 || eVar.f447349b <= 0) {
                    str = "";
                } else {
                    str = eVar.f447348a + " totalFrame:" + eVar.f447350c + ", totalTime:" + eVar.f447349b + ", average cost:" + (eVar.f447349b / eVar.f447350c);
                }
                xm5.b.c(str2, str, new java.lang.Object[0]);
            }
        }
    }
}
