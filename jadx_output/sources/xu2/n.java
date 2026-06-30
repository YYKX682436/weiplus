package xu2;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f457211a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f457212b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.i33 f457213c;

    /* renamed from: d, reason: collision with root package name */
    public final xu2.v f457214d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f457215e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f457216f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f457217g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f457218h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f457219i;

    /* renamed from: j, reason: collision with root package name */
    public int f457220j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f457221k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.a f457222l;

    public n(android.content.Context context, android.view.ViewGroup root, r45.i33 miniAppAdInfo, xu2.v reporter) {
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
        this.f457211a = context;
        this.f457212b = root;
        this.f457213c = miniAppAdInfo;
        this.f457214d = reporter;
        this.f457215e = "Finder.FinderLiveAdFeedbackWidget";
        this.f457220j = -1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f457221k = arrayList;
        android.content.Context context2 = root.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        android.view.View decorView = ((androidx.appcompat.app.AppCompatActivity) context2).getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488830al4, (android.view.ViewGroup) decorView);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.e0v);
        this.f457216f = viewGroup;
        this.f457219i = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.e0q);
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.e0r);
        this.f457217g = findViewById9;
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.e0s);
        this.f457218h = findViewById10;
        root.findViewById(com.tencent.mm.R.id.f482623jl).setOnClickListener(new xu2.d(this));
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new xu2.e(this));
        }
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(xu2.f.f457203d);
        }
        if (findViewById9 != null && (findViewById8 = findViewById9.findViewById(com.tencent.mm.R.id.lkp)) != null) {
            findViewById8.setOnClickListener(new xu2.g(this));
        }
        if (findViewById9 != null && (findViewById7 = findViewById9.findViewById(com.tencent.mm.R.id.lkt)) != null) {
            findViewById7.setOnClickListener(new xu2.h(this));
        }
        if (findViewById9 != null && (findViewById6 = findViewById9.findViewById(com.tencent.mm.R.id.gdv)) != null) {
            findViewById6.setOnClickListener(new xu2.i(this));
        }
        if (findViewById10 != null) {
            findViewById10.setOnClickListener(xu2.j.f457207d);
        }
        if (findViewById10 != null && (findViewById5 = findViewById10.findViewById(com.tencent.mm.R.id.lkq)) != null) {
            arrayList.add(new jz5.l(findViewById10 != null ? (android.widget.TextView) findViewById10.findViewById(com.tencent.mm.R.id.lkr) : null, findViewById5));
            findViewById5.setOnClickListener(new xu2.k(this));
        }
        if (findViewById10 != null && (findViewById4 = findViewById10.findViewById(com.tencent.mm.R.id.lkl)) != null) {
            arrayList.add(new jz5.l(findViewById10 != null ? (android.widget.TextView) findViewById10.findViewById(com.tencent.mm.R.id.lkm) : null, findViewById4));
            findViewById4.setOnClickListener(new xu2.l(this));
        }
        if (findViewById10 != null && (findViewById3 = findViewById10.findViewById(com.tencent.mm.R.id.lkj)) != null) {
            arrayList.add(new jz5.l(findViewById10 != null ? (android.widget.TextView) findViewById10.findViewById(com.tencent.mm.R.id.lkk) : null, findViewById3));
            findViewById3.setOnClickListener(new xu2.a(this));
        }
        if (findViewById10 != null && (findViewById2 = findViewById10.findViewById(com.tencent.mm.R.id.dz6)) != null) {
            findViewById2.setOnClickListener(new xu2.b(this));
        }
        if (findViewById10 == null || (findViewById = findViewById10.findViewById(com.tencent.mm.R.id.f485056ge0)) == null) {
            return;
        }
        findViewById.setOnClickListener(new xu2.c(this));
    }

    public static final void a(xu2.n nVar, int i17) {
        android.content.Context context;
        nVar.getClass();
        com.tencent.mars.xlog.Log.i(nVar.f457215e, "clickUninterest " + i17);
        java.util.ArrayList arrayList = nVar.f457221k;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            context = nVar.f457211a;
            if (!hasNext) {
                break;
            }
            jz5.l lVar = (jz5.l) it.next();
            android.widget.TextView textView = (android.widget.TextView) lVar.f302833d;
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            }
            android.view.View view = (android.view.View) lVar.f302834e;
            if (view != null) {
                view.setBackgroundResource(com.tencent.mm.R.drawable.f481677zt);
            }
        }
        if (nVar.f457220j == i17) {
            nVar.f457220j = -1;
        } else {
            nVar.f457220j = i17;
            jz5.l lVar2 = (jz5.l) kz5.n0.a0(arrayList, i17);
            if (lVar2 != null) {
                android.widget.TextView textView2 = (android.widget.TextView) lVar2.f302833d;
                if (textView2 != null) {
                    textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
                }
                android.view.View view2 = (android.view.View) lVar2.f302834e;
                if (view2 != null) {
                    view2.setBackgroundResource(com.tencent.mm.R.drawable.f481678zu);
                }
            }
        }
        if (nVar.f457220j >= 0) {
            android.view.View view3 = nVar.f457218h;
            android.view.View findViewById = view3 != null ? view3.findViewById(com.tencent.mm.R.id.dz6) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            android.view.View view4 = findViewById;
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "clickUninterest", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "clickUninterest", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public static final void b(xu2.n nVar) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("goExposeUrl ");
        r45.i33 i33Var = nVar.f457213c;
        sb6.append(i33Var != null ? i33Var.getString(7) : null);
        com.tencent.mars.xlog.Log.i(nVar.f457215e, sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        if (i33Var == null || (str = i33Var.getString(7)) == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        j45.l.j(nVar.f457211a, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void c() {
        android.view.ViewGroup viewGroup = this.f457216f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
