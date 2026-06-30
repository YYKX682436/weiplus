package com.tencent.mm.plugin.finder.nest;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010 R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/finder/nest/FinderChildRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "", "l2", "Z", "isStartFling", "()Z", "setStartFling", "(Z)V", "", "m2", "I", "getTotalDy", "()I", "setTotalDy", "(I)V", "totalDy", "Lcom/tencent/mm/plugin/finder/nest/FinderParentRecyclerView;", "n2", "Lcom/tencent/mm/plugin/finder/nest/FinderParentRecyclerView;", "getMFinderParentRecyclerView", "()Lcom/tencent/mm/plugin/finder/nest/FinderParentRecyclerView;", "setMFinderParentRecyclerView", "(Lcom/tencent/mm/plugin/finder/nest/FinderParentRecyclerView;)V", "mFinderParentRecyclerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderChildRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView {

    /* renamed from: j2, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b1 f122228j2;

    /* renamed from: k2, reason: collision with root package name */
    public int f122229k2;

    /* renamed from: l2, reason: collision with root package name and from kotlin metadata */
    public boolean isStartFling;

    /* renamed from: m2, reason: collision with root package name and from kotlin metadata */
    public int totalDy;

    /* renamed from: n2, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView mFinderParentRecyclerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderChildRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i17;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.live.util.b1 b1Var = new com.tencent.mm.plugin.finder.live.util.b1(context2);
        this.f122228j2 = b1Var;
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
        setOverScrollMode(2);
        i(new hr2.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.f122229k2 = 0;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean g1() {
        return !canScrollVertically(-1);
    }

    public final com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView getMFinderParentRecyclerView() {
        return this.mFinderParentRecyclerView;
    }

    public final int getTotalDy() {
        return this.totalDy;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, androidx.recyclerview.widget.RecyclerView
    public boolean r0(int i17, int i18) {
        if (!this.f11907x) {
            return false;
        }
        boolean r07 = super.r0(i17, i18);
        if (!r07 || i18 >= 0) {
            this.f122229k2 = 0;
        } else {
            this.isStartFling = true;
            this.f122229k2 = i18;
        }
        return r07;
    }

    public final void setMFinderParentRecyclerView(com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView) {
        this.mFinderParentRecyclerView = finderParentRecyclerView;
    }

    public final void setStartFling(boolean z17) {
        this.isStartFling = z17;
    }

    public final void setTotalDy(int i17) {
        this.totalDy = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderChildRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int i18;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.live.util.b1 b1Var = new com.tencent.mm.plugin.finder.live.util.b1(context2);
        this.f122228j2 = b1Var;
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
        setOverScrollMode(2);
        i(new hr2.a(this));
    }
}
