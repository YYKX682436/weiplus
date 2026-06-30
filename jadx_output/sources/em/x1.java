package em;

/* loaded from: classes9.dex */
public class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254907a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254908b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryIconImageView f254909c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f254910d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f254911e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f254912f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.CheckBox f254913g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254914h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.progress.RoundProgressBtn f254915i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f254916j;

    public x1(android.view.View view) {
        this.f254907a = view;
    }

    public android.widget.TextView a() {
        if (this.f254910d == null) {
            this.f254910d = (android.widget.TextView) this.f254907a.findViewById(com.tencent.mm.R.id.cut);
        }
        return this.f254910d;
    }

    public com.tencent.mm.ui.widget.progress.RoundProgressBtn b() {
        if (this.f254915i == null) {
            this.f254915i = (com.tencent.mm.ui.widget.progress.RoundProgressBtn) this.f254907a.findViewById(com.tencent.mm.R.id.tai);
        }
        return this.f254915i;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView c() {
        if (this.f254914h == null) {
            this.f254914h = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f254907a.findViewById(com.tencent.mm.R.id.jdt);
        }
        return this.f254914h;
    }

    public android.widget.TextView d() {
        if (this.f254916j == null) {
            this.f254916j = (android.widget.TextView) this.f254907a.findViewById(com.tencent.mm.R.id.f487100ni2);
        }
        return this.f254916j;
    }

    public android.widget.TextView e() {
        if (this.f254912f == null) {
            this.f254912f = (android.widget.TextView) this.f254907a.findViewById(com.tencent.mm.R.id.odf);
        }
        return this.f254912f;
    }
}
