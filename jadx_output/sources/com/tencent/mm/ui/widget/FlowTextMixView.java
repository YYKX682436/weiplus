package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0002\"#B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/tencent/mm/ui/widget/FlowTextMixView;", "Landroid/widget/FrameLayout;", "", "size", "Ljz5/f0;", "setItemSpacing", "maxPixels", "setMaxWidth", "", "enable", "setOneLineMode", "Lkotlin/Function0;", "i", "Lyz5/a;", "getMeasuredListener", "()Lyz5/a;", "setMeasuredListener", "(Lyz5/a;)V", "measuredListener", "m", "Z", "getIgnoreLastLineSpace", "()Z", "setIgnoreLastLineSpace", "(Z)V", "ignoreLastLineSpace", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al5/x", "al5/y", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public class FlowTextMixView extends android.widget.FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final al5.x f211256n = new al5.x(null);

    /* renamed from: d, reason: collision with root package name */
    public int f211257d;

    /* renamed from: e, reason: collision with root package name */
    public int f211258e;

    /* renamed from: f, reason: collision with root package name */
    public int f211259f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f211260g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f211261h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yz5.a measuredListener;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean ignoreLastLineSpace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowTextMixView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211260g = new java.util.ArrayList();
        c(context, attributeSet);
    }

    public final al5.y a(int i17) {
        java.util.ArrayList arrayList = this.f211260g;
        if (arrayList.size() <= i17) {
            al5.y yVar = new al5.y(i17, this.f211257d, this.f211258e);
            arrayList.add(yVar);
            return yVar;
        }
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.d(obj);
        return (al5.y) obj;
    }

    public final int b() {
        java.util.Iterator it = this.f211260g.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            int i18 = 0;
            for (android.view.View view : ((al5.y) it.next()).f6093d) {
                if (view instanceof android.widget.TextView) {
                    android.widget.TextView textView = (android.widget.TextView) view;
                    if (textView.getLineCount() > 1 && i18 < textView.getLineCount()) {
                        i18 = textView.getLineCount();
                    }
                }
                if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
                    com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) view;
                    if (neatTextView.getLineCount() > 1 && i18 < neatTextView.getLineCount()) {
                        i18 = neatTextView.getLineCount();
                    }
                }
            }
            if (i18 > 1) {
                i17 += i18 - 1;
            }
            i17++;
        }
        return i17;
    }

    public final void c(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447191i);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f211257d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f211258e = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.f211259f = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.ignoreLastLineSpace = obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean getIgnoreLastLineSpace() {
        return this.ignoreLastLineSpace;
    }

    public final yz5.a getMeasuredListener() {
        return this.measuredListener;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int d17;
        int e17;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        java.util.Iterator it = this.f211260g.iterator();
        while (it.hasNext()) {
            al5.y yVar = (al5.y) it.next();
            java.util.Iterator it6 = yVar.f6093d.iterator();
            int i28 = 0;
            int i29 = 0;
            int i37 = 0;
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                int i38 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.view.View view = (android.view.View) next;
                if (i28 > 0) {
                    paddingStart += this.f211257d;
                }
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                int marginStart = ((android.widget.FrameLayout.LayoutParams) layoutParams).getMarginStart();
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                int i39 = marginStart + paddingStart;
                int measuredHeight = (i29 <= 0 ? ((yVar.f6096g - view.getMeasuredHeight()) / 2) + paddingTop : paddingTop + i29 + ((i37 - view.getMeasuredHeight()) / 2)) + ((android.widget.FrameLayout.LayoutParams) layoutParams2).topMargin;
                view.layout(i39, measuredHeight, view.getMeasuredWidth() + i39, view.getMeasuredHeight() + measuredHeight);
                al5.x xVar = f211256n;
                paddingStart += al5.x.a(xVar, view);
                if (view instanceof android.widget.TextView) {
                    android.widget.TextView textView = (android.widget.TextView) view;
                    d17 = textView.getLayout() == null ? 0 : textView.getLayout().getLineTop(textView.getLineCount() - 1);
                    if (textView.getLayout() != null) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        textView.getLayout().getLineBounds(textView.getLineCount() - 1, rect);
                        e17 = rect.height();
                        i37 = e17;
                        i29 = d17;
                    }
                    i29 = d17;
                    i37 = 0;
                } else if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
                    com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) view;
                    d17 = al5.x.d(xVar, neatTextView);
                    if (neatTextView.getLayout() != null) {
                        int d18 = neatTextView.getLayout().d() - 1;
                        e17 = neatTextView.getLayout().e(d18) - neatTextView.getLayout().a(d18);
                        i37 = e17;
                        i29 = d17;
                    }
                    i29 = d17;
                    i37 = 0;
                }
                i28 = i38;
            }
            paddingStart = getPaddingStart();
            paddingTop += yVar.f6095f;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        al5.x xVar;
        al5.y a17;
        int i19;
        int i27 = this.f211259f;
        if (i27 > 0) {
            int size = android.view.View.MeasureSpec.getSize(i17);
            if (i27 > size) {
                i27 = size;
            }
        } else {
            i27 = android.view.View.MeasureSpec.getSize(i17);
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i27, Integer.MIN_VALUE), i18);
        java.util.ArrayList<al5.y> arrayList = this.f211260g;
        arrayList.clear();
        int childCount = getChildCount();
        int i28 = 0;
        int i29 = 0;
        int i37 = 0;
        while (true) {
            xVar = f211256n;
            if (i29 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i29);
            if (childAt.getVisibility() != 8) {
                al5.y a18 = a(i37);
                int a19 = al5.x.a(xVar, childAt);
                if (a19 > i27) {
                    if (a18.f6094e > 0) {
                        i37++;
                        a18 = a(i37);
                    }
                    a18.a(childAt);
                } else if (a18.f6097h + a19 <= i27) {
                    a18.a(childAt);
                } else {
                    i37++;
                    a(i37).a(childAt);
                }
            }
            i29++;
        }
        if (this.ignoreLastLineSpace && arrayList.size() != 0 && (i19 = (a17 = a(arrayList.size() - 1)).f6092c) != 0) {
            a17.f6095f -= i19;
            a17.f6092c = 0;
        }
        if (this.f211261h && arrayList.size() > 0) {
            java.lang.Object obj = arrayList.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            al5.y yVar = (al5.y) obj;
            if (arrayList.size() > 1) {
                int size2 = arrayList.size();
                for (int i38 = 1; i38 < size2; i38++) {
                    java.util.Iterator it = ((al5.y) arrayList.get(i38)).f6093d.iterator();
                    while (it.hasNext()) {
                        yVar.a((android.view.View) it.next());
                    }
                }
                arrayList.subList(1, arrayList.size()).clear();
            }
            if (yVar.f6094e > i27) {
                java.util.ArrayList arrayList2 = yVar.f6093d;
                if (arrayList2.size() > 1) {
                    java.lang.Object obj2 = arrayList2.get(0);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    android.view.View view = (android.view.View) obj2;
                    int c17 = i27 - (yVar.f6094e - al5.x.c(xVar, view));
                    if (c17 > 0) {
                        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(c17, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(al5.x.b(xVar, view), 1073741824));
                        yVar.f6094e = 0;
                        yVar.f6097h = 0;
                        java.util.List V0 = kz5.n0.V0(arrayList2);
                        arrayList2.clear();
                        java.util.Iterator it6 = V0.iterator();
                        while (it6.hasNext()) {
                            yVar.a((android.view.View) it6.next());
                        }
                    }
                }
            }
        }
        int i39 = 0;
        for (al5.y yVar2 : arrayList) {
            i39 += yVar2.f6095f;
            int i47 = yVar2.f6094e;
            if (i28 < i47) {
                i28 = i47;
            }
        }
        setMeasuredDimension(java.lang.Math.min(i27, i28) + getPaddingStart() + getPaddingEnd(), i39 + getPaddingTop() + getPaddingBottom());
        yz5.a aVar = this.measuredListener;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setIgnoreLastLineSpace(boolean z17) {
        this.ignoreLastLineSpace = z17;
    }

    public final void setItemSpacing(int i17) {
        this.f211257d = i17;
        requestLayout();
        invalidate();
    }

    public void setMaxWidth(int i17) {
        this.f211259f = i17;
        requestLayout();
        invalidate();
    }

    public final void setMeasuredListener(yz5.a aVar) {
        this.measuredListener = aVar;
    }

    public final void setOneLineMode(boolean z17) {
        com.tencent.mars.xlog.Log.i("FlowTextMixView", "@" + hashCode() + " setOneLineMode: " + z17);
        this.f211261h = z17;
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowTextMixView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211260g = new java.util.ArrayList();
        c(context, attributeSet);
    }
}
