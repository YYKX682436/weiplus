package em;

/* loaded from: classes12.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254529a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f254530b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f254531c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254532d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f254533e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f254534f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f254535g;

    public l0(android.view.View view) {
        this.f254529a = view;
    }

    public android.widget.LinearLayout a() {
        if (this.f254534f == null) {
            this.f254534f = (android.widget.LinearLayout) this.f254529a.findViewById(com.tencent.mm.R.id.ltc);
        }
        return this.f254534f;
    }

    public android.widget.LinearLayout b() {
        if (this.f254530b == null) {
            this.f254530b = (android.widget.LinearLayout) this.f254529a.findViewById(com.tencent.mm.R.id.lto);
        }
        return this.f254530b;
    }
}
