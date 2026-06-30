package f93;

/* loaded from: classes11.dex */
public class d5 extends androidx.recyclerview.widget.k3 implements k93.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMTextView f260313d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f260314e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f260315f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f260316g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.CheckBox f260317h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f260318i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f260319m;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.Context f260320n;

    /* renamed from: p1, reason: collision with root package name */
    public final android.view.View f260321p1;

    public d5(android.view.View view) {
        super(view);
        this.f260320n = view.getContext();
        this.f260315f = view.findViewById(com.tencent.mm.R.id.hzu);
        this.f260313d = (com.tencent.mm.ui.widget.MMTextView) view.findViewById(com.tencent.mm.R.id.hs8);
        this.f260314e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hs7);
        this.f260316g = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.hs6);
        this.f260317h = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.c8j);
        this.f260318i = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.c8h);
        this.f260319m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hzv);
        this.f260321p1 = view.findViewById(com.tencent.mm.R.id.a5s);
    }

    @Override // k93.c0
    public void a() {
        this.f260315f.setBackground(this.f260320n.getResources().getDrawable(com.tencent.mm.R.drawable.azm));
    }

    @Override // k93.c0
    public void g() {
        this.f260315f.setBackgroundColor(this.f260320n.getResources().getColor(com.tencent.mm.R.color.f478490b));
    }

    public d5(android.view.View view, int i17) {
        super(view);
    }
}
