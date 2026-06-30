package df5;

/* loaded from: classes11.dex */
public final class j1 extends df5.n {

    /* renamed from: s, reason: collision with root package name */
    public final v11.e0 f232135s;

    /* renamed from: t, reason: collision with root package name */
    public final df5.d1 f232136t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f232137u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f232138v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.LinearLayout f232139w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f232140x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(android.content.Context context, v11.e0 renderConfig) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(renderConfig, "renderConfig");
        this.f232135s = renderConfig;
        this.f232136t = new df5.d1(context, renderConfig);
        this.f232137u = "";
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f232139w = linearLayout;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    public static final java.util.List b(df5.j1 j1Var, java.util.List list, int i17, int i18) {
        int i19;
        j1Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        v11.e0 e0Var = j1Var.f232135s;
        boolean z17 = e0Var.f432372k.f432391o;
        int i27 = (i18 + i17) * 2;
        android.widget.LinearLayout linearLayout = j1Var.f232139w;
        android.view.View childAt = linearLayout.getChildAt(i27);
        android.widget.LinearLayout linearLayout2 = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NativeMarkdownTableView", "[TABLE_DIFF] buildCellFeedItems: rowViewIndex=%d NOT FOUND (childCount=%d), rowIdx=%d, headerOffset=%d, cells lost", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(linearLayout.getChildCount()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            return kz5.p0.f313996d;
        }
        int size = list.size();
        int i28 = 0;
        int i29 = 0;
        while (i29 < size) {
            v11.k0 k0Var = (v11.k0) kz5.n0.a0(list, i29);
            if (k0Var != null) {
                android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) j1Var.f232136t.g(k0Var.f432432e, e0Var.f432372k.f432392p);
                if ((spannableStringBuilder.length() == 0 ? 1 : i28) == 0) {
                    android.view.View childAt2 = linearLayout2.getChildAt(z17 ? i29 * 2 : i29);
                    android.widget.FrameLayout frameLayout = childAt2 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) childAt2 : null;
                    if (frameLayout != null) {
                        android.view.View childAt3 = frameLayout.getChildAt(i28);
                        android.widget.TextView textView = childAt3 instanceof android.widget.TextView ? (android.widget.TextView) childAt3 : null;
                        if (textView != null) {
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
                            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i29);
                            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(java.lang.System.identityHashCode(textView));
                            java.lang.String spannableStringBuilder2 = spannableStringBuilder.toString();
                            kotlin.jvm.internal.o.f(spannableStringBuilder2, "toString(...)");
                            com.tencent.mars.xlog.Log.i("MicroMsg.NativeMarkdownTableView", "[TABLE_DIFF] buildCellFeedItems: row=%d, col=%d, tvHash=%d, text=[%s]", valueOf, valueOf2, valueOf3, r26.p0.E0(spannableStringBuilder2, 40));
                            i19 = 0;
                            arrayList.add(new df5.m1(new df5.e(textView, spannableStringBuilder, 0)));
                            i29++;
                            i28 = i19;
                        }
                    }
                }
            }
            i19 = i28;
            i29++;
            i28 = i19;
        }
        return arrayList;
    }

    public final void c(java.util.List list, int[] iArr, java.util.List list2, boolean z17, boolean z18) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        boolean z19 = false;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(this.f232140x ? -1 : -2, -2));
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            v11.e0 e0Var = this.f232135s;
            if (!hasNext) {
                android.widget.LinearLayout linearLayout2 = this.f232139w;
                linearLayout2.addView(linearLayout);
                android.view.View view = new android.view.View(getContext());
                view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, e0Var.f432372k.f432389m));
                v11.g0 g0Var = e0Var.f432372k;
                if (z18) {
                    com.tencent.mm.ui.kk.d(view, g0Var.f432386j);
                }
                view.setBackgroundColor(g0Var.f432390n);
                linearLayout2.addView(view);
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            v11.k0 k0Var = (v11.k0) next;
            int length = iArr.length;
            int i19 = iArr[i17];
            v11.l0 l0Var = (v11.l0) kz5.n0.a0(list2, i17);
            if (l0Var == null) {
                v11.l0 l0Var2 = k0Var != null ? k0Var.f432431d : null;
                if (l0Var2 == null) {
                    l0Var2 = v11.l0.f432437d;
                }
                l0Var = l0Var2;
            }
            boolean z27 = i17 == 0 ? true : z19;
            boolean z28 = i17 == kz5.c0.h(list) ? true : z19;
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            boolean z29 = this.f232140x;
            if (z29 && z27 && z28) {
                i19 = 0;
            }
            frameLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i19, -2, (z29 && z27 && z28) ? 1.0f : 0.0f));
            frameLayout.addView(e(k0Var != null ? this.f232136t.g(k0Var.f432432e, e0Var.f432372k.f432392p) : "", z17 ? e0Var.f432372k.f432378b : e0Var.f432372k.f432377a, l0Var, z17, z28), new android.widget.FrameLayout.LayoutParams(-1, -2));
            linearLayout.addView(frameLayout);
            if (e0Var.f432372k.f432391o && i17 < kz5.c0.h(list)) {
                android.view.View view2 = new android.view.View(getContext());
                view2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(e0Var.f432372k.f432389m, -1));
                view2.setBackgroundColor(e0Var.f432372k.f432390n);
                linearLayout.addView(view2);
            }
            i17 = i18;
            z19 = false;
        }
    }

    public final int[] d(java.util.List list, java.util.List list2, java.util.List list3) {
        int size;
        if (list != null) {
            size = list.size();
        } else {
            java.util.List list4 = (java.util.List) kz5.n0.Z(list2);
            size = list4 != null ? list4.size() : 0;
        }
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = this.f232135s.f432372k.f432387k;
        }
        if (list != null) {
            int i18 = 0;
            for (java.lang.Object obj : list) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                iArr[i18] = java.lang.Math.max(iArr[i18], g((v11.k0) obj, true, list.size() == i19, (v11.l0) kz5.n0.a0(list3, i18)));
                i18 = i19;
            }
        }
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            java.util.List list5 = (java.util.List) it.next();
            int i27 = 0;
            for (java.lang.Object obj2 : list5) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                iArr[i27] = java.lang.Math.max(iArr[i27], g((v11.k0) obj2, false, list5.size() == i28, (v11.l0) kz5.n0.a0(list3, i27)));
                i27 = i28;
            }
        }
        return iArr;
    }

    public final android.widget.TextView e(java.lang.CharSequence charSequence, v11.j0 j0Var, v11.l0 l0Var, boolean z17, boolean z18) {
        int i17;
        v11.e0 e0Var = this.f232135s;
        v11.b0 b0Var = e0Var.f432372k.f432392p;
        if (b0Var == null) {
            b0Var = e0Var.f432368g;
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        df5.k1 k1Var = new df5.k1(context, b0Var);
        k1Var.setTextColor(j0Var.f432417b);
        k1Var.setTextSize(1, j0Var.f432416a);
        if (j0Var.f432418c) {
            android.text.TextPaint paint = k1Var.getPaint();
            e0Var.f432365d.getClass();
            com.tencent.mm.ui.bk.r0(paint, 0.8f);
        }
        if (j0Var.f432419d) {
            k1Var.setTypeface(android.graphics.Typeface.MONOSPACE);
        }
        int ordinal = l0Var.ordinal();
        int i18 = 2;
        if (ordinal == 0) {
            i17 = 8388611;
        } else if (ordinal == 1) {
            i17 = 17;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            i17 = 8388613;
        }
        k1Var.setGravity(i17 | 48);
        if (j0Var.f432423h) {
            com.tencent.mm.pluginsdk.ui.span.y0 y0Var = new com.tencent.mm.pluginsdk.ui.span.y0(k1Var.getContext());
            y0Var.f191313s = false;
            k1Var.setOnTouchListener(y0Var);
            k1Var.setClickable(false);
            k1Var.setLongClickable(false);
        }
        java.lang.Integer num = j0Var.f432424i;
        if (num != null) {
            k1Var.setHighlightColor(num.intValue());
        }
        k1Var.setHorizontallyScrolling(false);
        k1Var.setTextDirection(1);
        int ordinal2 = l0Var.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i18 = 4;
            } else {
                if (ordinal2 != 2) {
                    throw new jz5.j();
                }
                i18 = 3;
            }
        }
        k1Var.setTextAlignment(i18);
        k1Var.setSingleLine(false);
        k1Var.setIncludeFontPadding(false);
        v11.g0 g0Var = e0Var.f432372k;
        int i19 = g0Var.f432381e;
        int i27 = j0Var.f432421f;
        int i28 = i19 + i27;
        int i29 = j0Var.f432422g;
        k1Var.setPaddingRelative(i28, z17 ? g0Var.f432385i : g0Var.f432384h + i29, z18 ? g0Var.f432383g : g0Var.f432382f + i27, g0Var.f432384h + i29);
        k1Var.setText(charSequence, android.widget.TextView.BufferType.SPANNABLE);
        jf5.k0.c(k1Var, df5.f1.f232094d);
        return k1Var;
    }

    public final void f(java.util.List list, java.util.List list2, int i17, java.util.Map map, java.util.List list3) {
        android.widget.LinearLayout linearLayout;
        java.lang.String obj;
        java.lang.Integer num;
        df5.j1 j1Var = this;
        java.util.Map map2 = map;
        android.view.View childAt = j1Var.f232139w.getChildAt(i17);
        android.widget.LinearLayout linearLayout2 = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout2 == null) {
            return;
        }
        v11.e0 e0Var = j1Var.f232135s;
        boolean z17 = e0Var.f432372k.f432391o;
        int size = list2.size();
        int i18 = 0;
        int i19 = 0;
        while (i19 < size) {
            v11.k0 k0Var = (v11.k0) kz5.n0.a0(list, i19);
            v11.k0 k0Var2 = (v11.k0) kz5.n0.a0(list2, i19);
            if (!kotlin.jvm.internal.o.b(k0Var != null ? k0Var.f432432e : null, k0Var2 != null ? k0Var2.f432432e : null)) {
                int i27 = z17 ? i19 * 2 : i19;
                android.view.View childAt2 = linearLayout2.getChildAt(i27);
                android.widget.FrameLayout frameLayout = childAt2 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) childAt2 : null;
                if (frameLayout == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NativeMarkdownTableView", "[TABLE_DIFF] diffRowToItems: cellFrame null at rowViewIndex=%d, colIdx=%d, cellViewIndex=%d, rowChildCount=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(linearLayout2.getChildCount()));
                } else {
                    android.view.View childAt3 = frameLayout.getChildAt(i18);
                    android.widget.TextView textView = childAt3 instanceof android.widget.TextView ? (android.widget.TextView) childAt3 : null;
                    if (textView == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NativeMarkdownTableView", "[TABLE_DIFF] diffRowToItems: tv null at rowViewIndex=%d, colIdx=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
                    } else {
                        java.lang.String str = "";
                        java.lang.String g17 = k0Var2 != null ? j1Var.f232136t.g(k0Var2.f432432e, e0Var.f432372k.f432392p) : "";
                        android.text.SpannableStringBuilder spannableStringBuilder = g17 instanceof android.text.SpannableStringBuilder ? (android.text.SpannableStringBuilder) g17 : new android.text.SpannableStringBuilder(g17);
                        int identityHashCode = java.lang.System.identityHashCode(textView);
                        int length = (map2 == null || (num = (java.lang.Integer) map2.get(java.lang.Integer.valueOf(identityHashCode))) == null) ? textView.getText().length() : num.intValue();
                        java.lang.CharSequence text = textView.getText();
                        if (text != null && (obj = text.toString()) != null) {
                            str = obj;
                        }
                        linearLayout = linearLayout2;
                        if (length < spannableStringBuilder.length()) {
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17 / 2);
                            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
                            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(identityHashCode);
                            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(length);
                            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(spannableStringBuilder.length());
                            java.lang.String E0 = r26.p0.E0(str, 40);
                            java.lang.String spannableStringBuilder2 = spannableStringBuilder.toString();
                            kotlin.jvm.internal.o.f(spannableStringBuilder2, "toString(...)");
                            com.tencent.mars.xlog.Log.i("MicroMsg.NativeMarkdownTableView", "[TABLE_DIFF] diffRowToItems: Feed row=%d, col=%d, tvHash=%d, oldLen=%d, newLen=%d, tvText=[%s], newText=[%s]", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, E0, r26.p0.E0(spannableStringBuilder2, 40));
                            list3.add(new df5.m1(new df5.e(textView, spannableStringBuilder, length)));
                        } else {
                            java.lang.Integer valueOf6 = java.lang.Integer.valueOf(i17 / 2);
                            java.lang.Integer valueOf7 = java.lang.Integer.valueOf(i19);
                            java.lang.Integer valueOf8 = java.lang.Integer.valueOf(identityHashCode);
                            java.lang.Integer valueOf9 = java.lang.Integer.valueOf(length);
                            java.lang.Integer valueOf10 = java.lang.Integer.valueOf(spannableStringBuilder.length());
                            java.lang.String spannableStringBuilder3 = spannableStringBuilder.toString();
                            kotlin.jvm.internal.o.f(spannableStringBuilder3, "toString(...)");
                            com.tencent.mars.xlog.Log.i("MicroMsg.NativeMarkdownTableView", "[TABLE_DIFF] diffRowToItems: setText row=%d, col=%d, tvHash=%d, oldLen=%d, newLen=%d, newText=[%s]", valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, r26.p0.E0(spannableStringBuilder3, 40));
                            textView.setText(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE);
                        }
                        i19++;
                        j1Var = this;
                        map2 = map;
                        linearLayout2 = linearLayout;
                        i18 = 0;
                    }
                }
            }
            linearLayout = linearLayout2;
            i19++;
            j1Var = this;
            map2 = map;
            linearLayout2 = linearLayout;
            i18 = 0;
        }
    }

    public final int g(v11.k0 k0Var, boolean z17, boolean z18, v11.l0 l0Var) {
        v11.e0 e0Var = this.f232135s;
        if (k0Var == null) {
            return e0Var.f432372k.f432387k;
        }
        java.lang.CharSequence g17 = this.f232136t.g(k0Var.f432432e, e0Var.f432372k.f432392p);
        v11.j0 j0Var = z17 ? e0Var.f432372k.f432378b : e0Var.f432372k.f432377a;
        if (l0Var == null) {
            l0Var = k0Var.f432431d;
        }
        android.widget.TextView e17 = e(g17, j0Var, l0Var, z17, z18);
        int i17 = e0Var.f432372k.f432388l;
        if (i17 <= 0) {
            i17 = Integer.MAX_VALUE;
        }
        e17.setMaxWidth(i17);
        e17.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = e17.getMeasuredWidth();
        v11.g0 g0Var = e0Var.f432372k;
        int i18 = g0Var.f432388l;
        return i18 > 0 ? e06.p.f(measuredWidth, g0Var.f432387k, i18) : java.lang.Math.max(measuredWidth, g0Var.f432387k);
    }

    public final yz5.a getOnInteractionConsumed() {
        return this.f232138v;
    }

    public final java.util.List h(java.util.List list, int i17) {
        if (i17 == 0) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(null);
        }
        for (v11.k0 k0Var : kz5.n0.F0(list, new df5.i1())) {
            int i19 = k0Var.f432429b;
            if (i19 >= 0 && i19 < i17) {
                arrayList.set(i19, k0Var);
            }
        }
        return arrayList;
    }

    public final int i(v11.q qVar) {
        java.lang.Integer valueOf;
        java.lang.Integer valueOf2;
        java.lang.Integer valueOf3;
        java.util.Iterator it = qVar.f432454a.iterator();
        java.lang.Integer num = null;
        if (it.hasNext()) {
            valueOf = java.lang.Integer.valueOf(((v11.k0) it.next()).f432429b + 1);
            while (it.hasNext()) {
                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(((v11.k0) it.next()).f432429b + 1);
                if (valueOf.compareTo(valueOf4) < 0) {
                    valueOf = valueOf4;
                }
            }
        } else {
            valueOf = null;
        }
        java.lang.Integer num2 = valueOf;
        int intValue = num2 != null ? num2.intValue() : 0;
        java.util.Iterator it6 = qVar.f432455b.iterator();
        if (it6.hasNext()) {
            java.util.Iterator it7 = ((java.util.List) it6.next()).iterator();
            if (it7.hasNext()) {
                valueOf2 = java.lang.Integer.valueOf(((v11.k0) it7.next()).f432429b + 1);
                while (it7.hasNext()) {
                    java.lang.Integer valueOf5 = java.lang.Integer.valueOf(((v11.k0) it7.next()).f432429b + 1);
                    if (valueOf2.compareTo(valueOf5) < 0) {
                        valueOf2 = valueOf5;
                    }
                }
            } else {
                valueOf2 = null;
            }
            java.lang.Integer num3 = valueOf2;
            java.lang.Integer valueOf6 = java.lang.Integer.valueOf(num3 != null ? num3.intValue() : 0);
            while (it6.hasNext()) {
                java.util.Iterator it8 = ((java.util.List) it6.next()).iterator();
                if (it8.hasNext()) {
                    valueOf3 = java.lang.Integer.valueOf(((v11.k0) it8.next()).f432429b + 1);
                    while (it8.hasNext()) {
                        java.lang.Integer valueOf7 = java.lang.Integer.valueOf(((v11.k0) it8.next()).f432429b + 1);
                        if (valueOf3.compareTo(valueOf7) < 0) {
                            valueOf3 = valueOf7;
                        }
                    }
                } else {
                    valueOf3 = null;
                }
                java.lang.Integer num4 = valueOf3;
                java.lang.Integer valueOf8 = java.lang.Integer.valueOf(num4 != null ? num4.intValue() : 0);
                if (valueOf6.compareTo(valueOf8) < 0) {
                    valueOf6 = valueOf8;
                }
            }
            num = valueOf6;
        }
        java.lang.Integer num5 = num;
        return java.lang.Math.max(intValue, java.lang.Math.max(num5 != null ? num5.intValue() : 0, qVar.f432456c.size()));
    }

    public final void j(v11.q block, java.lang.String rawMarkdown, long j17) {
        kotlin.jvm.internal.o.g(block, "block");
        kotlin.jvm.internal.o.g(rawMarkdown, "rawMarkdown");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f232137u = rawMarkdown;
        android.widget.LinearLayout linearLayout = this.f232139w;
        linearLayout.removeAllViews();
        int i17 = i(block);
        if (i17 == 0) {
            return;
        }
        v11.g0 g0Var = this.f232135s.f432372k;
        int i18 = g0Var.f432379c;
        int i19 = g0Var.f432380d;
        linearLayout.setPadding(i18, i19, i18, i19);
        java.util.List list = block.f432454a;
        if (!(!list.isEmpty())) {
            list = null;
        }
        java.util.List h17 = list != null ? h(list, i17) : null;
        java.util.List list2 = block.f432455b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(h((java.util.List) it.next(), i17));
        }
        this.f232140x = arrayList.size() + (h17 != null ? 1 : 0) <= 1;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = this.f232140x ? -1 : -2;
        linearLayout.setLayoutParams(layoutParams2);
        int[] d17 = d(h17, arrayList, block.f432456c);
        if (h17 != null) {
            c(h17, d17, block.f432456c, true, arrayList.isEmpty());
        }
        java.util.Iterator it6 = arrayList.iterator();
        int i27 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            c((java.util.List) next, d17, block.f432456c, false, i27 == kz5.c0.h(arrayList));
            i27 = i28;
        }
        cf5.t tVar = cf5.t.f41027a;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new cf5.q(j17, currentTimeMillis2, null), 1, null);
        }
    }

    public final void k(int i17, int[] iArr) {
        int i18;
        android.view.View childAt = this.f232139w.getChildAt(i17);
        android.widget.LinearLayout linearLayout = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout == null) {
            return;
        }
        boolean z17 = this.f232135s.f432372k.f432391o;
        int length = iArr.length;
        for (int i19 = 0; i19 < length; i19++) {
            android.view.View childAt2 = linearLayout.getChildAt(z17 ? i19 * 2 : i19);
            android.widget.FrameLayout frameLayout = childAt2 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) childAt2 : null;
            if (frameLayout != null) {
                android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null && layoutParams2.width != (i18 = iArr[i19])) {
                    if (layoutParams2.weight == 0.0f) {
                        layoutParams2.width = i18;
                        frameLayout.setLayoutParams(layoutParams2);
                    }
                }
            }
        }
    }

    public final void setOnInteractionConsumed(yz5.a aVar) {
        this.f232138v = aVar;
        this.f232136t.f232074c = aVar;
    }
}
