package r36;

/* loaded from: classes16.dex */
public class j extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f369426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r36.b f369427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r36.z f369428g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r36.z zVar, java.lang.String str, java.lang.Object[] objArr, int i17, r36.b bVar) {
        super(str, objArr);
        this.f369428g = zVar;
        this.f369426e = i17;
        this.f369427f = bVar;
    }

    @Override // m36.b
    public void a() {
        r36.z zVar = this.f369428g;
        try {
            zVar.A.k(this.f369426e, this.f369427f);
        } catch (java.io.IOException unused) {
            zVar.b();
        }
    }
}
