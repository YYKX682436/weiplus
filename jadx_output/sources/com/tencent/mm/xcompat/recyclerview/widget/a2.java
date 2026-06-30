package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class a2 extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214451e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.z1 f214452f;

    public a2(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        this.f214451e = recyclerView;
        com.tencent.mm.xcompat.recyclerview.widget.z1 z1Var = this.f214452f;
        if (z1Var != null) {
            this.f214452f = z1Var;
        } else {
            this.f214452f = new com.tencent.mm.xcompat.recyclerview.widget.z1(this);
        }
    }

    @Override // n3.c
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (view instanceof com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) {
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214451e;
            if (!recyclerView.A || recyclerView.I || recyclerView.f214401h.g()) {
                return;
            }
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView2 = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) view;
            if (recyclerView2.getLayoutManager() != null) {
                com.tencent.mm.xcompat.recyclerview.widget.e0 e0Var = (com.tencent.mm.xcompat.recyclerview.widget.e0) recyclerView2.getLayoutManager();
                com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView3 = e0Var.f214522b;
                com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = recyclerView3.f214399f;
                if (accessibilityEvent != null) {
                    accessibilityEvent.setScrollable(recyclerView3.canScrollVertically(1) || e0Var.f214522b.canScrollVertically(-1) || e0Var.f214522b.canScrollHorizontally(-1) || e0Var.f214522b.canScrollHorizontally(1));
                    com.tencent.mm.xcompat.recyclerview.widget.u0 u0Var = e0Var.f214522b.f214412s;
                    if (u0Var != null) {
                        accessibilityEvent.setItemCount(u0Var.a());
                    }
                }
                if (e0Var.h() > 0) {
                    accessibilityEvent.setFromIndex(e0Var.N());
                    android.view.View P = e0Var.P(e0Var.h() - 1, -1, false, true);
                    accessibilityEvent.setToIndex(P != null ? e0Var.o(P) : -1);
                }
            }
        }
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214451e;
        if ((!recyclerView.A || recyclerView.I || recyclerView.f214401h.g()) || recyclerView.getLayoutManager() == null) {
            return;
        }
        com.tencent.mm.xcompat.recyclerview.widget.g1 layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = layoutManager.f214522b.f214399f;
        com.tencent.mm.xcompat.viewpager2.widget.n nVar = (com.tencent.mm.xcompat.viewpager2.widget.n) layoutManager;
        if (nVar.f214522b.canScrollVertically(-1) || nVar.f214522b.canScrollHorizontally(-1)) {
            lVar.a(8192);
            lVar.t(true);
        }
        if (nVar.f214522b.canScrollVertically(1) || nVar.f214522b.canScrollHorizontally(1)) {
            lVar.a(4096);
            lVar.t(true);
        }
        lVar.f342642a.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(-1, -1, false, 0));
        nVar.A.f214751z.getClass();
    }

    @Override // n3.c
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        int n17;
        int l17;
        int i18;
        int i19;
        if (super.performAccessibilityAction(view, i17, bundle)) {
            return true;
        }
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214451e;
        if ((!recyclerView.A || recyclerView.I || recyclerView.f214401h.g()) || recyclerView.getLayoutManager() == null) {
            return false;
        }
        com.tencent.mm.xcompat.recyclerview.widget.g1 layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = layoutManager.f214522b.f214399f;
        com.tencent.mm.xcompat.viewpager2.widget.n nVar = (com.tencent.mm.xcompat.viewpager2.widget.n) layoutManager;
        nVar.A.f214751z.getClass();
        if (nVar.f214522b != null) {
            int i27 = nVar.f214533m;
            int i28 = nVar.f214532l;
            android.graphics.Rect rect = new android.graphics.Rect();
            if (nVar.f214522b.getMatrix().isIdentity() && nVar.f214522b.getGlobalVisibleRect(rect)) {
                i27 = rect.height();
                i28 = rect.width();
            }
            if (i17 == 4096) {
                n17 = nVar.f214522b.canScrollVertically(1) ? (i27 - nVar.n()) - nVar.k() : 0;
                if (nVar.f214522b.canScrollHorizontally(1)) {
                    l17 = (i28 - nVar.l()) - nVar.m();
                    i18 = n17;
                    i19 = l17;
                }
                i18 = n17;
                i19 = 0;
            } else if (i17 != 8192) {
                i19 = 0;
                i18 = 0;
            } else {
                n17 = nVar.f214522b.canScrollVertically(-1) ? -((i27 - nVar.n()) - nVar.k()) : 0;
                if (nVar.f214522b.canScrollHorizontally(-1)) {
                    l17 = -((i28 - nVar.l()) - nVar.m());
                    i18 = n17;
                    i19 = l17;
                }
                i18 = n17;
                i19 = 0;
            }
            if (i18 != 0 || i19 != 0) {
                nVar.f214522b.d0(i19, i18, null, Integer.MIN_VALUE, true);
                return true;
            }
        }
        return false;
    }
}
