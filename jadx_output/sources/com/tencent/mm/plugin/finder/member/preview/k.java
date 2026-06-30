package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class k extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f121239d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f121240e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f121241f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.jj0 f121242g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f121243h;

    /* renamed from: i, reason: collision with root package name */
    public int f121244i;

    /* renamed from: m, reason: collision with root package name */
    public int f121245m;

    /* renamed from: n, reason: collision with root package name */
    public int f121246n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f121247o;

    /* renamed from: p, reason: collision with root package name */
    public ya2.b2 f121248p;

    /* renamed from: q, reason: collision with root package name */
    public int f121249q;

    /* renamed from: r, reason: collision with root package name */
    public int f121250r;

    /* renamed from: s, reason: collision with root package name */
    public int f121251s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f121240e = new java.util.ArrayList();
        this.f121242g = new com.tencent.mm.plugin.finder.storage.jj0(0, null, 3, null);
        this.f121243h = "";
        this.f121247o = "";
    }

    public final android.view.View O6() {
        android.view.View view = this.f121239d;
        if (view == null) {
            android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b2y, (android.view.ViewGroup) null, false);
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) getActivity().findViewById(com.tencent.mm.R.id.lqa);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jfy);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.l4v);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.jfd);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jff);
            android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a86);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jfi);
            android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jfq);
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) inflate.findViewById(com.tencent.mm.R.id.l3n);
            com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) inflate.findViewById(com.tencent.mm.R.id.l4j);
            androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.l4i);
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.kqj);
            android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kr6);
            com.tencent.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kqh)).getPaint(), 0.8f);
            com.tencent.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kqw)).getPaint(), 0.8f);
            com.tencent.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.fsf)).getPaint(), 0.8f);
            textView.setText(this.f121247o);
            kotlin.jvm.internal.o.d(findViewById);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.member.preview.c(findViewById, this));
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a17 = g1Var.a();
            ya2.b2 b2Var = this.f121248p;
            java.lang.String avatarUrl = b2Var != null ? b2Var.getAvatarUrl() : null;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (avatarUrl == null) {
                avatarUrl = "";
            }
            mn2.n nVar = new mn2.n(avatarUrl, com.tencent.mm.plugin.finder.storage.y90.X);
            kotlin.jvm.internal.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity context = getContext();
            ya2.b2 b2Var2 = this.f121248p;
            java.lang.String w07 = b2Var2 != null ? b2Var2.w0() : null;
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f460511a;
            kotlin.jvm.internal.o.d(imageView2);
            ya2.b2 b2Var3 = this.f121248p;
            zy2.tb.a(m1Var, imageView2, b2Var3 != null ? b2Var3.field_authInfo : null, 0, 4, null);
            com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
            if (this.f121249q == 0) {
                textView4.setText(getContext().getString(com.tencent.mm.R.string.en6, java.lang.Integer.valueOf(this.f121250r)));
            } else {
                textView4.setText(getContext().getString(com.tencent.mm.R.string.f491922en5, java.lang.Integer.valueOf(this.f121250r)));
            }
            appBarLayout.a(new com.tencent.mm.plugin.finder.member.preview.d(this, textView));
            kotlin.jvm.internal.o.d(recyclerView2);
            kotlin.jvm.internal.o.d(recyclerView);
            kotlin.jvm.internal.o.d(finderRefreshLayout);
            recyclerView2.setItemAnimator(null);
            recyclerView2.setLayoutManager(this.f121242g.d(getContext()));
            recyclerView2.N(this.f121242g.c());
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.member.preview.FinderMemberPreviewFeedItemUIC$initRecycleView$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return com.tencent.mm.plugin.finder.member.preview.k.this.f121242g.b(null).getItemConvert(type);
                }
            }, this.f121240e, false);
            wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.member.preview.f(this);
            recyclerView2.setAdapter(wxRecyclerAdapter);
            finderRefreshLayout.setOnSimpleAction(new com.tencent.mm.plugin.finder.member.preview.g(this, recyclerView2, finderRefreshLayout));
            finderRefreshLayout.post(new com.tencent.mm.plugin.finder.member.preview.h(finderRefreshLayout));
            qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
            android.app.Activity context2 = getContext();
            ((pg0.s3) h0Var).getClass();
            textView5.setTypeface(com.tencent.mm.wallet_core.ui.r1.F(context2, 3));
            int i17 = this.f121245m;
            textView5.setText(i17 > 0 ? java.lang.String.valueOf(i17) : java.lang.String.valueOf(this.f121244i));
            android.app.Activity context3 = getContext();
            kotlin.jvm.internal.o.g(context3, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            eo2.b bVar = (eo2.b) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).e(eo2.b.class);
            int i18 = bVar != null ? bVar.f255558d : 0;
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.member.preview.e(this, findViewById2, i18));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById2, "become_member");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById2, 40, 25496);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(i18));
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(getContext());
            lVarArr[1] = new jz5.l("comment_scene", e17 != null ? java.lang.Integer.valueOf(e17.f135380n) : null);
            lVarArr[2] = new jz5.l("finder_username", this.f121243h);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(getContext());
            lVarArr[3] = new jz5.l("finder_tab_context_id", e18 != null ? e18.f135386r : null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(getContext());
            lVarArr[4] = new jz5.l("finder_context_id", e19 != null ? e19.f135382p : null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(getContext());
            lVarArr[5] = new jz5.l("behaviour_session_id", e27 != null ? e27.f135385q : null);
            ((cy1.a) rVar).gk(findViewById2, kz5.c1.k(lVarArr));
            view = inflate;
        }
        this.f121239d = view;
        return view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f121240e = new java.util.ArrayList();
        this.f121242g = new com.tencent.mm.plugin.finder.storage.jj0(0, null, 3, null);
        this.f121243h = "";
        this.f121247o = "";
    }
}
