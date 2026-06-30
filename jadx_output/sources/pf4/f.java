package pf4;

/* loaded from: classes4.dex */
public final class f extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f353863d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f353864e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f353865f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(pf4.g gVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.nnv);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f353863d = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.cqs);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f353864e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.a4f);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f353865f = (android.widget.ImageView) findViewById3;
    }
}
