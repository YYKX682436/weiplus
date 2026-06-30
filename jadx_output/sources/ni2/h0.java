package ni2;

/* loaded from: classes10.dex */
public class h0 implements android.view.View.OnClickListener {
    public xh2.c A;
    public final bj2.b B;
    public int C;
    public final jz5.g D;
    public final aj2.f E;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f337305d;

    /* renamed from: e, reason: collision with root package name */
    public final zh2.c f337306e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f337307f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f337308g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f337309h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f337310i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f337311m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f337312n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f337313o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f337314p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f337315q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMSwitchBtn f337316r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f337317s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f337318t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f337319u;

    /* renamed from: v, reason: collision with root package name */
    public int f337320v;

    /* renamed from: w, reason: collision with root package name */
    public int f337321w;

    /* renamed from: x, reason: collision with root package name */
    public int f337322x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f337323y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Integer f337324z;

    public h0(android.view.View rootView, zh2.c pluginAbility, yz5.p notifyViewClick) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(notifyViewClick, "notifyViewClick");
        this.f337305d = rootView;
        this.f337306e = pluginAbility;
        this.f337307f = notifyViewClick;
        android.content.Context context = rootView.getContext();
        this.f337308g = context;
        this.f337309h = rootView.findViewById(com.tencent.mm.R.id.f486328kx0);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.juw);
        this.f337310i = findViewById;
        this.f337311m = rootView.findViewById(com.tencent.mm.R.id.jux);
        this.f337312n = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.juz);
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.jiy);
        this.f337313o = findViewById2;
        this.f337314p = rootView.findViewById(com.tencent.mm.R.id.jiz);
        this.f337315q = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f485918jj1);
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.fam);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.view.ratio.RatioLayout ratioLayout = (com.tencent.mm.view.ratio.RatioLayout) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.g_q);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById4;
        this.f337316r = mMSwitchBtn;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) rootView.findViewById(com.tencent.mm.R.id.f484725fa1);
        this.f337317s = recyclerView;
        java.lang.String str = ((mm2.e1) pluginAbility.g().a(mm2.e1.class)).f328987q.f380301n;
        str = str == null ? "" : str;
        this.f337318t = str;
        this.f337319u = str;
        this.f337320v = 1;
        this.f337321w = 1;
        this.f337322x = 1;
        jz5.g b17 = jz5.h.b(new ni2.g0(this));
        this.D = b17;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        kotlin.jvm.internal.o.f(context, "context");
        this.B = new bj2.b(context, pluginAbility, ratioLayout);
        aj2.f fVar = new aj2.f((java.util.ArrayList) ((jz5.n) b17).getValue(), str, new ni2.e0(this));
        this.E = fVar;
        recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget$2(context));
        recyclerView.setAdapter(fVar);
        mMSwitchBtn.setSwitchListener(new ni2.f0(this));
    }

    public final java.util.LinkedList a() {
        android.view.View view = this.f337311m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f337314p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f337317s.setVisibility(0);
        xh2.c cVar = this.A;
        if (cVar == null) {
            return null;
        }
        java.lang.String str = this.f337319u;
        return this.B.b(4, cVar.f454531a, str);
    }

    public final void b(boolean z17) {
        android.view.View view = this.f337311m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f337314p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f337317s.setVisibility(8);
        if (!z17) {
            this.f337319u = this.f337318t;
        }
        xh2.c cVar = this.A;
        if (cVar != null) {
            int i17 = bj2.b.f21141h;
            this.B.b(3, cVar.f454531a, "");
        }
    }

    public final java.util.LinkedList c() {
        android.view.View view = this.f337311m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f337314p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f337317s.setVisibility(0);
        xh2.c cVar = this.A;
        if (cVar == null) {
            return null;
        }
        java.lang.String str = this.f337319u;
        return this.B.b(2, cVar.f454531a, str);
    }

    public final void d(boolean z17) {
        android.view.View view = this.f337311m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f337314p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f337317s.setVisibility(8);
        if (!z17) {
            this.f337319u = this.f337318t;
        }
        xh2.c cVar = this.A;
        if (cVar != null) {
            int i17 = bj2.b.f21141h;
            this.B.b(1, cVar.f454531a, "");
        }
    }

    public final void e(boolean z17) {
        int i17;
        int i18 = this.C;
        int i19 = this.f337321w;
        if (i19 == 3) {
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            i17 = (i18 & (-65)) | 32;
        } else if (i19 != 4) {
            java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            i17 = i18 & (-33) & (-65);
        } else {
            java.util.regex.Pattern pattern3 = pm0.v.f356802a;
            i17 = (i18 & (-33)) | 64;
        }
        this.f337307f.invoke(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
    }

    public final boolean f() {
        if (!((mm2.y2) this.f337306e.g().a(mm2.y2.class)).Y6()) {
            return true;
        }
        android.content.Context context = this.f337308g;
        db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.d8j));
        return false;
    }

    public final void g(java.util.ArrayList arrayList) {
        jz5.g gVar = this.D;
        ((java.util.ArrayList) ((jz5.n) gVar).getValue()).clear();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            km2.q qVar = (km2.q) it.next();
            arrayList3.add(new aj2.a(qVar, kotlin.jvm.internal.o.b(qVar.f309170a, this.f337319u), false, false, 12, null));
        }
        arrayList2.addAll(arrayList3);
        ((java.util.ArrayList) ((jz5.n) gVar).getValue()).add(0, new aj2.a(new km2.q(this.f337318t, null, null, null, 0, null, null, false, 0, null, null, 0, 0, false, null, false, 0L, null, false, null, null, 0, 0, 0L, null, null, 0L, null, 0, 0L, null, null, null, -64, 1, null), kotlin.jvm.internal.o.b(this.f337318t, this.f337319u), false, false, 12, null));
        aj2.f fVar = this.E;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("focusSelectAdapter");
            throw null;
        }
    }

    public final void h() {
        this.f337323y = null;
        this.f337324z = null;
        bj2.b bVar = this.B;
        if (bVar != null) {
            com.tencent.mm.view.ratio.RatioLayout ratioLayout = bVar.f21143b;
            int childCount = ratioLayout.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = ratioLayout.getChildAt(i17);
                if (childAt != null && (childAt instanceof cj2.h)) {
                    ((cj2.h) childAt).c();
                }
            }
        }
    }

    public final boolean i() {
        if (!f()) {
            return false;
        }
        bj2.b bVar = this.B;
        java.util.LinkedList linkedList = bVar.f21147f;
        if (linkedList != null) {
            java.util.LinkedList linkedList2 = ((mm2.y2) bVar.f21142a.g().a(mm2.y2.class)).f329559i;
            linkedList2.clear();
            linkedList2.addAll(linkedList);
        }
        fj2.s.c(fj2.s.f263183a, ml2.q2.f327837x, java.lang.String.valueOf(this.f337322x), this.f337316r.f211363x ? "1" : "2", 0, 0, 24, null);
        return true;
    }

    public final void j(r45.il4 micSetting, xh2.c micData, int i17) {
        kotlin.jvm.internal.o.g(micSetting, "micSetting");
        kotlin.jvm.internal.o.g(micData, "micData");
        this.C = i17;
        this.A = micData.a();
        xh2.a aVar = (xh2.a) kz5.n0.Z(micData.f454531a);
        this.f337319u = aVar != null ? aVar.b() : this.f337318t;
        int i18 = micData.f454533c;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f337316r;
        int i19 = 2;
        boolean z17 = true;
        if (i18 != 1) {
            int i27 = 3;
            if (i18 == 2) {
                b(true);
                this.f337322x = 2;
                mMSwitchBtn.setCheck(false);
            } else if (i18 != 3) {
                d(true);
                this.f337322x = 1;
                mMSwitchBtn.setCheck(false);
                i19 = 1;
            } else {
                i27 = 4;
                l(4, a());
                this.f337322x = 2;
                mMSwitchBtn.setCheck(true);
            }
            i19 = i27;
        } else {
            l(2, c());
            mMSwitchBtn.setCheck(true);
            this.f337322x = 1;
        }
        this.f337320v = i19;
        this.f337321w = i19;
        zh2.c cVar = this.f337306e;
        k(cVar.g());
        r45.kl4 kl4Var = ((mm2.y2) cVar.g().a(mm2.y2.class)).f329562o;
        java.lang.String string = kl4Var != null ? kl4Var.getString(0) : null;
        boolean z18 = string == null || string.length() == 0;
        android.content.Context context = this.f337308g;
        if (z18) {
            string = context.getResources().getString(com.tencent.mm.R.string.dvj);
        }
        android.widget.TextView textView = this.f337312n;
        if (textView != null) {
            textView.setText(string);
        }
        r45.kl4 kl4Var2 = ((mm2.y2) cVar.g().a(mm2.y2.class)).f329562o;
        java.lang.String string2 = kl4Var2 != null ? kl4Var2.getString(1) : null;
        if (string2 != null && string2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            string2 = context.getResources().getString(com.tencent.mm.R.string.f491669dv2);
        }
        android.widget.TextView textView2 = this.f337315q;
        if (textView2 != null) {
            textView2.setText(string2);
        }
        e(false);
    }

    public final void k(gk2.e buContext) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        int i17 = this.f337321w;
        if (i17 == 4 || i17 == 2) {
            java.util.List list = ((mm2.o4) buContext.a(mm2.o4.class)).f329318o;
            kotlin.jvm.internal.o.f(list, "<get-linkMicUserList>(...)");
            synchronized (list) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (!((km2.q) obj).f309177h) {
                        arrayList.add(obj);
                    }
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = ((km2.q) next).f309181l;
                if (i18 == 3 || i18 == 4) {
                    arrayList2.add(next);
                }
            }
            g(arrayList2);
            this.f337317s.setVisibility(0);
        }
    }

    public final void l(int i17, java.util.LinkedList linkedList) {
        if (this.f337323y == null) {
            this.f337323y = linkedList;
        }
        if (this.f337324z == null) {
            this.f337324z = java.lang.Integer.valueOf(i17);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.View view2 = this.f337313o;
        boolean b17 = kotlin.jvm.internal.o.b(valueOf, view2 != null ? java.lang.Integer.valueOf(view2.getId()) : null);
        int i17 = 2;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f337316r;
        if (!b17) {
            if (this.f337322x != 1) {
                mMSwitchBtn.setCheck(false);
            }
            this.f337322x = 1;
            if (mMSwitchBtn.f211363x) {
                c();
            } else {
                d(false);
                i17 = 1;
            }
        } else {
            if (!f()) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (this.f337322x != 2) {
                mMSwitchBtn.setCheck(false);
            }
            this.f337322x = 2;
            if (mMSwitchBtn.f211363x) {
                i17 = 4;
                l(4, a());
            } else {
                b(false);
                i17 = 3;
            }
        }
        this.f337321w = i17;
        k(this.f337306e.g());
        e(this.f337321w != this.f337320v);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
