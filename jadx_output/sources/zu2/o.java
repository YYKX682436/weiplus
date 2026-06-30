package zu2;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f475720a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f475721b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.i33 f475722c;

    /* renamed from: d, reason: collision with root package name */
    public final zu2.q f475723d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f475724e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f475725f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f475726g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f475727h;

    /* renamed from: i, reason: collision with root package name */
    public int f475728i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f475729j;

    public o(android.app.Activity context, android.view.View root, r45.i33 miniAppAdInfo, zu2.q reporter) {
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View findViewById3;
        android.view.View findViewById4;
        android.view.View findViewById5;
        android.view.View findViewById6;
        android.view.View findViewById7;
        android.view.View findViewById8;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(miniAppAdInfo, "miniAppAdInfo");
        kotlin.jvm.internal.o.g(reporter, "reporter");
        this.f475720a = context;
        this.f475721b = root;
        this.f475722c = miniAppAdInfo;
        this.f475723d = reporter;
        this.f475724e = "Finder.WxaAdUIC";
        this.f475728i = -1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f475729j = arrayList;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.e0v);
        this.f475725f = viewGroup;
        android.view.View findViewById9 = viewGroup != null ? viewGroup.findViewById(com.tencent.mm.R.id.e0r) : null;
        this.f475726g = findViewById9;
        android.view.View findViewById10 = viewGroup != null ? viewGroup.findViewById(com.tencent.mm.R.id.e0s) : null;
        this.f475727h = findViewById10;
        root.findViewById(com.tencent.mm.R.id.f482623jl).setOnClickListener(new zu2.f(this));
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new zu2.g(this));
        }
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(zu2.h.f475713d);
        }
        if (findViewById9 != null && (findViewById8 = findViewById9.findViewById(com.tencent.mm.R.id.lkp)) != null) {
            findViewById8.setOnClickListener(new zu2.i(this));
        }
        if (findViewById9 != null && (findViewById7 = findViewById9.findViewById(com.tencent.mm.R.id.lkt)) != null) {
            findViewById7.setOnClickListener(new zu2.j(this));
        }
        if (findViewById9 != null && (findViewById6 = findViewById9.findViewById(com.tencent.mm.R.id.gdv)) != null) {
            findViewById6.setOnClickListener(new zu2.k(this));
        }
        android.widget.TextView textView = findViewById9 != null ? (android.widget.TextView) findViewById9.findViewById(com.tencent.mm.R.id.f482658kg) : null;
        if (textView != null) {
            textView.setText(!com.tencent.mm.sdk.platformtools.t8.K0(miniAppAdInfo.getString(9)) ? miniAppAdInfo.getString(9) : context.getResources().getText(com.tencent.mm.R.string.ckb));
        }
        if (findViewById10 != null) {
            findViewById10.setOnClickListener(zu2.l.f475717d);
        }
        if (findViewById10 != null && (findViewById5 = findViewById10.findViewById(com.tencent.mm.R.id.lkq)) != null) {
            arrayList.add(new jz5.l(findViewById10 != null ? (android.widget.TextView) findViewById10.findViewById(com.tencent.mm.R.id.lkr) : null, findViewById5));
            findViewById5.setOnClickListener(new zu2.m(this));
        }
        if (findViewById10 != null && (findViewById4 = findViewById10.findViewById(com.tencent.mm.R.id.lkl)) != null) {
            arrayList.add(new jz5.l(findViewById10 != null ? (android.widget.TextView) findViewById10.findViewById(com.tencent.mm.R.id.lkm) : null, findViewById4));
            findViewById4.setOnClickListener(new zu2.n(this));
        }
        if (findViewById10 != null && (findViewById3 = findViewById10.findViewById(com.tencent.mm.R.id.lkj)) != null) {
            arrayList.add(new jz5.l(findViewById10 != null ? (android.widget.TextView) findViewById10.findViewById(com.tencent.mm.R.id.lkk) : null, findViewById3));
            findViewById3.setOnClickListener(new zu2.c(this));
        }
        if (findViewById10 != null && (findViewById2 = findViewById10.findViewById(com.tencent.mm.R.id.dz6)) != null) {
            findViewById2.setOnClickListener(new zu2.d(this));
        }
        if (findViewById10 == null || (findViewById = findViewById10.findViewById(com.tencent.mm.R.id.f485056ge0)) == null) {
            return;
        }
        findViewById.setOnClickListener(new zu2.e(this));
    }

    public static final void a(zu2.o oVar, int i17) {
        android.app.Activity activity;
        oVar.getClass();
        com.tencent.mars.xlog.Log.i(oVar.f475724e, "clickUninterest " + i17);
        java.util.ArrayList arrayList = oVar.f475729j;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            activity = oVar.f475720a;
            if (!hasNext) {
                break;
            }
            jz5.l lVar = (jz5.l) it.next();
            android.widget.TextView textView = (android.widget.TextView) lVar.f302833d;
            if (textView != null) {
                textView.setTextColor(activity.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            }
            android.view.View view = (android.view.View) lVar.f302834e;
            if (view != null) {
                view.setBackgroundResource(com.tencent.mm.R.drawable.f481528vn);
            }
        }
        if (oVar.f475728i == i17) {
            oVar.f475728i = -1;
        } else {
            oVar.f475728i = i17;
            jz5.l lVar2 = (jz5.l) kz5.n0.a0(arrayList, i17);
            if (lVar2 != null) {
                android.widget.TextView textView2 = (android.widget.TextView) lVar2.f302833d;
                if (textView2 != null) {
                    textView2.setTextColor(activity.getResources().getColor(com.tencent.mm.R.color.f478502m));
                }
                android.view.View view2 = (android.view.View) lVar2.f302834e;
                if (view2 != null) {
                    view2.setBackgroundResource(com.tencent.mm.R.drawable.f481529vo);
                }
            }
        }
        if (oVar.f475728i >= 0) {
            android.view.View view3 = oVar.f475727h;
            android.view.View findViewById = view3 != null ? view3.findViewById(com.tencent.mm.R.id.dz6) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            android.view.View view4 = findViewById;
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "clickUninterest", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "clickUninterest", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public static final void b(zu2.o oVar) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("goExposeUrl ");
        r45.i33 i33Var = oVar.f475722c;
        sb6.append(i33Var != null ? i33Var.getString(7) : null);
        com.tencent.mars.xlog.Log.i(oVar.f475724e, sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        if (i33Var == null || (str = i33Var.getString(7)) == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        j45.l.j(oVar.f475720a, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void c() {
        android.view.ViewGroup viewGroup = this.f475725f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
