package ju5;

/* loaded from: classes15.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f302080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f302081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ju5.j0 f302082f;

    public d0(ju5.j0 j0Var, int i17, java.lang.CharSequence charSequence) {
        this.f302082f = j0Var;
        this.f302080d = i17;
        this.f302081e = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        du5.d dVar = this.f302082f.f302103c.f302112i;
        if (dVar != null) {
            dVar.e(this.f302080d, this.f302081e);
        }
    }
}
