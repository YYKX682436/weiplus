package xt2;

/* loaded from: classes15.dex */
public final class t extends ul5.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveOneWayHorizontalBounceView f457014b;

    public t(com.tencent.mm.plugin.finder.shopping.view.FinderLiveOneWayHorizontalBounceView finderLiveOneWayHorizontalBounceView) {
        this.f457014b = finderLiveOneWayHorizontalBounceView;
    }

    @Override // ul5.h
    public boolean a(ul5.m overScroll, android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(overScroll, "overScroll");
        kotlin.jvm.internal.o.g(child, "child");
        int supportedDirection = this.f457014b.getSupportedDirection();
        if (supportedDirection != 0) {
            if (supportedDirection == 1 && i17 != 8) {
                return false;
            }
        } else if (i17 != 4) {
            return false;
        }
        return true;
    }
}
