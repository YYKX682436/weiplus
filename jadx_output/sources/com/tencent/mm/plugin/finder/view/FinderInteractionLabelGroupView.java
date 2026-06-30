package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderInteractionLabelGroupView;", "Landroid/widget/LinearLayout;", "", "e", "Z", "getShrinkable", "()Z", "setShrinkable", "(Z)V", "shrinkable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderInteractionLabelGroupView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f131161d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean shrinkable;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderInteractionLabelGroupView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(java.util.List interactionLabels) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(interactionLabels, "interactionLabels");
        java.util.ArrayList arrayList = this.f131161d;
        while (interactionLabels.size() != arrayList.size()) {
            if (arrayList.size() > interactionLabels.size()) {
                android.view.View view = (android.widget.TextView) kz5.h0.E(arrayList);
                if (view == null) {
                    break;
                } else {
                    removeView(view);
                }
            } else {
                android.widget.TextView textView = new android.widget.TextView(getContext());
                textView.setTextAppearance(com.tencent.mm.R.style.f494501xv);
                textView.setSingleLine(true);
                addView(textView);
                arrayList.add(textView);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.widget.TextView textView2 = (android.widget.TextView) next;
            android.view.ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart(i17 == 0 ? 0 : getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl));
                textView2.setLayoutParams(layoutParams2);
            }
            r45.zb1 zb1Var = (r45.zb1) kz5.n0.a0(interactionLabels, i17);
            if (zb1Var == null || (string = zb1Var.getString(0)) == null) {
                com.tencent.mars.xlog.Log.e("FinderInteractionLabelGroupView", "can not get valid label with index:" + i17);
            } else {
                i95.m c17 = i95.n0.c(zy2.s6.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                android.text.SpannableString l66 = zy2.s6.l6((zy2.s6) c17, string, (int) textView2.getTextSize(), false, null, 0, false, null, 124, null);
                textView2.setText(l66);
                textView2.setVisibility(0);
                java.lang.Object[] spans = l66.getSpans(0, l66.length(), java.lang.Object.class);
                kotlin.jvm.internal.o.f(spans, "getSpans(...)");
                java.lang.Object obj = spans.length == 0 ? null : spans[spans.length - 1];
                textView2.setEllipsize(obj != null && (obj instanceof android.text.style.ImageSpan) ? android.text.TextUtils.TruncateAt.MIDDLE : android.text.TextUtils.TruncateAt.END);
            }
            i17 = i18;
        }
        requestLayout();
    }

    public final boolean getShrinkable() {
        return this.shrinkable;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        java.util.ArrayList<android.widget.TextView> arrayList = this.f131161d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            i19 = 0;
            if (!it.hasNext()) {
                break;
            }
            android.widget.TextView textView = (android.widget.TextView) it.next();
            textView.setVisibility(0);
            if (this.shrinkable) {
                i19 = (int) textView.getPaint().measureText(textView.getText().toString());
            }
            textView.setMinWidth(i19);
        }
        super.onMeasure(i17, i18);
        for (android.widget.TextView textView2 : arrayList) {
            int measureText = (int) textView2.getPaint().measureText(hc2.x0.f(textView2.getText().toString(), 2));
            textView2.getMeasuredWidth();
            if (textView2.getMeasuredWidth() < measureText) {
                textView2.setVisibility(8);
                i19 = 1;
            }
        }
        if (i19 != 0) {
            super.onMeasure(i17, i18);
        }
    }

    public final void setShrinkable(boolean z17) {
        this.shrinkable = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderInteractionLabelGroupView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131161d = new java.util.ArrayList();
        this.shrinkable = true;
        setOrientation(0);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b92.w2.f18548e, 0, 0);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                this.shrinkable = obtainStyledAttributes.getBoolean(0, true);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
