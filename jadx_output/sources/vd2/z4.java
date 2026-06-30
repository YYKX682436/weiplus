package vd2;

/* loaded from: classes3.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f436050a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.qt2 f436051b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f436052c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f436053d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout f436054e;

    /* renamed from: f, reason: collision with root package name */
    public int f436055f;

    public z4(android.app.Activity activity, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f436050a = activity;
        this.f436051b = qt2Var;
        this.f436052c = "Finder.FinderLiveViewCallback.Manager@" + hashCode();
        this.f436055f = -1;
    }

    public final void a(com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout, boolean z17, boolean z18) {
        java.lang.String str = "deactivate plugin pos:" + this.f436055f;
        java.lang.String str2 = this.f436052c;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (finderLiveVisitorPluginLayout != null) {
            finderLiveVisitorPluginLayout.reset(false, z18);
            finderLiveVisitorPluginLayout.unMount();
            android.view.ViewParent parent = finderLiveVisitorPluginLayout.getParent();
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = parent instanceof com.tencent.mm.ui.widget.RoundedCornerFrameLayout ? (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) parent : null;
            if (roundedCornerFrameLayout != null) {
                roundedCornerFrameLayout.setRadius(i65.a.b(roundedCornerFrameLayout.getContext(), 8));
            }
        }
        com.tencent.mars.xlog.Log.i(str2, "after deactivate plugin");
    }
}
