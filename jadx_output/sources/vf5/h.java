package vf5;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f436418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f436419e;

    public h(android.widget.FrameLayout frameLayout, int i17) {
        this.f436418d = frameLayout;
        this.f436419e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout frameLayout = this.f436418d;
        boolean z17 = frameLayout instanceof android.widget.ScrollView;
        int i17 = this.f436419e;
        if (z17) {
            ((android.widget.ScrollView) frameLayout).smoothScrollBy(0, i17);
        } else if (frameLayout instanceof androidx.core.widget.NestedScrollView) {
            ((androidx.core.widget.NestedScrollView) frameLayout).s(0, i17, 250, false);
        }
    }
}
