package el2;

/* loaded from: classes3.dex */
public final class u2 extends xt2.m6 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f253921d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f253922e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f253923f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f253924g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f253925h;

    public u2(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f253921d = root;
        this.f253922e = basePlugin;
        this.f253923f = "FinderLiveVisitorBottomFolderWidget";
        this.f253924g = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.rm6);
        this.f253925h = root.findViewById(com.tencent.mm.R.id.f484632rm5);
        root.setOnClickListener(new el2.s2(this));
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f253925h;
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f253921d;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView imageView = this.f253924g;
        kotlin.jvm.internal.o.f(imageView, "imageView");
        return imageView;
    }
}
