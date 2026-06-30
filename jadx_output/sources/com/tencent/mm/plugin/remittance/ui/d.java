package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f157664a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.mn0 f157665b;

    /* renamed from: c, reason: collision with root package name */
    public r45.mn0 f157666c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f157667d;

    public d() {
        this.f157664a = null;
        this.f157665b = null;
        this.f157666c = null;
        this.f157667d = false;
    }

    public final int a() {
        java.util.Iterator it = b().f380690f.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((r45.ln0) it.next()).f379655m == 0) {
                i17++;
            }
        }
        return i17;
    }

    public r45.mn0 b() {
        r45.mn0 mn0Var = this.f157666c;
        return mn0Var != null ? mn0Var : this.f157665b;
    }

    public long c() {
        long j17 = 0;
        if (this.f157665b == null) {
            return 0L;
        }
        java.util.Iterator it = b().f380690f.iterator();
        while (it.hasNext()) {
            r45.ln0 ln0Var = (r45.ln0) it.next();
            if (ln0Var.f379655m == 0 && ln0Var.f379657o) {
                j17 += ln0Var.f379652g;
            }
        }
        return j17;
    }

    public boolean d() {
        return b() != null && b().f380690f.size() > 0;
    }

    public d(android.content.Context context, r45.mn0 mn0Var) {
        this.f157664a = null;
        this.f157665b = null;
        this.f157666c = null;
        this.f157667d = false;
        this.f157664a = context;
        this.f157665b = mn0Var;
        if (mn0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtraBuyInfoHelper", "no extra buy info");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtraBuyInfoHelper", "init. title = %s, detail count = %d", mn0Var.f380689e, java.lang.Integer.valueOf(mn0Var.f380690f.size()));
        java.util.Iterator it = mn0Var.f380690f.iterator();
        while (it.hasNext()) {
            r45.ln0 ln0Var = (r45.ln0) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtraBuyInfoHelper", "extra buy item: %d, %s", java.lang.Long.valueOf(ln0Var.f379649d), ln0Var.f379650e);
        }
    }
}
