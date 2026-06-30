package em;

/* loaded from: classes10.dex */
public class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254939a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254940b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f254941c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryCheckBox f254942d;

    public y1(android.view.View view) {
        this.f254939a = view;
    }

    public android.widget.ImageView a() {
        if (this.f254941c == null) {
            this.f254941c = (android.widget.ImageView) this.f254939a.findViewById(com.tencent.mm.R.id.chd);
        }
        return this.f254941c;
    }

    public android.widget.TextView b() {
        if (this.f254940b == null) {
            this.f254940b = (android.widget.TextView) this.f254939a.findViewById(com.tencent.mm.R.id.cut);
        }
        return this.f254940b;
    }
}
