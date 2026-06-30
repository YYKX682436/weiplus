package com.tencent.mm.plugin.story.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GalleryLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public boolean A;

    /* renamed from: v, reason: collision with root package name */
    public int f171875v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f171876w;

    /* renamed from: x, reason: collision with root package name */
    public int f171877x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.p f171878y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.p f171879z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryLayoutManager(android.content.Context context, int i17) {
        super(context, i17, false);
        kotlin.jvm.internal.o.g(context, "context");
        this.f171877x = -1;
        this.A = true;
    }

    public final void W(boolean z17) {
        int i17 = 0;
        if (getChildCount() != 1) {
            if (super.getF98486n()) {
                int width = getWidth() / 2;
                int childCount = getChildCount();
                while (i17 < childCount) {
                    android.view.View childAt = getChildAt(i17);
                    kotlin.jvm.internal.o.d(childAt);
                    int left = childAt.getLeft();
                    android.view.View childAt2 = getChildAt(i17);
                    kotlin.jvm.internal.o.d(childAt2);
                    if ((left + childAt2.getRight()) / 2 == width) {
                        break;
                    } else {
                        i17++;
                    }
                }
                i17 = -1;
            } else {
                int height = getHeight() / 2;
                int childCount2 = getChildCount();
                while (i17 < childCount2) {
                    android.view.View childAt3 = getChildAt(i17);
                    kotlin.jvm.internal.o.d(childAt3);
                    int top = childAt3.getTop();
                    android.view.View childAt4 = getChildAt(i17);
                    kotlin.jvm.internal.o.d(childAt4);
                    if ((top + childAt4.getBottom()) / 2 == height) {
                        break;
                    } else {
                        i17++;
                    }
                }
                i17 = -1;
            }
        }
        if (i17 >= 0) {
            android.view.View childAt5 = getChildAt(i17);
            kotlin.jvm.internal.o.d(childAt5);
            int position = getPosition(childAt5);
            if (position != this.f171877x || z17) {
                this.f171877x = position;
                yz5.p pVar = this.f171878y;
                if (pVar != null) {
                    pVar.invoke(java.lang.Integer.valueOf(position), childAt5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF98486n() {
        return this.A && super.getF98486n();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        return this.A && getItemCount() > 1 && super.getF123307r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onItemsAdded(recyclerView, i17, i18);
        int i19 = this.f171877x;
        if (i19 < i17 || i19 >= i17 + i18) {
            return;
        }
        this.f171876w = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLayoutManager", "LogStory: onItemsChanged");
        this.f171876w = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLayoutManager", "LogStory: onItemsRemoved " + i17 + ", " + i18);
        super.onItemsRemoved(recyclerView, i17, i18);
        int i19 = this.f171877x;
        if (i19 < i17 || i19 >= i17 + i18) {
            return;
        }
        this.f171876w = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLayoutManager", "LogStory: onItemsUpdated " + i17 + ", " + i18);
        super.onItemsUpdated(recyclerView, i17, i18);
        int i19 = this.f171877x;
        if (i19 < i17 || i19 >= i17 + i18) {
            return;
        }
        this.f171876w = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLayoutManager", "LogStory: onLayoutCompleted");
        super.onLayoutCompleted(h3Var);
        W(this.f171876w);
        this.f171876w = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLayoutManager", "LogStory: onScrollStateChanged " + i17);
        super.onScrollStateChanged(i17);
        this.f171875v = i17;
        if (i17 == 0) {
            W(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i17, recycler, state);
        if ((i17 + 1 <= scrollHorizontallyBy && scrollHorizontallyBy < 0) && this.f171875v == 1) {
            android.view.View childAt = getChildAt(0);
            android.view.ViewParent parent = childAt != null ? childAt.getParent() : null;
            androidx.recyclerview.widget.RecyclerView recyclerView = parent instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) parent : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLayoutManager", "horizontal Drag to end, " + i17 + ' ' + scrollHorizontallyBy + ", " + recyclerView);
            if (recyclerView != null) {
                recyclerView.f1();
            }
        }
        return scrollHorizontallyBy;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: scrollToPosition ");
        sb6.append(i17);
        sb6.append(' ');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLayoutManager", sb6.toString());
        super.scrollToPosition(i17);
        yz5.p pVar = this.f171879z;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(0.0f));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        int decoratedLeft;
        int decoratedMeasuredWidth;
        float f17;
        int i18;
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        int scrollVerticallyBy = super.scrollVerticallyBy(i17, recycler, state);
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLayoutManager", "LogStory: vertical " + i17 + ' ' + scrollVerticallyBy);
        if ((i17 + 1 <= scrollVerticallyBy && scrollVerticallyBy < 0) && this.f171875v == 1) {
            android.view.View childAt = getChildAt(0);
            android.view.ViewParent parent = childAt != null ? childAt.getParent() : null;
            androidx.recyclerview.widget.RecyclerView recyclerView = parent instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) parent : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLayoutManager", "vertical Drag to end, " + i17 + ' ' + scrollVerticallyBy + ", " + recyclerView);
            if (recyclerView != null) {
                recyclerView.f1();
            }
        }
        if (getChildCount() != 0) {
            if (getChildCount() == 1) {
                android.view.View childAt2 = getChildAt(0);
                kotlin.jvm.internal.o.d(childAt2);
                i18 = getPosition(childAt2);
                f17 = 0.0f;
            } else {
                android.view.View childAt3 = getChildAt(0);
                kotlin.jvm.internal.o.d(childAt3);
                int position = getPosition(childAt3);
                if (getF123307r()) {
                    decoratedLeft = getDecoratedTop(childAt3);
                    decoratedMeasuredWidth = getDecoratedMeasuredHeight(childAt3);
                } else {
                    decoratedLeft = getDecoratedLeft(childAt3);
                    decoratedMeasuredWidth = getDecoratedMeasuredWidth(childAt3);
                }
                f17 = (-decoratedLeft) / decoratedMeasuredWidth;
                i18 = position;
            }
            yz5.p pVar = this.f171879z;
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(f17));
            }
        }
        return scrollVerticallyBy;
    }
}
