package tf5;

/* loaded from: classes11.dex */
public final class e extends in5.s0 {

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f418964n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f418965o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f418966p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f418967q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f418968r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.RelativeLayout f418969s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.RelativeLayout f418970t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f418971u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f418972v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tf5.f fVar, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f418964n = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cfx);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kbq);
        this.f418965o = textView;
        this.f418966p = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cut);
        this.f418967q = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a_4);
        this.f418968r = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kjp);
        this.f418969s = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.f483918cg5);
        this.f418970t = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.cfw);
        this.f418971u = view.findViewById(com.tencent.mm.R.id.kbo);
        this.f418972v = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.spk);
        if (textView.getPaint() != null) {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.1f);
        }
    }
}
