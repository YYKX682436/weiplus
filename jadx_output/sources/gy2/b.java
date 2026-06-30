package gy2;

/* loaded from: classes2.dex */
public class b extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f277542l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f277543m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f277544n;

    /* renamed from: o, reason: collision with root package name */
    public r45.f03 f277545o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f277546p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f277547q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f277548r;

    public b(int i17, int i18) {
        super(i17);
        this.f277546p = jz5.h.b(new gy2.a(this));
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.tencent.mm.R.layout.b3z;
    }

    @Override // zx2.i
    public int[] b() {
        return new int[]{0, 0};
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        android.content.Context context;
        if (viewGroup != null) {
            this.f477052j = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.nuw);
            this.f277542l = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.nuu);
            this.f277543m = viewGroup.findViewById(com.tencent.mm.R.id.kd7);
            this.f277548r = viewGroup.findViewById(com.tencent.mm.R.id.g3w);
            android.widget.TextView textView = this.f477052j;
            if (textView != null) {
                textView.setTextSize(1, 15.0f);
            }
            android.widget.TextView textView2 = this.f277542l;
            if (textView2 != null) {
                textView2.setTextSize(1, 12.0f);
            }
        }
        if (viewGroup != null) {
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            viewGroup.setContentDescription(i(context2));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTabInflated lastTabIndex:");
        jz5.g gVar = this.f277546p;
        sb6.append(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
        sb6.append(" index:");
        sb6.append(this.f477040a);
        com.tencent.mars.xlog.Log.i("Finder.FinderTab", sb6.toString());
        if (viewGroup != null && (context = viewGroup.getContext()) != null && ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() != this.f477040a) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.String w76 = ((com.tencent.mm.plugin.finder.viewmodel.component.fp) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).w7(this.f477040a);
            this.f277544n = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), w76, p(), false, false, 12, null);
            this.f277545o = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0(w76, p());
        }
        this.f277547q = viewGroup;
        if (viewGroup != null) {
            java.lang.Object parent = viewGroup.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
            this.f477030k = (android.view.View) parent;
            viewGroup.setTag(this);
        }
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        android.text.TextPaint paint;
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.d(z17, tabView);
        android.widget.TextView textView = this.f477052j;
        if (textView == null || (paint = textView.getPaint()) == null) {
            return;
        }
        if (z17) {
            com.tencent.mm.ui.bk.r0(paint, 0.8f);
        } else {
            com.tencent.mm.ui.bk.t0(paint);
        }
    }

    @Override // zx2.k, zx2.i
    public void e(boolean z17) {
        int i17 = z17 ? com.tencent.mm.R.color.a0c : com.tencent.mm.R.color.f478873jj;
        int i18 = z17 ? com.tencent.mm.R.raw.icons_filled_channels_like_bold : com.tencent.mm.R.raw.icons_filled_channels_like_thick;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.CharSequence i19 = i(context);
        int dimension = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.lang.CharSequence k17 = hc2.x0.k(i19, context2, '#', i18, i17, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        android.widget.TextView textView = this.f477052j;
        if (textView != null) {
            textView.setText(k17);
            k(z17);
            j(z17);
        }
    }

    @Override // zx2.k
    public void f(android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.f(tabView);
        if (tabView.getContext() instanceof com.tencent.mm.ui.MMActivity) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f277544n;
            r45.f03 f03Var = this.f277545o;
            android.content.Context context = tabView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
            if (jbVar == null || f03Var == null) {
                return;
            }
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "5", jbVar, f03Var, 3, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
        }
    }

    @Override // zx2.k
    public void g(android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.g(tabView);
        com.tencent.mars.xlog.Log.i("Finder.FinderTab", "onTabUnSelected real");
        r("", true);
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        android.content.Context context = tabView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        nk6.N(((com.tencent.mm.plugin.finder.viewmodel.component.fp) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).w7(this.f477040a));
    }

    @Override // zx2.k
    public int h() {
        return ((java.lang.Number) ((jz5.n) this.f277546p).getValue()).intValue();
    }

    @Override // zx2.c
    public android.view.View l() {
        return this.f477052j;
    }

    @Override // zx2.c
    public android.view.View m() {
        return this.f277548r;
    }

    @Override // zx2.c
    public android.view.View o() {
        return this.f277547q;
    }

    public final java.lang.String p() {
        android.content.Context context;
        android.view.View view = this.f277547q;
        if (view == null || (context = view.getContext()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        return xy2.c.e(context);
    }

    public final void q(java.lang.String str, boolean z17, boolean z18) {
        if (z18) {
            android.widget.TextView textView = this.f277542l;
            if (textView != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    textView.setVisibility(4);
                    textView.setText("");
                } else {
                    textView.setVisibility(0);
                    textView.setText(str);
                }
            }
            android.view.View view = this.f277543m;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.TextView textView2 = this.f277542l;
        if (textView2 != null) {
            textView2.setVisibility(4);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || z17) {
            android.view.View view2 = this.f277543m;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f277543m;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void r(java.lang.String str, boolean z17) {
        android.widget.TextView textView = this.f277542l;
        if (!((textView != null ? textView.getContext() : null) instanceof com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI)) {
            android.widget.TextView textView2 = this.f277542l;
            if (textView2 != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    textView2.setVisibility(4);
                    textView2.setText("");
                    return;
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(str);
                    return;
                }
            }
            return;
        }
        android.widget.TextView textView3 = this.f277542l;
        if (textView3 != null) {
            int i17 = this.f477051i;
            if (i17 == com.tencent.mm.R.string.erx) {
                ya2.g gVar = ya2.h.f460484a;
                android.content.Context context = textView3.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                q(str, z17, hc2.s.d(gVar.b(xy2.c.e(context)), 1L));
                return;
            }
            if (i17 == com.tencent.mm.R.string.erv) {
                ya2.g gVar2 = ya2.h.f460484a;
                android.content.Context context2 = textView3.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                q(str, z17, hc2.s.d(gVar2.b(xy2.c.e(context2)), 2L));
                return;
            }
            if (i17 == com.tencent.mm.R.string.erw) {
                ya2.g gVar3 = ya2.h.f460484a;
                android.content.Context context3 = textView3.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                q(str, z17, hc2.s.d(gVar3.b(xy2.c.e(context3)), 4L));
            }
        }
    }
}
