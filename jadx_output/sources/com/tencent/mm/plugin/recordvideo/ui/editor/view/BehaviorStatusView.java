package com.tencent.mm.plugin.recordvideo.ui.editor.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView;", "Landroid/widget/FrameLayout;", "", "Lcom/tencent/mm/ui/widget/loading/MMProgressLoading;", "g", "Ljz5/g;", "getMmProgressLoading", "()Lcom/tencent/mm/ui/widget/loading/MMProgressLoading;", "mmProgressLoading", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "h", "getResultImageView", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "resultImageView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BehaviorStatusView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f156430d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f156431e;

    /* renamed from: f, reason: collision with root package name */
    public final cw3.d f156432f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g mmProgressLoading;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g resultImageView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BehaviorStatusView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final com.tencent.mm.ui.widget.loading.MMProgressLoading getMmProgressLoading() {
        return (com.tencent.mm.ui.widget.loading.MMProgressLoading) ((jz5.n) this.mmProgressLoading).getValue();
    }

    private final com.tencent.mm.ui.widget.imageview.WeImageView getResultImageView() {
        return (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.resultImageView).getValue();
    }

    public void a(cw3.i newMode) {
        kotlin.jvm.internal.o.g(newMode, "newMode");
        java.lang.String name = newMode.getClass().getName();
        boolean b17 = kotlin.jvm.internal.o.b(this.f156430d, name);
        java.util.Map map = this.f156431e;
        if (!b17) {
            android.view.View view = (android.view.View) ((java.util.LinkedHashMap) map).get(this.f156430d);
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView", "onModeUpdate", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusViewMode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView", "onModeUpdate", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusViewMode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f156430d = name;
        }
        boolean z17 = newMode instanceof cw3.g;
        cw3.d dVar = this.f156432f;
        if (z17) {
            float f17 = ((cw3.g) newMode).f224163a;
            if (f17 <= 0.0d) {
                return;
            }
            if (!map.containsKey(name) && getMmProgressLoading().getParent() == null) {
                com.tencent.mm.ui.widget.loading.MMProgressLoading mmProgressLoading = getMmProgressLoading();
                int i17 = dVar.f224159c;
                map.put(name, mmProgressLoading);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i17);
                layoutParams.gravity = 17;
                addView(mmProgressLoading, layoutParams);
            }
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
            android.view.View view2 = (android.view.View) linkedHashMap.get(name);
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView", "onModeUpdate", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusViewMode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView", "onModeUpdate", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusViewMode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.Object obj = linkedHashMap.get(this.f156430d);
            com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading = obj instanceof com.tencent.mm.ui.widget.loading.MMProgressLoading ? (com.tencent.mm.ui.widget.loading.MMProgressLoading) obj : null;
            if (mMProgressLoading != null) {
                mMProgressLoading.setVisibility(0);
                mMProgressLoading.setProgress((int) (f17 * 100));
                return;
            }
            return;
        }
        if (!(newMode instanceof cw3.h)) {
            boolean z18 = newMode instanceof cw3.e;
            return;
        }
        if (!map.containsKey(name) && getResultImageView().getParent() == null) {
            com.tencent.mm.ui.widget.imageview.WeImageView resultImageView = getResultImageView();
            int i18 = dVar.f224158b;
            map.put(name, resultImageView);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(i18, i18);
            layoutParams2.gravity = 17;
            addView(resultImageView, layoutParams2);
        }
        android.view.View view3 = (android.view.View) ((java.util.LinkedHashMap) map).get(name);
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView", "onModeUpdate", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusViewMode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView", "onModeUpdate", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusViewMode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        java.lang.Object systemService = context.getSystemService("vibrator");
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BehaviorStatusView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f156430d = cw3.f.class.getName();
        this.f156431e = new java.util.LinkedHashMap();
        cw3.d dVar = new cw3.d(0, 0, 0, 0, 0, 31, null);
        this.f156432f = dVar;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gt3.a.f275381a);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            dVar.f224157a = obtainStyledAttributes.getResourceId(3, dVar.f224157a);
            dVar.f224158b = obtainStyledAttributes.getDimensionPixelSize(4, dVar.f224158b);
            dVar.f224160d = obtainStyledAttributes.getColor(2, dVar.f224160d);
            dVar.f224159c = obtainStyledAttributes.getDimensionPixelSize(1, dVar.f224159c);
            dVar.f224161e = obtainStyledAttributes.getColor(0, dVar.f224161e);
            obtainStyledAttributes.recycle();
        }
        this.mmProgressLoading = jz5.h.b(new cw3.b(context, this));
        this.resultImageView = jz5.h.b(new cw3.c(context, this));
    }
}
