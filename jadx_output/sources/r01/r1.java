package r01;

/* loaded from: classes9.dex */
public class r1 {

    /* renamed from: j, reason: collision with root package name */
    public static long f368216j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static int f368217k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f368218l = 9;

    /* renamed from: c, reason: collision with root package name */
    public i11.e f368221c;

    /* renamed from: e, reason: collision with root package name */
    public final int f368223e;

    /* renamed from: i, reason: collision with root package name */
    public r45.j16 f368227i;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f368219a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f368220b = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f368222d = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f368224f = false;

    /* renamed from: g, reason: collision with root package name */
    public final l75.z0 f368225g = new r01.n1(this);

    /* renamed from: h, reason: collision with root package name */
    public final i11.c f368226h = new r01.o1(this);

    public r1() {
        this.f368223e = 10;
        int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "BrandService", "continueLocationReportInterval"), 5);
        this.f368223e = P;
        if (P < 2) {
            this.f368223e = 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportLocation", "reportLocation interval %d", java.lang.Integer.valueOf(this.f368223e));
    }

    public static void c(java.lang.String username, long j17) {
        long j18 = f368216j;
        int i17 = f368217k;
        int i18 = f368218l;
        r01.j jVar = r01.j.f368119a;
        kotlin.jvm.internal.o.g(username, "username");
        r01.j.b(r01.j.f368119a, 6, username, null, null, null, j18, i17, java.lang.Long.valueOf(j17), i18, null, 512, null);
    }

    public static void d(com.tencent.mm.storage.f9 f9Var, long j17, int i17, int i18) {
        int i19 = f368218l;
        r01.j jVar = r01.j.f368119a;
        if (f9Var == null || f9Var.A0() == 1) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).a(new r01.h(f9Var, j17, i17, i18, i19));
    }

    public final void a(java.lang.String str, int i17, int i18, float f17, float f18, int i19, java.util.LinkedList linkedList) {
        b(str, i17, i18, f17, f18, i19, linkedList, 0, null, null);
    }

    public final void b(java.lang.String str, int i17, int i18, float f17, float f18, int i19, java.util.LinkedList linkedList, int i27, r45.j16 j16Var, r45.l36 l36Var) {
        java.lang.String format = i18 == 3 ? "<event></event>" : java.lang.String.format("<event><location><errcode>%d</errcode><data><latitude>%f</latitude><longitude>%f</longitude><precision>%d</precision></data></location></event>", java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i19));
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportLocation", "doScene, info: %s", format);
        gm0.j1.n().f273288b.g(new r01.g3(str, i17, format, linkedList, this.f368222d, i27, j16Var, l36Var));
    }

    public void e(r45.j16 j16Var, java.lang.String str) {
        int i17;
        if (j16Var == null || (i17 = j16Var.f377498f) <= 0) {
            return;
        }
        int min = java.lang.Math.min(i17, 30);
        j16Var.f377501i = 0;
        j16Var.f377502m = 0;
        android.database.Cursor M4 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M4(str, min, 0L);
        while (M4.moveToNext()) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.convertFrom(M4);
            if (f9Var.A0() != 1) {
                if (f9Var.a3()) {
                    j16Var.f377502m++;
                } else {
                    c01.ea w17 = c01.w9.w(f9Var.G);
                    if (w17 != null && w17.f37143b == 3) {
                        j16Var.f377501i++;
                    }
                }
            }
        }
        M4.close();
    }

    public void f(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportLocation", "Start report");
        this.f368219a = str;
        qk.o b17 = r01.z.b(str);
        if (b17 == null) {
            return;
        }
        if (this.f368220b != 0) {
            g();
        }
        this.f368220b = 0;
        if (b17.U0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportLocation", "need update contact %s", str);
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(str);
        }
        qk.n D0 = b17.D0(false);
        if (D0 == null) {
            return;
        }
        if (!D0.o() || !b17.u0()) {
            if (!D0.o() || b17.u0()) {
                return;
            }
            a(str, 11, 1, 0.0f, 0.0f, 0, null);
            return;
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f368221c = i11.h.e();
        qk.n D02 = b17.D0(false);
        org.json.JSONObject jSONObject = D02.f364256a;
        if (jSONObject != null) {
            D02.f364268m = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("ReportLocationType"), 0) == 2;
        }
        this.f368220b = D02.f364268m ? 3 : 2;
        if (!com.tencent.mm.sdk.platformtools.n2.a() && !com.tencent.mm.sdk.platformtools.n2.b()) {
            a(str, 11, 2, 0.0f, 0.0f, 0, null);
            return;
        }
        ((i11.h) this.f368221c).l(this.f368226h, true, this.f368220b != 2, false);
        com.tencent.mm.plugin.report.service.b1.f(3, 10);
    }

    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportLocation", "Stop report");
        this.f368220b = 0;
        i11.e eVar = this.f368221c;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f368226h);
        }
        if (gm0.j1.b().m()) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f368225g);
        }
    }
}
