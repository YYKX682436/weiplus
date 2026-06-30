package fq1;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final fq1.e f265507a = new fq1.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f265508b = new java.util.HashMap();

    public static /* synthetic */ void h(fq1.e eVar, android.view.View view, float f17, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            z18 = true;
        }
        eVar.g(view, f17, z17, z18);
    }

    public final void a(com.tencent.mm.ui.widget.MMNeat7extView tv6, java.lang.CharSequence text, android.graphics.drawable.Drawable drawable, int i17) {
        kotlin.jvm.internal.o.g(tv6, "tv");
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(drawable, "drawable");
        tv6.j(android.text.TextUtils.TruncateAt.END, 0.0f);
        al5.w wVar = new al5.w(drawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("@");
        spannableString.setSpan(wVar, 0, 1, 33);
        android.content.Context context = tv6.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int textSize = (int) tv6.getTextSize();
        android.graphics.drawable.Drawable drawable2 = context.getResources().getDrawable(com.tencent.mm.R.drawable.f481981ap3);
        drawable2.setBounds(0, 0, i65.a.b(context, i17), textSize);
        al5.w wVar2 = new al5.w(drawable2, 1);
        android.text.SpannableString spannableString2 = new android.text.SpannableString("@");
        spannableString2.setSpan(wVar2, 0, 1, 33);
        tv6.b(android.text.TextUtils.concat(text, spannableString2, spannableString));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(android.view.ViewParent viewParent, android.view.View view, int i17, int i18) {
        if (view == null || viewParent == 0) {
            return;
        }
        android.view.View view2 = viewParent instanceof android.view.View ? (android.view.View) viewParent : null;
        if (view2 == null) {
            return;
        }
        view2.post(new fq1.b(view, i17, i18, view2));
    }

    public final java.lang.String c(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (android.view.View view2 : d(view)) {
            if (view2.getVisibility() == 0) {
                sb6.append(view2 instanceof com.tencent.mm.ui.widget.MMNeat7extView ? ((com.tencent.mm.ui.widget.MMNeat7extView) view2).a() : view2 instanceof android.widget.TextView ? ((android.widget.TextView) view2).getText() : "");
                sb6.append("，");
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.util.List d(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view != null && (view instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.getVisibility() != 0) {
                return kz5.p0.f313996d;
            }
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                kotlin.jvm.internal.o.d(childAt);
                arrayList.add(childAt);
                arrayList.addAll(d(childAt));
            }
        }
        return arrayList;
    }

    public final int e(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            return com.tencent.mm.ui.bh.a(context).f197135a;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizViewUtils", e17, "getRealScreenWidth exception", new java.lang.Object[0]);
            return 0;
        }
    }

    public final java.lang.String f(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<this>");
        return textView.getVisibility() == 0 ? textView.getText().toString() : "";
    }

    public final void g(android.view.View view, float f17, boolean z17, boolean z18) {
        if (f17 <= 0.0f) {
            return;
        }
        if (view != null) {
            view.setOutlineProvider(new fq1.a(f17, z17, z18));
        }
        if (view == null) {
            return;
        }
        view.setClipToOutline(true);
    }

    public final void i(android.content.Context context, com.tencent.mm.ui.widget.MMNeat7extView tv6, int i17, java.lang.CharSequence text, int i18) {
        int i19;
        int B;
        int b17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tv6, "tv");
        kotlin.jvm.internal.o.g(text, "text");
        tv6.b(text);
        if (tv6.getWidth() > 0) {
            i19 = tv6.getWidth();
        } else {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            java.util.HashMap hashMap = f265508b;
            if (hashMap.containsKey(valueOf)) {
                java.lang.Object obj = hashMap.get(java.lang.Integer.valueOf(i18));
                kotlin.jvm.internal.o.d(obj);
                i19 = ((java.lang.Number) obj).intValue();
            } else {
                hashMap.put(java.lang.Integer.valueOf(i18), 0);
                i19 = 0;
            }
        }
        if (i19 <= 0) {
            android.view.ViewTreeObserver viewTreeObserver = tv6.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(new fq1.d(tv6, i18));
            }
            if (i18 == 0 || i18 == 11) {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 48);
            } else if (i18 == 1) {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 136);
            } else if (i18 == 2 || i18 == 21) {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 64);
            } else if (i18 == 3) {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 136);
            } else if (i18 == 4 || i18 == 41) {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 64);
            } else if (i18 == 5) {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 144);
            } else {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 64);
            }
            i19 = B - b17;
        }
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(i17);
        int textSize = (int) tv6.getTextSize();
        int intrinsicWidth = (drawable.getIntrinsicWidth() * textSize) / drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, textSize);
        tv6.j(android.text.TextUtils.TruncateAt.END, intrinsicWidth + i65.a.b(context, 9));
        ks5.a i27 = tv6.i(i19, Integer.MAX_VALUE);
        if (i27 != null) {
            int l17 = ((ks5.c) i27).l(tv6.getMaxLines() - 1);
            if (l17 <= 0) {
                a(tv6, text, drawable, 8);
                return;
            }
            a(tv6, text.subSequence(0, text.length() - l17).toString() + (char) 8230, drawable, 8);
        } else {
            a(tv6, text, drawable, 8);
        }
        tv6.setContentDescription(((java.lang.Object) tv6.a()) + (char) 65292 + tv6.getContext().getResources().getString(com.tencent.mm.R.string.f492564gz4));
    }
}
