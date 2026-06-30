package h22;

/* loaded from: classes15.dex */
public final class j extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f278305d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.gif.MMAnimateView f278306e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f278307f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f278308g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f278309h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) itemView.findViewById(com.tencent.mm.R.id.f484212de5);
        this.f278305d = frameLayout;
        this.f278306e = (com.tencent.mm.plugin.gif.MMAnimateView) itemView.findViewById(com.tencent.mm.R.id.d_q);
        this.f278307f = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.d_o);
        this.f278308g = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.d_p);
        int d17 = i65.a.d(context, com.tencent.mm.R.color.BW_100);
        int d18 = i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_0_5);
        float a17 = ym5.x.a(context, 8.0f);
        android.graphics.drawable.Drawable b17 = n22.f.f334290a.b(d17, d18, a17, a17, a17, a17);
        this.f278309h = b17;
        itemView.setClickable(true);
        itemView.setBackground(b17);
        frameLayout.setOutlineProvider(new h22.i(context));
        frameLayout.setClipToOutline(true);
    }
}
