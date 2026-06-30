package ud4;

/* loaded from: classes13.dex */
public class v implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public int f426746d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f426747e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f426748f;

    /* renamed from: g, reason: collision with root package name */
    public int f426749g;

    /* renamed from: h, reason: collision with root package name */
    public int f426750h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView f426751i;

    public v(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView) {
        this.f426751i = dynamicGridView;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.lang.Boolean bool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$10", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        this.f426748f = i17;
        this.f426749g = i18;
        int i27 = this.f426746d;
        if (i27 == -1) {
            i27 = i17;
        }
        this.f426746d = i27;
        int i28 = this.f426747e;
        if (i28 == -1) {
            i28 = i18;
        }
        this.f426747e = i28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAndHandleFirstVisibleCellChange", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        int i29 = this.f426748f;
        int i37 = this.f426746d;
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f426751i;
        if (i29 != i37) {
            int i38 = com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.f170255y0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            boolean z17 = dynamicGridView.f170275x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            if (z17 && com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.b(dynamicGridView) != -1) {
                long b17 = com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.b(dynamicGridView);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                dynamicGridView.B(b17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                dynamicGridView.p();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAndHandleFirstVisibleCellChange", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAndHandleLastVisibleCellChange", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        if (this.f426748f + this.f426749g != this.f426746d + this.f426747e) {
            int i39 = com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.f170255y0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            boolean z18 = dynamicGridView.f170275x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            if (z18 && com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.b(dynamicGridView) != -1) {
                long b18 = com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.b(dynamicGridView);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                dynamicGridView.B(b18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                dynamicGridView.p();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAndHandleLastVisibleCellChange", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        this.f426746d = this.f426748f;
        this.f426747e = this.f426749g;
        int i47 = com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.f170255y0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.s();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        boolean z19 = dynamicGridView.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (z19) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateWobbleState", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            for (int i48 = 0; i48 < i18; i48++) {
                android.view.View childAt = dynamicGridView.getChildAt(i48);
                if (childAt != null) {
                    if (com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.b(dynamicGridView) == -1 || (bool = java.lang.Boolean.TRUE) == childAt.getTag(com.tencent.mm.R.id.cxa)) {
                        if (com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.b(dynamicGridView) == -1 && childAt.getRotation() != 0.0f) {
                            childAt.setRotation(0.0f);
                            childAt.setTag(com.tencent.mm.R.id.cxa, java.lang.Boolean.FALSE);
                        }
                    } else {
                        if (i48 % 2 == 0) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                            dynamicGridView.i(childAt);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                            dynamicGridView.j(childAt);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                        }
                        childAt.setTag(com.tencent.mm.R.id.cxa, bool);
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWobbleState", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        }
        if (com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.d(dynamicGridView) != null) {
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.d(dynamicGridView).onScroll(absListView, i17, i18, i19);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$10", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$10", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        this.f426750h = i17;
        int i18 = com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.f170255y0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f426751i;
        dynamicGridView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isScrollCompleted", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        if (this.f426749g > 0 && this.f426750h == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            boolean z17 = dynamicGridView.f170275x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                boolean z18 = dynamicGridView.f170278z;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                if (z18) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    dynamicGridView.q();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isScrollCompleted", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        if (com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.d(dynamicGridView) != null) {
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.d(dynamicGridView).onScrollStateChanged(absListView, i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$10", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
    }
}
