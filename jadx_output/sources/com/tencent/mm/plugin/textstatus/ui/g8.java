package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public final pj4.b0 f173899a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f173900b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f173901c;

    /* renamed from: d, reason: collision with root package name */
    public int f173902d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f173903e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f173904f;

    /* renamed from: g, reason: collision with root package name */
    public long f173905g;

    /* renamed from: h, reason: collision with root package name */
    public long f173906h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f173907i;

    /* renamed from: j, reason: collision with root package name */
    public long f173908j;

    public g8(pj4.b0 curTextStatusExtInfo) {
        kotlin.jvm.internal.o.g(curTextStatusExtInfo, "curTextStatusExtInfo");
        this.f173899a = curTextStatusExtInfo;
        this.f173904f = true;
        this.f173907i = "";
    }

    public final void a(android.content.Context context) {
        pj4.h2 h2Var;
        int i17 = this.f173902d;
        if (i17 == 2) {
            pj4.h2 h2Var2 = (pj4.h2) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 8, pj4.h2.class);
            if (h2Var2 != null) {
                h2Var2.f355091p = this.f173905g * 1000;
                h2Var2.f355094q = this.f173908j;
                h2Var2.S = (int) this.f173906h;
                h2Var2.T = this.f173907i;
                return;
            }
            return;
        }
        if (i17 != 1 || (h2Var = (pj4.h2) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 8, pj4.h2.class)) == null) {
            return;
        }
        h2Var.f355091p = 0L;
        h2Var.f355094q = this.f173908j;
        h2Var.S = (int) this.f173906h;
        h2Var.T = this.f173907i;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "media reset: ");
        this.f173900b = null;
        this.f173901c = null;
        this.f173902d = 0;
        this.f173903e = false;
        this.f173904f = true;
        this.f173905g = 0L;
        this.f173906h = 0L;
        this.f173907i = "";
        this.f173908j = 0L;
    }

    public final void c(bi4.d1 d1Var, java.lang.String str, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        b();
        if (d1Var != null) {
            java.lang.String str2 = d1Var.f354938e;
            if (!(str2 == null || r26.n0.N(str2))) {
                int i17 = d1Var.f354937d.f354974f;
                if (i17 == 1) {
                    this.f173902d = 1;
                    if (!android.text.TextUtils.isEmpty(str)) {
                        java.lang.String a17 = oj4.l.f345818a.a(str);
                        this.f173900b = a17;
                        this.f173901c = a17;
                    }
                    this.f173904f = false;
                } else if (i17 == 2) {
                    this.f173902d = 2;
                    this.f173900b = str;
                    if (str != null) {
                        qc0.d1 wi6 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).wi(str);
                        this.f173905g = (wi6 != null ? wi6.f361366d : 0L) / 1000;
                    }
                    this.f173904f = false;
                    this.f173903e = true;
                }
            }
        }
        long k17 = com.tencent.mm.vfs.w6.k(this.f173900b);
        this.f173908j = k17;
        this.f173906h = k17;
        this.f173907i = kk.k.e(this.f173900b);
        a(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "[updateFromSetStatusParam] media oriLen:" + this.f173906h + " finalLen:" + this.f173908j + " type:" + this.f173902d + ", useDefaultBackground:" + this.f173904f);
    }
}
