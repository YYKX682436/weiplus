package t10;

/* loaded from: classes9.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f414547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.l lVar, java.lang.String str) {
        super(1);
        this.f414547d = lVar;
        this.f414548e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.n8 res = (bw5.n8) obj;
        kotlin.jvm.internal.o.g(res, "res");
        yz5.l lVar = this.f414547d;
        if (lVar != null) {
            z20.e eVar = z20.e.f469543e;
            z20.b bVar = new z20.b();
            bVar.f469537a = eVar;
            bw5.q9 q9Var = new bw5.q9();
            q9Var.f31999d = "ecso_open";
            q9Var.f32013u[1] = true;
            q9Var.c(java.lang.System.currentTimeMillis());
            q9Var.b(2);
            bVar.f469538b = q9Var;
            bVar.f(this.f414548e);
            bVar.c("native_handler_done");
            bVar.f469538b.f32012t.add("native_handler");
            bVar.a();
            lVar.invoke(res);
        }
        return jz5.f0.f302826a;
    }
}
