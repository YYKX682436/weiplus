package d94;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f227538a;

    /* renamed from: b, reason: collision with root package name */
    public int f227539b;

    /* renamed from: c, reason: collision with root package name */
    public int f227540c;

    /* renamed from: d, reason: collision with root package name */
    public int f227541d;

    /* renamed from: e, reason: collision with root package name */
    public float f227542e;

    /* renamed from: f, reason: collision with root package name */
    public float f227543f;

    /* renamed from: g, reason: collision with root package name */
    public float f227544g;

    /* renamed from: h, reason: collision with root package name */
    public int f227545h;

    /* renamed from: i, reason: collision with root package name */
    public float f227546i;

    @za4.k1(resType = 2)
    public java.lang.String imgUrl;

    /* renamed from: j, reason: collision with root package name */
    public float f227547j;

    /* renamed from: k, reason: collision with root package name */
    public int f227548k;

    /* renamed from: l, reason: collision with root package name */
    public int f227549l;

    /* renamed from: m, reason: collision with root package name */
    public float f227550m;

    /* renamed from: n, reason: collision with root package name */
    public float f227551n;

    /* renamed from: o, reason: collision with root package name */
    public float f227552o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f227553p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f227554q = false;

    public static d94.f b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        java.lang.String str2 = (java.lang.String) map.get(str + ".imgUrl");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".imgW"), 0);
        int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".imgH"), 0);
        if (android.text.TextUtils.isEmpty(str2) || D1 == 0 || D12 == 0) {
            com.tencent.mars.xlog.Log.e("ParticleAnimConfig", "parseFromXml err, w=" + D1 + ", h=" + D12 + ", url=" + str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            return null;
        }
        d94.f fVar = new d94.f();
        fVar.imgUrl = str2;
        fVar.f227539b = D1;
        fVar.f227538a = D12;
        fVar.f227540c = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".animCountMax"), 0);
        fVar.f227541d = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".animPerSecond"), 0);
        fVar.f227542e = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".scaleInitMin"));
        fVar.f227543f = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".scaleInitMax"));
        fVar.f227544g = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".scaleTarget"));
        fVar.f227545h = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".scaleDuration"), 0);
        fVar.f227546i = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".alphaInitMin"));
        fVar.f227547j = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".alphaInitMax"));
        fVar.f227548k = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".fadeOutDuration"), 0);
        fVar.f227549l = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".fadeOutDelay"), 0);
        fVar.f227550m = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".speedMin"));
        fVar.f227551n = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".speedMax"));
        fVar.f227552o = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".fillFactor"));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parseCfg=");
        sb6.append(fVar);
        com.tencent.mars.xlog.Log.i("ParticleAnimConfig", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        return fVar;
    }

    public android.graphics.Bitmap a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        if (android.text.TextUtils.isEmpty(this.imgUrl)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            return null;
        }
        android.graphics.Bitmap bitmap = this.f227553p;
        if (bitmap != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            return bitmap;
        }
        java.lang.String e17 = a84.m.e(this.imgUrl);
        if (android.text.TextUtils.isEmpty(e17) || !com.tencent.mm.vfs.w6.j(e17)) {
            com.tencent.mars.xlog.Log.i("ParticleAnimConfig", "no cache, try download, hash=" + hashCode() + ", isDownloading=" + this.f227554q + ", url=" + this.imgUrl);
            if (!this.f227554q) {
                this.f227554q = true;
                a84.m.d(this.imgUrl, new d94.e(this));
            }
        } else {
            com.tencent.mars.xlog.Log.i("ParticleAnimConfig", "hit local cache, hash=" + hashCode());
            ((ku5.t0) ku5.t0.f312615d).g(new d94.c(this, e17));
        }
        android.graphics.Bitmap bitmap2 = this.f227553p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        return bitmap2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        java.lang.String str = "{imgUrl=" + this.imgUrl + ", imgH=" + this.f227538a + ", imgW=" + this.f227539b + ", animCountMax=" + this.f227540c + ", animPerSecond=" + this.f227541d + ", scaleInitMin=" + this.f227542e + ", scaleInitMax=" + this.f227543f + ", scaleTarget=" + this.f227544g + ", scaleDuration=" + this.f227545h + ", alphaInitMin=" + this.f227546i + ", alphaInitMax=" + this.f227547j + ", fadoutDuration=" + this.f227548k + ", fadoutDelay=" + this.f227549l + ", speedMin=" + this.f227550m + ", speedMax=" + this.f227551n + ", fillFactor=" + this.f227552o + '}';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        return str;
    }
}
