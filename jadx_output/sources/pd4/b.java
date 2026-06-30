package pd4;

/* loaded from: classes4.dex */
public final class b extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f353561d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f353562e;

    /* renamed from: f, reason: collision with root package name */
    public final int f353563f;

    /* renamed from: g, reason: collision with root package name */
    public final int f353564g;

    /* renamed from: h, reason: collision with root package name */
    public final int f353565h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f353566i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f353562e = new android.graphics.drawable.ColorDrawable(i65.a.d(context, com.tencent.mm.R.color.f478492d));
        int b17 = i65.a.b(context, 1);
        this.f353563f = b17;
        this.f353564g = i65.a.b(context, 3);
        this.f353565h = com.tencent.mm.plugin.sns.model.l4.nj();
        this.f353566i = new java.util.ArrayList();
        setPadding(b17, b17, b17, b17);
    }

    public final void a(int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lineLayout", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        int i27 = this.f353564g;
        int i28 = this.f353565h;
        int i29 = i27 + i28;
        int i37 = i19 + i18;
        int i38 = 0;
        while (i18 < i37) {
            android.view.View childAt = getChildAt(i18);
            int i39 = i38 + 1;
            int i47 = this.f353563f;
            int i48 = (i38 * i29) + i47;
            int i49 = (i29 * i17) + i47;
            childAt.layout(i48, i49, i48 + i28, i49 + i28);
            i18++;
            i38 = i39;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lineLayout", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
    }

    public final void b(int i17) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMediaList", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        this.f353561d = i17;
        while (true) {
            int i18 = this.f353561d;
            int childCount = getChildCount();
            arrayList = this.f353566i;
            if (i18 <= childCount) {
                break;
            }
            nd4.e eVar = nd4.e.f336476a;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView = (com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) eVar.a(com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView.class, context);
            maskImageWithLivePhotoTagView.getImageView().setScaleType(al5.q2.CENTER_CROP);
            maskImageWithLivePhotoTagView.getImageView().setImageDrawable(this.f353562e);
            android.view.View livePhotoTagView = maskImageWithLivePhotoTagView.getLivePhotoTagView();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(livePhotoTagView, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/improve/view/ImproveMultiPhotoLayout", "updateMediaList", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            livePhotoTagView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            boolean z17 = false;
            yj0.a.f(livePhotoTagView, "com/tencent/mm/plugin/sns/ui/item/improve/view/ImproveMultiPhotoLayout", "updateMediaList", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (pc4.d.f353410a.x()) {
                float b17 = i65.a.b(maskImageWithLivePhotoTagView.getContext(), 1);
                boolean z18 = (12 & 4) != 0;
                if ((12 & 8) != 0) {
                    z17 = true;
                }
                maskImageWithLivePhotoTagView.setOutlineProvider(new zl5.a(z18, z17, b17));
                maskImageWithLivePhotoTagView.setClipToOutline(true);
            }
            arrayList.add(maskImageWithLivePhotoTagView);
            int i19 = this.f353565h;
            addView(maskImageWithLivePhotoTagView, i19, i19);
        }
        while (this.f353561d < getChildCount()) {
            int childCount2 = getChildCount() - 1;
            removeViewAt(childCount2);
            java.lang.Object remove = arrayList.remove(childCount2);
            kotlin.jvm.internal.o.f(remove, "removeAt(...)");
            nd4.e.f336476a.b((com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) remove);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMultiPhotoLayout", "updateMediaList media size:" + i17 + " child count:" + getChildCount());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMediaList", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
    }

    public final java.util.List<android.view.View> getChildList() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildList", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        java.util.ArrayList arrayList = this.f353566i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildList", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        return arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        int childCount = getChildCount();
        if (childCount >= 0 && childCount < 4) {
            a(0, 0, getChildCount());
        } else if (childCount == 4) {
            a(0, 0, 2);
            a(1, 2, 2);
        } else {
            if (5 <= childCount && childCount < 7) {
                a(0, 0, 3);
                a(1, 3, getChildCount() - 3);
            } else {
                if (7 <= childCount && childCount < 10) {
                    a(0, 0, 3);
                    a(1, 3, 3);
                    a(2, 6, getChildCount() - 6);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        super.onMeasure(i17, i18);
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = getChildAt(i19);
            measureChild(childAt, 1073741824, 1073741824);
            childAt.getMeasuredWidth();
            childAt.getMeasuredHeight();
        }
        setMeasuredDimension(i17, (((getChildCount() / 3) + (getChildCount() % 3 > 0 ? 1 : 0)) * (this.f353565h + this.f353564g)) + (this.f353563f * 2));
        getMeasuredWidth();
        getMeasuredHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
    }
}
