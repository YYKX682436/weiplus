package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHorizontalViewPager;", "Landroidx/recyclerview/widget/RecyclerView;", "", "getCurrentSnappedPosition", "Landroidx/recyclerview/widget/f2;", "adapter", "Ljz5/f0;", "setAdapter", "Lcom/tencent/mm/plugin/finder/view/sb;", "b2", "Lcom/tencent/mm/plugin/finder/view/sb;", "getPageChangeListener", "()Lcom/tencent/mm/plugin/finder/view/sb;", "setPageChangeListener", "(Lcom/tencent/mm/plugin/finder/view/sb;)V", "pageChangeListener", "Lcom/tencent/mm/plugin/finder/view/rb;", "c2", "Lcom/tencent/mm/plugin/finder/view/rb;", "getFingerTouchCallback", "()Lcom/tencent/mm/plugin/finder/view/rb;", "setFingerTouchCallback", "(Lcom/tencent/mm/plugin/finder/view/rb;)V", "fingerTouchCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderHorizontalViewPager extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.view.sb pageChangeListener;

    /* renamed from: c2, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.view.rb fingerTouchCallback;

    /* renamed from: d2, reason: collision with root package name */
    public androidx.recyclerview.widget.r3 f131149d2;

    /* renamed from: e2, reason: collision with root package name */
    public int f131150e2;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f131151f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHorizontalViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131150e2 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentSnappedPosition() {
        androidx.recyclerview.widget.r3 r3Var;
        android.view.View f17;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (r3Var = this.f131149d2) == null || (f17 = r3Var.f(linearLayoutManager)) == null) {
            return -1;
        }
        return linearLayoutManager.getPosition(f17);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void a1(int i17) {
        h1(i17, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.finder.view.rb rbVar;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.tencent.mm.plugin.finder.view.rb rbVar2 = this.fingerTouchCallback;
            if (rbVar2 != null) {
                mx2.g gVar = (mx2.g) rbVar2;
                com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = gVar.f332487b;
                gVar.f332486a = finderImageBanner.f132324v;
                finderImageBanner.o();
            }
        } else {
            boolean z17 = true;
            if ((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 3)) {
                z17 = false;
            }
            if (z17 && (rbVar = this.fingerTouchCallback) != null) {
                mx2.g gVar2 = (mx2.g) rbVar;
                boolean z18 = gVar2.f332486a;
                com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner2 = gVar2.f332487b;
                if (z18) {
                    finderImageBanner2.m();
                } else {
                    finderImageBanner2.o();
                }
            }
        }
        return dispatchTouchEvent;
    }

    public final com.tencent.mm.plugin.finder.view.rb getFingerTouchCallback() {
        return this.fingerTouchCallback;
    }

    public final com.tencent.mm.plugin.finder.view.sb getPageChangeListener() {
        return this.pageChangeListener;
    }

    public final void h1(int i17, boolean z17) {
        boolean z18 = i17 != this.f131150e2;
        super.a1(i17);
        if (z18) {
            this.f131150e2 = i17;
            post(new com.tencent.mm.plugin.finder.view.tb(this, i17, z17));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(androidx.recyclerview.widget.f2 f2Var) {
        if (this.f131149d2 == null) {
            this.f131149d2 = new androidx.recyclerview.widget.y1();
        }
        androidx.recyclerview.widget.r3 r3Var = this.f131149d2;
        if (r3Var != null) {
            r3Var.b(this);
        }
        super.setAdapter(f2Var);
        i(new com.tencent.mm.plugin.finder.view.ub(this));
    }

    public final void setFingerTouchCallback(com.tencent.mm.plugin.finder.view.rb rbVar) {
        this.fingerTouchCallback = rbVar;
    }

    public final void setPageChangeListener(com.tencent.mm.plugin.finder.view.sb sbVar) {
        this.pageChangeListener = sbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHorizontalViewPager(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131150e2 = -1;
    }
}
