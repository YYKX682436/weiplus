package com.tencent.mm.ui.chatting.layoutmanager;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ui/chatting/layoutmanager/ChattingLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class ChattingLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: w, reason: collision with root package name */
    public static tb5.v f201933w;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f201934v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingLinearLayoutManager(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f201934v = arrayList;
        arrayList.add(new fd5.c(this));
        arrayList.add(new fd5.d(this));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void P(int i17, int i18) {
        super.P(i17, i18);
    }

    public final fd5.a W(java.lang.Class lmClazz) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(lmClazz, "lmClazz");
        java.util.Iterator it = this.f201934v.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (lmClazz.isInstance((fd5.a) obj)) {
                break;
            }
        }
        if (obj instanceof fd5.a) {
            return (fd5.a) obj;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void addView(android.view.View child) {
        tb5.v vVar;
        kotlin.jvm.internal.o.g(child, "child");
        long nanoTime = java.lang.System.nanoTime();
        super.addView(child);
        long nanoTime2 = java.lang.System.nanoTime();
        java.lang.Object tag = child.getTag(com.tencent.mm.R.id.ego);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        long j17 = nanoTime2 - nanoTime;
        if (j17 <= 500000.0d || (vVar = f201933w) == null) {
            return;
        }
        java.util.HashMap hashMap = vVar.f417095l;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(valueOf, obj);
        }
        ((java.util.List) obj).add(new tb5.e(intValue, j17, "", false, 0, 16, null));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(android.view.View child, int i17, int i18) {
        tb5.v vVar;
        kotlin.jvm.internal.o.g(child, "child");
        long nanoTime = java.lang.System.nanoTime();
        super.measureChildWithMargins(child, i17, i18);
        long nanoTime2 = java.lang.System.nanoTime();
        java.lang.Object tag = child.getTag(com.tencent.mm.R.id.ego);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        long j17 = nanoTime2 - nanoTime;
        if (j17 <= 500000.0d || (vVar = f201933w) == null) {
            return;
        }
        java.util.HashMap hashMap = vVar.f417096m;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(valueOf, obj);
        }
        ((java.util.List) obj).add(new tb5.e(intValue, j17, "", false, 0, 16, null));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        java.util.List list = this.f201934v;
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((fd5.a) it.next()).a(z2Var, h3Var);
            }
            super.onLayoutChildren(z2Var, h3Var);
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                ((fd5.a) it6.next()).b(z2Var, h3Var);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingLinearLayoutManager", th6, "onLayoutChildren err", new java.lang.Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        java.util.Objects.toString(z2Var);
        java.util.Objects.toString(h3Var);
        return super.scrollHorizontallyBy(i17, z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        super.scrollToPosition(i17);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        java.util.Objects.toString(z2Var);
        java.util.Objects.toString(h3Var);
        return super.scrollVerticallyBy(i17, z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        android.content.Context context = recyclerView != null ? recyclerView.getContext() : null;
        if (context == null) {
            return;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1;
        fd5.b bVar = new fd5.b(context, itemCount == i17, recyclerView);
        try {
            bVar.f12049a = i17;
            startSmoothScroll(bVar);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingLinearLayoutManager", th6, "startSmoothScroll problem %s %s", java.lang.Integer.valueOf(itemCount), java.lang.Integer.valueOf(i17));
        }
    }
}
