package of2;

/* loaded from: classes5.dex */
public final class e extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f345078d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f345079e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f345080f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(of2.g gVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.uem);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f345078d = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.uel);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f345079e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.ueo);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f345080f = (android.widget.TextView) findViewById3;
    }
}
