package qn2;

/* loaded from: classes3.dex */
public final class v0 {
    public final java.lang.Integer[] A;

    /* renamed from: a, reason: collision with root package name */
    public final qn2.i0 f365176a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f365177b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f365178c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f365179d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f365180e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f365181f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f365182g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f365183h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f365184i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f365185j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f365186k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f365187l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f365188m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.lottery.card.FinderLiveLotteryCardGiftWidget f365189n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f365190o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f365191p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f365192q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f365193r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f365194s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f365195t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f365196u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f365197v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f365198w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f365199x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.c1 f365200y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f365201z;

    public v0(qn2.i0 visitorCardPlugin, android.view.ViewGroup doneContainer, android.view.View cardContainer, android.view.View card) {
        kotlin.jvm.internal.o.g(visitorCardPlugin, "visitorCardPlugin");
        kotlin.jvm.internal.o.g(doneContainer, "doneContainer");
        kotlin.jvm.internal.o.g(cardContainer, "cardContainer");
        kotlin.jvm.internal.o.g(card, "card");
        this.f365176a = visitorCardPlugin;
        this.f365177b = doneContainer;
        this.f365178c = cardContainer;
        this.f365179d = card;
        this.A = new java.lang.Integer[]{3, 5};
    }

    public static final void e(r45.cz1 cz1Var, qn2.v0 v0Var, r45.of1 of1Var) {
        r45.yy1 yy1Var = (r45.yy1) cz1Var.getCustom(13);
        android.widget.ImageView imageView = yy1Var != null && yy1Var.getInteger(0) == 4 ? v0Var.f365192q : v0Var.f365182g;
        r45.yy1 yy1Var2 = (r45.yy1) cz1Var.getCustom(13);
        android.widget.TextView textView = yy1Var2 != null && yy1Var2.getInteger(0) == 4 ? v0Var.f365193r : v0Var.f365183h;
        if (imageView != null) {
            int integer = of1Var.getInteger(2);
            mn2.g1 g1Var = mn2.g1.f329975a;
            if (integer == 3) {
                vo0.d a17 = g1Var.a();
                java.lang.String string = of1Var.getString(1);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                a17.c(new mn2.n(string != null ? string : "", null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
            } else {
                vo0.d l17 = g1Var.l();
                java.lang.String string2 = of1Var.getString(1);
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                l17.c(new mn2.n(string2 != null ? string2 : "", null, 2, null), imageView, g1Var.h(mn2.f1.f329961o));
            }
            if (textView == null) {
                return;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = v0Var.f365177b.getContext();
            java.lang.String string3 = of1Var.getString(0);
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string3));
        }
    }

    public final void a(android.widget.TextView textView, r45.yy1 claimMethod) {
        kotlin.jvm.internal.o.g(claimMethod, "claimMethod");
        jz5.f0 f0Var = null;
        if (textView != null) {
            com.tencent.mars.xlog.Log.i("VisitorLotteryCardDoneWidget", "set claim, text = " + claimMethod.getString(2) + ", status = " + claimMethod.getInteger(3));
            if (claimMethod.getInteger(5) != 1) {
                java.lang.String string = claimMethod.getString(2);
                if (string == null) {
                    string = "";
                }
                textView.setText(string);
                if (claimMethod.getInteger(3) != 0) {
                    if (!kz5.z.G(this.A, java.lang.Integer.valueOf(claimMethod.getInteger(0)))) {
                        textView.setBackground(null);
                        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3, null));
                        textView.setEnabled(false);
                    }
                }
                textView.setBackgroundResource(com.tencent.mm.R.drawable.a09);
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an, null));
                textView.setEnabled(true);
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c17;
                ml2.p4 p4Var = ml2.p4.f327806t;
                int integer = claimMethod.getInteger(0);
                ml2.r0.ek(r0Var, p4Var, integer != 1 ? integer != 2 ? integer != 3 ? "1" : "4" : "3" : "2", null, 0, null, 28, null);
            } else {
                textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.dqh));
                textView.setBackground(null);
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f479070p1, null));
                textView.setEnabled(false);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("LotteryUtil", "setClaim " + pm0.b0.g(claimMethod) + " but claimPrizeTip is null!");
        }
    }

    public final void b() {
        android.widget.TextView textView = this.f365180e;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f365181f;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = this.f365184i;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        c(false);
        android.widget.TextView textView4 = this.f365187l;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        android.widget.ImageView imageView = this.f365182g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.TextView textView5 = this.f365183h;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        android.view.View view = this.f365190o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setDoneNoWinnerUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setDoneNoWinnerUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f365191p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setDoneNoWinnerUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setDoneNoWinnerUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.lottery.card.FinderLiveLotteryCardGiftWidget finderLiveLotteryCardGiftWidget = this.f365189n;
        if (finderLiveLotteryCardGiftWidget != null) {
            finderLiveLotteryCardGiftWidget.setVisibility(8);
        }
        android.widget.TextView textView6 = this.f365188m;
        if (textView6 == null) {
            return;
        }
        textView6.setVisibility(8);
    }

    public final void c(boolean z17) {
        if (zl2.q4.f473933a.E()) {
            com.tencent.mm.sdk.platformtools.Log.c("VisitorLotteryCardDoneWidget", "setRainbowVisible visible:" + z17, new java.lang.Object[0]);
        }
        if (z17) {
            android.widget.ImageView imageView = this.f365185j;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            android.widget.ImageView imageView2 = this.f365186k;
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(0);
            return;
        }
        android.widget.ImageView imageView3 = this.f365185j;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        android.widget.ImageView imageView4 = this.f365186k;
        if (imageView4 == null) {
            return;
        }
        imageView4.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0577  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(r45.cz1 r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.v0.d(r45.cz1, boolean):void");
    }
}
