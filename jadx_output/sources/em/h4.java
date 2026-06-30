package em;

/* loaded from: classes5.dex */
public class h4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254399a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f254400b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f254401c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f254402d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.MMImageView f254403e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f254404f;

    public h4(android.view.View view) {
        this.f254399a = view;
    }

    public android.widget.TextView a() {
        if (this.f254402d == null) {
            this.f254402d = (android.widget.TextView) this.f254399a.findViewById(com.tencent.mm.R.id.f486398ut1);
        }
        return this.f254402d;
    }

    public com.tencent.mm.ui.MMImageView b() {
        if (this.f254403e == null) {
            this.f254403e = (com.tencent.mm.ui.MMImageView) this.f254399a.findViewById(com.tencent.mm.R.id.ut7);
        }
        return this.f254403e;
    }

    public com.tencent.mm.ui.widget.MMRoundCornerImageView c() {
        if (this.f254401c == null) {
            this.f254401c = (com.tencent.mm.ui.widget.MMRoundCornerImageView) this.f254399a.findViewById(com.tencent.mm.R.id.ut8);
        }
        return this.f254401c;
    }

    public android.widget.ImageView d() {
        if (this.f254400b == null) {
            this.f254400b = (android.widget.ImageView) this.f254399a.findViewById(com.tencent.mm.R.id.ut9);
        }
        return this.f254400b;
    }
}
