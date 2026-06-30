package dk5;

/* loaded from: classes9.dex */
public class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f234622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk5.g5 f234623e;

    public f5(dk5.g5 g5Var, java.util.Map map) {
        this.f234623e = g5Var;
        this.f234622d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        dk5.r5 r5Var = this.f234623e.f234639e;
        if (r5Var != null) {
            ((dk5.u4$$a) r5Var).a(this.f234622d);
        }
    }
}
