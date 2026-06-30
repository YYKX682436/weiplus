package em;

/* loaded from: classes10.dex */
public class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254843a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.Button f254844b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.EditText f254845c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f254846d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f254847e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f254848f;

    public u2(android.view.View view) {
        this.f254843a = view;
    }

    public android.widget.Button a() {
        if (this.f254844b == null) {
            this.f254844b = (android.widget.Button) this.f254843a.findViewById(com.tencent.mm.R.id.t8c);
        }
        return this.f254844b;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerView b() {
        if (this.f254848f == null) {
            this.f254848f = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f254843a.findViewById(com.tencent.mm.R.id.lqa);
        }
        return this.f254848f;
    }

    public android.widget.Button c() {
        if (this.f254846d == null) {
            this.f254846d = (android.widget.Button) this.f254843a.findViewById(com.tencent.mm.R.id.v_p);
        }
        return this.f254846d;
    }
}
