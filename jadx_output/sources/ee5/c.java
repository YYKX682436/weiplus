package ee5;

/* loaded from: classes9.dex */
public final class c extends zd5.k {

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f251838m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f251839n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.gfu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f251838m = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.gg_);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f251839n = textView;
        textView.setVisibility(0);
    }
}
