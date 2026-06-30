package sm3;

/* loaded from: classes10.dex */
public final class n extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.widget.MvFrameListView f409892d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.widget.RangeSliderView f409893e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f409894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sm3.o f409895g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(sm3.o oVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f409895g = oVar;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.gdt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f409892d = (com.tencent.mm.plugin.mv.ui.widget.MvFrameListView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f486960n06);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f409893e = (com.tencent.mm.plugin.mv.ui.widget.RangeSliderView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.at8);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f409894f = findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.cqy);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
    }

    public final int i() {
        int adapterPosition = getAdapterPosition();
        this.f409895g.getClass();
        return adapterPosition - 1;
    }
}
