package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class q extends com.tencent.mm.plugin.textstatus.convert.topic.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f173342f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f173343g;

    /* renamed from: h, reason: collision with root package name */
    public final float f173344h;

    /* renamed from: i, reason: collision with root package name */
    public final float f173345i;

    /* renamed from: m, reason: collision with root package name */
    public final int f173346m;

    /* renamed from: n, reason: collision with root package name */
    public final int f173347n;

    /* renamed from: o, reason: collision with root package name */
    public final float f173348o;

    /* renamed from: p, reason: collision with root package name */
    public final float f173349p;

    /* renamed from: q, reason: collision with root package name */
    public final mj4.h f173350q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f173351r;

    /* renamed from: s, reason: collision with root package name */
    public final int f173352s;

    /* renamed from: t, reason: collision with root package name */
    public final float f173353t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f173354u;

    /* renamed from: v, reason: collision with root package name */
    public final android.content.Context f173355v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f173356w;

    public q(int i17, android.content.Context activity) {
        int i18;
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f173342f = new java.util.HashMap();
        this.f173343g = new java.util.HashMap();
        this.f173344h = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        this.f173345i = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479720dd);
        int i19 = 0;
        if (valueOf != null) {
            i18 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(valueOf.intValue());
        } else {
            i18 = 0;
        }
        this.f173346m = i18;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479688cn);
        if (valueOf2 != null) {
            i19 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(valueOf2.intValue());
        }
        this.f173347n = i19;
        this.f173348o = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        this.f173349p = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479671c8);
        this.f173350q = ai4.m0.f5173a.M(en1.a.a());
        this.f173351r = new java.util.HashMap();
        this.f173352s = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f197135a;
        this.f173353t = 1.3f;
        this.f173355v = activity;
    }

    public static final void o(com.tencent.mm.plugin.textstatus.convert.topic.q qVar, ym3.p pVar, in5.s0 s0Var, nj4.e eVar, android.view.View view) {
        ai4.e eVar2;
        java.lang.String a17;
        java.lang.String string;
        ai4.e eVar3;
        qVar.getClass();
        if (pVar == ym3.p.f463181f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.SquareItemConvert", "handleListLoadStateChanged: UIRefresh size=" + eVar.f337936d.f5135b.size() + ", itemHash=" + eVar.hashCode() + ", holderHash=" + s0Var.hashCode());
            boolean z17 = qVar.f173356w;
            ai4.e eVar4 = eVar.f337936d;
            if (z17) {
                eVar2 = eVar4;
            } else {
                int i17 = (int) (((((qVar.f173352s - qVar.f173346m) - qVar.f173347n) - qVar.f173348o) / 2) * qVar.f173353t);
                int size = eVar4.f5135b.size();
                float f17 = qVar.f173349p;
                if (size <= 2) {
                    view.getLayoutParams().height = ((int) f17) + i17;
                }
                if (3 <= size && size < 5) {
                    eVar3 = eVar4;
                    int ceil = (int) java.lang.Math.ceil(size / 2);
                    view.getLayoutParams().height = (i17 * ceil) + (ceil * ((int) f17));
                } else {
                    eVar3 = eVar4;
                }
                if (size > 4) {
                    android.content.Context context = s0Var.f293121e;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    java.util.HashMap hashMap = (java.util.HashMap) ((com.tencent.mm.plugin.textstatus.ui.mg) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.mg.class)).f174107d;
                    eVar2 = eVar3;
                    java.lang.String str = eVar2.f5134a;
                    if ((hashMap.containsKey(str) && kotlin.jvm.internal.o.b(hashMap.get(str), java.lang.Boolean.TRUE)) || !hashMap.containsKey(str)) {
                        android.content.Context context2 = view.getContext();
                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                        com.tencent.mm.plugin.textstatus.ui.TextStatusExpandMoreFriendsView textStatusExpandMoreFriendsView = new com.tencent.mm.plugin.textstatus.ui.TextStatusExpandMoreFriendsView(context2, null, 0, 6, null);
                        textStatusExpandMoreFriendsView.measure(0, 0);
                        view.getLayoutParams().height = (i17 * 2) + (((int) f17) * 2) + textStatusExpandMoreFriendsView.getMeasuredHeight();
                    } else {
                        int ceil2 = (int) java.lang.Math.ceil(size / 2);
                        view.getLayoutParams().height = (i17 * ceil2) + (ceil2 * ((int) f17));
                    }
                } else {
                    eVar2 = eVar3;
                }
            }
            android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.d0v);
            imageView.setVisibility(0);
            if (bk4.i.a().K()) {
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) qVar.f173344h);
                imageView.setLayoutParams(layoutParams2);
            }
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f485657ii3);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/convert/topic/SquareItemConvert", "initStatusTitle", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/textstatus/convert/topic/SquareItemConvert", "initStatusTitle", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.om7);
            android.widget.ImageView imageView2 = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.hnv);
            boolean K = bk4.i.a().K();
            android.content.Context context3 = qVar.f173355v;
            if (K) {
                imageView2.setVisibility(8);
                textView.setTextColor(context3.getResources().getColor(com.tencent.mm.R.color.f479220t8));
                android.view.ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.topMargin = (int) qVar.f173345i;
                textView.setLayoutParams(layoutParams4);
                textView.setTextSize(0, context3.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
            } else {
                com.tencent.mm.ui.bk.s0(textView.getPaint());
                imageView2.setVisibility(0);
                if (bk4.i.a().y()) {
                    java.lang.String c17 = ((mj4.k) ((mj4.h) eVar2.f5135b.get(0))).c();
                    mj4.h hVar = qVar.f173350q;
                    if (!kotlin.jvm.internal.o.b(c17, hVar != null ? ((mj4.k) hVar).c() : null)) {
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        java.util.Iterator it = eVar2.f5135b.iterator();
                        while (it.hasNext()) {
                            java.lang.String h17 = ((mj4.k) ((mj4.h) it.next())).h();
                            if (hashMap2.containsKey(h17)) {
                                java.lang.Integer num = (java.lang.Integer) hashMap2.get(h17);
                                hashMap2.put(h17, java.lang.Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                            } else {
                                hashMap2.put(h17, 1);
                            }
                        }
                        java.util.HashSet hashSet = new java.util.HashSet();
                        int i18 = 0;
                        for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                            if (((java.lang.Number) entry.getValue()).intValue() >= i18) {
                                i18 = ((java.lang.Number) entry.getValue()).intValue();
                                hashSet.add(entry.getKey());
                            }
                        }
                        if (hashSet.size() != 1) {
                            java.util.Iterator it6 = eVar2.f5135b.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    a17 = mj4.d.a((mj4.h) eVar2.f5135b.get(0));
                                    break;
                                }
                                mj4.k kVar = (mj4.k) ((mj4.h) it6.next());
                                if (hashSet.contains(kVar.h())) {
                                    a17 = kVar.h();
                                    break;
                                }
                            }
                        } else {
                            java.util.Iterator it7 = hashSet.iterator();
                            kotlin.jvm.internal.o.f(it7, "iterator(...)");
                            a17 = it7.hasNext() ? (java.lang.String) it7.next() : mj4.d.a((mj4.h) eVar2.f5135b.get(0));
                        }
                    } else {
                        a17 = ((mj4.k) hVar).h();
                    }
                    if (a17 == null) {
                        a17 = mj4.d.a((mj4.h) eVar2.f5135b.get(0));
                    }
                } else {
                    a17 = mj4.d.a((mj4.h) eVar2.f5135b.get(0));
                }
                bk4.f.V(bk4.i.a(), imageView2, a17, bi4.d.OUTLINED, bi4.b.FG_0, (mj4.h) eVar2.f5135b.get(0), false, true, 32, null);
            }
            int size2 = eVar2.f5135b.size();
            if (size2 > 0) {
                pj4.o0 a18 = xe0.j0.a((xe0.j0) eVar2.f5135b.get(0), false, 1, null);
                mj4.h M = ai4.m0.f5173a.M(en1.a.a());
                int i19 = kotlin.jvm.internal.o.b(M != null ? ((mj4.k) M).o() : null, ((mj4.k) ((mj4.h) eVar2.f5135b.get(0))).o()) ? size2 == 1 ? 4 : 3 : 2;
                if (bk4.i.a().K()) {
                    long f18 = c01.id.f(((mj4.k) ((mj4.h) eVar2.f5135b.get(0))).f327067b.field_CreateTime) / 3600;
                    string = f18 < 1 ? context3.getResources().getString(com.tencent.mm.R.string.jx8) : context3.getResources().getString(com.tencent.mm.R.string.jx6, java.lang.Long.valueOf(f18));
                } else {
                    string = bk4.i.a().G() ? context3.getResources().getString(com.tencent.mm.R.string.jvq, java.lang.Integer.valueOf(eVar2.f5135b.size())) : bk4.i.a().c(a18, size2, bk4.i.a().m(a18), i19);
                }
                kotlin.jvm.internal.o.d(string);
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.SquareItemConvert", "initStatusTitle: " + string + ", type=" + i19 + ", firstUser=" + ((mj4.k) ((mj4.h) eVar2.f5135b.get(0))).o() + ", itemSize=" + eVar2.f5135b.size() + ", itemHash=" + eVar.hashCode());
                if (string.length() == 0) {
                    if (i19 == 1) {
                        string = context3.getResources().getString(com.tencent.mm.R.string.jvt, java.lang.Integer.valueOf(eVar2.f5135b.size()), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar2.f5135b.get(0), false, 1, null)));
                        kotlin.jvm.internal.o.d(string);
                    } else if (i19 == 3) {
                        string = context3.getResources().getString(com.tencent.mm.R.string.jvu, java.lang.Integer.valueOf(eVar2.f5135b.size() - 1), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar2.f5135b.get(0), false, 1, null)));
                        kotlin.jvm.internal.o.d(string);
                    } else if (i19 != 4) {
                        string = context3.getResources().getString(com.tencent.mm.R.string.jvs, java.lang.Integer.valueOf(eVar2.f5135b.size()), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar2.f5135b.get(0), false, 1, null)));
                        kotlin.jvm.internal.o.d(string);
                    } else {
                        string = context3.getResources().getString(com.tencent.mm.R.string.jvr, bk4.i.a().m(xe0.j0.a((xe0.j0) eVar2.f5135b.get(0), false, 1, null)));
                        kotlin.jvm.internal.o.d(string);
                    }
                }
                textView.setText(string);
            }
        }
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.doo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r23, in5.c r24, int r25, int r26, boolean r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.convert.topic.q.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // com.tencent.mm.plugin.textstatus.convert.topic.a
    public void n(android.content.Context context, nj4.e item) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = item.f337936d.f5134a;
        if (str == null || r26.n0.N(str)) {
            return;
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = (com.tencent.mm.plugin.mvvmlist.MvvmList) this.f173342f.get(str);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.Object obj = this.f173343g.get(str);
        h0Var.f310123d = obj;
        if (obj != null && this.f173253e > 0) {
            int size = ((java.util.List) obj).size();
            int i17 = this.f173253e;
            if (size >= i17 + 1) {
                this.f173356w = true;
                int size2 = ((java.util.List) h0Var.f310123d).size();
                while (i17 < size2) {
                    if (mvvmList != null) {
                        mvvmList.u((xm3.d) ((java.util.List) h0Var.f310123d).get(i17));
                    }
                    i17++;
                }
                java.lang.Object obj2 = h0Var.f310123d;
                java.util.List subList = ((java.util.List) obj2).subList(this.f173253e + 1, ((java.util.List) obj2).size());
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
                java.util.Iterator it = subList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.tencent.mm.plugin.textstatus.convert.topic.d) it.next()).f173265e);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.SquareItemConvert", "[closeArrowClick] otherFriendsList = " + arrayList);
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.textstatus.convert.topic.l lVar = new com.tencent.mm.plugin.textstatus.convert.topic.l(this, mvvmList, item, h0Var, arrayList);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(lVar, 150L, false);
            }
        }
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((java.util.HashMap) ((com.tencent.mm.plugin.textstatus.ui.mg) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.mg.class)).f174107d).put(str, java.lang.Boolean.TRUE);
    }

    public void p(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        if (str == null || r26.n0.N(str)) {
            return;
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = (com.tencent.mm.plugin.mvvmlist.MvvmList) this.f173342f.get(str);
        java.util.List list = (java.util.List) this.f173343g.get(str);
        if (list != null && this.f173253e > 0) {
            int size = list.size();
            int i17 = this.f173253e;
            if (size >= i17 + 1) {
                if (mvvmList != null) {
                    mvvmList.u((xm3.d) list.get(i17));
                }
                java.util.List subList = list.subList(this.f173253e + 1, list.size());
                if (mvvmList != null) {
                    com.tencent.mm.plugin.mvvmlist.MvvmList.p(mvvmList, subList, false, 2, null);
                }
            }
        }
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((java.util.HashMap) ((com.tencent.mm.plugin.textstatus.ui.mg) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.mg.class)).f174107d).put(str, java.lang.Boolean.FALSE);
    }
}
