package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public class y0 implements com.tencent.mm.plugin.fts.ui.widget.j1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f138364a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f138365b = "";

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.b1 f138366c;

    public y0(com.tencent.mm.plugin.fts.ui.widget.b1 b1Var) {
        this.f138366c = b1Var;
    }

    public void a(int i17, int i18, int i19) {
        com.tencent.mm.plugin.fts.ui.widget.b1 b1Var = this.f138366c;
        b1Var.f138248c = false;
        c();
        if (i17 == 12) {
            b1Var.f138247b.c(false, true, this.f138364a);
        } else {
            b1Var.f138247b.c(false, false, this.f138364a);
        }
    }

    public final void b() {
        if (this.f138364a.length() > 0) {
            this.f138364a = this.f138364a.replaceAll("。", " ").replaceAll("\\.", " ").replaceAll("，", " ").replaceAll(",", " ").trim();
        }
        com.tencent.mm.plugin.fts.ui.widget.b1 b1Var = this.f138366c;
        b1Var.f138250e.setText(this.f138364a);
        b1Var.f138251f.setVisibility(0);
        b1Var.f138247b.b(this.f138364a);
    }

    public final void c() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.fts.ui.widget.b1 b1Var = this.f138366c;
        b1Var.f138254i = currentTimeMillis;
        long j17 = b1Var.f138253h;
        if (j17 <= 0) {
            j17 = b1Var.f138254i;
        }
        b1Var.f138253h = j17;
        int i17 = com.tencent.mm.sdk.platformtools.t8.K0(this.f138364a) ? 2 : 1;
        long j18 = b1Var.f138253h;
        long j19 = b1Var.f138252g;
        long j27 = j18 - j19;
        long j28 = b1Var.f138254i - j19;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16346, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(o13.p.f342250c), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28));
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSVoiceInputHelper", "16346 actionType:%s, searchId:%s, voiceTime:%s, tranTime:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(o13.p.f342250c), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28));
        b1Var.f138252g = 0L;
        b1Var.f138253h = 0L;
        b1Var.f138254i = 0L;
    }
}
