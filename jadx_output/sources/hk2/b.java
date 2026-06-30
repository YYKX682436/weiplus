package hk2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final hk2.b f281879a = new hk2.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f281880b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f281881c;

    static {
        jz5.h.b(hk2.a.f281878d);
        f281880b = "\u2005";
        f281881c = 17;
    }

    public final android.graphics.drawable.Drawable a(int i17) {
        int i18;
        if (40 <= i17 && i17 < 50) {
            i18 = com.tencent.mm.R.drawable.f481710a20;
        } else {
            if (50 <= i17 && i17 < 60) {
                i18 = com.tencent.mm.R.drawable.f481712a22;
            } else {
                if (60 <= i17 && i17 < 70) {
                    i18 = com.tencent.mm.R.drawable.f481714a24;
                } else {
                    if (70 <= i17 && i17 < 80) {
                        i18 = com.tencent.mm.R.drawable.f481716a26;
                    } else {
                        if (80 <= i17 && i17 < 90) {
                            i18 = com.tencent.mm.R.drawable.a28;
                        } else {
                            i18 = 90 <= i17 && i17 < 100 ? com.tencent.mm.R.drawable.a2_ : com.tencent.mm.R.drawable.a1y;
                        }
                    }
                }
            }
        }
        android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(i18, null);
        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
        return drawable;
    }

    public final android.text.style.ImageSpan b(r45.yl1 yl1Var) {
        int i17;
        gm2.c cVar;
        int i18;
        java.lang.Integer valueOf = yl1Var != null ? java.lang.Integer.valueOf(yl1Var.getInteger(0)) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            android.graphics.drawable.Drawable a17 = gm2.q.f273460e.a(gm2.t1.f273481c.b(yl1Var.getInteger(2)), 2.0f);
            gm2.c1 c1Var = gm2.c1.f273320a;
            gm2.c cVar2 = new gm2.c(gm2.c1.c(c1Var, c1Var.l() + c1Var.k(), 0, 2, null));
            wo.q1 q1Var = new wo.q1(c1Var.l(), c1Var.l());
            int W0 = zl2.r4.f473950a.W0(yl1Var.getInteger(2));
            cVar2.f273315d = a17;
            cVar2.f273316e = q1Var;
            cVar2.f273317f = W0;
            c1Var.k();
            cVar2.f273318g = 0;
            return cVar2;
        }
        if (valueOf != null && valueOf.intValue() == 4) {
            int integer = yl1Var.getInteger(2);
            if (1 <= integer && integer < 7) {
                i18 = com.tencent.mm.R.drawable.c4e;
            } else {
                if (7 <= integer && integer < 13) {
                    i18 = com.tencent.mm.R.drawable.c4f;
                } else {
                    if (!(13 <= integer && integer < 18)) {
                        if (!(18 <= integer && integer <= Integer.MAX_VALUE)) {
                            i18 = 0;
                        }
                    }
                    i18 = com.tencent.mm.R.drawable.c4g;
                }
            }
            android.graphics.drawable.Drawable e17 = m95.a.e(com.tencent.mm.sdk.platformtools.x2.f193075e, i18, 2.0f);
            gm2.c1 c1Var2 = gm2.c1.f273320a;
            cVar = new gm2.c(gm2.c1.c(c1Var2, c1Var2.l() + c1Var2.k(), 0, 2, null));
            kotlin.jvm.internal.o.d(e17);
            wo.q1 q1Var2 = new wo.q1(c1Var2.l(), c1Var2.l());
            cVar.f273315d = e17;
            cVar.f273316e = q1Var2;
            cVar.f273317f = 0;
            c1Var2.k();
            cVar.f273318g = 0;
        } else {
            if (valueOf == null || valueOf.intValue() != 12) {
                return null;
            }
            int integer2 = yl1Var.getInteger(2);
            if (1 <= integer2 && integer2 < 7) {
                i17 = com.tencent.mm.R.drawable.cpt;
            } else {
                if (7 <= integer2 && integer2 < 13) {
                    i17 = com.tencent.mm.R.drawable.cpu;
                } else {
                    if (!(13 <= integer2 && integer2 < 18)) {
                        if (!(18 <= integer2 && integer2 <= Integer.MAX_VALUE)) {
                            i17 = 0;
                        }
                    }
                    i17 = com.tencent.mm.R.drawable.cpq;
                }
            }
            android.graphics.drawable.Drawable e18 = m95.a.e(com.tencent.mm.sdk.platformtools.x2.f193075e, i17, 2.0f);
            gm2.c1 c1Var3 = gm2.c1.f273320a;
            cVar = new gm2.c(gm2.c1.c(c1Var3, c1Var3.l() + c1Var3.k(), 0, 2, null));
            kotlin.jvm.internal.o.d(e18);
            wo.q1 q1Var3 = new wo.q1(c1Var3.l(), c1Var3.l());
            cVar.f273315d = e18;
            cVar.f273316e = q1Var3;
            cVar.f273317f = 0;
            c1Var3.k();
            cVar.f273318g = 0;
        }
        return cVar;
    }

    public final void c(dk2.zf finderLiveMsg, android.view.View likeRoot) {
        kotlin.jvm.internal.o.g(finderLiveMsg, "finderLiveMsg");
        kotlin.jvm.internal.o.g(likeRoot, "likeRoot");
        if (finderLiveMsg instanceof dk2.cg) {
            dk2.cg cgVar = (dk2.cg) finderLiveMsg;
            se2.w.f406895a.m(likeRoot, cgVar.o(), cgVar.s(), null);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(likeRoot, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemBase", "processLike", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        likeRoot.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(likeRoot, "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemBase", "processLike", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void d(android.view.View itemView) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.qcw);
        itemView.findViewById(com.tencent.mm.R.id.lti).setPadding(0, 0, 0, 0);
        com.tencent.mm.plugin.finder.view.DanmakuStrokeTextView danmakuStrokeTextView = (com.tencent.mm.plugin.finder.view.DanmakuStrokeTextView) itemView.findViewById(com.tencent.mm.R.id.i8m);
        if (danmakuStrokeTextView != null) {
            danmakuStrokeTextView.setTextColor(danmakuStrokeTextView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            danmakuStrokeTextView.setGradientTextColor(null);
        }
        int dimensionPixelOffset = findViewById.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479672c9);
        int dimensionPixelOffset2 = findViewById.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479645bk);
        findViewById.setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
        findViewById.setBackground(null);
    }

    public final void e(r45.yl1 yl1Var, android.view.View bgView, android.view.View likeRoot) {
        kotlin.jvm.internal.o.g(bgView, "bgView");
        kotlin.jvm.internal.o.g(likeRoot, "likeRoot");
        java.lang.Integer valueOf = yl1Var != null ? java.lang.Integer.valueOf(yl1Var.getInteger(0)) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            bgView.setBackground(a(yl1Var.getInteger(2)));
            android.view.ViewGroup.LayoutParams layoutParams = likeRoot.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            gm2.c1 c1Var = gm2.c1.f273320a;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((java.lang.Number) ((jz5.n) gm2.c1.f273332m).getValue()).intValue();
            return;
        }
        if (valueOf != null && valueOf.intValue() == 4) {
            bgView.setBackground(null);
            android.view.ViewGroup.LayoutParams layoutParams2 = likeRoot.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = gm2.c1.f273320a.j() * (-1);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = likeRoot.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = gm2.c1.f273320a.j() * (-1);
        bgView.setBackground(null);
    }

    public final void f(android.view.View bgView, android.view.View likeRoot) {
        kotlin.jvm.internal.o.g(bgView, "bgView");
        kotlin.jvm.internal.o.g(likeRoot, "likeRoot");
        android.view.ViewGroup.LayoutParams layoutParams = likeRoot.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = gm2.c1.f273320a.j() * (-1);
        bgView.setBackground(null);
    }
}
