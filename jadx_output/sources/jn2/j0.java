package jn2;

/* loaded from: classes10.dex */
public final class j0 extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jn2.m0 f300633a;

    public j0(jn2.m0 m0Var) {
        this.f300633a = m0Var;
    }

    @Override // androidx.recyclerview.widget.a1
    public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorSingSongEditPanel", "clearView pos:" + viewHolder.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        return androidx.recyclerview.widget.a1.makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    @Override // androidx.recyclerview.widget.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onMove(androidx.recyclerview.widget.RecyclerView r5, androidx.recyclerview.widget.k3 r6, androidx.recyclerview.widget.k3 r7) {
        /*
            r4 = this;
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r5 = "source"
            kotlin.jvm.internal.o.g(r6, r5)
            java.lang.String r5 = "target"
            kotlin.jvm.internal.o.g(r7, r5)
            int r5 = r6.getAdapterPosition()
            int r6 = r7.getAdapterPosition()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "onMove from:"
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r0 = " - to:"
            r7.append(r0)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "FinderLiveAnchorSingSongEditPanel"
            com.tencent.mars.xlog.Log.i(r0, r7)
            jn2.m0 r7 = r4.f300633a
            jn2.r0 r0 = r7.R
            r1 = 1
            if (r5 < 0) goto L54
            java.util.List r0 = r0.f300677f
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            if (r5 >= r3) goto L57
            if (r6 < 0) goto L57
            int r2 = r2.size()
            if (r6 < r2) goto L4f
            goto L57
        L4f:
            java.util.Collections.swap(r0, r5, r6)
            r0 = r1
            goto L58
        L54:
            r0.getClass()
        L57:
            r0 = 0
        L58:
            if (r0 == 0) goto L5f
            jn2.r0 r7 = r7.R
            r7.notifyItemMoved(r5, r6)
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.j0.onMove(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.k3, androidx.recyclerview.widget.k3):boolean");
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
    }
}
