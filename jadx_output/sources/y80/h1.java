package y80;

/* loaded from: classes8.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.model.LocationInfo f459857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f459858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z80.s0 f459859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y80.n1 f459860g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.location.model.LocationInfo locationInfo, android.content.Context context, z80.s0 s0Var, y80.n1 n1Var) {
        super(1);
        this.f459857d = locationInfo;
        this.f459858e = context;
        this.f459859f = s0Var;
        this.f459860g = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        id5.a aVar = new id5.a();
        o15.b bVar = new o15.b();
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = this.f459857d;
        java.lang.String b17 = va3.w.b(locationInfo);
        kotlin.jvm.internal.o.f(b17, "getLocationContent(...)");
        bVar.fromXml(b17);
        aVar.k(bVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(username);
        android.content.Context context = this.f459858e;
        final y80.g1 g1Var = new y80.g1(context, this.f459860g, username, locationInfo);
        com.tencent.mm.ui.widget.dialog.j jVar = new com.tencent.mm.ui.widget.dialog.j(g1Var) { // from class: y80.m1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.q f459884a;

            {
                kotlin.jvm.internal.o.g(g1Var, "function");
                this.f459884a = g1Var;
            }

            @Override // com.tencent.mm.ui.widget.dialog.j
            public final /* synthetic */ void a(boolean z17, java.lang.String str, int i17) {
                this.f459884a.invoke(java.lang.Boolean.valueOf(z17), str, java.lang.Integer.valueOf(i17));
            }
        };
        n13.t tVar = new n13.t();
        tVar.f334133a = jVar;
        ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).Ai(context, aVar, arrayList, tVar);
        yz5.l lVar = this.f459859f.f470674f;
        if (lVar != null) {
            lVar.invoke(username);
        }
        return jz5.f0.f302826a;
    }
}
