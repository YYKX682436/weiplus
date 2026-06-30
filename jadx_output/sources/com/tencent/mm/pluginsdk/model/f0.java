package com.tencent.mm.pluginsdk.model;

/* loaded from: classes15.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f189294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f189295f;

    public f0(java.lang.String str, int i17, long j17) {
        this.f189293d = str;
        this.f189294e = i17;
        this.f189295f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.model.d0 d0Var;
        com.tencent.mm.pluginsdk.model.e0 e0Var = (com.tencent.mm.pluginsdk.model.e0) com.tencent.mm.pluginsdk.model.i0.f189341b.get(this.f189293d);
        if (e0Var == null || (d0Var = (com.tencent.mm.pluginsdk.model.d0) e0Var.f189285f.get(java.lang.Integer.valueOf(this.f189294e))) == null) {
            return;
        }
        int i17 = d0Var.f189270a;
        if (i17 == 2 || i17 == 3) {
            if (i17 == 2 && this.f189295f < 0) {
                java.lang.System.currentTimeMillis();
            }
            d0Var.f189270a = 4;
        }
    }
}
