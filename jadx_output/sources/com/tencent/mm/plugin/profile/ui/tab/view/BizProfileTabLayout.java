package com.tencent.mm.plugin.profile.ui.tab.view;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Las3/l0;", "getVisibleTabs", "Lkotlin/Function1;", "Las3/m0;", "Ljz5/f0;", "w", "Lyz5/l;", "getOnTabSelected", "()Lyz5/l;", "setOnTabSelected", "(Lyz5/l;)V", "onTabSelected", "", "getTabCount", "()I", "tabCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizProfileTabLayout extends androidx.constraintlayout.widget.ConstraintLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.List f154652x = kz5.c0.i(0, 1, 2, 3, 4, 5);

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f154653v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public yz5.l onTabSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizProfileTabLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f154653v = new java.util.ArrayList();
        B();
    }

    private final java.util.List<as3.l0> getVisibleTabs() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.f154653v) {
            if (((as3.l0) obj).f13526c.getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int A(as3.m0 tabType) {
        kotlin.jvm.internal.o.g(tabType, "tabType");
        java.util.Iterator<as3.l0> it = getVisibleTabs().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (it.next().f13524a == tabType) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    public final void B() {
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.a1p, (android.view.ViewGroup) this, true);
        java.util.ArrayList<as3.l0> arrayList = (java.util.ArrayList) this.f154653v;
        arrayList.clear();
        as3.m0 m0Var = as3.m0.f13530d;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.anc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ane);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        arrayList.add(new as3.l0(m0Var, textView, (android.view.ViewGroup) findViewById2, findViewById(com.tencent.mm.R.id.and), new as3.t(this)));
        as3.m0 m0Var2 = as3.m0.f13534h;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.sjr);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.sjt);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        arrayList.add(new as3.l0(m0Var2, textView2, (android.view.ViewGroup) findViewById4, findViewById(com.tencent.mm.R.id.sjs), new as3.u(this)));
        as3.m0 m0Var3 = as3.m0.f13535i;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.sjo);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.sjq);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        arrayList.add(new as3.l0(m0Var3, textView3, (android.view.ViewGroup) findViewById6, findViewById(com.tencent.mm.R.id.sjp), new as3.v(this)));
        as3.m0 m0Var4 = as3.m0.f13532f;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.an7);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.an9);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        arrayList.add(new as3.l0(m0Var4, textView4, (android.view.ViewGroup) findViewById8, findViewById(com.tencent.mm.R.id.an8), new as3.w(this)));
        as3.m0 m0Var5 = as3.m0.f13531e;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.anl);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.ann);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        arrayList.add(new as3.l0(m0Var5, textView5, (android.view.ViewGroup) findViewById10, findViewById(com.tencent.mm.R.id.anm), new as3.x(this)));
        as3.m0 m0Var6 = as3.m0.f13533g;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.anf);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        android.widget.TextView textView6 = (android.widget.TextView) findViewById11;
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.ani);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        arrayList.add(new as3.l0(m0Var6, textView6, (android.view.ViewGroup) findViewById12, null, new as3.y(this)));
        for (as3.l0 l0Var : arrayList) {
            l0Var.f13526c.setVisibility(8);
            android.view.ViewGroup viewGroup = l0Var.f13526c;
            com.tencent.mm.ui.tools.d8.a(viewGroup);
            viewGroup.setOnClickListener(new as3.z(this, l0Var));
        }
    }

    public final void C(int i17) {
        java.util.List<as3.l0> visibleTabs = getVisibleTabs();
        boolean z17 = false;
        if (i17 >= 0 && i17 < visibleTabs.size()) {
            z17 = true;
        }
        if (z17) {
            D(visibleTabs.get(i17).f13524a);
            return;
        }
        com.tencent.mars.xlog.Log.w("BizProfileTabLayout", "bobkw selectIndex: index=" + i17 + " out of range, visibleTabs.size=" + visibleTabs.size());
    }

    public final void D(as3.m0 tabType) {
        android.text.TextPaint paint;
        kotlin.jvm.internal.o.g(tabType, "tabType");
        if (tabType == as3.m0.f13533g) {
            return;
        }
        for (as3.l0 l0Var : getVisibleTabs()) {
            boolean z17 = l0Var.f13524a == tabType;
            android.view.View view = l0Var.f13527d;
            if (view != null) {
                int i17 = z17 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout", "selectTab", "(Lcom/tencent/mm/plugin/profile/ui/tab/view/TabType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout", "selectTab", "(Lcom/tencent/mm/plugin/profile/ui/tab/view/TabType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            int color = getContext().getResources().getColor(z17 ? com.tencent.mm.R.color.a0c : com.tencent.mm.R.color.f478872ji);
            android.widget.TextView textView = l0Var.f13525b;
            textView.setTextColor(color);
            if (z17) {
                android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
                if (paint2 != null) {
                    paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                }
                paint = textView != null ? textView.getPaint() : null;
                if (paint != null) {
                    paint.setStrokeWidth(0.8f);
                }
            } else {
                android.text.TextPaint paint3 = textView != null ? textView.getPaint() : null;
                if (paint3 != null) {
                    paint3.setStyle(android.graphics.Paint.Style.FILL);
                }
                paint = textView != null ? textView.getPaint() : null;
                if (paint != null) {
                    paint.setStrokeWidth(0.0f);
                }
            }
        }
    }

    public final void E(as3.m0 tabType, java.lang.String text) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(tabType, "tabType");
        kotlin.jvm.internal.o.g(text, "text");
        java.util.Iterator it = this.f154653v.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((as3.l0) obj).f13524a == tabType) {
                    break;
                }
            }
        }
        as3.l0 l0Var = (as3.l0) obj;
        android.widget.TextView textView = l0Var != null ? l0Var.f13525b : null;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public final void F(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29) {
        boolean z37;
        java.util.Iterator it = ((java.util.ArrayList) this.f154653v).iterator();
        while (true) {
            if (!it.hasNext()) {
                java.util.List<as3.l0> visibleTabs = getVisibleTabs();
                boolean z38 = visibleTabs.size() == 1;
                java.util.Iterator<T> it6 = visibleTabs.iterator();
                while (it6.hasNext()) {
                    ((as3.l0) it6.next()).f13525b.setVisibility(z38 ? 8 : 0);
                }
                return;
            }
            as3.l0 l0Var = (as3.l0) it.next();
            int ordinal = l0Var.f13524a.ordinal();
            if (ordinal == 0) {
                z37 = z17;
            } else if (ordinal == 1) {
                z37 = z18;
            } else if (ordinal == 2) {
                z37 = z19;
            } else if (ordinal == 3) {
                z37 = z27;
            } else if (ordinal == 4) {
                z37 = z28;
            } else {
                if (ordinal != 5) {
                    throw new jz5.j();
                }
                z37 = z29;
            }
            android.view.ViewGroup viewGroup = l0Var.f13526c;
            int visibility = viewGroup.getVisibility();
            int i17 = z37 ? 0 : 8;
            if (visibility != i17) {
                viewGroup.setVisibility(i17);
            }
            if (l0Var.f13524a == as3.m0.f13534h) {
                ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
                l0Var.f13525b.setText(com.tencent.wechat.iam.biz.t1.f217792c.d() ? getContext().getString(com.tencent.mm.R.string.noo) : getContext().getString(com.tencent.mm.R.string.nno));
            }
        }
    }

    public final yz5.l getOnTabSelected() {
        return this.onTabSelected;
    }

    public final int getTabCount() {
        java.util.List list = this.f154653v;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if ((((as3.l0) it.next()).f13526c.getVisibility() == 0) && (i17 = i17 + 1) < 0) {
                kz5.c0.o();
                throw null;
            }
        }
        return i17;
    }

    public final void setOnTabSelected(yz5.l lVar) {
        this.onTabSelected = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizProfileTabLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f154653v = new java.util.ArrayList();
        B();
    }
}
