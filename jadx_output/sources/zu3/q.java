package zu3;

/* loaded from: classes3.dex */
public final class q extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f475824d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f475825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dxq, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.s8l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f475824d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.s8m);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f475825e = (android.widget.TextView) findViewById2;
    }

    public final void a(int i17, int i18) {
        this.f475824d.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), i17, -16777216));
        this.f475825e.setText(i65.a.r(getContext(), i18));
    }
}
