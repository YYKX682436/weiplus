package com.tencent.mm.plugin.finder.nest;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/nest/FinderParentRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "", "can", "Ljz5/f0;", "setCanScrollVertically", "", "l2", "I", "getTotalDy", "()I", "setTotalDy", "(I)V", "totalDy", "m2", "Z", "isStartFling", "()Z", "setStartFling", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public class FinderParentRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView {

    /* renamed from: p2, reason: collision with root package name */
    public static final /* synthetic */ int f122233p2 = 0;

    /* renamed from: j2, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b1 f122234j2;

    /* renamed from: k2, reason: collision with root package name */
    public float f122235k2;

    /* renamed from: l2, reason: collision with root package name and from kotlin metadata */
    public int totalDy;

    /* renamed from: m2, reason: collision with root package name and from kotlin metadata */
    public boolean isStartFling;

    /* renamed from: n2, reason: collision with root package name */
    public int f122238n2;

    /* renamed from: o2, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f122239o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderParentRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i17;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.live.util.b1 b1Var = new com.tencent.mm.plugin.finder.live.util.b1(context2);
        this.f122234j2 = b1Var;
        android.content.Context context3 = getContext();
        int c17 = com.tencent.mm.ui.bl.c(context3 == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context3);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            i17 = (i19 >= i18 ? i19 : i18) - c17;
        }
        b1Var.b(i17 * 4);
        this.f122239o2 = new java.util.concurrent.atomic.AtomicBoolean(true);
        i(new hr2.b(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.f122238n2 = 0;
        }
        if (motionEvent != null && motionEvent.getAction() != 2) {
            this.f122235k2 = 0.0f;
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView g1() {
        com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment o17;
        java.lang.Object adapter = getAdapter();
        hr2.c cVar = adapter instanceof hr2.c ? (hr2.c) adapter : null;
        if (cVar == null) {
            return null;
        }
        in5.r w07 = ((up2.h) cVar).w0(-4998);
        gq2.j jVar = w07 instanceof gq2.j ? (gq2.j) w07 : null;
        if (jVar == null || (o17 = jVar.o()) == null) {
            return null;
        }
        return o17.f122085o;
    }

    public final int getTotalDy() {
        return this.totalDy;
    }

    public boolean h1() {
        return true ^ canScrollVertically(1);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View target, float f17, float f18, boolean z17) {
        kotlin.jvm.internal.o.g(target, "target");
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View target, float f17, float f18) {
        kotlin.jvm.internal.o.g(target, "target");
        com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView g17 = g1();
        boolean z17 = f18 > 0.0f && !h1();
        boolean z18 = f18 < 0.0f && g17 != null && g17.g1();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17 && !z18) {
            return false;
        }
        r0(0, (int) f18);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View target, int i17, int i18, int[] consumed) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(consumed, "consumed");
        com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView g17 = g1();
        boolean z17 = i18 > 0 && !h1();
        boolean z18 = i18 < 0 && g17 != null && g17.g1();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17 || z18) {
            scrollBy(0, i18);
            consumed[1] = i18;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View child, android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        return target instanceof com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        if (this.f122235k2 == 0.0f) {
            this.f122235k2 = e17.getY();
        }
        com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView g17 = g1();
        if (h1() && g17 != null) {
            int y17 = (int) (this.f122235k2 - e17.getY());
            g17.scrollBy(0, y17);
            com.tencent.mars.xlog.Log.i("FinderParentRecyclerView", "onTouchEvent nestScroll deltaY: " + y17);
        }
        if (e17.getAction() == 1) {
            if (g17 != null && g17.g1()) {
                setCanScrollVertically(true);
            }
        }
        this.f122235k2 = e17.getY();
        try {
            return super.onTouchEvent(e17);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, androidx.recyclerview.widget.RecyclerView
    public boolean r0(int i17, int i18) {
        boolean r07 = super.r0(i17, i18);
        if (!r07 || i18 <= 0) {
            this.f122238n2 = 0;
        } else {
            this.isStartFling = true;
            this.f122238n2 = i18;
        }
        return r07;
    }

    public final void setCanScrollVertically(boolean z17) {
        this.f122239o2.set(z17);
        com.tencent.mars.xlog.Log.i("FinderParentRecyclerView", "setCanScrollVertically: " + z17);
    }

    public final void setStartFling(boolean z17) {
        this.isStartFling = z17;
    }

    public final void setTotalDy(int i17) {
        this.totalDy = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderParentRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int i18;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.live.util.b1 b1Var = new com.tencent.mm.plugin.finder.live.util.b1(context2);
        this.f122234j2 = b1Var;
        android.content.Context context3 = getContext();
        int c17 = com.tencent.mm.ui.bl.c(context3 == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context3);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i19 = b17.x;
        int i27 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i18 = i27 - c17;
        } else {
            i18 = (i27 >= i19 ? i27 : i19) - c17;
        }
        b1Var.b(i18 * 4);
        this.f122239o2 = new java.util.concurrent.atomic.AtomicBoolean(true);
        i(new hr2.b(this));
    }
}
