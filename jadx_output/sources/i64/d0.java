package i64;

/* loaded from: classes4.dex */
public class d0 {
    public final java.lang.String G;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.SnsObject f289134b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f289135c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f289136d;

    /* renamed from: h, reason: collision with root package name */
    public int f289140h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f289141i;

    /* renamed from: j, reason: collision with root package name */
    public final int f289142j;

    /* renamed from: k, reason: collision with root package name */
    public int f289143k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f289144l;

    /* renamed from: m, reason: collision with root package name */
    public final long f289145m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.ADXml f289146n;

    /* renamed from: a, reason: collision with root package name */
    public boolean f289133a = false;

    /* renamed from: e, reason: collision with root package name */
    public int f289137e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f289138f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f289139g = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f289147o = -10086;

    /* renamed from: p, reason: collision with root package name */
    public int f289148p = -10086;

    /* renamed from: q, reason: collision with root package name */
    public int f289149q = -10086;

    /* renamed from: r, reason: collision with root package name */
    public long f289150r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f289151s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f289152t = -10086;

    /* renamed from: u, reason: collision with root package name */
    public long f289153u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f289154v = -10086;

    /* renamed from: w, reason: collision with root package name */
    public long f289155w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f289156x = 0;

    /* renamed from: y, reason: collision with root package name */
    public long f289157y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f289158z = 0;
    public int A = -1;
    public int B = -1;
    public int C = 0;
    public int D = 0;
    public boolean E = false;
    public int F = 0;
    public boolean H = false;

    public d0(com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, java.lang.String str, long j17, android.view.View view, int i17, android.view.View view2, int i18, int i19, com.tencent.mm.protocal.protobuf.SnsObject snsObject, int i27, com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
        this.f289142j = 0;
        java.lang.String str2 = "";
        this.f289144l = "";
        this.f289145m = 0L;
        this.G = "";
        this.f289135c = view;
        this.f289134b = snsObject;
        this.f289146n = aDXml;
        if (aDInfo != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        }
        if (aDInfo != null) {
            java.lang.String str3 = aDInfo.uxInfo;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str3 != null) {
                str2 = str3;
            }
        }
        this.f289144l = str2;
        this.G = str;
        this.f289145m = j17;
        this.f289140h = i17;
        this.f289141i = view2;
        this.f289142j = i18;
        if (view != null) {
            this.f289136d = view.findViewById(com.tencent.mm.R.id.f482875qh);
        }
        c();
    }

    public void a(boolean z17) {
        boolean z18;
        boolean z19;
        boolean z27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calc", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        android.view.View view = this.f289135c;
        if (view != null) {
            c();
            boolean z28 = this.E;
            int i17 = this.f289138f;
            if (z28 || i17 <= 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calc", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                return;
            }
            boolean z29 = true;
            this.f289133a = true;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i18 = (iArr[1] - this.f289143k) - this.f289142j;
            int i19 = this.f289138f;
            int i27 = i18 + i19;
            if (i18 < 0 || i27 < 0 || i27 > this.f289140h) {
                this.F = 0;
            } else {
                this.F = 1;
                this.H = true;
            }
            if (this.f289147o == -10086 && this.f289148p == -10086) {
                this.f289147o = i18;
                this.f289148p = i27;
            }
            this.f289149q = i18;
            int i28 = this.f289139g;
            if (i18 < 0) {
                int i29 = i19 - i27;
                if (i27 < i28 || this.f289152t != -10086) {
                    z19 = true;
                } else {
                    this.f289152t = i18;
                    this.f289153u = java.lang.System.currentTimeMillis();
                    z19 = false;
                }
                if (i29 >= this.f289139g && this.f289154v == -10086 && z19 && this.f289153u > 0) {
                    this.f289154v = i18;
                    this.f289155w = java.lang.System.currentTimeMillis();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcHalfVisibleState", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                int i37 = this.f289139g;
                if (i27 >= i37) {
                    this.H = true;
                    z27 = false;
                } else {
                    z27 = true;
                }
                if (i29 >= i37 && z27) {
                    this.H = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcHalfVisibleState", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            }
            int i38 = this.f289140h;
            if (i27 > i38) {
                int i39 = i27 - i38;
                int i47 = this.f289138f - i39;
                if (i47 < this.f289139g || this.f289152t != -10086) {
                    z18 = true;
                } else {
                    this.f289152t = i18;
                    this.f289153u = java.lang.System.currentTimeMillis();
                    z18 = false;
                }
                if (i39 >= this.f289139g && this.f289154v == -10086 && z18 && this.f289153u > 0) {
                    this.f289154v = i18;
                    this.f289155w = java.lang.System.currentTimeMillis();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcHalfVisibleState", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                int i48 = this.f289139g;
                if (i47 >= i48) {
                    this.H = true;
                    z29 = false;
                }
                if (i39 >= i48 && z29) {
                    this.H = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcHalfVisibleState", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            }
            if (i18 < 0 || i27 > this.f289140h) {
                if (this.f289157y == 0 && this.f289156x != 0) {
                    this.f289157y = java.lang.System.currentTimeMillis();
                }
            } else if (this.f289156x == 0) {
                this.f289156x = java.lang.System.currentTimeMillis();
            }
            if (i18 < 0) {
                int i49 = -i18;
                int i57 = this.A;
                if (i57 == -1 || i57 > i49) {
                    this.A = i49;
                }
            } else {
                this.A = 0;
            }
            int i58 = this.f289140h;
            if (i27 > i58) {
                int i59 = i27 - i58;
                int i66 = this.B;
                if (i66 == -1 || i66 > i59) {
                    this.B = i59;
                }
            } else {
                this.B = 0;
            }
            int i67 = this.f289138f;
            if (i18 < 0) {
                i67 += i18;
            }
            if (i27 > i58) {
                i67 -= i27 - i58;
            }
            int i68 = this.f289158z;
            if (i68 == -1 || i68 < i67) {
                this.f289158z = i67;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calc", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r45.h3 b() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i64.d0.b():r45.h3");
    }

    public final void c() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        if (this.f289138f == 0 && (view = this.f289135c) != null) {
            this.f289138f = view.getHeight();
            android.view.View view2 = this.f289136d;
            if (view2 != null && view2.getVisibility() == 0) {
                this.f289137e = view2.getHeight();
            }
            if (this.f289138f == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                return;
            }
            this.f289143k = 0;
            android.view.View view3 = this.f289141i;
            if (view3 != null) {
                this.f289143k = view3.getHeight();
            }
            int i17 = this.f289138f - this.f289137e;
            this.f289138f = i17;
            this.f289139g = i17 / 2;
            int i18 = this.f289140h - this.f289143k;
            int i19 = this.f289142j;
            this.f289140h = i18 - i19;
            com.tencent.mars.xlog.Log.i("MicroMsg.AdViewStatic", "viewHeight " + this.f289138f + " SCREEN_HEIGHT: " + this.f289140h + " abottom: " + this.f289143k + " stHeight: " + i19 + " commentViewHeight:" + this.f289137e);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
    }
}
