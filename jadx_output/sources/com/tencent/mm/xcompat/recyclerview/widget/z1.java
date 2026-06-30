package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class z1 extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.a2 f214728e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f214729f = new java.util.WeakHashMap();

    public z1(com.tencent.mm.xcompat.recyclerview.widget.a2 a2Var) {
        this.f214728e = a2Var;
    }

    @Override // n3.c
    public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f214729f).get(view);
        return cVar != null ? cVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // n3.c
    public o3.p getAccessibilityNodeProvider(android.view.View view) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f214729f).get(view);
        return cVar != null ? cVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
    }

    @Override // n3.c
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f214729f).get(view);
        if (cVar != null) {
            cVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        com.tencent.mm.xcompat.recyclerview.widget.a2 a2Var = this.f214728e;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = a2Var.f214451e;
        if (!(!recyclerView.A || recyclerView.I || recyclerView.f214401h.g())) {
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView2 = a2Var.f214451e;
            if (recyclerView2.getLayoutManager() != null) {
                com.tencent.mm.xcompat.recyclerview.widget.g1 layoutManager = recyclerView2.getLayoutManager();
                layoutManager.getClass();
                com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(view);
                if (K != null && !K.m() && !layoutManager.f214521a.j(K.f214703d)) {
                    com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = layoutManager.f214522b.f214399f;
                    com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = ((com.tencent.mm.xcompat.viewpager2.widget.s) ((com.tencent.mm.xcompat.viewpager2.widget.n) layoutManager).A.f214751z).f214783d;
                    lVar.o(o3.k.a(viewPager2.getOrientation() == 1 ? viewPager2.f214738m.o(view) : 0, 1, viewPager2.getOrientation() == 0 ? viewPager2.f214738m.o(view) : 0, 1, false, false));
                }
                n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f214729f).get(view);
                if (cVar != null) {
                    cVar.onInitializeAccessibilityNodeInfo(view, lVar);
                    return;
                } else {
                    super.onInitializeAccessibilityNodeInfo(view, lVar);
                    return;
                }
            }
        }
        super.onInitializeAccessibilityNodeInfo(view, lVar);
    }

    @Override // n3.c
    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f214729f).get(view);
        if (cVar != null) {
            cVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // n3.c
    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f214729f).get(viewGroup);
        return cVar != null ? cVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // n3.c
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        com.tencent.mm.xcompat.recyclerview.widget.a2 a2Var = this.f214728e;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = a2Var.f214451e;
        if (!(!recyclerView.A || recyclerView.I || recyclerView.f214401h.g())) {
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView2 = a2Var.f214451e;
            if (recyclerView2.getLayoutManager() != null) {
                n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f214729f).get(view);
                if (cVar != null) {
                    if (cVar.performAccessibilityAction(view, i17, bundle)) {
                        return true;
                    }
                } else if (super.performAccessibilityAction(view, i17, bundle)) {
                    return true;
                }
                com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = recyclerView2.getLayoutManager().f214522b.f214399f;
                return false;
            }
        }
        return super.performAccessibilityAction(view, i17, bundle);
    }

    @Override // n3.c
    public void sendAccessibilityEvent(android.view.View view, int i17) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f214729f).get(view);
        if (cVar != null) {
            cVar.sendAccessibilityEvent(view, i17);
        } else {
            super.sendAccessibilityEvent(view, i17);
        }
    }

    @Override // n3.c
    public void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f214729f).get(view);
        if (cVar != null) {
            cVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
