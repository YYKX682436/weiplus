package f;

/* loaded from: classes14.dex */
public final class c implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.a f257971a;

    public c(f.a aVar) {
        this.f257971a = aVar;
    }

    @Override // n0.a2
    public void dispose() {
        jz5.f0 f0Var;
        androidx.activity.result.c cVar = this.f257971a.f257969a;
        if (cVar == null) {
            f0Var = null;
        } else {
            cVar.b();
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            throw new java.lang.IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
