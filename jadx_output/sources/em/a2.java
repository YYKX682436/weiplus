package em;

/* loaded from: classes9.dex */
public class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254052a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254053b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryIconImageView f254054c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f254055d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f254056e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f254057f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254058g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.CheckBox f254059h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.chatting.widget.RoundClipFrameLayout f254060i;

    public a2(android.view.View view) {
        this.f254052a = view;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView a() {
        if (this.f254058g == null) {
            this.f254058g = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f254052a.findViewById(com.tencent.mm.R.id.t2t);
        }
        return this.f254058g;
    }

    public android.widget.TextView b() {
        if (this.f254055d == null) {
            this.f254055d = (android.widget.TextView) this.f254052a.findViewById(com.tencent.mm.R.id.cut);
        }
        return this.f254055d;
    }

    public com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryIconImageView c() {
        if (this.f254054c == null) {
            this.f254054c = (com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryIconImageView) this.f254052a.findViewById(com.tencent.mm.R.id.h6y);
        }
        return this.f254054c;
    }

    public android.widget.TextView d() {
        if (this.f254057f == null) {
            this.f254057f = (android.widget.TextView) this.f254052a.findViewById(com.tencent.mm.R.id.odf);
        }
        return this.f254057f;
    }
}
