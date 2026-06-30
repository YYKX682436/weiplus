package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public class y0 {

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.media.x0 f185834k = new com.tencent.mm.plugin.webview.ui.tools.media.x0(null);

    /* renamed from: b, reason: collision with root package name */
    public long f185836b;

    /* renamed from: c, reason: collision with root package name */
    public int f185837c;

    /* renamed from: d, reason: collision with root package name */
    public int f185838d;

    /* renamed from: f, reason: collision with root package name */
    public int f185840f;

    /* renamed from: g, reason: collision with root package name */
    public int f185841g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f185842h;

    /* renamed from: i, reason: collision with root package name */
    public int f185843i;

    /* renamed from: j, reason: collision with root package name */
    public int f185844j;

    /* renamed from: a, reason: collision with root package name */
    public long f185835a = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f185839e = "";

    public final int a() {
        int i17 = this.f185843i;
        if (i17 == 1) {
            return 4;
        }
        if (i17 == 2) {
            return 8;
        }
        if (i17 != 3) {
            return i17 != 4 ? 3 : 10;
        }
        return 9;
    }

    public final void b(ot0.m1 m1Var, int i17, int i18, int i19) {
        if (m1Var == null || this.f185844j == i17) {
            return;
        }
        this.f185844j = i17;
        if (m1Var.f348588z == -1) {
            try {
                android.net.Uri parse = android.net.Uri.parse(m1Var.f373339d);
                m1Var.f348588z = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("mid"), 0L);
                m1Var.A = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("idx"), 0);
            } catch (java.lang.Exception unused) {
                m1Var.f348588z = 0L;
            }
        }
        switch (i17) {
            case 2:
            case 7:
            case 8:
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                this.f185836b += currentTimeMillis - this.f185835a;
                this.f185835a = currentTimeMillis;
                break;
            case 3:
            case 4:
            case 9:
            case 10:
                this.f185835a = java.lang.System.currentTimeMillis();
                break;
        }
        com.tencent.mm.plugin.webview.ui.tools.media.x0 x0Var = f185834k;
        if (i17 == 3) {
            java.lang.String videoVid = m1Var.f373341f;
            kotlin.jvm.internal.o.f(videoVid, "videoVid");
            java.lang.String mpUrl = m1Var.f373339d;
            kotlin.jvm.internal.o.f(mpUrl, "mpUrl");
            x0Var.e(0, videoVid, mpUrl, 141, this.f185841g, 0, i18);
        } else if (i17 == 4) {
            java.lang.String videoVid2 = m1Var.f373341f;
            kotlin.jvm.internal.o.f(videoVid2, "videoVid");
            java.lang.String mpUrl2 = m1Var.f373339d;
            kotlin.jvm.internal.o.f(mpUrl2, "mpUrl");
            x0Var.e(1, videoVid2, mpUrl2, 141, this.f185841g, 0, i18);
        } else if (i17 == 10) {
            java.lang.String videoVid3 = m1Var.f373341f;
            kotlin.jvm.internal.o.f(videoVid3, "videoVid");
            java.lang.String mpUrl3 = m1Var.f373339d;
            kotlin.jvm.internal.o.f(mpUrl3, "mpUrl");
            x0Var.e(2, videoVid3, mpUrl3, 141, this.f185841g, 0, i18);
        }
        int h17 = ot0.g0.h();
        if (h17 == 100) {
            h17 = -1;
        }
        com.tencent.mm.autogen.mmdata.rpt.MPVideoLandingPageEventStruct mPVideoLandingPageEventStruct = new com.tencent.mm.autogen.mmdata.rpt.MPVideoLandingPageEventStruct();
        mPVideoLandingPageEventStruct.f58907e = mPVideoLandingPageEventStruct.b("BizUserName", m1Var.f373348p, true);
        mPVideoLandingPageEventStruct.f58913k = i17;
        mPVideoLandingPageEventStruct.f58911i = mPVideoLandingPageEventStruct.b("VideoId", m1Var.f373341f, true);
        mPVideoLandingPageEventStruct.f58906d = h17;
        mPVideoLandingPageEventStruct.f58908f = m1Var.f348588z;
        mPVideoLandingPageEventStruct.f58909g = m1Var.A;
        mPVideoLandingPageEventStruct.f58910h = i18;
        mPVideoLandingPageEventStruct.f58912j = m1Var.f373344i;
        mPVideoLandingPageEventStruct.f58918p = this.f185840f;
        mPVideoLandingPageEventStruct.f58919q = this.f185841g;
        mPVideoLandingPageEventStruct.f58923u = m1Var.f373345m;
        mPVideoLandingPageEventStruct.f58922t = m1Var.f373346n;
        mPVideoLandingPageEventStruct.B = i19;
        if (this.f185836b == 0 && this.f185835a != 0) {
            this.f185836b = java.lang.System.currentTimeMillis() - this.f185835a;
        }
        mPVideoLandingPageEventStruct.f58915m = this.f185836b;
        mPVideoLandingPageEventStruct.f58917o = this.f185838d;
        mPVideoLandingPageEventStruct.f58914l = java.lang.System.currentTimeMillis() / 1000;
        mPVideoLandingPageEventStruct.f58916n = this.f185837c;
        mPVideoLandingPageEventStruct.f58920r = mPVideoLandingPageEventStruct.b("PlayErrType", this.f185839e, true);
        mPVideoLandingPageEventStruct.f58925w = 2L;
        mPVideoLandingPageEventStruct.f58921s = this.f185842h ? 1L : 0L;
        mPVideoLandingPageEventStruct.f58926x = 1L;
        mPVideoLandingPageEventStruct.k();
        if (i17 == 1 || i17 == 2) {
            this.f185836b = 0L;
            this.f185835a = java.lang.System.currentTimeMillis();
            this.f185838d = 0;
        }
    }
}
