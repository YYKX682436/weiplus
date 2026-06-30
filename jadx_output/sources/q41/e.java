package q41;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f360041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f360042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q41.a f360043f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360044g;

    public e(k41.g0 g0Var, int i17, q41.a aVar, java.lang.String str) {
        this.f360041d = g0Var;
        this.f360042e = i17;
        this.f360043f = aVar;
        this.f360044g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        k41.g0 g0Var = this.f360041d;
        java.lang.String fj6 = ((l41.q2) b0Var).fj(g0Var.field_openImAppId, g0Var.field_openImDescWordingId);
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[17];
        objArr[0] = g0Var.field_username;
        objArr[1] = g0Var.field_nickname;
        objArr[2] = g0Var.field_openImAppId;
        objArr[3] = fj6;
        objArr[4] = java.lang.Integer.valueOf(this.f360042e);
        objArr[5] = 0;
        objArr[6] = 0;
        objArr[7] = "";
        objArr[8] = g0Var.field_finderUsername;
        objArr[9] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr[10] = java.lang.Integer.valueOf(g0Var.field_kefuType);
        q41.a aVar = this.f360043f;
        java.lang.String str = aVar.f360026b;
        if (str == null) {
            str = "";
        }
        objArr[11] = str;
        objArr[12] = java.lang.Integer.valueOf(aVar.f360025a);
        java.lang.String str2 = aVar.f360027c;
        if (str2 == null) {
            str2 = "";
        }
        objArr[13] = str2;
        objArr[14] = java.lang.Integer.valueOf(aVar.f360028d ? 1 : 2);
        java.lang.String str3 = this.f360044g;
        objArr[15] = str3 != null ? str3 : "";
        objArr[16] = java.lang.Integer.valueOf(aVar.f360029e ? 1 : 2);
        g0Var2.d(23393, objArr);
    }
}
