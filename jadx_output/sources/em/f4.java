package em;

/* loaded from: classes5.dex */
public class f4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254316a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.MMImageView f254317b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f254318c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f254319d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254320e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ProgressBar f254321f;

    public f4(android.view.View view) {
        this.f254316a = view;
    }

    public com.tencent.mm.ui.MMImageView a() {
        if (this.f254317b == null) {
            this.f254317b = (com.tencent.mm.ui.MMImageView) this.f254316a.findViewById(com.tencent.mm.R.id.a_4);
        }
        return this.f254317b;
    }

    public android.widget.TextView b() {
        if (this.f254318c == null) {
            this.f254318c = (android.widget.TextView) this.f254316a.findViewById(com.tencent.mm.R.id.cut);
        }
        return this.f254318c;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView c() {
        if (this.f254320e == null) {
            this.f254320e = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f254316a.findViewById(com.tencent.mm.R.id.t8h);
        }
        return this.f254320e;
    }

    public android.widget.TextView d() {
        if (this.f254319d == null) {
            this.f254319d = (android.widget.TextView) this.f254316a.findViewById(com.tencent.mm.R.id.odf);
        }
        return this.f254319d;
    }
}
