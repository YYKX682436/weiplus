package r01;

/* loaded from: classes9.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f368108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f368109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f368110f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f368111g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f368112h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f368113i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f368114m;

    public i(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.f9 f9Var, int i17, int i18, long j17, int i19, int i27) {
        this.f368108d = z3Var;
        this.f368109e = f9Var;
        this.f368110f = i17;
        this.f368111g = i18;
        this.f368112h = j17;
        this.f368113i = i19;
        this.f368114m = i27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r01.j jVar = r01.j.f368119a;
        long j17 = this.f368112h;
        int i17 = this.f368113i;
        int i18 = this.f368114m;
        int i19 = (this.f368111g - this.f368110f) - 1;
        r01.f fVar = new r01.f();
        com.tencent.mm.storage.f9 f9Var = this.f368109e;
        jVar.d(f9Var, fVar);
        jVar.c(f9Var, fVar);
        if (fVar.f368058a <= 0) {
            return;
        }
        java.lang.String.valueOf(j17);
        r01.g e17 = r01.j.e(jVar, f9Var, 0, 2, null);
        com.tencent.mm.storage.z3 z3Var = this.f368108d;
        z3Var.d1();
        f9Var.getCreateTime();
        java.lang.String d17 = z3Var.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        jVar.a(1, d17, f9Var, fVar, e17, j17, i17, null, i18, java.lang.Integer.valueOf(i19));
    }
}
