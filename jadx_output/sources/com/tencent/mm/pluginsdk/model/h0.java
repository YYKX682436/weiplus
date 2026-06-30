package com.tencent.mm.pluginsdk.model;

/* loaded from: classes15.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f189328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f189329f;

    public h0(java.lang.String str, int i17, long j17) {
        this.f189327d = str;
        this.f189328e = i17;
        this.f189329f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = com.tencent.mm.pluginsdk.model.i0.f189341b;
        java.lang.String str = this.f189327d;
        com.tencent.mm.pluginsdk.model.e0 e0Var = (com.tencent.mm.pluginsdk.model.e0) hashMap.get(str);
        if (e0Var == null) {
            e0Var = new com.tencent.mm.pluginsdk.model.e0(str);
            hashMap.put(str, e0Var);
        }
        java.util.HashMap hashMap2 = e0Var.f189285f;
        int i17 = this.f189328e;
        com.tencent.mm.pluginsdk.model.d0 d0Var = (com.tencent.mm.pluginsdk.model.d0) hashMap2.get(java.lang.Integer.valueOf(i17));
        if (d0Var == null) {
            d0Var = new com.tencent.mm.pluginsdk.model.d0(e0Var.f189284e, i17);
            hashMap2.put(java.lang.Integer.valueOf(i17), d0Var);
        }
        if (d0Var.f189270a == 0) {
            d0Var.f189270a = 1;
        }
        long j17 = this.f189329f;
        if (i17 == 1 || i17 == 2) {
            d0Var.a(j17);
        } else {
            d0Var.a(j17);
        }
    }
}
