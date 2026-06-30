package td4;

/* loaded from: classes2.dex */
public final class h extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f417683d;

    /* renamed from: e, reason: collision with root package name */
    public final int f417684e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f417685f;

    public h(int i17, int i18, int i19, boolean z17, java.util.Set mIgnoreItemViewTypeSet) {
        kotlin.jvm.internal.o.g(mIgnoreItemViewTypeSet, "mIgnoreItemViewTypeSet");
        this.f417683d = i17;
        this.f417684e = i18;
        this.f417685f = mIgnoreItemViewTypeSet;
        new android.graphics.drawable.ColorDrawable(i19);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration");
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        if (parent.getAdapter() != null) {
            androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
            kotlin.jvm.internal.o.d(adapter);
            i17 = adapter.getItemCount();
        } else {
            i17 = 0;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b17 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).b();
        if (b17 < 0 || i17 <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration");
            return;
        }
        if (parent.getAdapter() != null) {
            androidx.recyclerview.widget.f2 adapter2 = parent.getAdapter();
            kotlin.jvm.internal.o.d(adapter2);
            i18 = adapter2.getItemViewType(b17);
        } else {
            i18 = -1;
        }
        if (i18 == -1 || this.f417685f.contains(java.lang.Integer.valueOf(i18))) {
            outRect.set(0, 0, 0, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration");
            return;
        }
        int i19 = this.f417683d;
        int i27 = this.f417684e;
        outRect.set(i19 / 2, i27 / 2, i19 / 2, i27 / 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration");
    }
}
