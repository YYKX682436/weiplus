package em;

/* loaded from: classes5.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254905a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f254906b;

    public x0(android.view.View view) {
        this.f254905a = view;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerView a() {
        if (this.f254906b == null) {
            this.f254906b = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f254905a.findViewById(com.tencent.mm.R.id.rat);
        }
        return this.f254906b;
    }
}
