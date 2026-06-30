package nk4;

/* loaded from: classes15.dex */
public final class a implements java.lang.Cloneable {
    public int A;
    public org.json.JSONObject E;
    public org.json.JSONObject F;
    public long G;
    public int H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f338043J;
    public int K;
    public int M;
    public int N;
    public int P;

    /* renamed from: e, reason: collision with root package name */
    public int f338045e;

    /* renamed from: f, reason: collision with root package name */
    public long f338046f;

    /* renamed from: g, reason: collision with root package name */
    public int f338047g;

    /* renamed from: h, reason: collision with root package name */
    public int f338048h;

    /* renamed from: i, reason: collision with root package name */
    public long f338049i;

    /* renamed from: m, reason: collision with root package name */
    public long f338050m;

    /* renamed from: n, reason: collision with root package name */
    public long f338051n;

    /* renamed from: o, reason: collision with root package name */
    public int f338052o;

    /* renamed from: t, reason: collision with root package name */
    public int f338057t;

    /* renamed from: v, reason: collision with root package name */
    public long f338059v;

    /* renamed from: w, reason: collision with root package name */
    public int f338060w;

    /* renamed from: x, reason: collision with root package name */
    public int f338061x;

    /* renamed from: y, reason: collision with root package name */
    public int f338062y;

    /* renamed from: z, reason: collision with root package name */
    public int f338063z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f338044d = "";

    /* renamed from: p, reason: collision with root package name */
    public int f338053p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f338054q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f338055r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f338056s = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f338058u = -1;
    public java.util.concurrent.CopyOnWriteArrayList B = new java.util.concurrent.CopyOnWriteArrayList();
    public java.util.concurrent.CopyOnWriteArrayList C = new java.util.concurrent.CopyOnWriteArrayList();
    public java.lang.String D = "";
    public float L = 1.0f;

    public final nk4.a a() {
        java.lang.Object clone = super.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.report.ExtraPlayInfo");
        nk4.a aVar = (nk4.a) clone;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        aVar.C = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(this.C);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = new java.util.concurrent.CopyOnWriteArrayList();
        aVar.B = copyOnWriteArrayList2;
        copyOnWriteArrayList2.addAll(this.B);
        org.json.JSONObject jSONObject = this.E;
        if (jSONObject != null) {
            aVar.E = new org.json.JSONObject(jSONObject.toString());
        }
        org.json.JSONObject jSONObject2 = this.F;
        if (jSONObject2 != null) {
            aVar.F = new org.json.JSONObject(jSONObject2.toString());
        }
        return aVar;
    }

    public final float b() {
        long j17 = this.f338046f;
        if (j17 == 0) {
            return -1.0f;
        }
        return (this.f338045e * 1000.0f) / ((float) j17);
    }

