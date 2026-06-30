package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public final class jj extends wm3.a implements com.tencent.mm.plugin.setting.ui.setting.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f161197d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f161198e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f161199f;

    /* renamed from: g, reason: collision with root package name */
    public final w14.d f161200g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f161201h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161197d = new java.util.ArrayList();
        this.f161200g = w14.d.f442234d;
        this.f161201h = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.ij(this));
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.z1
    public boolean T5(ip.k composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        java.lang.Integer num = this.f161199f;
        return num != null && num.intValue() == composition.f293571a;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.z1
    public void X3(ip.k composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        java.lang.Integer num = this.f161198e;
        int i17 = composition.f293571a;
        if (num == null || num.intValue() != i17) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).enableOptionMenu(i17, true);
        }
        this.f161199f = java.lang.Integer.valueOf(i17);
        this.f161200g.h(i17);
        t14.r rVar = com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference.f161506e;
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new t14.z("select_view_notification_banner", composition.f293572b, 4));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.clo;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.z1
    public void notifyDataSetChanged() {
        androidx.recyclerview.widget.f2 adapter = ((em.y3) ((jz5.n) this.f161201h).getValue()).a().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList arrayList = this.f161197d;
        java.util.Map map = w14.d.f442241n;
        arrayList.addAll(map.values());
        this.f161198e = -1;
        this.f161199f = -1;
        w14.d dVar = this.f161200g;
        dVar.c();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("横幅显示内容");
            P6.enableOptionMenu(0, false);
            P6.hideActionbarLine();
            P6.setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.hj(P6));
        }
        jz5.g gVar = this.f161201h;
        ((em.y3) ((jz5.n) gVar).getValue()).a().setAdapter(new com.tencent.mm.plugin.setting.ui.setting.y1(arrayList, this));
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(getContext());
        wxLinearLayoutManager.Q(1);
        ((em.y3) ((jz5.n) gVar).getValue()).a().setLayoutManager(wxLinearLayoutManager);
        androidx.recyclerview.widget.RecyclerView a17 = ((em.y3) ((jz5.n) gVar).getValue()).a();
        in5.t0 t0Var = new in5.t0(getContext());
        t0Var.f293129c = in5.q.f293113d;
        t0Var.c(com.tencent.mm.R.color.f479307vn);
        t0Var.b(com.tencent.mm.R.color.a9e);
        t0Var.d(com.tencent.mm.R.dimen.f479638bd);
        android.content.res.Resources resources = t0Var.f293128b;
        t0Var.f293131e = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        t0Var.f293132f = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        a17.N(t0Var.a());
        dVar.c();
        ip.k kVar = (ip.k) map.get(w14.d.f442235e);
        if (kVar != null) {
            X3(kVar);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f161200g.a();
    }
}
