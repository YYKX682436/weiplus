package xr3;

/* loaded from: classes11.dex */
public final class b extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f456211d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f456212e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.happybubble.LabelsView f456213f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.ana);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f456211d = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.ank);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f456212e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.anu);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f456213f = (com.tencent.mm.ui.widget.happybubble.LabelsView) findViewById3;
    }
}
