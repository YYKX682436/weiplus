package l20;

/* loaded from: classes9.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView f315157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.qf f315158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView, bw5.qf qfVar) {
        super(0);
        this.f315157d = ecsFinderFeedProductCardView;
        this.f315158e = qfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView.L;
        com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView = this.f315157d;
        ecsFinderFeedProductCardView.d("feeds_add_shopping_cart", "element_click", null);
        bw5.qf qfVar = this.f315158e;
        int i18 = qfVar.g().f31083d;
        if (i18 == 1) {
            bw5.ie0 ie0Var = new bw5.ie0();
            ie0Var.f28563e = 1;
            boolean[] zArr = ie0Var.f28565g;
            zArr[3] = true;
            ie0Var.f28562d = qfVar.f32067d;
            zArr[2] = true;
            ie0Var.f28564f = qfVar.C[11] ? qfVar.f32077q : "";
            zArr[4] = true;
            l20.i iVar = new l20.i(ecsFinderFeedProductCardView);
            byte[] byteArray = ie0Var.toByteArray();
            x02.d dVar = new x02.d();
            dVar.f450980g = iVar;
            kotlin.jvm.internal.o.d(byteArray);
            urgen.ur_7522.UR_C8A2.UR_1846(byteArray, dVar);
        } else if (i18 == 2) {
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq.q qVar = (pq.q) c17;
            android.content.Context context = ecsFinderFeedProductCardView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pq.a aVar = new pq.a(context);
            bw5.of g17 = qfVar.g();
            bw5.x7 x7Var = g17.f31085f[2] ? g17.f31084e : new bw5.x7();
            kotlin.jvm.internal.o.f(x7Var, "getSelectSkuJumpInfo(...)");
            pq.q.Lb(qVar, aVar, x7Var, null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
