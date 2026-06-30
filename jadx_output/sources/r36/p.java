package r36;

/* loaded from: classes16.dex */
public class p extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f369449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r36.z f369450f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r36.z zVar, java.lang.String str, java.lang.Object[] objArr, int i17, r36.b bVar) {
        super(str, objArr);
        this.f369450f = zVar;
        this.f369449e = i17;
    }

    @Override // m36.b
    public void a() {
        this.f369450f.f369480p.getClass();
        synchronized (this.f369450f) {
            this.f369450f.C.remove(java.lang.Integer.valueOf(this.f369449e));
        }
    }
}
