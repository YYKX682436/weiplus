package td4;

/* loaded from: classes4.dex */
public final class q1 extends ub4.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI f417720d;

    public q1(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f417720d = snsAlbumPickerUI;
    }

    @Override // ub4.q
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadMore", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$2");
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI = this.f417720d;
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Y6(snsAlbumPickerUI).post(new td4.p1(snsAlbumPickerUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadMore", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$2");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    @Override // ub4.q, androidx.recyclerview.widget.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r7, int r8) {
        /*
            r6 = this;
            java.lang.String r8 = "onScrollStateChanged"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$2"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r0)
            java.lang.String r1 = "recyclerView"
            kotlin.jvm.internal.o.g(r7, r1)
            com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI r1 = r6.f417720d
            boolean r2 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Z6(r1)
            r3 = 1
            if (r2 == 0) goto L28
            java.lang.String r2 = "access$getMIsDataFetching$p"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            boolean r5 = r1.f170229h
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            if (r5 != 0) goto L26
            goto L28
        L26:
            r2 = 0
            goto L29
        L28:
            r2 = r3
        L29:
            r1.setBounceEnabled(r2)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r7 = r7.getLayoutManager()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"
            kotlin.jvm.internal.o.e(r7, r1)
            androidx.recyclerview.widget.GridLayoutManager r7 = (androidx.recyclerview.widget.GridLayoutManager) r7
            int r1 = r7.x()
            int r7 = r7.getItemCount()
            int r7 = r7 - r3
            if (r1 != r7) goto L46
            r6.a()
        L46:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: td4.q1.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }
}
