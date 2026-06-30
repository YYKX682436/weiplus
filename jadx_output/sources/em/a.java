package em;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254036a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254037b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f254038c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f254039d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.core.widget.NestedScrollView f254040e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f254041f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f254042g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f254043h;

    public a(android.view.View view) {
        this.f254036a = view;
    }

    public android.widget.LinearLayout a() {
        if (this.f254043h == null) {
            this.f254043h = (android.widget.LinearLayout) this.f254036a.findViewById(com.tencent.mm.R.id.sei);
        }
        return this.f254043h;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerView b() {
        if (this.f254041f == null) {
            this.f254041f = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f254036a.findViewById(com.tencent.mm.R.id.sej);
        }
        return this.f254041f;
    }
}
