package q41;

/* loaded from: classes11.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f360039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f360040f;

    public d(java.lang.String str, k41.g0 g0Var, long j17) {
        this.f360038d = str;
        this.f360039e = g0Var;
        this.f360040f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f360038d;
        if (str == null) {
            str = "";
        }
        int i17 = 1;
        if (str.length() == 0) {
            i17 = 0;
        } else if (com.tencent.mm.storage.z3.m4(str)) {
            i17 = 3;
        } else if (com.tencent.mm.storage.z3.p4(str)) {
            i17 = 6;
        } else if (c01.e2.E(str)) {
            i17 = 4;
        } else if (com.tencent.mm.storage.z3.q4(str)) {
            i17 = 5;
        } else if (com.tencent.mm.storage.z3.R4(str)) {
            i17 = 2;
        }
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        k41.g0 g0Var = this.f360039e;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23393, g0Var.field_username, g0Var.field_nickname, g0Var.field_openImAppId, ((l41.q2) b0Var).fj(g0Var.field_openImAppId, g0Var.field_openImDescWordingId), 13, 0, java.lang.Integer.valueOf(i17), this.f360038d, g0Var.field_finderUsername, java.lang.Long.valueOf(this.f360040f), java.lang.Integer.valueOf(g0Var.field_kefuType));
    }
}
