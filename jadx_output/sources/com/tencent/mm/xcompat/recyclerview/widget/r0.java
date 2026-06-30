package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class r0 implements com.tencent.mm.xcompat.recyclerview.widget.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214623a;

    public r0(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        this.f214623a = recyclerView;
    }

    public int a() {
        return this.f214623a.getChildCount();
    }

    public void b(int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214623a;
        android.view.View childAt = recyclerView.getChildAt(i17);
        if (childAt != null) {
            recyclerView.q(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i17);
    }
}
