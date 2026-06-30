package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010 J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\"\u0010\u0014\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\u0013¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderRedDotTextView;", "Landroid/widget/FrameLayout;", "", "Lm40/q0;", "", "getHighLightHeight", "Landroid/view/View;", "getView", "d", "I", "getDROP_TITLE", "()I", "DROP_TITLE", "e", "getDROP_ALL", "DROP_ALL", "t", "getDropStat", "setDropStat", "(I)V", "dropStat", "u", "getRowCount", "setRowCount", "rowCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "finder-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderRedDotTextView extends android.widget.FrameLayout implements xn5.a0, m40.q0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f131443w = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int DROP_TITLE;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int DROP_ALL;

    /* renamed from: f, reason: collision with root package name */
    public int f131446f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f131447g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f131448h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f131449i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f131450m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f131451n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f131452o;

    /* renamed from: p, reason: collision with root package name */
    public int f131453p;

    /* renamed from: q, reason: collision with root package name */
    public int f131454q;

    /* renamed from: r, reason: collision with root package name */
    public float f131455r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f131456s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public int dropStat;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public int rowCount;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f131459v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderRedDotTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        ((m40.r0) i95.n0.c(m40.r0.class)).getClass();
        this.DROP_TITLE = 1;
        ((m40.r0) i95.n0.c(m40.r0.class)).getClass();
        this.DROP_ALL = 2;
        this.f131447g = true;
        this.f131456s = "";
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.esk);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f131459v = string;
        h(context, attributeSet);
    }

    public static void c(com.tencent.mm.plugin.finder.view.FinderRedDotTextView finderRedDotTextView, int i17, android.widget.TextView textView, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0 && (textView = finderRedDotTextView.f131448h) == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        finderRedDotTextView.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = i17;
        textView.setLayoutParams(layoutParams);
    }

    private final int getHighLightHeight() {
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        android.widget.TextView textView = this.f131451n;
        if (textView == null) {
            kotlin.jvm.internal.o.o("highLightTextView");
            throw null;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i17 = fontMetricsInt.descent - fontMetricsInt.ascent;
        return (!this.f131452o || dimension <= i17) ? i17 : dimension;
    }

    public final void a() {
        android.view.View view = this.f131449i;
        if (view == null) {
            kotlin.jvm.internal.o.o("highLightContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        android.widget.TextView textView = this.f131448h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        marginLayoutParams.bottomMargin = ((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - (getHighLightHeight() / 2);
        android.view.View view2 = this.f131449i;
        if (view2 != null) {
            view2.setLayoutParams(marginLayoutParams);
        } else {
            kotlin.jvm.internal.o.o("highLightContainer");
            throw null;
        }
    }

    public final void b(int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        int i18;
        int i19;
        java.lang.String str3 = str;
        android.widget.TextView textView = this.f131451n;
        if (textView == null) {
            kotlin.jvm.internal.o.o("highLightTextView");
            throw null;
        }
        float measureText = textView.getPaint().measureText(str2);
        int f17 = f(z17);
        float f18 = i17;
        float f19 = f17;
        int i27 = (int) (((f18 - measureText) - f19) - this.f131446f);
        int i28 = i27 < 0 ? 0 : i27;
        int length = str.length();
        android.widget.TextView textView2 = this.f131448h;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(str, 0, length, textView2.getPaint(), i28, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
        this.f131453p = staticLayout.getLineEnd(0);
        android.widget.TextView textView3 = this.f131451n;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("highLightTextView");
            throw null;
        }
        this.f131455r = textView3.getPaint().measureText(str2) + f(z17) + this.f131446f;
        android.widget.TextView textView4 = this.f131448h;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        this.f131454q = (int) (this.f131455r / textView4.getPaint().measureText("我"));
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "adjustLayout lineWithIconMaxWordCount:" + this.f131453p + " subTitleWidthWordCount:" + this.f131454q + " endGapWidth:" + this.f131446f);
        android.widget.TextView textView5 = this.f131451n;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("highLightTextView");
            throw null;
        }
        int i29 = textView5.getVisibility() == 0 ? (int) (measureText + f19 + this.f131446f) : f17;
        if (staticLayout.getLineCount() == 1) {
            setRowCount(1);
            com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "adjustSingleLineTitle:".concat(str3));
            android.widget.TextView textView6 = this.f131448h;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("titleTextView");
                throw null;
            }
            textView6.setText(str3);
            android.widget.TextView textView7 = this.f131448h;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("titleTextView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = textView7.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(i29);
            textView7.setLayoutParams(marginLayoutParams);
            a();
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "onMultiLineAverageWordLine:".concat(str3));
        int length2 = str.length();
        android.widget.TextView textView8 = this.f131448h;
        if (textView8 == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        int i37 = i29;
        android.text.StaticLayout staticLayout2 = new android.text.StaticLayout(str, 0, length2, textView8.getPaint(), i17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
        int lineEnd = staticLayout2.getLineEnd(0);
        int length3 = str.length();
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "titleWordCount :" + length3 + " fullLineMaxWordCount:" + lineEnd + " lineWithIconMaxWordCount:" + this.f131453p);
        int i38 = lineEnd + this.f131453p;
        if (length3 > i38 || (length3 == i38 && !android.text.TextUtils.isEmpty(str2))) {
            e(i17, str, str2);
            return;
        }
        if (staticLayout2.getLineCount() == 1) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "onMultiLineAverageWordLine direct padding new line");
            d(str3, i17, str2);
            return;
        }
        int i39 = ((this.f131454q + length3) + 1) / 2;
        if (i39 > length3) {
            i39 = length3;
        }
        android.widget.TextView textView9 = this.f131448h;
        if (textView9 == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        float measureText2 = textView9.getPaint().measureText(str3.subSequence(0, i39).toString());
        android.widget.TextView textView10 = this.f131448h;
        if (textView10 == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        float measureText3 = textView10.getPaint().measureText(str3.subSequence(i39, length3).toString()) + this.f131455r;
        if (f18 < (measureText2 < measureText3 ? measureText3 : measureText2)) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotTextView", "drop for content too long!");
        }
        float f27 = measureText2 < measureText3 ? measureText3 : measureText2;
        float f28 = i37;
        if (f27 < f28) {
            f27 = f28;
        }
        if (f27 > f18) {
            f27 = f18;
        }
        int i47 = (int) f27;
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "averageCount:" + i39 + " firstLineWidth:" + measureText2 + " lastLineWidth:" + measureText3 + " viewWidth:" + i47 + " maxWidth:" + i17);
        c(this, i47, null, 2, null);
        if (i47 < i37 && !android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "adjustTextViewWidth: calcSubTitleMaxWidth");
            int f29 = (i47 - (length3 > i39 ? this.f131446f : 0)) - f(this.f131452o);
            android.widget.TextView textView11 = this.f131451n;
            if (textView11 == null) {
                kotlin.jvm.internal.o.o("highLightTextView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = textView11.getLayoutParams();
            layoutParams2.width = f29;
            textView11.setLayoutParams(layoutParams2);
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "onMultiLineTitle:".concat(str3));
        int length4 = str.length();
        android.widget.TextView textView12 = this.f131448h;
        if (textView12 == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        android.text.StaticLayout staticLayout3 = new android.text.StaticLayout(str, 0, length4, textView12.getPaint(), i47, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
        android.widget.TextView textView13 = this.f131448h;
        if (textView13 == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        int maxLines = textView13.getMaxLines();
        if (staticLayout3.getLineCount() < maxLines) {
            d(str3, i47, str2);
            return;
        }
        int lineEnd2 = staticLayout3.getLineEnd(maxLines - 2);
        java.lang.String obj = str3.subSequence(lineEnd2, str.length()).toString();
        int i48 = i47 - i37;
        if (i48 <= 0) {
            i48 = 0;
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "preLastLineText:" + obj + "  preLastLineWidth:" + i48);
        int length5 = obj.length();
        android.widget.TextView textView14 = this.f131448h;
        if (textView14 == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        boolean z18 = new android.text.StaticLayout(obj, 0, length5, textView14.getPaint(), i48, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true).getLineCount() > 1;
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "onMultiLineTitle isNeedEllipse:" + z18);
        if (z18) {
            e(i47, str3, str2);
            return;
        }
        if (this.f131447g) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i49 = lineEnd2 - 1;
            int i57 = i49;
            while (str3.charAt(i57) == ' ') {
                i57--;
            }
            if (i57 < 0 || i57 == i49) {
                i18 = 0;
                if (i57 == 0) {
                    com.tencent.mars.xlog.Log.e("Finder.RedDotTextView", "filterLineChars index == 0");
                } else {
                    sb6.append(str3.subSequence(0, lineEnd2));
                }
            } else {
                int i58 = i57 + 1;
                sb6.append(str3.subSequence(i58, lineEnd2));
                i18 = 0;
                sb6.append(str3.subSequence(0, i58));
            }
            com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "filterLineChars newTitleBuilder 1:" + ((java.lang.Object) sb6));
            char charAt = str3.charAt(lineEnd2);
            if (((charAt == 12290 || charAt == '?' || charAt == '!' || charAt == 65292 || charAt == 12289 || charAt == 65307 || charAt == ':' || charAt == '\'') ? 1 : i18) != 0) {
                lineEnd2++;
            }
            if (lineEnd2 < str.length()) {
                sb6.append(str3.subSequence(lineEnd2, str.length()));
            }
            com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "filterLineChars newTitleBuilder 2:" + ((java.lang.Object) sb6));
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            str3 = sb7;
        } else {
            i18 = 0;
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "adjustMultiLineTitle:".concat(str3));
        android.widget.TextView textView15 = this.f131448h;
        if (textView15 == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        int length6 = str3.length();
        if (length6 > str3.length() || i37 == 0) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotTextView", "addPadding paddingIndex out of limit! needPaddingWidth:" + i37 + " paddingIndex:" + length6);
        } else {
            android.widget.TextView textView16 = this.f131448h;
            if (textView16 == null) {
                kotlin.jvm.internal.o.o("titleTextView");
                throw null;
            }
            float measureText4 = textView16.getPaint().measureText(" ");
            float f37 = f28 / measureText4;
            float f38 = this.f131446f / measureText4;
            com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "getPaddingWordCount :ret " + f37 + " ratio:" + f38);
            if (java.lang.Float.isInfinite(f37) || java.lang.Float.isNaN(f37)) {
                i19 = i18;
            } else {
                float f39 = 10;
                i19 = (((double) ((f37 * f39) % f39)) >= 4.0d || ((double) f38) <= 2.0d) ? ((int) f37) + 1 : (int) f37;
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str3);
            while (i19 > 0) {
                sb8.append(" ");
                i19--;
            }
            com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "addPadding :" + ((java.lang.Object) sb8));
            str3 = sb8.toString();
            kotlin.jvm.internal.o.f(str3, "toString(...)");
        }
        textView15.setText(str3);
        setRowCount(2);
        a();
        c(this, i47, null, 2, null);
    }

    public final void d(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "adjustTitleByNewLine direct padding new line");
        android.widget.TextView textView = this.f131448h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        textView.setText(str + '\n');
        setRowCount(2);
        a();
        android.widget.TextView textView2 = this.f131448h;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        int measureText = (int) textView2.getPaint().measureText(str);
        if (measureText > i17) {
            measureText = i17;
        }
        c(this, measureText, null, 2, null);
        if (!i(i17, str2)) {
            setDropStat(this.DROP_TITLE);
            android.view.View view = this.f131449i;
            if (view == null) {
                kotlin.jvm.internal.o.o("highLightContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "adjustTitleByNewLine", "(Ljava/lang/String;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "adjustTitleByNewLine", "(Ljava/lang/String;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView3 = this.f131451n;
        if (textView3 != null) {
            textView3.setMaxWidth((i17 - 0) - f(this.f131452o));
        } else {
            kotlin.jvm.internal.o.o("highLightTextView");
            throw null;
        }
    }

    public final void e(int i17, java.lang.String str, java.lang.String str2) {
        int i18;
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "dropSubTitle highlightTitle:" + str2);
        if (!android.text.TextUtils.isEmpty(str2) || this.f131452o) {
            setDropStat(this.DROP_TITLE);
            return;
        }
        android.view.View view = this.f131449i;
        if (view == null) {
            kotlin.jvm.internal.o.o("highLightContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "dropSubTitle", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "dropSubTitle", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c(this, i17, null, 2, null);
        android.widget.TextView textView = this.f131448h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        textView.setText("");
        setRowCount(2);
        if (kotlin.jvm.internal.o.b(str, this.f131459v)) {
            ((m40.r0) i95.n0.c(m40.r0.class)).getClass();
            i18 = 3;
        } else {
            i18 = this.DROP_ALL;
        }
        setDropStat(i18);
    }

    public final int f(boolean z17) {
        if (z17) {
            return (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        }
        return 0;
    }

    public final boolean g(int i17, java.lang.String str, java.lang.String str2) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (i(i17, str2)) {
            return true;
        }
        setDropStat(this.DROP_ALL);
        android.view.View view = this.f131449i;
        if (view == null) {
            kotlin.jvm.internal.o.o("highLightContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "handleHighLight", "(ILjava/lang/String;Ljava/lang/String;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "handleHighLight", "(ILjava/lang/String;Ljava/lang/String;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    public final int getDROP_ALL() {
        return this.DROP_ALL;
    }

    public final int getDROP_TITLE() {
        return this.DROP_TITLE;
    }

    @Override // m40.q0
    public int getDropStat() {
        return this.dropStat;
    }

    @Override // m40.q0
    public int getRowCount() {
        return this.rowCount;
    }

    @Override // m40.q0
    public android.view.View getView() {
        return this;
    }

    public final void h(android.content.Context context, android.util.AttributeSet attributeSet) {
        ((wx2.k) ((m40.r0) i95.n0.c(m40.r0.class))).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b92.w2.f18550g);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            this.f131446f = dimensionPixelSize;
            com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "init : endGapWidth:" + this.f131446f);
        } catch (java.lang.Throwable th6) {
            obtainStyledAttributes.recycle();
            throw th6;
        }
    }

    public final boolean i(int i17, java.lang.String str) {
        android.widget.TextView textView = this.f131451n;
        if (textView != null) {
            return ((float) i17) >= ((float) f(this.f131452o)) + textView.getPaint().measureText(str);
        }
        kotlin.jvm.internal.o.o("highLightTextView");
        throw null;
    }

    public final boolean j(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f131456s) && kotlin.jvm.internal.o.b(this.f131456s, str)) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f131450m;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("highLightIcon");
                throw null;
            }
            if (weImageView.getDrawable() != null) {
                return true;
            }
        }
        return false;
    }

    public final void k(java.lang.String str, int i17, int i18, java.lang.String str2, int i19) {
        if (android.text.TextUtils.isEmpty(str) && !this.f131452o) {
            android.view.View view = this.f131449i;
            if (view == null) {
                kotlin.jvm.internal.o.o("highLightContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "preHandleHighLight", "(Ljava/lang/String;IILjava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "preHandleHighLight", "(Ljava/lang/String;IILjava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f131446f = 0;
            return;
        }
        android.view.View view2 = this.f131449i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("highLightContainer");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "preHandleHighLight", "(Ljava/lang/String;IILjava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "preHandleHighLight", "(Ljava/lang/String;IILjava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f131451n;
        if (textView == null) {
            kotlin.jvm.internal.o.o("highLightTextView");
            throw null;
        }
        textView.setTextSize(0, getResources().getDimension(i17));
        android.widget.TextView textView2 = this.f131451n;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("highLightTextView");
            throw null;
        }
        textView2.setTextColor(i18);
        android.widget.TextView textView3 = this.f131451n;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("highLightTextView");
            throw null;
        }
        textView3.setText(str);
        if (android.text.TextUtils.isEmpty(str)) {
            android.widget.TextView textView4 = this.f131451n;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("highLightTextView");
                throw null;
            }
            textView4.setVisibility(8);
        } else {
            android.widget.TextView textView5 = this.f131451n;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("highLightTextView");
                throw null;
            }
            textView5.setVisibility(0);
        }
        if (!this.f131452o) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f131450m;
            if (weImageView != null) {
                weImageView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("highLightIcon");
                throw null;
            }
        }
        if (j(str2 == null ? "" : str2)) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f131450m;
            if (weImageView2 != null) {
                weImageView2.setIconColor(i19);
                return;
            } else {
                kotlin.jvm.internal.o.o("highLightIcon");
                throw null;
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f131450m;
        if (weImageView3 == null) {
            kotlin.jvm.internal.o.o("highLightIcon");
            throw null;
        }
        weImageView3.setVisibility(0);
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "loadHighLightIcon: iconUrl" + str2 + " highLightColor:" + i19);
        ((wx2.k) ((m40.r0) i95.n0.c(m40.r0.class))).getClass();
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329964r));
        kotlin.jvm.internal.o.e(b17, "null cannot be cast to non-null type com.tencent.mm.loader.builder.RequestBuilder<com.tencent.mm.loader.model.data.ILoaderData, android.graphics.Bitmap>");
        b17.f447873d = new com.tencent.mm.plugin.finder.view.hj(this, str2, i19);
        b17.f447879j = new com.tencent.mm.plugin.finder.view.jj(str2, this, i19);
        b17.f447878i = new com.tencent.mm.plugin.finder.view.kj(this);
        b17.f();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f131450m;
        if (weImageView4 != null) {
            weImageView4.setIconColor(i19);
        } else {
            kotlin.jvm.internal.o.o("highLightIcon");
            throw null;
        }
    }

    public final void l(int i17) {
        this.f131453p = 0;
        this.f131454q = 0;
        this.f131455r = 0.0f;
        setDropStat(0);
        setRowCount(1);
        if (this.f131446f == 0) {
            this.f131446f = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        }
        android.widget.TextView textView = this.f131448h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(0);
        textView.setLayoutParams(marginLayoutParams);
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        android.view.ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginEnd(dimension);
        setLayoutParams(marginLayoutParams2);
        c(this, -2, null, 2, null);
        android.widget.TextView textView2 = this.f131451n;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("highLightTextView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
        layoutParams3.width = -2;
        textView2.setLayoutParams(layoutParams3);
        android.widget.TextView textView3 = this.f131451n;
        if (textView3 != null) {
            textView3.setMaxWidth(i17);
        } else {
            kotlin.jvm.internal.o.o("highLightTextView");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:3:0x0019, B:7:0x0070, B:9:0x007f, B:11:0x0093, B:15:0x00a1, B:17:0x00a5, B:19:0x00b2, B:21:0x00b6, B:22:0x00c5, B:25:0x00ce, B:28:0x00e8, B:30:0x00ee, B:34:0x0101, B:38:0x00ba, B:39:0x00bd, B:40:0x00be, B:42:0x00c2, B:43:0x0108, B:44:0x010b, B:45:0x010c, B:46:0x010f), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:3:0x0019, B:7:0x0070, B:9:0x007f, B:11:0x0093, B:15:0x00a1, B:17:0x00a5, B:19:0x00b2, B:21:0x00b6, B:22:0x00c5, B:25:0x00ce, B:28:0x00e8, B:30:0x00ee, B:34:0x0101, B:38:0x00ba, B:39:0x00bd, B:40:0x00be, B:42:0x00c2, B:43:0x0108, B:44:0x010b, B:45:0x010c, B:46:0x010f), top: B:2:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(int r17, java.lang.String r18, java.lang.String r19, int r20, int r21, int r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.FinderRedDotTextView.m(int, java.lang.String, java.lang.String, int, int, int, java.lang.String, boolean):void");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        m40.r0 r0Var = (m40.r0) i95.n0.c(m40.r0.class);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((wx2.k) r0Var).getClass();
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.cdj, (android.view.ViewGroup) this, true);
        ((wx2.k) ((m40.r0) i95.n0.c(m40.r0.class))).getClass();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lqm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f131448h = (android.widget.TextView) findViewById;
        ((wx2.k) ((m40.r0) i95.n0.c(m40.r0.class))).getClass();
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.lqh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f131449i = findViewById2;
        ((wx2.k) ((m40.r0) i95.n0.c(m40.r0.class))).getClass();
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.lqj);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f131451n = (android.widget.TextView) findViewById3;
        ((wx2.k) ((m40.r0) i95.n0.c(m40.r0.class))).getClass();
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.lqi);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f131450m = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        android.widget.TextView textView = this.f131451n;
        if (textView != null) {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            kotlin.jvm.internal.o.o("highLightTextView");
            throw null;
        }
    }

    @Override // m40.q0
    public void setDropStat(int i17) {
        this.dropStat = i17;
    }

    public void setRowCount(int i17) {
        this.rowCount = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderRedDotTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        ((m40.r0) i95.n0.c(m40.r0.class)).getClass();
        this.DROP_TITLE = 1;
        ((m40.r0) i95.n0.c(m40.r0.class)).getClass();
        this.DROP_ALL = 2;
        this.f131447g = true;
        this.f131456s = "";
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.esk);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f131459v = string;
        h(context, attributeSet);
    }
}
