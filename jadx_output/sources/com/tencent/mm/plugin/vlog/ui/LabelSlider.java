package com.tencent.mm.plugin.vlog.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000eB!\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0014\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/LabelSlider;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "color", "Ljz5/f0;", "setTrackColor", "count", "setLabelCount", "", "", "labelList", "setLabels", ya.b.INDEX, "setSelection", "Lyo4/b;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lyo4/b;", "getCallback", "()Lyo4/b;", "setCallback", "(Lyo4/b;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class LabelSlider extends androidx.constraintlayout.widget.ConstraintLayout {

    /* renamed from: A, reason: from kotlin metadata */
    public yo4.b callback;

    /* renamed from: v, reason: collision with root package name */
    public int f175834v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.ui.SliderTrackView f175835w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f175836x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f175837y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f175838z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelSlider(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f175834v = 5;
        this.f175836x = new java.util.LinkedList();
        this.f175837y = new java.util.LinkedList();
        this.f175838z = new java.util.LinkedList();
        com.tencent.mm.plugin.vlog.ui.SliderTrackView sliderTrackView = new com.tencent.mm.plugin.vlog.ui.SliderTrackView(context, null);
        this.f175835w = sliderTrackView;
        android.graphics.drawable.Drawable drawable = context.getDrawable(com.tencent.mm.R.drawable.f481836c60);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, drawable != null ? drawable.getIntrinsicHeight() : 48);
        layoutParams.f10908s = 0;
        layoutParams.f10906q = 0;
        layoutParams.f10893h = 0;
        addView(sliderTrackView, layoutParams);
        sliderTrackView.setThumbDrawable(drawable);
        sliderTrackView.setCallback(new yo4.a(this));
    }

    public final void A() {
        int i17 = this.f175834v;
        com.tencent.mm.plugin.vlog.ui.SliderTrackView sliderTrackView = this.f175835w;
        sliderTrackView.setPointCount(i17);
        sliderTrackView.setStartOffset(getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479718db));
        java.util.LinkedList linkedList = this.f175837y;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            removeView((android.widget.TextView) it.next());
        }
        linkedList.clear();
        java.util.LinkedList linkedList2 = this.f175836x;
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            removeView((androidx.constraintlayout.widget.Guideline) it6.next());
        }
        linkedList2.clear();
        if (getWidth() > 0) {
            int i18 = 0;
            for (java.lang.Object obj : sliderTrackView.getTrackPoint()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                float floatValue = ((java.lang.Number) obj).floatValue();
                androidx.constraintlayout.widget.Guideline guideline = new androidx.constraintlayout.widget.Guideline(getContext());
                guideline.setId(android.view.View.generateViewId());
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, 0);
                layoutParams.f10906q = 0;
                layoutParams.f10905p = 0;
                layoutParams.R = 1;
                layoutParams.f10879a = (int) floatValue;
                addView(guideline, layoutParams);
                linkedList2.add(guideline);
                android.widget.TextView textView = new android.widget.TextView(getContext());
                textView.setText((java.lang.CharSequence) kz5.n0.a0(this.f175838z, i18));
                textView.setTextColor(-855638017);
                textView.setGravity(17);
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
                layoutParams2.f10895i = sliderTrackView.getId();
                layoutParams2.f10906q = guideline.getId();
                layoutParams2.f10908s = guideline.getId();
                layoutParams2.f10899k = 0;
                addView(textView, layoutParams2);
                linkedList.add(textView);
                i18 = i19;
            }
        }
    }

    public final yo4.b getCallback() {
        return this.callback;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        post(new yo4.c(this));
    }

    public final void setCallback(yo4.b bVar) {
        this.callback = bVar;
    }

    public final void setLabelCount(int i17) {
        this.f175834v = i17;
        A();
    }

    public final void setLabels(java.util.List<? extends java.lang.CharSequence> labelList) {
        kotlin.jvm.internal.o.g(labelList, "labelList");
        java.util.LinkedList linkedList = this.f175838z;
        linkedList.clear();
        linkedList.addAll(labelList);
        int i17 = 0;
        for (java.lang.Object obj : this.f175837y) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((android.widget.TextView) obj).setText((java.lang.CharSequence) kz5.n0.a0(linkedList, i17));
            i17 = i18;
        }
    }

    public final void setSelection(int i17) {
        this.f175835w.setSelection(i17);
    }

    public final void setTrackColor(int i17) {
        this.f175835w.setTrackColor(i17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelSlider(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
