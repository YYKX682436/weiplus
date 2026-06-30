package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class l1 {
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f176712J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public long U;
    public long W;

    /* renamed from: a, reason: collision with root package name */
    public int f176713a;

    /* renamed from: a0, reason: collision with root package name */
    public java.lang.String f176714a0;

    /* renamed from: b, reason: collision with root package name */
    public int f176715b;

    /* renamed from: c, reason: collision with root package name */
    public int f176716c;

    /* renamed from: d, reason: collision with root package name */
    public int f176717d;

    /* renamed from: e, reason: collision with root package name */
    public byte f176718e;

    /* renamed from: f, reason: collision with root package name */
    public byte f176719f;

    /* renamed from: g, reason: collision with root package name */
    public byte f176720g;

    /* renamed from: h, reason: collision with root package name */
    public byte f176721h;

    /* renamed from: i, reason: collision with root package name */
    public byte f176722i;

    /* renamed from: j, reason: collision with root package name */
    public byte f176723j;

    /* renamed from: k, reason: collision with root package name */
    public int f176724k;

    /* renamed from: m, reason: collision with root package name */
    public int f176726m;

    /* renamed from: n, reason: collision with root package name */
    public int f176727n;

    /* renamed from: o, reason: collision with root package name */
    public int f176728o;

    /* renamed from: p, reason: collision with root package name */
    public int f176729p;

    /* renamed from: q, reason: collision with root package name */
    public int f176730q;

    /* renamed from: r, reason: collision with root package name */
    public int f176731r;

    /* renamed from: s, reason: collision with root package name */
    public int f176732s;

    /* renamed from: t, reason: collision with root package name */
    public int f176733t;

    /* renamed from: u, reason: collision with root package name */
    public int f176734u;

    /* renamed from: v, reason: collision with root package name */
    public int f176735v;

    /* renamed from: w, reason: collision with root package name */
    public int f176736w;

    /* renamed from: x, reason: collision with root package name */
    public int f176737x;

    /* renamed from: y, reason: collision with root package name */
    public int f176738y;

    /* renamed from: z, reason: collision with root package name */
    public int f176739z;

    /* renamed from: l, reason: collision with root package name */
    public long f176725l = 0;
    public final long[] V = new long[6];
    public long X = 0;
    public long Y = 0;
    public int Z = 0;

    public l1() {
        f();
    }

    public void a() {
        if (this.f176712J == 0) {
            this.f176736w = 0;
        } else {
            this.f176736w = (int) (java.lang.System.currentTimeMillis() - this.f176712J);
        }
        vq4.d0.c("MicroMsg.VoipDailReport", "devin:answerInvite current:" + java.lang.System.currentTimeMillis());
        vq4.d0.c("MicroMsg.VoipDailReport", "devin:answerInvite:" + this.f176736w);
    }

    public void b() {
        this.B = java.lang.System.currentTimeMillis();
        vq4.d0.c("MicroMsg.VoipDailReport", "devin:beginTalk:" + this.B);
    }

    public void c() {
        if (this.f176725l == 0) {
            this.f176733t = 0;
        } else {
            this.f176733t = (int) (java.lang.System.currentTimeMillis() - this.f176725l);
        }
        vq4.d0.c("MicroMsg.VoipDailReport", "devin:beginTime:" + this.f176725l + ", CurrentTime: " + java.lang.System.currentTimeMillis());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("devin:endNewDial:");
        sb6.append(this.f176733t);
        vq4.d0.c("MicroMsg.VoipDailReport", sb6.toString());
    }

    public java.lang.String d() {
        return "," + ((int) this.f176723j);
    }

    public void e() {
        if (0 == this.F) {
            this.F = java.lang.System.currentTimeMillis();
            vq4.d0.c("MicroMsg.VoipDailReport", "rudp accept received timestamp:" + this.F);
        }
    }

    public void f() {
        this.B = 0L;
        this.H = 0L;
        this.I = 0L;
        this.f176712J = 0L;
        this.S = 0L;
        this.T = 0L;
        this.U = 0L;
        this.C = 0L;
        this.D = 0L;
        this.F = 0L;
        this.E = 0L;
        this.G = 0L;
        this.K = 0L;
        this.L = 0L;
        this.M = 0L;
        this.N = 0L;
        this.O = 0L;
        this.P = 0L;
        this.Q = 0L;
        this.R = 0L;
        this.f176726m = 0;
        this.f176727n = 0;
        this.f176728o = 0;
        this.f176729p = 0;
        this.f176730q = 0;
        this.f176731r = 0;
        this.f176732s = 0;
        this.f176733t = 0;
        this.f176734u = 0;
        this.f176735v = 0;
        this.f176736w = 0;
        this.f176737x = 0;
        this.f176738y = 0;
        this.f176739z = 0;
        this.A = 0;
        java.util.Arrays.fill(this.V, 0L);
    }

    public void g(long j17) {
        if (j17 > 800000000) {
            return;
        }
        long[] jArr = this.V;
        if (0 <= j17 && j17 <= 500) {
            jArr[0] = jArr[0] + 1;
            return;
        }
        if (500 < j17 && j17 <= 1000) {
            jArr[1] = jArr[1] + 1;
            return;
        }
        if (1000 < j17 && j17 <= 2000) {
            jArr[2] = jArr[2] + 1;
            return;
        }
        if (2000 < j17 && j17 <= 4000) {
            jArr[3] = jArr[3] + 1;
        } else if (4000 >= j17 || j17 > 8000) {
            jArr[5] = jArr[5] + 1;
        } else {
            jArr[4] = jArr[4] + 1;
        }
    }
}
