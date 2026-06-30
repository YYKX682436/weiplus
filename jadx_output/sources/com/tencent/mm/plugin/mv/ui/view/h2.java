package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class h2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int f151840o = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f151841d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f151842e;

    /* renamed from: f, reason: collision with root package name */
    public final wl3.e f151843f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f151844g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f151845h;

    /* renamed from: i, reason: collision with root package name */
    public fm3.u f151846i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f151847m;

    /* renamed from: n, reason: collision with root package name */
    public in5.w f151848n;

    public h2(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f151841d = context;
        this.f151842e = new java.util.ArrayList();
        wl3.e eVar = new wl3.e(context, true);
        this.f151843f = eVar;
        jz5.g b17 = jz5.h.b(new com.tencent.mm.plugin.mv.ui.view.f2(this));
        this.f151845h = b17;
        kotlin.jvm.internal.o.f(java.util.Collections.synchronizedList(new java.util.ArrayList()), "synchronizedList(...)");
        jz5.g b18 = jz5.h.b(new com.tencent.mm.plugin.mv.ui.view.g2(this));
        android.view.View view = eVar.f447058f;
        kotlin.jvm.internal.o.d(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.av6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View view2 = eVar.f447058f;
        kotlin.jvm.internal.o.d(view2);
        android.view.LayoutInflater.from(view2.getContext()).inflate(com.tencent.mm.R.layout.c4a, (android.view.ViewGroup) findViewById, true);
        android.view.View view3 = eVar.f447058f;
        android.view.ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = com.tencent.mm.ui.bl.b(context).y / 2;
        }
        android.view.View view4 = eVar.f447058f;
        android.view.View findViewById2 = view4 != null ? view4.findViewById(com.tencent.mm.R.id.f483758bz2) : null;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.mv.ui.view.b2(this));
        }
        android.view.View view5 = eVar.f447058f;
        this.f151844g = view5 != null ? (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.odf) : null;
        android.view.View view6 = eVar.f447058f;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = view6 != null ? (com.tencent.mm.view.recyclerview.WxRecyclerView) view6.findViewById(com.tencent.mm.R.id.k27) : null;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager((androidx.recyclerview.widget.LinearLayoutManager) ((jz5.n) b18).getValue());
        }
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((jz5.n) b17).getValue());
        }
        ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((jz5.n) b17).getValue()).f293105o = new com.tencent.mm.plugin.mv.ui.view.c2(this);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c4g, (android.view.ViewGroup) wxRecyclerView, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f151847m = inflate;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("Music.Mv.MusicMvListDialog", "onSceneEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scene:" + m1Var);
    }
}
