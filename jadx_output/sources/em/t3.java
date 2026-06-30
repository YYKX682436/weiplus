package em;

/* loaded from: classes11.dex */
public class t3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254817a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f254818b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.base.FlowLayout f254819c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254820d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f254821e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f254822f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254823g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f254824h;

    public t3(android.view.View view) {
        this.f254817a = view;
    }

    public android.widget.LinearLayout a() {
        if (this.f254818b == null) {
            this.f254818b = (android.widget.LinearLayout) this.f254817a.findViewById(com.tencent.mm.R.id.t2r);
        }
        return this.f254818b;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView b() {
        if (this.f254820d == null) {
            this.f254820d = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f254817a.findViewById(com.tencent.mm.R.id.t3b);
        }
        return this.f254820d;
    }

    public com.tencent.mm.ui.base.FlowLayout c() {
        if (this.f254819c == null) {
            this.f254819c = (com.tencent.mm.ui.base.FlowLayout) this.f254817a.findViewById(com.tencent.mm.R.id.v09);
        }
        return this.f254819c;
    }
}
