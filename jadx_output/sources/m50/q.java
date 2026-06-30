package m50;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m50.x f323498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m50.x xVar) {
        super(0);
        this.f323498d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        m50.x xVar = this.f323498d;
        co.a c76 = xVar.c7();
        if (c76.getLong(c76.f43702d + 0) <= 0) {
            co.a c77 = xVar.c7();
            if (c77.getLong(c77.f43702d + 2) == 0) {
                return null;
            }
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        co.a c78 = xVar.c7();
        java.lang.String string = c78.getString(c78.f43702d + 1);
        co.a c79 = xVar.c7();
        com.tencent.mm.storage.f9 k17 = e0Var.k(string, c79.getLong(c79.f43702d + 0));
        if (k17 != null) {
            return k17;
        }
        co.a c710 = xVar.c7();
        java.lang.String string2 = c710.getString(c710.f43702d + 1);
        co.a c711 = xVar.c7();
        return e0Var.l(string2, c711.getLong(c711.f43702d + 2));
    }
}
