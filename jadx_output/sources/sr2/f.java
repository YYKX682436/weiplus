package sr2;

/* loaded from: classes2.dex */
public final class f extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f411550d;

    /* renamed from: e, reason: collision with root package name */
    public ya2.b2 f411551e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f411552f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f411553g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f411554h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f411555i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer f411556m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f411557n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f411558o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411550d = "";
        this.f411552f = new java.util.ArrayList();
    }

    public final void O6(java.lang.String str, java.lang.String str2) {
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.widget.ImageView imageView = this.f411553g;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("avatarIv");
            throw null;
        }
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
        android.widget.TextView textView = this.f411554h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("nickTv");
            throw null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity context = getContext();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
    }

    public final void P6() {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        ya2.b2 b2Var = this.f411551e;
        if (b2Var != null) {
            r45.xk b17 = ya2.d.b(b2Var, true);
            f0Var = jz5.f0.f302826a;
            if (b17 != null) {
                O6(b17.getString(2), b17.getString(1));
                android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.f483425as3);
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC", "showContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC", "showContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                f0Var2 = f0Var;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                O6(b2Var.field_avatarUrl, b2Var.w0());
                android.view.View findViewById2 = getActivity().findViewById(com.tencent.mm.R.id.f483425as3);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC", "showContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC", "showContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.widget.ImageView imageView = this.f411553g;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("avatarIv");
                throw null;
            }
            imageView.setVisibility(0);
            android.widget.TextView textView = this.f411554h;
            if (textView == null) {
                kotlin.jvm.internal.o.o("nickTv");
                throw null;
            }
            textView.setVisibility(0);
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.widget.ImageView imageView2 = this.f411553g;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("avatarIv");
                throw null;
            }
            imageView2.setVisibility(8);
            android.widget.TextView textView2 = this.f411554h;
            if (textView2 != null) {
                textView2.setVisibility(8);
            } else {
                kotlin.jvm.internal.o.o("nickTv");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        m92.b t37;
        java.lang.String e17 = xy2.c.e(getActivity());
        this.f411550d = e17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            this.f411551e = ya2.h.f460484a.b(this.f411550d);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("key_finder_post_can_switch_account", false);
        java.util.ArrayList arrayList = this.f411552f;
        if (booleanExtra) {
            g92.b bVar = g92.b.f269769e;
            m92.b j37 = g92.a.j3(bVar, this.f411550d, false, 2, null);
            if (j37 != null) {
                arrayList.add(j37);
            } else {
                if (this.f411550d.length() > 0) {
                    m92.b bVar2 = new m92.b(this.f411550d);
                    ya2.b2 b17 = ya2.h.f460484a.b(this.f411550d);
                    if (b17 != null) {
                        bVar2.field_avatarUrl = b17.getAvatarUrl();
                        bVar2.field_nickname = b17.w0();
                    }
                    arrayList.add(bVar2);
                }
            }
            if (j37 == null && (t37 = g92.a.t3(bVar, false, 1, null)) != null) {
                arrayList.add(t37);
            }
            com.tencent.mars.xlog.Log.i("FinderPostAccountUIC", "[initData] curUserName:" + this.f411550d + " account.size:" + arrayList.size());
        }
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.f486356l00);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f411553g = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = getActivity().findViewById(com.tencent.mm.R.id.l0t);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f411554h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = getActivity().findViewById(com.tencent.mm.R.id.l1r);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f411555i = (android.widget.LinearLayout) findViewById3;
        P6();
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.widget.LinearLayout linearLayout = this.f411555i;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("switchLayout");
            throw null;
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        com.tencent.mm.plugin.finder.report.d2.m(d2Var, linearLayout, "switch_account", 0, 0, kz5.b1.e(new jz5.l("enter_scene", finderFeedReportObject != null ? java.lang.Integer.valueOf(finderFeedReportObject.getEnterScene()) : null)), null, 44, null);
        if (arrayList.size() >= 2) {
            android.widget.LinearLayout linearLayout2 = this.f411555i;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("switchLayout");
                throw null;
            }
            linearLayout2.setVisibility(0);
            android.widget.LinearLayout linearLayout3 = this.f411555i;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.o.o("switchLayout");
                throw null;
            }
            linearLayout3.setOnClickListener(new sr2.e(this));
        } else {
            android.widget.LinearLayout linearLayout4 = this.f411555i;
            if (linearLayout4 == null) {
                kotlin.jvm.internal.o.o("switchLayout");
                throw null;
            }
            linearLayout4.setVisibility(8);
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
            android.view.View findViewById4 = getActivity().findViewById(com.tencent.mm.R.id.ur8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById4, arrayList2.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById4, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
