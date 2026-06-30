package em;

/* loaded from: classes4.dex */
public class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254889a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.Button f254890b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.Button f254891c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f254892d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f254893e;

    public w2(android.view.View view) {
        this.f254889a = view;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerView a() {
        if (this.f254893e == null) {
            this.f254893e = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f254889a.findViewById(com.tencent.mm.R.id.lqa);
        }
        return this.f254893e;
    }
}
