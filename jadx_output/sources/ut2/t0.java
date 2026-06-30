package ut2;

/* loaded from: classes3.dex */
public final class t0 extends in5.r0 {

    /* renamed from: e, reason: collision with root package name */
    public ut2.q0 f431095e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f431096f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f431097g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f431098h;

    /* renamed from: i, reason: collision with root package name */
    public ut2.p0 f431099i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(android.view.View itemView, boolean z17) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.obc);
        d92.f fVar = d92.f.f227470a;
        android.content.Context context = itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 14.0f, 0.0f, 8, null);
        this.f431096f = textView;
        this.f431097g = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.jqq);
        this.f431098h = (androidx.constraintlayout.widget.ConstraintLayout) itemView.findViewById(com.tencent.mm.R.id.cg7);
        this.f431099i = ut2.p0.f431047e;
    }
}
