package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class x60 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f136404a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f136405b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f136406c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.k60 f136407d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.j60 f136408e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f136409f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f136410g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f136411h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f136412i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f136413j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f136414k;

    public x60(androidx.appcompat.app.AppCompatActivity activity, android.content.Context context) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(context, "context");
        this.f136404a = activity;
        this.f136405b = context;
        this.f136407d = com.tencent.mm.plugin.finder.viewmodel.component.k60.f134924d;
        this.f136409f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.w60(this));
        this.f136410g = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.m60(this));
        this.f136411h = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.t60(this));
        this.f136412i = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.s60(this));
        this.f136413j = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.r60(this));
        this.f136414k = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.q60(this));
    }

    public static void c(com.tencent.mm.plugin.finder.viewmodel.component.x60 x60Var, boolean z17, boolean z18, float f17, int i17, java.lang.Object obj) {
        yz5.a aVar;
        int height;
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        if ((i17 & 4) != 0) {
            f17 = 0.0f;
        }
        x60Var.getClass();
        com.tencent.mars.xlog.Log.i("SpeedSelectorPanelVM", "hidePanel needAnim: " + z17 + ", reShowHideView: " + z18 + ", selectedSpeed: " + f17);
        java.util.List list = x60Var.f136406c;
        if (list == null) {
            return;
        }
        x60Var.a(list, false, z18, z17);
        android.view.View findViewById = x60Var.b().findViewById(com.tencent.mm.R.id.f486330kx2);
        if (findViewById != null) {
            if (z17) {
                int ordinal = x60Var.f136407d.ordinal();
                if (ordinal == 0) {
                    height = findViewById.getHeight();
                } else {
                    if (ordinal != 1) {
                        throw new jz5.j();
                    }
                    height = 0;
                }
                findViewById.animate().translationY(height).translationX(x60Var.f136407d == com.tencent.mm.plugin.finder.viewmodel.component.k60.f134925e ? findViewById.getWidth() : 0).setDuration(300L).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.p60(x60Var, findViewById)).start();
            } else {
                android.view.View decorView = x60Var.f136404a.getWindow().getDecorView();
                android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
                if (viewGroup != null) {
                    viewGroup.removeView(x60Var.b());
                }
            }
        }
        com.tencent.mm.plugin.finder.viewmodel.component.j60 j60Var = x60Var.f136408e;
        if (j60Var != null && (aVar = j60Var.f134821e) != null) {
            aVar.invoke();
        }
        x60Var.f136406c = null;
        x60Var.f136407d = com.tencent.mm.plugin.finder.viewmodel.component.k60.f134924d;
        x60Var.f136408e = null;
    }

    public final void a(java.util.List list, boolean z17, boolean z18, boolean z19) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if (z17) {
                view.animate().alpha(0.0f).setDuration(300L).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.n60(view)).start();
            } else {
                if (z18) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedSelectorPanelViewModel", "animateHiddenViews", "(Ljava/util/List;ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedSelectorPanelViewModel", "animateHiddenViews", "(Ljava/util/List;ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (z19) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedSelectorPanelViewModel", "animateHiddenViews", "(Ljava/util/List;ZZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedSelectorPanelViewModel", "animateHiddenViews", "(Ljava/util/List;ZZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.animate().alpha(1.0f).setDuration(300L).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.o60(view)).start();
                }
            }
        }
    }

    public final android.view.View b() {
        return (android.view.View) ((jz5.n) this.f136409f).getValue();
    }
}
