package vg2;

/* loaded from: classes3.dex */
public class j0 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f436523h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f436524i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f436525m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f436526n;

    /* renamed from: o, reason: collision with root package name */
    public vg2.h0 f436527o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f436528p;

    /* renamed from: q, reason: collision with root package name */
    public km2.q f436529q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.content.Context context) {
        super(context, true, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f436528p = new java.util.ArrayList();
        this.f118384g.f444836c.b().setGravity(80);
        this.f118384g.f444836c.b().setWindowAnimations(com.tencent.mm.R.style.f494074dp);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.diu;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int n() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f436525m = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.f483758bz2);
        this.f436526n = (androidx.recyclerview.widget.RecyclerView) rootView.findViewById(com.tencent.mm.R.id.f483027fd5);
        android.content.Context context = this.f118381d;
        this.f436527o = new vg2.h0(this, context);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f436526n;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f436526n;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.setAdapter(this.f436527o);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        yz5.a aVar = this.f436523h;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
