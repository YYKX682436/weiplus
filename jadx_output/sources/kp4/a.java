package kp4;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public int f311071a;

    /* renamed from: b, reason: collision with root package name */
    public int f311072b;

    /* renamed from: c, reason: collision with root package name */
    public int f311073c;

    /* renamed from: d, reason: collision with root package name */
    public long f311074d;

    /* renamed from: e, reason: collision with root package name */
    public long f311075e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f311078h;

    /* renamed from: j, reason: collision with root package name */
    public long f311080j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f311082l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f311083m;

    /* renamed from: f, reason: collision with root package name */
    public float f311076f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f311077g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f311079i = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f311081k = 1;

    public abstract long a();

    public abstract float b();

    public abstract long c();

    public abstract long d();

    public abstract boolean e();

    public final void f() {
        float f17 = (float) (this.f311075e - this.f311074d);
        float f18 = this.f311076f;
        long j17 = f17 / f18;
        int ceil = (int) java.lang.Math.ceil(f18);
        java.util.LinkedList linkedList = this.f311077g;
        linkedList.clear();
        int i17 = j17 >= 1000 ? 500 : 200;
        for (int i18 = 0; i18 < ceil; i18++) {
            kp4.m mVar = new kp4.m();
            long j18 = i17;
            long c17 = a06.d.c((((float) (((i18 * j17) + this.f311074d) + (j17 / 2))) * 1.0f) / i17) * j18;
            mVar.f311124a = c17;
            long j19 = this.f311075e;
            if (c17 >= j19) {
                mVar.f311124a = ((j19 - 1) / j18) * j18;
            }
            linkedList.add(mVar);
        }
    }

    public final void g() {
        float d17 = (float) d();
        float f17 = this.f311076f;
        long j17 = d17 / f17;
        int ceil = (int) java.lang.Math.ceil(f17);
        java.util.LinkedList linkedList = this.f311077g;
        linkedList.clear();
        for (int i17 = 0; i17 < ceil; i17++) {
            kp4.m mVar = new kp4.m();
            long j18 = 500;
            long c17 = a06.d.c((((float) ((i17 * j17) + (j17 / 2))) * 1.0f) / 500) * j18;
            mVar.f311124a = c17;
            if (c17 >= d()) {
                mVar.f311124a = ((d() - 1) / j18) * j18;
            }
            linkedList.add(mVar);
        }
    }
}
