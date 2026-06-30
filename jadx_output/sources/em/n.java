package em;

/* loaded from: classes9.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254618a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f254619b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f254620c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f254621d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f254622e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f254623f;

    public n(android.view.View view) {
        this.f254618a = view;
    }

    public android.widget.ImageView a() {
        if (this.f254621d == null) {
            this.f254621d = (android.widget.ImageView) this.f254618a.findViewById(com.tencent.mm.R.id.ei8);
        }
        return this.f254621d;
    }

    public android.widget.TextView b() {
        if (this.f254622e == null) {
            this.f254622e = (android.widget.TextView) this.f254618a.findViewById(com.tencent.mm.R.id.ei9);
        }
        return this.f254622e;
    }
}
