package ej2;

/* loaded from: classes10.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f253298a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f253299b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f253300c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f253301d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f253302e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f253303f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f253304g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f253305h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f253306i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f253307j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f253308k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f253309l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f253310m;

    /* renamed from: n, reason: collision with root package name */
    public yh2.k f253311n;

    public j(android.view.View root, gk2.e liveData) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f253298a = root;
        this.f253299b = liveData;
        this.f253300c = "FinderLiveVisitorApplySearchWidget";
        new java.util.HashMap();
        this.f253309l = new java.util.ArrayList();
        this.f253310m = new java.util.ArrayList();
        ej2.n nVar = (ej2.n) this;
        android.view.View view = nVar.f253298a;
        nVar.f253301d = view.findViewById(com.tencent.mm.R.id.fkv);
        nVar.c();
        android.view.View view2 = nVar.f253301d;
        android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = ((com.tencent.mm.ui.bl.b(view.getContext()).y * 2) / 3) + com.tencent.mm.ui.zk.a(view.getContext(), 68);
        }
        android.view.View view3 = nVar.f253301d;
        if (view3 != null) {
            view3.setOnClickListener(ej2.m.f253317d);
        }
        android.view.View view4 = nVar.f253301d;
        nVar.f253302e = view4 != null ? (android.widget.EditText) view4.findViewById(com.tencent.mm.R.id.eko) : null;
        android.view.View view5 = nVar.f253301d;
        nVar.f253303f = view5 != null ? view5.findViewById(com.tencent.mm.R.id.f4z) : null;
        android.view.View view6 = nVar.f253301d;
        nVar.f253304g = view6 != null ? view6.findViewById(com.tencent.mm.R.id.ekq) : null;
        android.view.View view7 = nVar.f253301d;
        nVar.f253305h = view7 != null ? view7.findViewById(com.tencent.mm.R.id.ekp) : null;
        android.view.View view8 = nVar.f253301d;
        nVar.f253306i = view8 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view8.findViewById(com.tencent.mm.R.id.ekg) : null;
        android.view.View view9 = nVar.f253301d;
        nVar.f253307j = view9 != null ? (android.widget.TextView) view9.findViewById(com.tencent.mm.R.id.ekn) : null;
        android.view.View view10 = nVar.f253301d;
        nVar.f253308k = view10 != null ? (androidx.recyclerview.widget.RecyclerView) view10.findViewById(com.tencent.mm.R.id.fq9) : null;
        android.widget.TextView textView = this.f253307j;
        if (textView != null) {
            textView.setOnClickListener(new ej2.b(this));
        }
        android.view.View view11 = this.f253303f;
        if (view11 != null) {
            view11.setOnClickListener(new ej2.c(this));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f253306i;
        if (weImageView != null) {
            weImageView.setOnClickListener(new ej2.d(this));
        }
        android.widget.EditText editText = this.f253302e;
        if (editText != null) {
            editText.addTextChangedListener(new ej2.e(this));
        }
    }

    public final yh2.k a() {
        yh2.k kVar = this.f253311n;
        if (kVar != null) {
            return kVar;
        }
        kotlin.jvm.internal.o.o("searchAdapter");
        throw null;
    }

    public final void b() {
        android.widget.EditText editText = this.f253302e;
        android.view.View view = this.f253301d;
        if (editText == null || view == null) {
            return;
        }
        this.f253310m.clear();
        a().notifyDataSetChanged();
        android.widget.EditText editText2 = this.f253302e;
        if (editText2 != null) {
            editText2.setText("");
            editText2.clearFocus();
            com.tencent.mm.sdk.platformtools.t8.t0(editText2);
        }
        com.tencent.mm.sdk.platformtools.t8.t0(editText);
        android.view.View view2 = ((ej2.n) this).f253301d;
        if (view2 != null) {
            float f17 = com.tencent.mm.ui.bl.b(view2.getContext()).x;
            view2.animate().translationX(f17).setListener(new ej2.k(view2, f17)).setDuration(200L).start();
        }
    }

    public final void c() {
        android.view.View view = this.f253301d;
        if (view != null) {
            view.setTranslationX(com.tencent.mm.ui.bl.b(this.f253298a.getContext()).x);
        }
        android.view.View view2 = this.f253301d;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/search/FinderLiveMicBaseSearchWidget", "resetSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/search/FinderLiveMicBaseSearchWidget", "resetSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
