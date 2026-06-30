package em;

/* loaded from: classes5.dex */
public class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254925a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ScrollView f254926b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f254927c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.InputPanelLinearLayout f254928d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f254929e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMClearEditText f254930f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f254931g;

    public x3(android.view.View view) {
        this.f254925a = view;
    }

    public com.tencent.mm.ui.base.MMClearEditText a() {
        if (this.f254930f == null) {
            this.f254930f = (com.tencent.mm.ui.base.MMClearEditText) this.f254925a.findViewById(com.tencent.mm.R.id.t7d);
        }
        return this.f254930f;
    }

    public android.widget.TextView b() {
        if (this.f254929e == null) {
            this.f254929e = (android.widget.TextView) this.f254925a.findViewById(com.tencent.mm.R.id.dhj);
        }
        return this.f254929e;
    }

    public com.tencent.mm.ui.widget.InputPanelLinearLayout c() {
        if (this.f254928d == null) {
            this.f254928d = (com.tencent.mm.ui.widget.InputPanelLinearLayout) this.f254925a.findViewById(com.tencent.mm.R.id.hdf);
        }
        return this.f254928d;
    }

    public android.widget.Button d() {
        if (this.f254931g == null) {
            this.f254931g = (android.widget.Button) this.f254925a.findViewById(com.tencent.mm.R.id.kao);
        }
        return this.f254931g;
    }

    public android.widget.ScrollView e() {
        if (this.f254926b == null) {
            this.f254926b = (android.widget.ScrollView) this.f254925a.findViewById(com.tencent.mm.R.id.mcm);
        }
        return this.f254926b;
    }
}
