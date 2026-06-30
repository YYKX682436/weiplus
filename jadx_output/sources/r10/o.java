package r10;

/* loaded from: classes9.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f368586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, yz5.l lVar) {
        super(1);
        this.f368585d = str;
        this.f368586e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.n8 res = (bw5.n8) obj;
        kotlin.jvm.internal.o.g(res, "res");
        boolean z17 = res.f30543m;
        java.lang.String str = this.f368585d;
        if (z17) {
            z20.e eVar = z20.e.f469543e;
            z20.b bVar = new z20.b();
            bVar.f469537a = eVar;
            bw5.q9 q9Var = new bw5.q9();
            q9Var.f31999d = "ecso_open";
            q9Var.f32013u[1] = true;
            q9Var.c(java.lang.System.currentTimeMillis());
            q9Var.b(2);
            bVar.f469538b = q9Var;
            bVar.f(str);
            bVar.c("native_done");
            bVar.a();
        } else {
            z20.e eVar2 = z20.e.f469544f;
            z20.b bVar2 = new z20.b();
            bVar2.f469537a = eVar2;
            bw5.q9 q9Var2 = new bw5.q9();
            q9Var2.f31999d = "ecso_open";
            q9Var2.f32013u[1] = true;
            q9Var2.c(java.lang.System.currentTimeMillis());
            q9Var2.b(2);
            bVar2.f469538b = q9Var2;
            bVar2.f(str);
            bVar2.c("native_done");
            bVar2.a();
        }
        yz5.l lVar = this.f368586e;
        if (lVar != null) {
            lVar.invoke(res);
        }
        return jz5.f0.f302826a;
    }
}
