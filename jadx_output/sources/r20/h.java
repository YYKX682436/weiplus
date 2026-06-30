package r20;

/* loaded from: classes9.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView f368777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.d9 f368778e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView ecsRichTextButtonView, bw5.d9 d9Var) {
        super(0);
        this.f368777d = ecsRichTextButtonView;
        this.f368778e = d9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView ecsRichTextButtonView = this.f368777d;
        yz5.a preOnCLick = ecsRichTextButtonView.getPreOnCLick();
        if (preOnCLick != null) {
            preOnCLick.invoke();
        }
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = ecsRichTextButtonView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pq.a aVar = new pq.a(context);
        bw5.d9 d9Var = this.f368778e;
        bw5.x7 x7Var = d9Var.f26380f[2] ? d9Var.f26379e : new bw5.x7();
        kotlin.jvm.internal.o.f(x7Var, "getEcsJumpInfo(...)");
        pq.q.Lb(qVar, aVar, x7Var, null, 4, null);
        return jz5.f0.f302826a;
    }
}
