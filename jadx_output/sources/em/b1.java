package em;

/* loaded from: classes9.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254112a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254113b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254114c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254115d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254116e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f254117f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f254118g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.MMImageView f254119h;

    public b1(android.view.View view) {
        this.f254112a = view;
    }

    public android.widget.LinearLayout a() {
        if (this.f254118g == null) {
            this.f254118g = (android.widget.LinearLayout) this.f254112a.findViewById(com.tencent.mm.R.id.v_1);
        }
        return this.f254118g;
    }

    public com.tencent.mm.ui.MMImageView b() {
        if (this.f254119h == null) {
            this.f254119h = (com.tencent.mm.ui.MMImageView) this.f254112a.findViewById(com.tencent.mm.R.id.f487295o70);
        }
        return this.f254119h;
    }
}
