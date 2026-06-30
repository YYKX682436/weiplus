package ie2;

/* loaded from: classes3.dex */
public abstract class a implements ie2.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f290979d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f290980e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout f290981f;

    public a(android.view.View oriRootView, com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout) {
        kotlin.jvm.internal.o.g(oriRootView, "oriRootView");
        this.f290979d = oriRootView;
        this.f290980e = "BaseLiveBubbleView_" + v();
        this.f290981f = frameBubbleContentLayout;
        if (frameBubbleContentLayout != null) {
            frameBubbleContentLayout.setSceneStateListener(this);
        }
        if (frameBubbleContentLayout != null) {
            frameBubbleContentLayout.b();
        }
    }

    public android.view.View h() {
        return u();
    }

    public final android.view.View t(int i17) {
        android.view.View view = this.f290981f;
        if (view == null) {
            view = this.f290979d;
        }
        return view.findViewById(i17);
    }

    public final android.view.View u() {
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = this.f290981f;
        android.view.View childAt = frameBubbleContentLayout != null ? frameBubbleContentLayout.getChildAt(0) : null;
        return childAt == null ? this.f290979d : childAt;
    }

    public abstract java.lang.String v();

    public final int w() {
        android.view.View view = this.f290981f;
        if (view == null) {
            view = this.f290979d;
        }
        return view.getVisibility();
    }

    public final boolean x() {
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = this.f290981f;
        return frameBubbleContentLayout != null && frameBubbleContentLayout.f111510i == 2;
    }

    public final void y() {
        com.tencent.mars.xlog.Log.i(this.f290980e, "requestBubbleHide");
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = this.f290981f;
        if (frameBubbleContentLayout != null) {
            frameBubbleContentLayout.c();
        }
    }

    public void z() {
        com.tencent.mars.xlog.Log.i(this.f290980e, "requestBubbleShow");
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = this.f290981f;
        if (frameBubbleContentLayout != null) {
            frameBubbleContentLayout.d();
        }
    }
}
