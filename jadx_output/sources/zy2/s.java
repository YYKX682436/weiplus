package zy2;

/* loaded from: classes10.dex */
public abstract class s {
    public static final java.lang.String a(r45.g92 g92Var) {
        kotlin.jvm.internal.o.g(g92Var, "<this>");
        r45.d50 d50Var = (r45.d50) g92Var.getCustom(46);
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> list = d50Var != null ? d50Var.getList(1) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.lang.String string = g92Var.getString(21);
        java.lang.String string2 = !(string == null || string.length() == 0) ? g92Var.getString(21) : g92Var.getString(3);
        lz5.e eVar = new lz5.e(list.size() + 1);
        if (string2 == null) {
            string2 = "";
        }
        eVar.add(string2);
        for (com.tencent.mm.protocal.protobuf.FinderContact finderContact : list) {
            java.lang.String nickname = finderContact != null ? finderContact.getNickname() : null;
            if (nickname == null) {
                nickname = "";
            }
            eVar.add(nickname);
        }
        java.util.List a17 = kz5.b0.a(eVar);
        zy2.p pVar = zy2.p.f477526a;
        return pVar.c(a17).concat(pVar.d(((kz5.l) a17).d()));
    }

    public static final void b(android.widget.TextView textView, java.util.List nicknames, int i17, android.view.View view) {
        int i18;
        int intValue;
        kotlin.jvm.internal.o.g(textView, "<this>");
        kotlin.jvm.internal.o.g(nicknames, "nicknames");
        java.lang.Object tag = textView.getTag(com.tencent.mm.R.id.sut);
        java.lang.Integer num = null;
        zy2.n nVar = tag instanceof zy2.n ? (zy2.n) tag : null;
        if (nVar != null) {
            android.view.ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver().isAlive() ? textView.getViewTreeObserver() : nVar.f477478a;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(nVar.f477479b);
            }
            android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = nVar.f477480c;
            if (onAttachStateChangeListener != null) {
                textView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
        }
        textView.setMinWidth(0);
        if (view != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getWidth());
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                intValue = valueOf.intValue();
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(layoutParams.width);
                    if (valueOf2.intValue() > 0) {
                        num = valueOf2;
                    }
                }
                intValue = num != null ? num.intValue() : 0;
            }
            i18 = intValue;
        } else {
            i18 = 0;
        }
        if (i18 > 0) {
            textView.setMaxWidth(i18);
        }
        zy2.p pVar = zy2.p.f477526a;
        java.lang.String concat = pVar.c(nicknames).concat(pVar.d(i17));
        if (i18 > 0) {
            int paddingStart = (i18 - textView.getPaddingStart()) - textView.getPaddingEnd();
            int i19 = paddingStart >= 0 ? paddingStart : 0;
            if (i19 > 0) {
                android.text.TextPaint paint = textView.getPaint();
                kotlin.jvm.internal.o.f(paint, "getPaint(...)");
                concat = pVar.b(nicknames, i17, i19, paint);
            }
        }
        textView.setText(pVar.a(concat, i17));
        android.view.ViewTreeObserver viewTreeObserver2 = textView.getViewTreeObserver();
        zy2.r rVar = new zy2.r(textView, viewTreeObserver2, nicknames, i17, i18);
        viewTreeObserver2.addOnPreDrawListener(rVar);
        zy2.q qVar = new zy2.q(textView, viewTreeObserver2, rVar);
        textView.addOnAttachStateChangeListener(qVar);
        textView.setTag(com.tencent.mm.R.id.sut, new zy2.n(viewTreeObserver2, rVar, qVar));
    }
}
