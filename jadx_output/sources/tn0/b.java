package tn0;

/* loaded from: classes3.dex */
public final class b implements mo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420650a;

    public b(tn0.w0 w0Var) {
        this.f420650a = w0Var;
    }

    @Override // mo0.b
    public void a() {
        ts0.r rVar = this.f420650a.f420775v;
        if (rVar != null) {
            rVar.t(true, false, 1);
        }
    }

    @Override // mo0.b
    public void b() {
        ts0.r rVar = this.f420650a.f420775v;
        if (rVar != null) {
            rVar.t(false, false, 1);
        }
    }

    @Override // mo0.b
    public boolean c(float f17, float f18, int i17, int i18, long j17) {
        ts0.r rVar = this.f420650a.f420775v;
        if (rVar == null) {
            return false;
        }
        rVar.f(f17, f18, i17, i18, j17);
        return false;
    }

    @Override // mo0.b
    public boolean e(float f17, float f18) {
        return false;
    }
}
