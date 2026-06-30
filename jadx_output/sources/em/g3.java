package em;

/* loaded from: classes10.dex */
public class g3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254353a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f254354b;

    public g3(android.view.View view) {
        this.f254353a = view;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerView a() {
        if (this.f254354b == null) {
            this.f254354b = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f254353a.findViewById(com.tencent.mm.R.id.lqa);
        }
        return this.f254354b;
    }
}
