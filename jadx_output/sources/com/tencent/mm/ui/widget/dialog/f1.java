package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class f1 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f211787d;

    public f1(com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.ui.widget.dialog.s0 s0Var) {
        this.f211787d = k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(androidx.recyclerview.widget.RecyclerView r7) {
        /*
            r6 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r7 = r7.getLayoutManager()
            boolean r0 = r7 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 != 0) goto L9
            return
        L9:
            androidx.recyclerview.widget.LinearLayoutManager r7 = (androidx.recyclerview.widget.LinearLayoutManager) r7
            int r0 = r7.w()
            int r1 = r7.y()
        L13:
            if (r0 > r1) goto L83
            r2 = 0
            com.tencent.mm.ui.widget.dialog.k0 r3 = r6.f211787d
            if (r0 >= 0) goto L1c
        L1a:
            r4 = r2
            goto L58
        L1c:
            db5.g4 r4 = r3.L
            int r4 = r4.size()
            if (r0 >= r4) goto L31
            db5.g4 r4 = r3.L
            java.util.List r4 = r4.f228344d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r4 = r4.get(r0)
            db5.h4 r4 = (db5.h4) r4
            goto L58
        L31:
            db5.g4 r4 = r3.M
            int r4 = r4.size()
            if (r4 <= 0) goto L1a
            db5.g4 r4 = r3.L
            int r4 = r4.size()
            db5.g4 r5 = r3.M
            int r5 = r5.size()
            int r4 = r4 + r5
            if (r0 >= r4) goto L1a
            db5.g4 r4 = r3.M
            db5.g4 r5 = r3.L
            int r5 = r5.size()
            int r5 = r0 - r5
            android.view.MenuItem r4 = r4.getItem(r5)
            db5.h4 r4 = (db5.h4) r4
        L58:
            if (r4 != 0) goto L75
            db5.g4 r4 = r3.L
            int r4 = r4.size()
            db5.g4 r5 = r3.M
            int r5 = r5.size()
            int r4 = r4 + r5
            if (r0 != r4) goto L80
            db5.v4 r3 = r3.f211871m2
            if (r3 == 0) goto L80
            android.view.View r4 = r7.findViewByPosition(r0)
            r3.a(r2, r4)
            goto L80
        L75:
            db5.v4 r2 = r4.f228362J
            if (r2 == 0) goto L80
            android.view.View r3 = r7.findViewByPosition(r0)
            r2.a(r4, r3)
        L80:
            int r0 = r0 + 1
            goto L13
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.dialog.f1.a(androidx.recyclerview.widget.RecyclerView):void");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$MenuItemVisibleHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        a(recyclerView);
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$MenuItemVisibleHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$MenuItemVisibleHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        a(recyclerView);
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$MenuItemVisibleHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