    public final long c() {
        return this.I;
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    public final long d() {
        return this.f338043J;
    }

    public final org.json.JSONObject e() {
        return this.F;
    }

    public final java.lang.String f() {
        return this.D;
    }

    public final void g() {
        if (this.f338050m == 0 || this.f338046f > 0) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f338050m;
        if (elapsedRealtime >= 0) {
            this.f338046f += elapsedRealtime;
        }
        if (elapsedRealtime > this.f338049i) {
            this.f338049i = elapsedRealtime;
        }
        this.f338050m = 0L;
        com.tencent.mars.xlog.Log.i("OnStopPlayData", "onBlur focusTimeMs:" + elapsedRealtime + " focusMaxTimeMs:" + this.f338049i + " blurFPS:" + b() + ' ' + this.f338044d);
    }

    public final void h() {
        if (this.f338050m != 0) {
            return;
        }
        this.f338050m = android.os.SystemClock.elapsedRealtime();
        this.f338048h++;
        com.tencent.mars.xlog.Log.i("OnStopPlayData", "onFocus focusTotalCount:" + this.f338048h + ' ' + this.f338044d);
    }

    public final void i(long j17, long j18) {
        if (j17 - this.f338051n > 1000) {
            this.B.add(java.lang.Integer.valueOf((int) (j17 / 1000)));
            int i17 = this.f338045e - this.f338052o;
            this.C.add(java.lang.Integer.valueOf(i17));
            int i18 = this.f338056s;
            if (i17 < i18 || i18 == -1) {
                this.f338056s = i17;
            }
            int i19 = this.f338055r;
            if (i17 > i19 || i19 == -1) {
                this.f338055r = i17;
            }
            if (this.f338053p == -1) {
                this.f338053p = i17;
            }
            this.f338054q = i17;
            if (i17 < this.f338058u) {
                this.f338057t++;
            }
            this.f338052o = this.f338045e;
            this.f338051n = j17;
        }
    }

    public final void j(org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        jsonObject.put("stup", this.f338045e);
        jsonObject.put("psta", this.f338047g);
        jsonObject.put("fttm", this.f338046f);
        jsonObject.put("fttc", this.f338048h);
        jsonObject.put("fmtm", this.f338049i);
        jsonObject.put("ffps", java.lang.Float.valueOf(b()));
        jsonObject.put("maxfps", this.f338055r);
        jsonObject.put("minfps", this.f338056s);
        jsonObject.put("fsfps", this.f338053p);
        jsonObject.put("lsfps", this.f338054q);
        jsonObject.put("lvfps", this.f338057t);
        jsonObject.put("mopts", this.f338063z);
        jsonObject.put("mclts", this.A);
        jsonObject.put("hpsz", this.G);
        jsonObject.put("fpsg", 0);
        jsonObject.put("hdcd", this.H);
        jsonObject.put("hpsz2", this.f338059v);
        jsonObject.put("nsdcnt", this.f338060w);
        jsonObject.put("lmbcnt", this.f338061x);
        jsonObject.put("pcnt", this.f338062y);
        jsonObject.put("fileDelete", this.K);
        jsonObject.put("playSpeed", java.lang.Float.valueOf(this.L));
        jsonObject.put("bufCnt", this.M);
        jsonObject.put("appendBuf", this.N);
        jsonObject.put("isMutePlay", this.P);
        java.util.Iterator it = this.B.iterator();
        java.lang.String str = "";
        java.lang.String str2 = "";
        while (it.hasNext()) {
            str2 = str2 + ((java.lang.Integer) it.next()) + ';';
        }
        jsonObject.put("pgsl", str2);
        java.util.Iterator it6 = this.C.iterator();
        while (it6.hasNext()) {
            str = str + ((java.lang.Integer) it6.next()) + ';';
        }
        jsonObject.put("fpsl", str);
        com.tencent.mars.xlog.Log.i("OnStopPlayData", toString());
    }

    public final void k() {
        this.f338045e = 0;
        this.f338046f = 0L;
        this.f338047g = 0;
        this.f338048h = 0;
        this.f338049i = 0L;
        this.f338050m = 0L;
        this.f338051n = -1L;
        this.f338052o = 0;
        this.f338055r = -1;
        this.f338056s = -1;
        this.f338053p = -1;
        this.f338054q = -1;
        this.f338057t = 0;
        this.f338058u = 0;
        this.f338063z = 0;
        this.A = 0;
        this.D = "";
        this.G = 0L;
        this.H = 0;
        this.I = 0L;
        this.f338043J = 0L;
        this.K = 0;
        this.B.clear();
        this.C.clear();
    }

    public java.lang.String toString() {
        return "OnStopPlayData hitPreloadSize:" + this.G + " TextureUpdateCount:" + this.f338045e + " PlayerState:" + this.f338047g + "  FocusTotalTimeMs:" + this.f338046f + " FocusTotalCount:" + this.f338048h + " FocusMaxTimeMs:" + this.f338049i + " FocusFps:" + b() + " lessVideoFpsCount:" + this.f338057t + " videoFps:" + this.f338058u + " focusMinFps:" + this.f338056s + " focusMaxFps:" + this.f338055r + " firstSecondFps:" + this.f338053p + " lastSecondFps:" + this.f338054q + " progressList:" + this.B + " fpsList:" + this.C + " mediaId:" + this.f338044d + " isMute:" + this.P;
    }
}
