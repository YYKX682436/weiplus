package r20;

/* loaded from: classes9.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView f368781d;

    public k(com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView) {
        this.f368781d = ecsRichTextLabelView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bw5.a9 a9Var;
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView = this.f368781d;
        if (!ecsRichTextLabelView.getCanBind() || (a9Var = ecsRichTextLabelView.f65967d) == null) {
            return;
        }
        ecsRichTextLabelView.a(a9Var);
    }
}
