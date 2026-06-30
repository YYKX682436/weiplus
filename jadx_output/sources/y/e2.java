package y;

/* loaded from: classes16.dex */
public final class e2 extends androidx.recyclerview.widget.k3 {

    /* renamed from: p1, reason: collision with root package name */
    public final android.widget.TextView f458339p1;

    /* renamed from: x1, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f458340x1;

    /* renamed from: y1, reason: collision with root package name */
    public final android.view.View f458341y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(mi2.h hVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f_l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f458339p1 = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f_k);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f458340x1 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f_j);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f458341y1 = findViewById3;
    }
}
