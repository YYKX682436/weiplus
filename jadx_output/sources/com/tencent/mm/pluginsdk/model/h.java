package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public final class h implements zq1.v {

    /* renamed from: a, reason: collision with root package name */
    public final int f189325a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f189326b;

    public h(int i17) {
        this.f189325a = i17;
    }

    public void a(java.lang.String str) {
        if (str != null && this.f189326b == null) {
            com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
            int p17 = com.tencent.mm.sdk.platformtools.v3.p(com.tencent.mm.pluginsdk.model.b0.f189199c, "refreshInterval-".concat(str), 0, 2, null);
            if (p17 < 10) {
                p17 = 10;
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(str.concat("-live-UpdateTimer"), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.pluginsdk.model.g(this, str), true);
            this.f189326b = b4Var;
            b4Var.c(0L, (p17 * 1000) / 2);
        }
    }

    public void b() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f189326b;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            this.f189326b = null;
        }
    }
}
