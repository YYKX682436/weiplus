package com.tencent.mm.ui.widget.happybubble;

/* loaded from: classes13.dex */
public class LabelsView extends android.view.ViewGroup implements android.view.View.OnClickListener {
    public final java.util.ArrayList A;
    public final java.util.ArrayList B;
    public final java.util.ArrayList C;
    public ol5.k D;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f212107d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.res.ColorStateList f212108e;

    /* renamed from: f, reason: collision with root package name */
    public float f212109f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f212110g;

    /* renamed from: h, reason: collision with root package name */
    public int f212111h;

    /* renamed from: i, reason: collision with root package name */
    public int f212112i;

    /* renamed from: m, reason: collision with root package name */
    public int f212113m;

    /* renamed from: n, reason: collision with root package name */
    public int f212114n;

    /* renamed from: o, reason: collision with root package name */
    public int f212115o;

    /* renamed from: p, reason: collision with root package name */
    public int f212116p;

    /* renamed from: q, reason: collision with root package name */
    public int f212117q;

    /* renamed from: r, reason: collision with root package name */
    public int f212118r;

    /* renamed from: s, reason: collision with root package name */
    public int f212119s;

    /* renamed from: t, reason: collision with root package name */
    public ol5.n f212120t;

    /* renamed from: u, reason: collision with root package name */
    public int f212121u;

    /* renamed from: v, reason: collision with root package name */
    public int f212122v;

    /* renamed from: w, reason: collision with root package name */
    public int f212123w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f212124x;

    /* renamed from: y, reason: collision with root package name */
    public int f212125y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f212126z;

