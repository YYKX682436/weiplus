package lx;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedDeleteEvent f321728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx.k f321729e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent, lx.k kVar) {
        super(0);
        this.f321728d = feedDeleteEvent;
        this.f321729e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f321728d.f54247g.f6437a != 0) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            lx.k kVar = this.f321729e;
            android.app.Activity activity = kVar.f321822d;
            lx.c cVar = new lx.c(kVar);
            lx.d dVar = new lx.d(kVar);
            com.tencent.mm.plugin.finder.assist.k8 k8Var = com.tencent.mm.plugin.finder.assist.k8.f102328a;
            java.lang.String selfUsername = g92.b.f269769e.U();
            ya2.k1 k1Var = new ya2.k1(cVar);
            kotlin.jvm.internal.o.g(selfUsername, "selfUsername");
            java.lang.String concat = "23-".concat(selfUsername);
            pq5.g l17 = new db2.a4(selfUsername, 23).l();
            if (activity != null) {
                l17.f((com.tencent.mm.ui.MMActivity) activity);
            }
            k8Var.a(l17, concat, k1Var, dVar);
            k8Var.b(concat);
        }
        return jz5.f0.f302826a;
    }
}
