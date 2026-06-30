package d04;

/* loaded from: classes8.dex */
public final class x1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f225548d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f225549e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f225550f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ProgressBar f225551g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f225552h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f225548d = (android.view.ViewGroup) itemView.findViewById(com.tencent.mm.R.id.m_q);
        this.f225549e = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.m_p);
        android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.m_s);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f225550f = textView;
        this.f225551g = (android.widget.ProgressBar) itemView.findViewById(com.tencent.mm.R.id.m_r);
        this.f225552h = itemView.findViewById(com.tencent.mm.R.id.a4f);
    }
}
