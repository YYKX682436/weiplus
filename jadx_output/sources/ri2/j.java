package ri2;

/* loaded from: classes10.dex */
public final class j implements ri2.a {
    public kotlinx.coroutines.r2 A;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f396058a;

    /* renamed from: b, reason: collision with root package name */
    public final bg2.k f396059b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f396060c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f396061d;

    /* renamed from: e, reason: collision with root package name */
    public final int f396062e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f396063f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f396064g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f396065h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f396066i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f396067j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f396068k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f396069l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f396070m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f396071n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f396072o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f396073p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f396074q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f396075r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f396076s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f396077t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f396078u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f396079v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f396080w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f396081x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f396082y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f396083z;

    public j(android.view.View root, bg2.k controller) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f396058a = root;
        this.f396059b = controller;
        this.f396060c = "LiveFeedCommonBattleUICallback";
        this.f396061d = "finder_live_pk_fire_ball.pag";
        this.f396062e = (int) root.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479720dd);
        this.f396063f = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.eog);
        this.f396064g = root.findViewById(com.tencent.mm.R.id.ep_);
        this.f396065h = root.findViewById(com.tencent.mm.R.id.epc);
        this.f396066i = root.findViewById(com.tencent.mm.R.id.eoy);
        this.f396067j = root.findViewById(com.tencent.mm.R.id.eow);
        this.f396068k = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.eov);
        this.f396069l = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.eox);
        this.f396070m = root.findViewById(com.tencent.mm.R.id.eos);
        this.f396071n = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.eor);
        this.f396072o = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.eot);
        this.f396073p = (com.tencent.mm.view.MMPAGView) root.findViewById(com.tencent.mm.R.id.epb);
        this.f396074q = root.findViewById(com.tencent.mm.R.id.epe);
        this.f396075r = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.epg);
        this.f396076s = root.findViewById(com.tencent.mm.R.id.epf);
        this.f396077t = root.findViewById(com.tencent.mm.R.id.f484568ep2);
        this.f396078u = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.ep8);
        this.f396079v = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f484571ep5);
        this.f396080w = root.findViewById(com.tencent.mm.R.id.f484569ep3);
        this.f396081x = root.findViewById(com.tencent.mm.R.id.ep6);
        this.f396082y = root.findViewById(com.tencent.mm.R.id.epd);
        this.f396083z = root.findViewById(com.tencent.mm.R.id.epc);
        int i17 = com.tencent.mm.ui.bl.b(root.getContext()).x / 2;
        android.view.View view = this.f396067j;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(((i17 * 7) / 25) + i17);
        }
        android.view.View view2 = this.f396070m;
        java.lang.Object layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.setMarginStart(i17 + ((i17 * 7) / 25));
        }
        d92.f fVar = d92.f.f227470a;
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        float d17 = fVar.d(context, 11.0f, false);
        android.widget.TextView textView = this.f396078u;
        if (textView != null) {
            textView.setTextSize(1, d17);
        }
        android.widget.TextView textView2 = this.f396079v;
        if (textView2 != null) {
            textView2.setTextSize(1, d17);
        }
        android.content.Context context2 = root.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        float d18 = fVar.d(context2, 12.6f, false);
        android.widget.TextView textView3 = this.f396075r;
        if (textView3 != null) {
            textView3.setTextSize(1, d18);
        }
        android.widget.TextView textView4 = this.f396063f;
        if (textView4 != null) {
            textView4.setTextSize(1, 28.0f);
        }
        zl2.r4.f473950a.b3(this.f396063f);
    }

    public final java.lang.Long a() {
        java.lang.Object obj;
        dk2.u4 f76 = this.f396059b.f7();
        if (f76 == null) {
            return null;
        }
        if (f76.f234160g != 2) {
            zy2.a aVar = (zy2.a) kz5.n0.Z(this.f396059b.c7());
            km2.k c17 = f76.c(aVar != null ? aVar.f477335b : null);
            if (c17 != null) {
                return java.lang.Long.valueOf(f76.f234161h == 1 ? c17.f309122i : c17.f309116c);
            }
            return null;
        }
        for (r45.r22 r22Var : f76.f234163j) {
            java.util.LinkedList list = r22Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getMembers(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.wk6) obj).getString(0), this.f396059b.f20232s)) {
                        break;
                    }
                }
            }
            if (obj == null) {
                return f76.f234161h == 1 ? java.lang.Long.valueOf(r22Var.getLong(3)) : java.lang.Long.valueOf(r22Var.getLong(1));
            }
        }
        return null;
    }

    public final java.lang.Long b() {
        java.lang.Object obj;
        dk2.u4 f76 = this.f396059b.f7();
        if (f76 == null) {
            return null;
        }
        if (f76.f234160g != 2) {
            km2.k e17 = f76.e(this.f396059b.f20232s);
            if (e17 != null) {
                return java.lang.Long.valueOf(f76.f234161h == 1 ? e17.f309122i : e17.f309116c);
            }
            return null;
        }
        for (r45.r22 r22Var : f76.f234163j) {
            java.util.LinkedList list = r22Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getMembers(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.wk6) obj).getString(0), this.f396059b.f20232s)) {
                        break;
                    }
                }
            }
            if (obj != null) {
                return f76.f234161h == 1 ? java.lang.Long.valueOf(r22Var.getLong(3)) : java.lang.Long.valueOf(r22Var.getLong(1));
            }
        }
        return null;
    }

    public final void c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        bg2.k kVar = this.f396059b;
        kVar.f20233t = str2;
        kVar.getClass();
        android.widget.ImageView imageView = this.f396071n;
        if (imageView != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.a().c(new mn2.n(str, null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
        }
        android.widget.TextView textView = this.f396072o;
        if (textView != null) {
            textView.setText(str3);
        }
        com.tencent.mars.xlog.Log.i(this.f396060c, "loadOtherUserInfo headUrl:" + str + " username:" + str2 + " nickname:" + str3 + " sdkUserId:" + str4);
    }

    public void d(int i17) {
        android.view.View view = this.f396058a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r21 = this;
            r0 = r21
            bg2.k r1 = r0.f396059b
            int r2 = r1.d7()
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L1f
            dk2.u4 r2 = r1.f7()
            if (r2 == 0) goto L19
            int r2 = r2.f234160g
            r5 = 2
            if (r2 != r5) goto L19
            r2 = r3
            goto L1a
        L19:
            r2 = r4
        L1a:
            if (r2 == 0) goto L1d
            goto L1f
        L1d:
            r2 = r4
            goto L20
        L1f:
            r2 = r3
        L20:
            r5 = 8
            if (r2 == 0) goto L81
            xi2.g r1 = r1.e7()
            if (r1 == 0) goto L31
            int r1 = r1.getVisibility()
            if (r1 != r5) goto L31
            goto L32
        L31:
            r3 = r4
        L32:
            if (r3 == 0) goto L81
            android.view.View r1 = r0.f396064g
            if (r1 != 0) goto L3a
            goto Lcc
        L3a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.add(r3)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r7 = r2.toArray()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback"
            java.lang.String r9 = "showPkBarGroup"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            yj0.a.d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback"
            java.lang.String r8 = "showPkBarGroup"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r1
            yj0.a.f(r6, r7, r8, r9, r10, r11, r12)
            goto Lcc
        L81:
            android.view.View r1 = r0.f396064g
            if (r1 != 0) goto L86
            goto Lcc
        L86:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.add(r3)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r14 = r2.toArray()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback"
            java.lang.String r16 = "showPkBarGroup"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            yj0.a.d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback"
            java.lang.String r15 = "showPkBarGroup"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r13 = r1
            yj0.a.f(r13, r14, r15, r16, r17, r18, r19)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ri2.j.e():void");
    }

    public final void f(java.lang.Long l17, java.lang.Long l18, boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f396060c, "updateBattleBar: selfWecoinHot:" + l17 + " otherWecoinHot:" + l18 + " needInit:" + z17);
        android.view.View view = this.f396064g;
        if (view != null) {
            view.post(new ri2.i(this, l17, l18, z17));
        }
    }
}
