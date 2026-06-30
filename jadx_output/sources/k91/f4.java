package k91;

/* loaded from: classes7.dex */
public class f4 implements k91.c5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.e6 f305582a;

    public f4(k91.g4 g4Var, com.tencent.mm.plugin.appbrand.service.e6 e6Var) {
        this.f305582a = e6Var;
    }

    @Override // k91.c5
    public void a(k91.b5 b5Var, java.lang.Object obj) {
        k91.v5 v5Var = (k91.v5) obj;
        com.tencent.mm.plugin.appbrand.service.e6 e6Var = this.f305582a;
        if (e6Var != null) {
            e6Var.a(v5Var);
        }
    }
}
