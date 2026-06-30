package com.tencent.mm.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/ui/MMBottomButtonList;", "Landroid/view/ViewGroup;", "", "enableClick", "Ljz5/f0;", "setEnableClick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MMBottomButtonList extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f196888d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f196889e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f196890f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f196891g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f196892h;

    /* renamed from: i, reason: collision with root package name */
    public final int f196893i;

    /* renamed from: m, reason: collision with root package name */
    public final int f196894m;

    /* renamed from: n, reason: collision with root package name */
    public final int f196895n;

    /* renamed from: o, reason: collision with root package name */
    public final int f196896o;

    /* renamed from: p, reason: collision with root package name */
    public final int f196897p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f196898q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MMBottomButtonList(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(java.lang.String text, yz5.l addButtonFinish, yz5.l onCLick) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(addButtonFinish, "addButtonFinish");
        kotlin.jvm.internal.o.g(onCLick, "onCLick");
        java.util.List list = this.f196889e;
        if (!list.isEmpty()) {
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            imageView.setBackgroundResource(com.tencent.mm.R.color.f478593br);
            ((java.util.ArrayList) this.f196888d).add(imageView);
        }
        android.widget.Button button = new android.widget.Button(getContext(), null, 0);
        button.setText(text);
        button.setBackground(null);
        button.setTextSize(0, i65.a.h(button.getContext(), com.tencent.mm.R.dimen.f479853h2));
        button.setTextColor(button.getContext().getColor(com.tencent.mm.R.color.f479311vr));
        com.tencent.mm.ui.dl.i(button.getPaint());
        button.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        button.setOnClickListener(new com.tencent.mm.ui.wb(this, onCLick, button));
        addView(button);
        addButtonFinish.invoke(button);
        ((java.util.ArrayList) list).add(button);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.util.List list;
        int i28;
        java.util.List list2;
        int i29;
        java.util.List list3 = this.f196888d;
        java.util.Iterator it = list3.iterator();
        while (it.hasNext()) {
            removeViewInLayout((android.view.View) it.next());
        }
        int i37 = i19 - i17;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i38 = 0;
        int i39 = 0;
        for (java.lang.Object obj : this.f196890f) {
            int i47 = i38 + 1;
            if (i38 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.List list4 = (java.util.List) obj;
            if (list4.isEmpty()) {
                list = list3;
                i28 = i37;
            } else {
                int intValue = ((java.lang.Number) ((java.util.ArrayList) this.f196891g).get(i38)).intValue();
                int intValue2 = ((java.lang.Number) ((java.util.ArrayList) this.f196892h).get(i38)).intValue();
                int paddingLeft2 = paddingLeft + ((((i37 - getPaddingLeft()) - getPaddingRight()) - intValue) / 2);
                int i48 = 0;
                for (java.lang.Object obj2 : list4) {
                    int i49 = i48 + 1;
                    if (i48 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    android.view.View view = (android.view.View) obj2;
                    if (view.getVisibility() != 8) {
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        int i57 = paddingTop + ((intValue2 - measuredHeight) / 2);
                        i29 = i37;
                        view.layout(paddingLeft2, i57, paddingLeft2 + measuredWidth, measuredHeight + i57);
                        if (i48 != 0) {
                            int i58 = i39 + 1;
                            android.view.View view2 = (android.view.View) ((java.util.ArrayList) list3).get(i39);
                            int i59 = this.f196894m;
                            int i66 = this.f196895n;
                            list2 = list3;
                            addViewInLayout(view2, -1, new android.view.ViewGroup.LayoutParams(i59, i66), true);
                            int i67 = (paddingLeft2 - this.f196893i) - i59;
                            view2.layout(i67, i57, i59 + i67, i66 + i57);
                            i39 = i58;
                        } else {
                            list2 = list3;
                        }
                        paddingLeft2 += measuredWidth + this.f196896o;
                    } else {
                        list2 = list3;
                        i29 = i37;
                    }
                    i37 = i29;
                    i48 = i49;
                    list3 = list2;
                }
                list = list3;
                i28 = i37;
                paddingTop += intValue2 + this.f196897p;
                paddingLeft = getPaddingLeft();
            }
            i37 = i28;
            i38 = i47;
            list3 = list;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int i27;
        int paddingTop;
        int paddingBottom;
        if (android.view.View.MeasureSpec.getMode(i17) == 0) {
            throw new java.lang.IllegalStateException("MMBottomButtonList必须设置宽度约束为MATCH_PARENT或者具体数值，以保证其measuremode 为 AT_MOST或者EXACTLY，当前测量模式为UNSPECIFIED");
        }
        java.util.List list = this.f196892h;
        ((java.util.ArrayList) list).clear();
        java.util.List list2 = this.f196891g;
        ((java.util.ArrayList) list2).clear();
        java.util.List list3 = this.f196890f;
        ((java.util.ArrayList) list3).clear();
        int size = (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight();
        int size2 = (android.view.View.MeasureSpec.getSize(i18) - getPaddingTop()) - getPaddingBottom();
        int i28 = Integer.MIN_VALUE;
        int makeMeasureSpec = android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE ? android.view.View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f196889e.iterator();
        int i29 = 0;
        int i37 = 0;
        int i38 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            i19 = this.f196896o;
            if (!hasNext) {
                break;
            }
            android.view.View view = (android.view.View) it.next();
            java.util.Iterator it6 = it;
            if (view.getVisibility() != 8) {
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, i28), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                if (i29 + measuredWidth > size) {
                    ((java.util.ArrayList) list3).add(kz5.n0.V0(arrayList));
                    arrayList.clear();
                    ((java.util.ArrayList) list).add(java.lang.Integer.valueOf(i37));
                    ((java.util.ArrayList) list2).add(java.lang.Integer.valueOf(i29 - i19));
                    i38 += i37 + this.f196897p;
                    i29 = 0;
                    i37 = 0;
                }
                i37 = java.lang.Math.max(i37, view.getMeasuredHeight());
                i29 += measuredWidth + i19;
                arrayList.add(view);
            }
            it = it6;
            i28 = Integer.MIN_VALUE;
        }
        ((java.util.ArrayList) list3).add(kz5.n0.V0(arrayList));
        ((java.util.ArrayList) list2).add(java.lang.Integer.valueOf(i29 - i19));
        ((java.util.ArrayList) list).add(java.lang.Integer.valueOf(i37));
        if (android.view.View.MeasureSpec.getMode(i18) != 0) {
            if (android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE && (i27 = i38 + i37) < size2) {
                paddingTop = i27 + getPaddingTop();
                paddingBottom = getPaddingBottom();
            }
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), size2);
        }
        paddingTop = i38 + i37 + getPaddingTop();
        paddingBottom = getPaddingBottom();
        size2 = paddingTop + paddingBottom;
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), size2);
    }

    public final void setEnableClick(boolean z17) {
        this.f196898q = z17;
    }

    public /* synthetic */ MMBottomButtonList(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMBottomButtonList(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f196888d = new java.util.ArrayList();
        this.f196889e = new java.util.ArrayList();
        this.f196890f = new java.util.ArrayList();
        this.f196891g = new java.util.ArrayList();
        this.f196892h = new java.util.ArrayList();
        int f17 = i65.a.f(context, com.tencent.mm.R.dimen.f479567j);
        this.f196893i = f17;
        int f18 = i65.a.f(context, com.tencent.mm.R.dimen.f479638bd);
        this.f196894m = f18;
        this.f196895n = i65.a.f(context, com.tencent.mm.R.dimen.f479869hi);
        this.f196896o = (f17 * 2) + f18;
        this.f196897p = i65.a.f(context, com.tencent.mm.R.dimen.f479738dv);
        this.f196898q = true;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
    }
}