    public LabelsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212111h = -2;
        this.f212112i = -2;
        this.f212113m = 17;
        this.f212124x = false;
        this.f212125y = 1;
        this.A = new java.util.ArrayList();
        this.B = new java.util.ArrayList();
        this.C = new java.util.ArrayList();
        this.f212107d = context;
        c(context, attributeSet);
        h();
    }

    public final int a(float f17) {
        return (int) android.util.TypedValue.applyDimension(1, f17, getResources().getDisplayMetrics());
    }

    public final void b() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            ((android.widget.TextView) getChildAt(i17)).setClickable((this.D == null && this.f212120t == ol5.n.NONE) ? false : true);
        }
    }

    public final void c(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.M);
            int i17 = obtainStyledAttributes.getInt(16, 1);
            ol5.n nVar = ol5.n.NONE;
            if (i17 != 1) {
                if (i17 == 2) {
                    nVar = ol5.n.SINGLE;
                } else if (i17 == 3) {
                    nVar = ol5.n.SINGLE_IRREVOCABLY;
                } else if (i17 == 4) {
                    nVar = ol5.n.MULTI;
                }
            }
            this.f212120t = nVar;
            this.f212121u = obtainStyledAttributes.getInteger(14, 0);
            this.f212122v = obtainStyledAttributes.getInteger(15, 0);
            this.f212123w = obtainStyledAttributes.getInteger(13, 0);
            this.f212126z = obtainStyledAttributes.getBoolean(0, false);
            this.f212113m = obtainStyledAttributes.getInt(2, this.f212113m);
            this.f212111h = obtainStyledAttributes.getLayoutDimension(11, this.f212111h);
            this.f212112i = obtainStyledAttributes.getLayoutDimension(4, this.f212112i);
            if (obtainStyledAttributes.hasValue(3)) {
                this.f212108e = obtainStyledAttributes.getColorStateList(3);
            } else {
                this.f212108e = android.content.res.ColorStateList.valueOf(-16777216);
            }
            this.f212109f = obtainStyledAttributes.getDimension(10, (int) android.util.TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
            if (obtainStyledAttributes.hasValue(5)) {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                this.f212117q = dimensionPixelOffset;
                this.f212116p = dimensionPixelOffset;
                this.f212115o = dimensionPixelOffset;
                this.f212114n = dimensionPixelOffset;
            } else {
                this.f212114n = obtainStyledAttributes.getDimensionPixelOffset(7, a(10.0f));
                this.f212115o = obtainStyledAttributes.getDimensionPixelOffset(9, a(5.0f));
                this.f212116p = obtainStyledAttributes.getDimensionPixelOffset(8, a(10.0f));
                this.f212117q = obtainStyledAttributes.getDimensionPixelOffset(6, a(5.0f));
            }
            this.f212119s = obtainStyledAttributes.getDimensionPixelOffset(12, a(5.0f));
            this.f212118r = obtainStyledAttributes.getDimensionPixelOffset(18, a(5.0f));
            if (obtainStyledAttributes.hasValue(1)) {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId != 0) {
                    this.f212110g = getResources().getDrawable(resourceId);
                } else {
                    this.f212110g = new android.graphics.drawable.ColorDrawable(obtainStyledAttributes.getColor(1, 0));
                }
            } else {
                this.f212110g = getResources().getDrawable(com.tencent.mm.R.drawable.f481344qy);
            }
            this.f212124x = obtainStyledAttributes.getBoolean(17, false);
            obtainStyledAttributes.recycle();
        }
    }

    public final void d() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            f((android.widget.TextView) getChildAt(i17), false);
        }
        this.B.clear();
    }

    public final int e(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode == 1073741824) {
            i18 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i18 = java.lang.Math.min(i18, size);
        }
        return android.view.View.resolveSizeAndState(java.lang.Math.max(i18, getSuggestedMinimumWidth()), i17, 0);
    }

    public final void f(android.widget.TextView textView, boolean z17) {
        if (textView.isSelected() != z17) {
            textView.setSelected(z17);
            java.util.ArrayList arrayList = this.B;
            if (z17) {
                arrayList.add((java.lang.Integer) textView.getTag(com.tencent.mm.R.id.nwq));
            } else {
                arrayList.remove((java.lang.Integer) textView.getTag(com.tencent.mm.R.id.nwq));
            }
        }
    }

    public void g(java.util.List list, ol5.j jVar) {
        d();
        removeAllViews();
        java.util.ArrayList arrayList = this.A;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.Object obj = list.get(i17);
                android.widget.TextView textView = new android.widget.TextView(this.f212107d);
                textView.setPadding(this.f212114n, this.f212115o, this.f212116p, this.f212117q);
                textView.setTextSize(0, this.f212109f);
                textView.setGravity(this.f212113m);
                textView.setTextColor(this.f212108e);
                textView.setBackgroundDrawable(this.f212110g.getConstantState().newDrawable());
                textView.setTag(com.tencent.mm.R.id.nwn, obj);
                textView.setTag(com.tencent.mm.R.id.nwq, java.lang.Integer.valueOf(i17));
                textView.setOnClickListener(this);
                textView.setSingleLine(true);
                textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                addView(textView, this.f212111h, this.f212112i);
                textView.setText(jVar.a(textView, i17, obj));
            }
            b();
        }
        if (this.f212120t == ol5.n.SINGLE_IRREVOCABLY) {
            setSelects(0);
        }
    }

    public java.util.List<java.lang.Integer> getCompulsorys() {
        return this.C;
    }

    public int getLabelGravity() {
        return this.f212113m;
    }

    public android.content.res.ColorStateList getLabelTextColor() {
        return this.f212108e;
    }

    public float getLabelTextSize() {
        return this.f212109f;
    }

    public <T> java.util.List<T> getLabels() {
        return this.A;
    }

    public int getLineCount() {
        return this.f212125y;
    }

    public int getLineMargin() {
        return this.f212119s;
    }

    public int getMaxLines() {
        return this.f212123w;
    }

    public int getMaxSelect() {
        return this.f212121u;
    }

    public int getMinSelect() {
        return this.f212122v;
    }

    public <T> java.util.List<T> getSelectLabelDatas() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.B;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object tag = getChildAt(((java.lang.Integer) arrayList2.get(i17)).intValue()).getTag(com.tencent.mm.R.id.nwn);
            if (tag != null) {
                arrayList.add(tag);
            }
        }
        return arrayList;
    }

    public java.util.List<java.lang.Integer> getSelectLabels() {
        return this.B;
    }

    public ol5.n getSelectType() {
        return this.f212120t;
    }

    public int getTextPaddingBottom() {
        return this.f212117q;
    }

    public int getTextPaddingLeft() {
        return this.f212114n;
    }

    public int getTextPaddingRight() {
        return this.f212116p;
    }

    public int getTextPaddingTop() {
        return this.f212115o;
    }

    public int getWordMargin() {
        return this.f212118r;
    }

    public final void h() {
        if (isInEditMode()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("Label 1");
            arrayList.add("Label 2");
            arrayList.add("Label 3");
            arrayList.add("Label 4");
            arrayList.add("Label 5");
            arrayList.add("Label 6");
            arrayList.add("Label 7");
            setLabels(arrayList);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/happybubble/LabelsView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            if (!this.f212126z && this.f212120t != ol5.n.NONE) {
                boolean isSelected = textView.isSelected();
                java.util.ArrayList arrayList2 = this.B;
                ol5.n nVar = ol5.n.SINGLE_IRREVOCABLY;
                ol5.n nVar2 = ol5.n.MULTI;
                boolean z17 = true;
                if (isSelected) {
                    if (!((this.f212120t == nVar2 && this.C.contains((java.lang.Integer) textView.getTag(com.tencent.mm.R.id.nwq))) || (this.f212120t == nVar2 && arrayList2.size() <= this.f212122v)) && this.f212120t != nVar) {
                        z17 = false;
                    }
                    if (!z17) {
                        f(textView, false);
                    }
                } else {
                    ol5.n nVar3 = this.f212120t;
                    if (nVar3 == ol5.n.SINGLE || nVar3 == nVar) {
                        d();
                        f(textView, true);
                    } else if (nVar3 == nVar2 && ((i17 = this.f212121u) <= 0 || i17 > arrayList2.size())) {
                        f(textView, true);
                    }
                }
            }
            ol5.k kVar = this.D;
            if (kVar != null) {
                java.lang.Object tag = textView.getTag(com.tencent.mm.R.id.nwn);
                int intValue = ((java.lang.Integer) textView.getTag(com.tencent.mm.R.id.nwq)).intValue();
                xr3.e eVar = (xr3.e) kVar;
                yz5.q qVar = eVar.f456218a.f456229e;
                if (qVar != null) {
                    kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizServiceMenuButton");
                    qVar.invoke((r45.mm) tag, java.lang.Integer.valueOf(eVar.f456219b), java.lang.Integer.valueOf(intValue));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/happybubble/LabelsView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i28 = i19 - i17;
        int childCount = getChildCount();
        int i29 = 1;
        int i37 = 0;
        for (int i38 = 0; i38 < childCount; i38++) {
            android.view.View childAt = getChildAt(i38);
            if (!this.f212124x && i28 < childAt.getMeasuredWidth() + paddingLeft + getPaddingRight()) {
                i29++;
                int i39 = this.f212123w;
                if (i39 > 0 && i29 > i39) {
                    return;
                }
                paddingLeft = getPaddingLeft();
                paddingTop = paddingTop + this.f212119s + i37;
                i37 = 0;
            }
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
            paddingLeft = paddingLeft + childAt.getMeasuredWidth() + this.f212118r;
            i37 = java.lang.Math.max(i37, childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f212124x) {
            int childCount = getChildCount();
            int i19 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < childCount; i28++) {
                android.view.View childAt = getChildAt(i28);
                measureChild(childAt, i17, i18);
                i19 += childAt.getMeasuredWidth();
                if (i28 != childCount - 1) {
                    i19 += this.f212118r;
                }
                i27 = java.lang.Math.max(i27, childAt.getMeasuredHeight());
            }
            setMeasuredDimension(e(i17, i19 + getPaddingLeft() + getPaddingRight()), e(i18, i27 + getPaddingTop() + getPaddingBottom()));
            return;
        }
        int childCount2 = getChildCount();
        int size = (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight();
        int i29 = 1;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i47 = 0;
        for (int i48 = 0; i48 < childCount2; i48++) {
            android.view.View childAt2 = getChildAt(i48);
            measureChild(childAt2, i17, i18);
            if (childAt2.getMeasuredWidth() + i37 > size) {
                i29++;
                int i49 = this.f212123w;
                if (i49 > 0 && i29 > i49) {
                    break;
                }
                i39 = i39 + this.f212119s + i38;
                i47 = java.lang.Math.max(i47, i37);
                i37 = 0;
                i38 = 0;
            }
            i37 += childAt2.getMeasuredWidth();
            i38 = java.lang.Math.max(i38, childAt2.getMeasuredHeight());
            if (i48 != childCount2 - 1) {
                int i57 = this.f212118r + i37;
                if (i57 > size) {
                    i29++;
                    int i58 = this.f212123w;
                    if (i58 > 0 && i29 > i58) {
                        break;
                    }
                    i39 = i39 + this.f212119s + i38;
                    i38 = 0;
                    i47 = java.lang.Math.max(i47, i37);
                    i37 = 0;
                } else {
                    i37 = i57;
                }
            }
        }
        this.f212125y = i29;
        setMeasuredDimension(e(i17, java.lang.Math.max(i47, i37) + getPaddingLeft() + getPaddingRight()), e(i18, i39 + i38 + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof android.os.Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        android.os.Bundle bundle = (android.os.Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("key_super_state"));
        android.content.res.ColorStateList colorStateList = (android.content.res.ColorStateList) bundle.getParcelable("key_text_color_state");
        if (colorStateList != null) {
            setLabelTextColor(colorStateList);
        }
        setLabelTextSize(bundle.getFloat("key_text_size_state", this.f212109f));
        this.f212111h = bundle.getInt("key_label_width_state", this.f212111h);
        this.f212112i = bundle.getInt("key_label_height_state", this.f212112i);
        setLabelGravity(bundle.getInt("key_label_gravity_state", this.f212113m));
        int[] intArray = bundle.getIntArray("key_padding_state");
        if (intArray != null && intArray.length == 4) {
            int i17 = intArray[0];
            int i18 = intArray[1];
            int i19 = intArray[2];
            int i27 = intArray[3];
            if (this.f212114n != i17 || this.f212115o != i18 || this.f212116p != i19 || this.f212117q != i27) {
                this.f212114n = i17;
                this.f212115o = i18;
                this.f212116p = i19;
                this.f212117q = i27;
                int childCount = getChildCount();
                for (int i28 = 0; i28 < childCount; i28++) {
                    ((android.widget.TextView) getChildAt(i28)).setPadding(i17, i18, i19, i27);
                }
            }
        }
        setWordMargin(bundle.getInt("key_word_margin_state", this.f212118r));
        setLineMargin(bundle.getInt("key_line_margin_state", this.f212119s));
        int i29 = bundle.getInt("key_select_type_state", this.f212120t.f346241d);
        ol5.n nVar = ol5.n.NONE;
        if (i29 != 1) {
            if (i29 == 2) {
                nVar = ol5.n.SINGLE;
            } else if (i29 == 3) {
                nVar = ol5.n.SINGLE_IRREVOCABLY;
            } else if (i29 == 4) {
                nVar = ol5.n.MULTI;
            }
        }
        setSelectType(nVar);
        setMaxSelect(bundle.getInt("key_max_select_state", this.f212121u));
        setMinSelect(bundle.getInt("key_min_select_state", this.f212122v));
        setMaxLines(bundle.getInt("key_max_lines_state", this.f212123w));
        setIndicator(bundle.getBoolean("key_indicator_state", this.f212126z));
        setSingleLine(bundle.getBoolean("key_single_line_state", this.f212124x));
        java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList("key_select_compulsory_state");
        if (integerArrayList != null && !integerArrayList.isEmpty()) {
            setCompulsorys(integerArrayList);
        }
        java.util.ArrayList<java.lang.Integer> integerArrayList2 = bundle.getIntegerArrayList("key_select_labels_state");
        if (integerArrayList2 == null || integerArrayList2.isEmpty()) {
            return;
        }
        int size = integerArrayList2.size();
        int[] iArr = new int[size];
        for (int i37 = 0; i37 < size; i37++) {
            iArr[i37] = integerArrayList2.get(i37).intValue();
        }
        setSelects(iArr);
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("key_super_state", super.onSaveInstanceState());
        android.content.res.ColorStateList colorStateList = this.f212108e;
        if (colorStateList != null) {
            bundle.putParcelable("key_text_color_state", colorStateList);
        }
        bundle.putFloat("key_text_size_state", this.f212109f);
        bundle.putInt("key_label_width_state", this.f212111h);
        bundle.putInt("key_label_height_state", this.f212112i);
        bundle.putInt("key_label_gravity_state", this.f212113m);
        bundle.putIntArray("key_padding_state", new int[]{this.f212114n, this.f212115o, this.f212116p, this.f212117q});
        bundle.putInt("key_word_margin_state", this.f212118r);
        bundle.putInt("key_line_margin_state", this.f212119s);
        bundle.putInt("key_select_type_state", this.f212120t.f346241d);
        bundle.putInt("key_max_select_state", this.f212121u);
        bundle.putInt("key_min_select_state", this.f212122v);
        bundle.putInt("key_max_lines_state", this.f212123w);
        bundle.putBoolean("key_indicator_state", this.f212126z);
        java.util.ArrayList<java.lang.Integer> arrayList = this.B;
        if (!arrayList.isEmpty()) {
            bundle.putIntegerArrayList("key_select_labels_state", arrayList);
        }
        java.util.ArrayList<java.lang.Integer> arrayList2 = this.C;
        if (!arrayList2.isEmpty()) {
            bundle.putIntegerArrayList("key_select_compulsory_state", arrayList2);
        }
        bundle.putBoolean("key_single_line_state", this.f212124x);
        return bundle;
    }

    public void setCompulsorys(java.util.List<java.lang.Integer> list) {
        if (this.f212120t != ol5.n.MULTI || list == null) {
            return;
        }
        java.util.ArrayList arrayList = this.C;
        arrayList.clear();
        arrayList.addAll(list);
        d();
        setSelects(list);
    }

    public void setIndicator(boolean z17) {
        this.f212126z = z17;
    }

    public void setLabelBackgroundColor(int i17) {
        setLabelBackgroundDrawable(new android.graphics.drawable.ColorDrawable(i17));
    }

    public void setLabelBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        this.f212110g = drawable;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            ((android.widget.TextView) getChildAt(i17)).setBackgroundDrawable(this.f212110g.getConstantState().newDrawable());
        }
    }

    public void setLabelBackgroundResource(int i17) {
        setLabelBackgroundDrawable(getResources().getDrawable(i17));
    }

    public void setLabelGravity(int i17) {
        if (this.f212113m != i17) {
            this.f212113m = i17;
            int childCount = getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                ((android.widget.TextView) getChildAt(i18)).setGravity(i17);
            }
        }
    }

    public void setLabelTextColor(int i17) {
        setLabelTextColor(android.content.res.ColorStateList.valueOf(i17));
    }

    public void setLabelTextSize(float f17) {
        if (this.f212109f != f17) {
            this.f212109f = f17;
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                ((android.widget.TextView) getChildAt(i17)).setTextSize(0, f17);
            }
        }
    }

    public void setLabels(java.util.List<java.lang.String> list) {
        g(list, new ol5.i(this));
    }

    public void setLineMargin(int i17) {
        if (this.f212119s != i17) {
            this.f212119s = i17;
            requestLayout();
        }
    }

    public void setMaxLines(int i17) {
        if (this.f212123w != i17) {
            this.f212123w = i17;
            requestLayout();
        }
    }

    public void setMaxSelect(int i17) {
        if (this.f212121u != i17) {
            this.f212121u = i17;
            if (this.f212120t == ol5.n.MULTI) {
                d();
            }
        }
    }

    public void setMinSelect(int i17) {
        this.f212122v = i17;
    }

    public void setOnLabelClickListener(ol5.k kVar) {
        this.D = kVar;
        b();
    }

    public void setOnLabelSelectChangeListener(ol5.l lVar) {
    }

    public void setOnSelectChangeIntercept(ol5.m mVar) {
    }

    public void setSelectType(ol5.n nVar) {
        if (this.f212120t != nVar) {
            this.f212120t = nVar;
            d();
            if (this.f212120t == ol5.n.SINGLE_IRREVOCABLY) {
                setSelects(0);
            }
            if (this.f212120t != ol5.n.MULTI) {
                this.C.clear();
            }
            b();
        }
    }

    public void setSelects(java.util.List<java.lang.Integer> list) {
        if (list != null) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr[i17] = list.get(i17).intValue();
            }
            setSelects(iArr);
        }
    }

    public void setSingleLine(boolean z17) {
        if (this.f212124x != z17) {
            this.f212124x = z17;
            requestLayout();
        }
    }

    public void setWordMargin(int i17) {
        if (this.f212118r != i17) {
            this.f212118r = i17;
            requestLayout();
        }
    }

    public void setLabelTextColor(android.content.res.ColorStateList colorStateList) {
        this.f212108e = colorStateList;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            ((android.widget.TextView) getChildAt(i17)).setTextColor(this.f212108e);
        }
    }

    public void setSelects(int... iArr) {
        if (this.f212120t != ol5.n.NONE) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int childCount = getChildCount();
            ol5.n nVar = this.f212120t;
            int i17 = (nVar == ol5.n.SINGLE || nVar == ol5.n.SINGLE_IRREVOCABLY) ? 1 : this.f212121u;
            for (int i18 : iArr) {
                if (i18 < childCount) {
                    android.widget.TextView textView = (android.widget.TextView) getChildAt(i18);
                    if (!arrayList.contains(textView)) {
                        f(textView, true);
                        arrayList.add(textView);
                    }
                    if (i17 > 0 && arrayList.size() == i17) {
                        break;
                    }
                }
            }
            for (int i19 = 0; i19 < childCount; i19++) {
                android.widget.TextView textView2 = (android.widget.TextView) getChildAt(i19);
                if (!arrayList.contains(textView2)) {
                    f(textView2, false);
                }
            }
        }
    }

    public void setCompulsorys(int... iArr) {
        if (this.f212120t != ol5.n.MULTI || iArr == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i17));
        }
        setCompulsorys(arrayList);
    }

    public LabelsView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212111h = -2;
        this.f212112i = -2;
        this.f212113m = 17;
        this.f212124x = false;
        this.f212125y = 1;
        this.A = new java.util.ArrayList();
        this.B = new java.util.ArrayList();
        this.C = new java.util.ArrayList();
        this.f212107d = context;
        c(context, attributeSet);
        h();
    }
}
