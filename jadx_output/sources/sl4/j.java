package sl4;

/* loaded from: classes11.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl4.l f409274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.jq0 f409275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sl4.l lVar, bw5.jq0 jq0Var) {
        super(0);
        this.f409274d = lVar;
        this.f409275e = jq0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bw5.lp0 b17;
        sl4.a aVar;
        bw5.cp0 b18;
        bw5.lp0 b19;
        sl4.l lVar = this.f409274d;
        if (lVar.f409280g == null) {
            lVar.d();
        }
        bl4.b bVar = lVar.f409281h;
        bw5.o50 o50Var = null;
        bw5.jq0 jq0Var = this.f409275e;
        if (bVar == null) {
            bw5.eq0 eq0Var = lVar.f409277d;
            java.lang.String b27 = (jq0Var == null || (b19 = jq0Var.b()) == null) ? null : b19.b();
            java.lang.String str = b27 == null ? "" : b27;
            int i17 = jq0Var.f29110e;
            java.lang.String title = jq0Var.b().d().getTitle();
            kotlin.jvm.internal.o.f(title, "getTitle(...)");
            java.lang.String f17 = jq0Var.b().d().f();
            kotlin.jvm.internal.o.f(f17, "getCover(...)");
            lVar.f409281h = new bl4.b(eq0Var, str, i17, title, f17, null, 32, null);
        } else {
            bw5.eq0 eq0Var2 = lVar.f409277d;
            kotlin.jvm.internal.o.g(eq0Var2, "<set-?>");
            bVar.f21732a = eq0Var2;
            java.lang.String b28 = (jq0Var == null || (b17 = jq0Var.b()) == null) ? null : b17.b();
            bVar.f21733b = b28 != null ? b28 : "";
            bVar.f21734c = jq0Var.f29110e;
            java.lang.String title2 = jq0Var.b().d().getTitle();
            kotlin.jvm.internal.o.f(title2, "getTitle(...)");
            bVar.f21735d = title2;
            java.lang.String f18 = jq0Var.b().d().f();
            kotlin.jvm.internal.o.f(f18, "getCover(...)");
            bVar.f21736e = f18;
        }
        bl4.b bVar2 = lVar.f409281h;
        if (bVar2 != null) {
            bVar2.f21737f = jq0Var.b();
        }
        bl4.b bVar3 = lVar.f409281h;
        if (bVar3 != null) {
            bw5.dr0 c17 = jq0Var.c();
            if (c17 != null && (b18 = c17.b()) != null) {
                o50Var = b18.b();
            }
            bVar3.f21738g = o50Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMinimizeModule", "onViewInfoUpdate info: " + lVar.f409281h);
        sl4.a aVar2 = lVar.f409280g;
        if (aVar2 != null) {
            bl4.b bVar4 = lVar.f409281h;
            kotlin.jvm.internal.o.d(bVar4);
            aVar2.c(bVar4);
        }
        if (!kotlin.jvm.internal.o.b(lVar.f409282i, java.lang.Boolean.TRUE) && jq0Var.f29110e == 1 && (aVar = lVar.f409280g) != null) {
            ((sl4.g) aVar).e0();
        }
        return jz5.f0.f302826a;
    }
}
