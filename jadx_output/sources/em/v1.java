package em;

/* loaded from: classes10.dex */
public class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254861a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.CheckBox f254862b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f254863c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f254864d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f254865e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f254866f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f254867g;

    public v1(android.view.View view) {
        this.f254861a = view;
    }

    public android.widget.CheckBox a() {
        if (this.f254862b == null) {
            this.f254862b = (android.widget.CheckBox) this.f254861a.findViewById(com.tencent.mm.R.id.btf);
        }
        return this.f254862b;
    }

    public android.widget.LinearLayout b() {
        if (this.f254866f == null) {
            this.f254866f = (android.widget.LinearLayout) this.f254861a.findViewById(com.tencent.mm.R.id.cug);
        }
        return this.f254866f;
    }
}
