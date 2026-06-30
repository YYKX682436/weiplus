package em;

/* loaded from: classes10.dex */
public class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254379a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f254380b;

    public h1(android.view.View view) {
        this.f254379a = view;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerView a() {
        if (this.f254380b == null) {
            this.f254380b = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f254379a.findViewById(com.tencent.mm.R.id.rgy);
        }
        return this.f254380b;
    }
}
