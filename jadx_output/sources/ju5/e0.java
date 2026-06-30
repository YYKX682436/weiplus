package ju5;

/* loaded from: classes15.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f302085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f302086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ju5.j0 f302087f;

    public e0(ju5.j0 j0Var, int i17, java.lang.CharSequence charSequence) {
        this.f302087f = j0Var;
        this.f302085d = i17;
        this.f302086e = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        du5.d dVar = this.f302087f.f302103c.f302112i;
        if (dVar != null) {
            java.lang.CharSequence charSequence = this.f302086e;
            dVar.c(this.f302085d, charSequence == null ? "unknown error" : charSequence.toString());
        }
    }
}
