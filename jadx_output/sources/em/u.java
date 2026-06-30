package em;

/* loaded from: classes9.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254825a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f254826b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254827c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254828d;

    public u(android.view.View view) {
        this.f254825a = view;
    }

    public android.widget.LinearLayout a() {
        if (this.f254826b == null) {
            this.f254826b = (android.widget.LinearLayout) this.f254825a.findViewById(com.tencent.mm.R.id.f483679sr2);
        }
        return this.f254826b;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView b() {
        if (this.f254827c == null) {
            this.f254827c = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f254825a.findViewById(com.tencent.mm.R.id.f483680sr3);
        }
        return this.f254827c;
    }

    public com.tencent.mm.ui.widget.MMTextView c() {
        if (this.f254828d == null) {
            this.f254828d = (com.tencent.mm.ui.widget.MMTextView) this.f254825a.findViewById(com.tencent.mm.R.id.f483681sr4);
        }
        return this.f254828d;
    }
}
