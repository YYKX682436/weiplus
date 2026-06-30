package em;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254443a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254444b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f254445c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f254446d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f254447e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f254448f;

    public j(android.view.View view) {
        this.f254443a = view;
    }

    public android.widget.TextView a() {
        if (this.f254448f == null) {
            this.f254448f = (android.widget.TextView) this.f254443a.findViewById(com.tencent.mm.R.id.cjm);
        }
        return this.f254448f;
    }
}
