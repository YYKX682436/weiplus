package w82;

/* loaded from: classes8.dex */
public final class b extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f443813d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f443814e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f443815f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.vix);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f443813d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.u7f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f443814e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.d0v);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f443815f = findViewById3;
    }
}
