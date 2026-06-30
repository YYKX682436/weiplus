package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes14.dex */
public final class q2 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.playlist.p2 f122409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b4u;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f122409d = new com.tencent.mm.plugin.finder.playlist.p2(getContext());
        android.app.Activity context = getContext();
        com.tencent.mm.plugin.finder.playlist.p2 p2Var = this.f122409d;
        if (p2Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.playlist.s2 s2Var = new com.tencent.mm.plugin.finder.playlist.s2(context, p2Var);
        com.tencent.mm.plugin.finder.playlist.p2 p2Var2 = this.f122409d;
        if (p2Var2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        p2Var2.f122400f = p2Var2.f122395a.getIntent().getStringExtra("finder_username");
        p2Var2.f122401g = p2Var2.f122395a.getIntent().getIntExtra("finder_collection_business_type", 0);
        byte[] byteArrayExtra = p2Var2.f122395a.getIntent().getByteArrayExtra("KEY_LAST_BUFFER");
        if (byteArrayExtra != null) {
            p2Var2.f122402h = new com.tencent.mm.protobuf.g(byteArrayExtra, 0, byteArrayExtra.length);
        }
        p2Var2.f122397c = s2Var;
        android.app.Activity activity = s2Var.f122445a;
        android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        s2Var.f122447c = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) findViewById;
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter(activity, null);
        finderProfileLoaderMoreFooter.j(com.tencent.mm.R.layout.bsd);
        s2Var.d().D(finderProfileLoaderMoreFooter);
        android.view.View findViewById2 = activity.findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        s2Var.f122448d = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById2;
        s2Var.b().setHasFixedSize(true);
        s2Var.b().setItemViewCacheSize(4);
        androidx.recyclerview.widget.n2 itemAnimator = s2Var.b().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        s2Var.b().setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(activity));
        com.tencent.mm.view.recyclerview.WxRecyclerView b17 = s2Var.b();
        com.tencent.mm.plugin.finder.playlist.p2 p2Var3 = s2Var.f122446b;
        p2Var3.getClass();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.playlist.FinderPlayListPresenter$getAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == com.tencent.mm.plugin.finder.playlist.e.class.hashCode()) {
                    return new com.tencent.mm.plugin.finder.playlist.d();
                }
                hc2.l.a("Finder.FinderPlayListPresenter", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, p2Var3.f122396b, false);
        p2Var3.f122398d = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.playlist.g2(p2Var3);
        b17.setAdapter(wxRecyclerAdapter);
        android.view.View findViewById3 = activity.findViewById(com.tencent.mm.R.id.kxr);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        s2Var.f122449e = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = activity.findViewById(com.tencent.mm.R.id.oai);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        s2Var.f122450f = findViewById4;
        android.view.View findViewById5 = activity.findViewById(com.tencent.mm.R.id.oao);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        s2Var.f122451g = findViewById5;
        android.view.View findViewById6 = activity.findViewById(com.tencent.mm.R.id.oav);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        s2Var.f122452h = findViewById6;
        com.tencent.mm.plugin.finder.playlist.s2 s2Var2 = p2Var2.f122397c;
        if (s2Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        s2Var2.d().setOnSimpleAction(new com.tencent.mm.plugin.finder.playlist.h2(p2Var2));
        com.tencent.mm.plugin.finder.playlist.s2 s2Var3 = p2Var2.f122397c;
        if (s2Var3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        s2Var3.e();
        p2Var2.b();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.playlist.p2 p2Var = this.f122409d;
        if (p2Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        kotlinx.coroutines.z0.d(p2Var.f122399e, p2Var + " onDetach", null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
