package zf4;

/* loaded from: classes13.dex */
public class w implements com.tencent.mm.modelbase.g1 {

    /* renamed from: i, reason: collision with root package name */
    public static int f472694i = 100;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.modelbase.f1 f472696b;

    /* renamed from: a, reason: collision with root package name */
    public w21.k0 f472695a = null;

    /* renamed from: c, reason: collision with root package name */
    public int f472697c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472698d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f472699e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f472700f = 0;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f472702h = new com.tencent.mm.sdk.platformtools.b4(new zf4.t(this), true);

    /* renamed from: g, reason: collision with root package name */
    public final tf4.b f472701g = new tf4.b(new zf4.s(this));

    @Override // com.tencent.mm.modelbase.g1
    public java.lang.String a() {
        return this.f472698d;
    }

    @Override // com.tencent.mm.modelbase.g1
    public void b(com.tencent.mm.modelbase.e1 e1Var) {
    }

    @Override // com.tencent.mm.modelbase.g1
    public long c() {
        long j17 = this.f472699e;
        if (j17 <= 0) {
            return 0L;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return android.os.SystemClock.elapsedRealtime() - j17;
    }

    @Override // com.tencent.mm.modelbase.g1
    public boolean cancel() {
        zf4.q c17;
        synchronized (this) {
            w21.k0 k0Var = this.f472695a;
            if (k0Var != null) {
                k0Var.stopRecord();
            }
        }
        java.lang.String str = this.f472698d;
        if (str != null && (c17 = zf4.r.c(str)) != null) {
            c17.field_status = 8;
            c17.field_totallen = zf4.i.a(zf4.r.b(str, false));
            c17.U = 64;
            zf4.r.f(c17);
        }
        zf4.l.Ai().c();
        this.f472698d = "";
        return true;
    }

    @Override // com.tencent.mm.modelbase.g1
    public int d() {
        w21.k0 k0Var = this.f472695a;
        if (k0Var == null) {
            return 0;
        }
        int d17 = k0Var.d();
        if (d17 > f472694i) {
            f472694i = d17;
        }
        int i17 = f472694i;
        int i18 = d17 * 100;
        int i19 = i18 / i17;
        return i18 / i17;
    }

    @Override // com.tencent.mm.modelbase.g1
    public int e() {
        return 0;
    }

    @Override // com.tencent.mm.modelbase.g1
    public void f() {
    }

    @Override // com.tencent.mm.modelbase.g1
    public boolean g(java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String y07 = zf4.b0.y0(c01.z1.r());
        zf4.q qVar = new zf4.q();
        qVar.field_filename = y07;
        qVar.field_user = str;
        qVar.field_createtime = java.lang.System.currentTimeMillis() / 1000;
        qVar.field_clientid = y07;
        qVar.field_lastmodifytime = java.lang.System.currentTimeMillis() / 1000;
        qVar.field_status = 1;
        qVar.field_human = c01.z1.r();
        qVar.U = -1;
        zf4.b0 Bi = zf4.l.Bi();
        Bi.getClass();
        if (((int) Bi.f472649d.l("VoiceRemindInfo", "", qVar.convertTo())) == -1) {
            y07 = null;
        }
        this.f472698d = y07;
        tf4.b bVar = this.f472701g;
        bVar.q("record");
        int r17 = bVar.r("record", 4);
        bVar.f418951l = false;
        if (r17 != 0) {
            bVar.o(100);
        } else {
            new tf4.a(bVar).sendEmptyMessageDelayed(0, 50L);
        }
        return false;
    }

    @Override // com.tencent.mm.modelbase.g1
    public void h(com.tencent.mm.modelbase.f1 f1Var) {
        this.f472696b = f1Var;
    }

    @Override // com.tencent.mm.modelbase.g1
    public boolean i() {
        w21.k0 k0Var = this.f472695a;
        return k0Var != null && k0Var.f442419c == 1;
    }

    @Override // com.tencent.mm.modelbase.g1
    public com.tencent.mm.storage.f9 j() {
        return null;
    }

    @Override // com.tencent.mm.modelbase.g1
    public int k() {
        return this.f472697c;
    }

    @Override // com.tencent.mm.modelbase.g1
    public void reset() {
        w21.k0 k0Var = this.f472695a;
        if (k0Var != null) {
            k0Var.stopRecord();
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceRemindRecorder", "Reset recorder.stopReocrd");
        }
        this.f472698d = "";
        this.f472700f = 0;
        this.f472699e = 0L;
    }

    @Override // com.tencent.mm.modelbase.g1
    public boolean stop() {
        zf4.q c17;
        ym1.f.Ai("record").q("record");
        synchronized (this) {
            w21.k0 k0Var = this.f472695a;
            if (k0Var != null) {
                k0Var.stopRecord();
            }
        }
        boolean z17 = false;
        if (this.f472700f != 2) {
            zf4.r.a(this.f472698d);
            this.f472698d = null;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
        } else {
            int c18 = (int) c();
            this.f472697c = c18;
            if (c18 < 800 || c18 < 1000) {
                zf4.r.a(this.f472698d);
                this.f472698d = "";
            } else {
                java.lang.String str = this.f472698d;
                if (str != null && (c17 = zf4.r.c(str)) != null) {
                    int i17 = c17.field_status;
                    if (i17 != 97 && i17 != 98) {
                        c17.field_status = 3;
                    }
                    int a17 = zf4.i.a(zf4.r.b(str, false));
                    c17.field_totallen = a17;
                    if (a17 <= 0) {
                        zf4.r.e(str);
                    } else {
                        c17.field_lastmodifytime = java.lang.System.currentTimeMillis() / 1000;
                        c17.field_voicelenght = c18;
                        c17.U = 3424;
                        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                        f9Var.u1(c17.field_user);
                        f9Var.setType(34);
                        f9Var.j1(1);
                        if (!pt0.f0.f358209b1.j()) {
                            f9Var.i1(str);
                        }
                        int i18 = c17.field_status;
                        if (i18 == 97) {
                            f9Var.r1(2);
                            f9Var.d1(zf4.p.a(c17.field_human, c17.field_voicelenght, false));
                        } else if (i18 == 98) {
                            f9Var.r1(5);
                            f9Var.d1(zf4.p.a(c17.field_human, -1L, true));
                        } else {
                            f9Var.r1(1);
                        }
                        f9Var.e1(c01.w9.o(c17.field_user));
                        c17.field_msglocalid = (int) c01.w9.x(f9Var);
                        zf4.r.f(c17);
                    }
                }
                zf4.l.Ai().c();
                z17 = true;
            }
            this.f472698d = "";
        }
        this.f472700f = -1;
        return z17;
    }
}
