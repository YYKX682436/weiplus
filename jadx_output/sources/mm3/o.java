package mm3;

/* loaded from: classes10.dex */
public final class o extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f329665d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f329666e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.gif.MMAnimateView f329667f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.k3f);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f329665d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.hc7);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f329666e = findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.m9f);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f329667f = (com.tencent.mm.plugin.gif.MMAnimateView) findViewById3;
    }
}
