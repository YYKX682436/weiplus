package lx4;

/* loaded from: classes8.dex */
public final class n extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f322150d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f322151e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f322152f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f322153g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f322154h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.ayx);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f322150d = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.ayw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f322151e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f483470az1);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f322152f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.f483469az0);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f322153g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.ayz);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f322154h = (android.widget.TextView) findViewById5;
    }
}
