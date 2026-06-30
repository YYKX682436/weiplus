package r36;

/* loaded from: classes16.dex */
public class v extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r36.g0 f369463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r36.y f369464f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r36.y yVar, java.lang.String str, java.lang.Object[] objArr, r36.g0 g0Var) {
        super(str, objArr);
        this.f369464f = yVar;
        this.f369463e = g0Var;
    }

    @Override // m36.b
    public void a() {
        r36.g0 g0Var = this.f369463e;
        r36.y yVar = this.f369464f;
        try {
            yVar.f369470f.f369472e.b(g0Var);
        } catch (java.io.IOException e17) {
            t36.k.f415461a.l(4, "Http2Connection.Listener failure for " + yVar.f369470f.f369474g, e17);
            try {
                g0Var.c(r36.b.PROTOCOL_ERROR);
            } catch (java.io.IOException unused) {
            }
        }
    }
}
