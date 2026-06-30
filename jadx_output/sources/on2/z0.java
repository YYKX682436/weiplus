package on2;

/* loaded from: classes3.dex */
public final class z0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f347079d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f347080e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f347081f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f347082g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f347083h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f347084i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f347085m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f347086n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(on2.j1 j1Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.ir8);
        this.f347079d = textView;
        this.f347080e = (androidx.recyclerview.widget.RecyclerView) itemView.findViewById(com.tencent.mm.R.id.q87);
        this.f347081f = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.pms);
        this.f347082g = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.irh);
        this.f347083h = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.isn);
        android.widget.TextView textView2 = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.isj);
        this.f347084i = textView2;
        this.f347085m = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.f486441l74);
        this.f347086n = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.q6p);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
    }
}
