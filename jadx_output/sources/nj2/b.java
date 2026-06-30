package nj2;

/* loaded from: classes10.dex */
public final class b extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f337823h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f337824i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f337825m;

    /* renamed from: n, reason: collision with root package name */
    public final kj2.o f337826n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f337827o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f337828p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, gk2.e liveData, pj2.b service) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(service, "service");
        this.f337823h = liveData;
        android.view.View view = this.f337824i;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View inviteListLayout = view.findViewById(com.tencent.mm.R.id.qtx);
        this.f337825m = inviteListLayout;
        kotlin.jvm.internal.o.f(inviteListLayout, "inviteListLayout");
        this.f337826n = new kj2.o(inviteListLayout, liveData, service, new ii2.c(new ii2.a(context.getResources().getColor(com.tencent.mm.R.color.f479314vu), new android.graphics.Rect(0, 0, 0, 1), ii2.b.f291622e, null, 8, null)), new nj2.a(this, context));
        android.view.View view2 = this.f337824i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        this.f337827o = view2.findViewById(com.tencent.mm.R.id.nhc);
        android.view.View view3 = this.f337824i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        this.f337828p = view3.findViewById(com.tencent.mm.R.id.imn);
        this.f118384g.c(context.getResources().getDrawable(com.tencent.mm.R.drawable.cle));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.f488839ba4;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.hky);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f337824i = rootView;
        android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (com.tencent.mm.ui.bl.b(rootView.getContext()).y * 2) / 3;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        this.f337826n.b();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        this.f337826n.f();
    }
}
