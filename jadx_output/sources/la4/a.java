package la4;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public r45.jj4 f317542a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f317543b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f317544c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317545d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317546e;

    /* renamed from: f, reason: collision with root package name */
    public int f317547f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f317548g;

    /* renamed from: h, reason: collision with root package name */
    public ca4.s0 f317549h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f317550i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f317551j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f317552k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.storage.s7 f317553l;

    /* renamed from: m, reason: collision with root package name */
    public float f317554m;

    /* renamed from: n, reason: collision with root package name */
    public int f317555n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f317556o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f317557p;

    /* renamed from: q, reason: collision with root package name */
    public final android.util.SparseArray f317558q;

    /* renamed from: r, reason: collision with root package name */
    public final int f317559r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f317560s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f317561t;

    public a(java.lang.String str) {
        this.f317543b = "";
        this.f317544c = "";
        this.f317545d = false;
        this.f317546e = false;
        this.f317547f = 0;
        this.f317548g = "";
        this.f317549h = null;
        this.f317550i = "";
        this.f317551j = "";
        this.f317552k = "";
        this.f317554m = 0.0f;
        this.f317555n = 0;
        this.f317543b = str;
    }

    public int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEncIdx", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        int i17 = this.f317547f;
        if (i17 == 10) {
            int i18 = this.f317542a.f377867p1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEncIdx", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            return i18;
        }
        if (i17 == 11) {
            int i19 = this.f317542a.C1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEncIdx", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            return i19;
        }
        int i27 = this.f317545d ? this.f317542a.K : this.f317542a.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEncIdx", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return i27;
    }

    public java.lang.String b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaDownloadPath", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaDownloadPath", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return d17;
    }

    public java.lang.String c(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaFileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        java.lang.String a07 = ca4.z0.a0(jj4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaFileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return a07;
    }

    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPath", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f317551j)) {
            java.lang.String str = this.f317551j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPath", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            return str;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f317550i)) {
            i();
        }
        java.lang.String str2 = this.f317550i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPath", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return str2;
    }

    public int e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReqDownType", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        int i17 = this.f317547f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReqDownType", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return i17;
    }

    public java.lang.String f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReqKey", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        java.lang.String str = this.f317548g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReqKey", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return str;
    }

    public java.lang.String g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getToken", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        int i17 = this.f317547f;
        if (i17 == 10) {
            java.lang.String str = this.f317542a.f377861l1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getToken", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            return str;
        }
        if (i17 == 11) {
            java.lang.String str2 = this.f317542a.B1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getToken", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            return str2;
        }
        java.lang.String str3 = this.f317545d ? this.f317542a.f377854J : this.f317542a.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getToken", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return str3;
    }

    public java.lang.String h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getfileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        int i17 = this.f317547f;
        if (i17 != 4) {
            if (i17 != 6) {
                java.lang.String a07 = this.f317545d ? ca4.z0.a0(this.f317542a) : ca4.z0.W(this.f317542a);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getfileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                return a07;
            }
            r45.jj4 jj4Var = this.f317542a;
            android.os.Vibrator vibrator = ca4.z0.f40068a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTmpAdSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            java.lang.String str = "sns_tmpsad_" + ca4.z0.s(jj4Var.f377855d);
            if (jj4Var.D == 1) {
                str = l21.c.a(str + ca4.z0.f0(jj4Var), jj4Var.E);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpAdSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpAdSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getfileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            return str;
        }
        java.lang.String str2 = this.f317543b;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !str2.contains("SlideFullCardAd_")) {
            java.lang.String Y = ca4.z0.Y(this.f317542a);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getfileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            return Y;
        }
        com.tencent.mars.xlog.Log.i("ParamsToLocalId", "preload, mediaId = " + str2);
        r45.jj4 jj4Var2 = this.f317542a;
        android.os.Vibrator vibrator2 = ca4.z0.f40068a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlideFullCardAdSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str3 = "sns_slide_full_card_ad_tmps_" + ca4.z0.s(jj4Var2.f377855d);
        if (jj4Var2.D == 1) {
            str3 = l21.c.a(str3 + ca4.z0.f0(jj4Var2), jj4Var2.E);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlideFullCardAdSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlideFullCardAdSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getfileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return str3;
    }

    public boolean i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        this.f317550i = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), this.f317543b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return true;
    }

    public la4.a j(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReqDownype", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        this.f317547f = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReqDownype", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return this;
    }

    public la4.a k(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRequestKey", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        this.f317548g = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRequestKey", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return this;
    }

    public la4.a l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSpec", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        this.f317551j = str;
        this.f317552k = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSpec", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return this;
    }

    public a(java.lang.String str, android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2, int i17) {
        this.f317543b = "";
        this.f317544c = "";
        this.f317545d = false;
        this.f317546e = false;
        this.f317547f = 0;
        this.f317548g = "";
        this.f317549h = null;
        this.f317550i = "";
        this.f317551j = "";
        this.f317552k = "";
        this.f317554m = 0.0f;
        this.f317555n = 0;
        this.f317556o = str;
        this.f317557p = sparseArray;
        this.f317558q = sparseArray2;
        this.f317559r = i17;
    }
}
