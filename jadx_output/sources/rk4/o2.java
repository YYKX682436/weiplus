package rk4;

/* loaded from: classes11.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f396872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f396873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f396874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f396875g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f396876h;

    public o2(long j17, rk4.l3 l3Var, android.app.Activity activity, bw5.lp0 lp0Var, byte[] bArr) {
        this.f396872d = j17;
        this.f396873e = l3Var;
        this.f396874f = activity;
        this.f396875g = lp0Var;
        this.f396876h = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17 = this.f396872d;
        bw5.d60 d60Var = null;
        bw5.lp0 tingItem = this.f396875g;
        android.app.Activity activity = this.f396874f;
        rk4.l3 l3Var = this.f396873e;
        if (j17 == 1) {
            cl4.v b17 = l3Var.b();
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            b17.k(activity, tingItem, null);
            return;
        }
        if (j17 == 2) {
            cl4.v b18 = l3Var.b();
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            b18.l(activity, tingItem);
        } else if (j17 == 3) {
            cl4.v b19 = l3Var.b();
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            b19.c(activity, tingItem);
        } else if (j17 == 4) {
            try {
                d60Var = new bw5.d60().parseFrom(this.f396876h);
            } catch (java.lang.Exception unused) {
            }
            cl4.v b27 = l3Var.b();
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            b27.h(activity, tingItem, d60Var);
        }
    }
}
