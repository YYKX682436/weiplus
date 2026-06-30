package em;

/* loaded from: classes.dex */
public class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254464a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254465b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f254466c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f254467d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f254468e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f254469f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f254470g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f254471h;

    public j2(android.view.View view) {
        this.f254464a = view;
    }

    public android.widget.LinearLayout a() {
        if (this.f254469f == null) {
            this.f254469f = (android.widget.LinearLayout) this.f254464a.findViewById(com.tencent.mm.R.id.chj);
        }
        return this.f254469f;
    }

    public android.widget.TextView b() {
        if (this.f254471h == null) {
            this.f254471h = (android.widget.TextView) this.f254464a.findViewById(com.tencent.mm.R.id.f483931ci2);
        }
        return this.f254471h;
    }

    public android.view.View c() {
        if (this.f254468e == null) {
            this.f254468e = this.f254464a.findViewById(com.tencent.mm.R.id.d0v);
        }
        return this.f254468e;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView d() {
        if (this.f254465b == null) {
            this.f254465b = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f254464a.findViewById(com.tencent.mm.R.id.h6y);
        }
        return this.f254465b;
    }

    public android.widget.TextView e() {
        if (this.f254467d == null) {
            this.f254467d = (android.widget.TextView) this.f254464a.findViewById(com.tencent.mm.R.id.omr);
        }
        return this.f254467d;
    }
}
