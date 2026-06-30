package r36;

/* loaded from: classes16.dex */
public class n extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f369442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r36.z f369443f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r36.z zVar, java.lang.String str, java.lang.Object[] objArr, int i17, java.util.List list, boolean z17) {
        super(str, objArr);
        this.f369443f = zVar;
        this.f369442e = i17;
    }

    @Override // m36.b
    public void a() {
        this.f369443f.f369480p.getClass();
        try {
            this.f369443f.A.k(this.f369442e, r36.b.CANCEL);
            synchronized (this.f369443f) {
                this.f369443f.C.remove(java.lang.Integer.valueOf(this.f369442e));
            }
        } catch (java.io.IOException unused) {
        }
    }
}
