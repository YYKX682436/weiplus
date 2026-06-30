package kl2;

/* loaded from: classes3.dex */
public final class v extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f308819h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f308820i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f308821m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f308822n;

    /* renamed from: o, reason: collision with root package name */
    public final kl2.s f308823o;

    /* renamed from: p, reason: collision with root package name */
    public r45.f82 f308824p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, yz5.l onSelect, yz5.a onCancel) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onSelect, "onSelect");
        kotlin.jvm.internal.o.g(onCancel, "onCancel");
        this.f308819h = onSelect;
        this.f308820i = onCancel;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f308822n = linkedList;
        kl2.s sVar = new kl2.s(this, linkedList);
        this.f308823o = sVar;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f308821m;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        recyclerView.setAdapter(sVar);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return e();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.ayh;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.ebh);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f308821m = (androidx.recyclerview.widget.RecyclerView) findViewById;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void s() {
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void u() {
        a();
        this.f308820i.invoke();
    }
}
