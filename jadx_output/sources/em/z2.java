package em;

/* loaded from: classes.dex */
public class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254984a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254985b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f254986c;

    public z2(android.view.View view) {
        this.f254984a = view;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerView a() {
        if (this.f254986c == null) {
            this.f254986c = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f254984a.findViewById(com.tencent.mm.R.id.lqa);
        }
        return this.f254986c;
    }
}
