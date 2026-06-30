package jw2;

/* loaded from: classes9.dex */
public final class b extends androidx.recyclerview.widget.p1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView f302310f;

    public b(com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView recordTypeSelectView) {
        this.f302310f = recordTypeSelectView;
    }

    @Override // androidx.recyclerview.widget.p1, androidx.recyclerview.widget.r3
    public int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View targetView) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        return super.c(layoutManager, targetView);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    @Override // androidx.recyclerview.widget.p1, androidx.recyclerview.widget.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager r7) {
        /*
            r6 = this;
            android.view.View r7 = super.f(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "findSnapView "
            r0.<init>(r1)
            r1 = 0
            if (r7 == 0) goto L13
            java.lang.Object r2 = r7.getTag()
            goto L14
        L13:
            r2 = r1
        L14:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.RecordTypeSelectView"
            com.tencent.mars.xlog.Log.i(r2, r0)
            r0 = 0
            com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView r2 = r6.f302310f
            if (r7 == 0) goto L3a
            int r3 = r2.f130793f
            java.lang.Object r4 = r7.getTag()
            boolean r5 = r4 instanceof java.lang.Integer
            if (r5 != 0) goto L30
            goto L3a
        L30:
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r3 != r4) goto L3a
            r3 = 1
            goto L3b
        L3a:
            r3 = r0
        L3b:
            if (r3 != 0) goto L5f
            if (r7 == 0) goto L43
            java.lang.Object r1 = r7.getTag()
        L43:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L4b
            int r0 = r1.intValue()
        L4b:
            r2.f130793f = r0
            yz5.l r0 = r2.f130796i
            if (r0 == 0) goto L5a
            int r1 = r2.f130793f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r1)
        L5a:
            jw2.e r0 = r2.f130794g
            r0.notifyDataSetChanged()
        L5f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jw2.b.f(androidx.recyclerview.widget.RecyclerView$LayoutManager):android.view.View");
    }

    @Override // androidx.recyclerview.widget.p1, androidx.recyclerview.widget.r3
    public int g(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        return super.g(layoutManager, i17, i18);
    }
}
