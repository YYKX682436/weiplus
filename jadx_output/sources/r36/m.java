package r36;

/* loaded from: classes16.dex */
public class m extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f369438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r36.z f369439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r36.z zVar, java.lang.String str, java.lang.Object[] objArr, int i17, java.util.List list) {
        super(str, objArr);
        this.f369439f = zVar;
        this.f369438e = i17;
    }

    @Override // m36.b
    public void a() {
        this.f369439f.f369480p.getClass();
        try {
            this.f369439f.A.k(this.f369438e, r36.b.CANCEL);
            synchronized (this.f369439f) {
                this.f369439f.C.remove(java.lang.Integer.valueOf(this.f369438e));
            }
        } catch (java.io.IOException unused) {
        }
    }
}
