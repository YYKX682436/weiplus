package em;

/* loaded from: classes9.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254932a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254933b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254934c;

    public y(android.view.View view) {
        this.f254932a = view;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView a() {
        if (this.f254934c == null) {
            this.f254934c = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f254932a.findViewById(com.tencent.mm.R.id.ne8);
        }
        return this.f254934c;
    }

    public com.tencent.mm.ui.widget.MMTextView b() {
        if (this.f254933b == null) {
            this.f254933b = (com.tencent.mm.ui.widget.MMTextView) this.f254932a.findViewById(com.tencent.mm.R.id.nec);
        }
        return this.f254933b;
    }
}
