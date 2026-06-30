package p05;

/* loaded from: classes14.dex */
public abstract class g1 implements p05.v0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f350524a;

    /* renamed from: b, reason: collision with root package name */
    public rh0.d0 f350525b;

    /* renamed from: c, reason: collision with root package name */
    public long f350526c;

    /* renamed from: d, reason: collision with root package name */
    public int f350527d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f350528e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public long f350529f;

    @Override // p05.e2
    public int a() {
        return this.f350527d;
    }

    @Override // p05.e2
    public void b(rh0.d0 d0Var) {
        if (this.f350524a && d0Var != null && ((p05.l4) d0Var).f350593f != this.f350526c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MakeUpSuitEffect", "Cannot attach twice!");
            return;
        }
        rh0.d0 d0Var2 = this.f350525b;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f350525b = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        if (d0Var == null) {
            c("", "");
            this.f350526c = 0L;
            this.f350524a = false;
        } else {
            long j17 = ((p05.l4) d0Var).f350593f;
            this.f350526c = j17;
            if (j17 == 0) {
                return;
            }
            this.f350524a = true;
            com.tencent.mm.xeffect.WeEffectRender.nEnableSkinSeg(j17, true);
        }
    }

    public abstract void c(java.lang.String str, java.lang.String str2);
}
