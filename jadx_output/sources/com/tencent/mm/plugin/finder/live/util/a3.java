package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes2.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.a3 f115443a = new com.tencent.mm.plugin.finder.live.util.a3();

    public static void e(com.tencent.mm.plugin.finder.live.util.a3 a3Var, android.widget.TextView textView, java.util.LinkedList colorList, com.tencent.mm.plugin.finder.live.util.u2 gradientOrientation, com.tencent.mm.plugin.finder.live.util.t2 format, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            gradientOrientation = com.tencent.mm.plugin.finder.live.util.u2.f115716e;
        }
        if ((i17 & 4) != 0) {
            format = com.tencent.mm.plugin.finder.live.util.t2.f115708d;
        }
        a3Var.getClass();
        kotlin.jvm.internal.o.g(textView, "<this>");
        kotlin.jvm.internal.o.g(colorList, "colorList");
        kotlin.jvm.internal.o.g(gradientOrientation, "gradientOrientation");
        kotlin.jvm.internal.o.g(format, "format");
        if (colorList.size() < 2) {
            textView.getPaint().setShader(null);
            java.lang.String str = (java.lang.String) kz5.n0.Z(colorList);
            if (str != null) {
                if (str.length() > 0) {
                    textView.setTextColor(zl2.q4.f473933a.O(str));
                    return;
                }
                return;
            }
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : colorList) {
            if (((java.lang.String) obj2).length() > 0) {
                arrayList.add(obj2);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            arrayList2.add(java.lang.Integer.valueOf(format == com.tencent.mm.plugin.finder.live.util.t2.f115708d ? zl2.q4.f473933a.O(str2) : hc2.l.l(str2)));
        }
        textView.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.live.util.z2(textView, gradientOrientation, kz5.n0.R0(arrayList2)));
    }

    public final void a(android.view.ViewGroup viewGroup, r45.an1 it) {
        kotlin.jvm.internal.o.g(viewGroup, "<this>");
        kotlin.jvm.internal.o.g(it, "it");
        int integer = it.getInteger(4);
        if (integer != 0) {
            if (integer != 1) {
                return;
            }
            d(viewGroup, it.getString(3));
        } else {
            java.util.LinkedList list = it.getList(2);
            kotlin.jvm.internal.o.f(list, "getBackground_color(...)");
            c(viewGroup, list, com.tencent.mm.plugin.finder.live.util.u2.f115715d);
        }
    }

    public final void b(android.widget.ImageView imageView, r45.an1 it) {
        kotlin.jvm.internal.o.g(imageView, "<this>");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = it.getString(7);
        if (string == null || string.length() == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/util/SquareConvertUtil", "loadHighlightTagIcon", "(Landroid/widget/ImageView;Lcom/tencent/mm/protocal/protobuf/FinderLiveCardHighlightTag;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/util/SquareConvertUtil", "loadHighlightTagIcon", "(Landroid/widget/ImageView;Lcom/tencent/mm/protocal/protobuf/FinderLiveCardHighlightTag;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/util/SquareConvertUtil", "loadHighlightTagIcon", "(Landroid/widget/ImageView;Lcom/tencent/mm/protocal/protobuf/FinderLiveCardHighlightTag;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/util/SquareConvertUtil", "loadHighlightTagIcon", "(Landroid/widget/ImageView;Lcom/tencent/mm/protocal/protobuf/FinderLiveCardHighlightTag;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c a17 = g1Var.e().a(new mn2.q3(it.getString(7), com.tencent.mm.plugin.finder.storage.y90.f128356f));
        com.tencent.mm.plugin.finder.live.util.w2 w2Var = new com.tencent.mm.plugin.finder.live.util.w2(imageView, it);
        a17.getClass();
        a17.f447873d = w2Var;
        a17.g(g1Var.h(mn2.f1.f329965s));
        a17.f();
    }

    public final void c(android.view.View view, java.util.LinkedList colorList, com.tencent.mm.plugin.finder.live.util.u2 gradientOrientation) {
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(colorList, "colorList");
        kotlin.jvm.internal.o.g(gradientOrientation, "gradientOrientation");
        if (colorList.size() < 2) {
            java.lang.String str = (java.lang.String) kz5.n0.Z(colorList);
            if (str != null) {
                if (str.length() > 0) {
                    view.setBackgroundColor(zl2.q4.f473933a.O(str));
                    return;
                }
                return;
            }
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : colorList) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(zl2.q4.f473933a.O((java.lang.String) it.next())));
        }
        view.setBackgroundDrawable(new com.tencent.mm.plugin.finder.live.view.bd(gradientOrientation, kz5.n0.R0(arrayList2)));
    }

    public final void d(android.view.View view, java.lang.String str) {
        kotlin.jvm.internal.o.g(view, "<this>");
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("SquareConvertUtil", "load background img, url is null");
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c a17 = g1Var.e().a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        com.tencent.mm.plugin.finder.live.util.y2 y2Var = new com.tencent.mm.plugin.finder.live.util.y2(view, str);
        a17.getClass();
        a17.f447873d = y2Var;
        a17.g(g1Var.h(mn2.f1.f329965s));
        a17.f();
    }
}
