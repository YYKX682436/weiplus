package r36;

/* loaded from: classes16.dex */
public class l extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r36.z f369436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r36.z zVar, java.lang.String str, java.lang.Object... objArr) {
        super(str, objArr);
        this.f369436e = zVar;
    }

    @Override // m36.b
    public void a() {
        r36.z zVar = this.f369436e;
        zVar.getClass();
        try {
            zVar.A.j(false, 2, 0);
        } catch (java.io.IOException unused) {
            zVar.b();
        }
    }
}
