package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes12.dex */
public class ShakeEggAnimFrame extends android.widget.FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f162091e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f162092d;

    public ShakeEggAnimFrame(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f162092d = new java.util.ArrayList();
    }

    private int getSize() {
        return (int) (new android.widget.TextView(getContext()).getTextSize() * 1.2d);
    }

    public void a(android.app.Activity activity, int i17) {
        int i18;
        com.tencent.mm.smiley.c cVar;
        com.tencent.mm.smiley.b2 b2Var;
        com.tencent.mm.smiley.c1 c1Var;
        android.util.SparseArray sparseArray;
        java.util.List list = this.f162092d;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            view.clearAnimation();
            removeView(view);
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        setVisibility(0);
        for (int i19 = 0; i19 < i17; i19++) {
            com.tencent.mm.plugin.shake.ui.l lVar = new com.tencent.mm.plugin.shake.ui.l(this, displayMetrics.widthPixels, displayMetrics.heightPixels);
            com.tencent.mm.smiley.x1.Di().getClass();
            com.tencent.mm.smiley.g.b().getClass();
            boolean z17 = com.tencent.mm.smiley.q0.f193336d;
            com.tencent.mm.smiley.q0 q0Var = com.tencent.mm.smiley.l0.f193307a;
            q0Var.getClass();
            com.tencent.mm.smiley.p pVar = com.tencent.mm.smiley.m.f193309a;
            android.graphics.drawable.Drawable drawable = null;
            com.tencent.mm.smiley.f1 f1Var = (com.tencent.mm.smiley.f1) pVar.f193327c.get(107, null);
            if (f1Var != null && (i18 = f1Var.f193252e) < q0Var.f193341a.f193256d.size() && i18 >= 0 && (cVar = (com.tencent.mm.smiley.c) q0Var.f193341a.f193256d.get(i18)) != null) {
                java.util.LinkedList codePoints = cVar.f193223d;
                kotlin.jvm.internal.o.f(codePoints, "codePoints");
                java.util.Iterator it6 = codePoints.iterator();
                com.tencent.mm.smiley.b bVar = pVar.f193329e;
                int i27 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.Integer num = (java.lang.Integer) next;
                    if (bVar == null || (sparseArray = bVar.f193217b) == null) {
                        c1Var = null;
                    } else {
                        kotlin.jvm.internal.o.d(num);
                        c1Var = (com.tencent.mm.smiley.c1) sparseArray.get(num.intValue(), null);
                    }
                    bVar = (com.tencent.mm.smiley.l) c1Var;
                    if (bVar == null) {
                        break;
                    }
                    if (i27 == codePoints.size() - 1) {
                        com.tencent.mm.smiley.a1 a1Var = bVar.f193216a;
                        if (a1Var instanceof com.tencent.mm.smiley.b2) {
                            b2Var = (com.tencent.mm.smiley.b2) a1Var;
                        }
                    } else {
                        i27 = i28;
                    }
                }
                b2Var = null;
                if (b2Var != null) {
                    int i29 = com.tencent.mm.smiley.e.f193236b;
                    drawable = com.tencent.mm.smiley.d.f193233a.a(b2Var, true);
                }
            }
            drawable.setBounds(0, 0, getSize(), getSize());
            android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(drawable, 1);
            android.text.SpannableString spannableString = new android.text.SpannableString("  ");
            spannableString.setSpan(imageSpan, 0, 1, 33);
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setSingleLine();
            textView.setText(spannableString);
            textView.setAnimation(lVar);
            textView.setTag(lVar);
            addView(textView);
            lVar.f162286d = textView;
            ((java.util.ArrayList) list).add(textView);
        }
    }
}
