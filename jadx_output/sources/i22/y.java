package i22;

/* loaded from: classes15.dex */
public final class y extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f288066f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f288067g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context context, android.view.View itemView, i22.p0 p0Var) {
        super(itemView, p0Var);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.dec);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f288066f = (android.widget.TextView) findViewById;
        int d17 = i65.a.d(context, com.tencent.mm.R.color.BW_100);
        int d18 = i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_0_5);
        float a17 = ym5.x.a(context, 8.0f);
        this.f288067g = n22.f.f334290a.b(d17, d18, 0.0f, 0.0f, a17, a17);
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        super.i(item, payloads);
        i22.k0 k0Var = (i22.k0) this.f288003e;
        this.f288066f.setText(k0Var != null ? k0Var.f287995a : null);
        this.itemView.setBackground(this.f288067g);
    }
}
