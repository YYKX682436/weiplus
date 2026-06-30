package l20;

/* loaded from: classes9.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView f315144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView ecsFinderFeedProductNewAndBulkBuyerView) {
        super(1);
        this.f315144d = ecsFinderFeedProductNewAndBulkBuyerView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.je0 it = (bw5.je0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = it.getBaseResponse().f376959d == 0 ? "已加入购物车" : "网络异常，请稍后重试";
        android.content.Context context = this.f315144d.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = str;
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
