package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes10.dex */
public abstract class k2 {
    public static final java.lang.Integer a(int i17) {
        r45.ql4 ql4Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        kotlinx.coroutines.flow.j2 j2Var;
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        r45.g02 g02Var = (eVar == null || (j2Var = ((mm2.v4) eVar.a(mm2.v4.class)).f329477g) == null) ? null : (r45.g02) ((kotlinx.coroutines.flow.h3) j2Var).getValue();
        if (g02Var == null || (linkedList = g02Var.f374775n) == null) {
            ql4Var = null;
        } else {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.ql4) obj).f384087d == i17) {
                    break;
                }
            }
            ql4Var = (r45.ql4) obj;
        }
        if (ql4Var == null) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(android.graphics.Color.parseColor(b(ql4Var.f384088e)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiveMileStoneColorHelper", th6, "getColor for type " + i17 + " failed", new java.lang.Object[0]);
            return null;
        }
    }

    public static final java.lang.String b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() != 9) {
            return str;
        }
        char charAt = str.charAt(0);
        java.lang.String substring = str.substring(1, 3);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String substring2 = str.substring(3, 5);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        java.lang.String substring3 = str.substring(5, 7);
        kotlin.jvm.internal.o.f(substring3, "substring(...)");
        java.lang.String substring4 = str.substring(7, 9);
        kotlin.jvm.internal.o.f(substring4, "substring(...)");
        return charAt + substring4 + substring + substring2 + substring3;
    }

    public static final void c(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, int i17) {
        if (weImageView == null) {
            return;
        }
        java.lang.Integer a17 = a(i17);
        if (a17 != null) {
            weImageView.setIconColor(a17.intValue());
        }
    }

    public static final boolean d(android.widget.TextView textView, int i17, int i18) {
        if (textView == null) {
            return false;
        }
        java.lang.Integer a17 = a(i17);
        if (!(a17 != null)) {
            return false;
        }
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i18);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{b17, b17, b17, b17, b17, b17, b17, b17}, null, null));
        shapeDrawable.getPaint().setColor(a17.intValue());
        textView.setBackground(shapeDrawable);
        return true;
    }

    public static final boolean e(android.widget.TextView textView, int i17) {
        if (textView == null) {
            return false;
        }
        java.lang.Integer a17 = a(i17);
        if (!(a17 != null)) {
            return false;
        }
        textView.setTextColor(a17.intValue());
        return true;
    }

    public static final boolean f(android.view.View view, int i17, int i18) {
        if (view == null) {
            return false;
        }
        java.lang.Integer a17 = a(i17);
        if (!(a17 != null)) {
            return false;
        }
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i18);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{b17, b17, b17, b17, b17, b17, b17, b17}, null, null));
        shapeDrawable.getPaint().setColor(a17.intValue());
        view.setBackground(shapeDrawable);
        return true;
    }
}
