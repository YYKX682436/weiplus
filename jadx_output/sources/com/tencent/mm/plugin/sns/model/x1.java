package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f164749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s7 f164751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164752g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i1 f164753h;

    public x1(com.tencent.mm.plugin.sns.model.i1 i1Var, r45.jj4 jj4Var, int i17, com.tencent.mm.storage.s7 s7Var, java.lang.String str) {
        this.f164753h = i1Var;
        this.f164749d = jj4Var;
        this.f164750e = i17;
        this.f164751f = s7Var;
        this.f164752g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$8");
        r45.jj4 jj4Var = this.f164749d;
        java.lang.String str = jj4Var.f377855d;
        int i17 = this.f164750e;
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] run pushToImageLoaderUi decodeType:%d", "[image-flow]", str, java.lang.Integer.valueOf(i17));
        if (!com.tencent.mm.plugin.sns.model.i1.c(this.f164753h, i17, jj4Var, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] run pushToImageLoaderUi false,do net request", "[image-flow]", jj4Var.f377855d);
            ca4.s0 s0Var = new ca4.s0(jj4Var);
            s0Var.d(i17);
            s0Var.e(jj4Var.f377855d);
            com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
            r45.jj4 jj4Var2 = this.f164749d;
            Cj.e(jj4Var2, jj4Var2.f377856e == 6 ? 5 : 1, s0Var, this.f164751f, this.f164752g);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$8");
    }
}
