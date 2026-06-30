package l20;

/* loaded from: classes9.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.content.Context context) {
        super(0);
        this.f315159d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView = new com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView(this.f315159d, null, 0, 6, null);
        ecsRichTextLabelView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        android.content.Context context = this.f315159d;
        ecsRichTextLabelView.setTextColor(context.getColor(com.tencent.mm.R.color.f478873jj));
        ecsRichTextLabelView.setTextSize(context.getResources().getDimension(com.tencent.mm.R.dimen.f479930ja));
        return ecsRichTextLabelView;
    }
}
