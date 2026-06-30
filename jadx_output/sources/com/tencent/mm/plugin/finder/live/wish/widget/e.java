package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes10.dex */
public final class e extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.y f120697h;

    /* renamed from: i, reason: collision with root package name */
    public final kn2.b f120698i;

    /* renamed from: m, reason: collision with root package name */
    public final kn2.c f120699m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.wish.widget.i f120700n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f120701o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, androidx.lifecycle.y owner, boolean z17, kn2.b interactionWishViewEvent, kn2.c serviceLive) {
        super(context, false, null, z17, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(interactionWishViewEvent, "interactionWishViewEvent");
        kotlin.jvm.internal.o.g(serviceLive, "serviceLive");
        this.f120697h = owner;
        this.f120698i = interactionWishViewEvent;
        this.f120699m = serviceLive;
        this.f120701o = jz5.h.b(new com.tencent.mm.plugin.finder.live.wish.widget.b(context));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return h();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View c() {
        return f();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.graphics.drawable.Drawable i() {
        return new android.graphics.drawable.ColorDrawable(this.f118381d.getResources().getColor(com.tencent.mm.R.color.f478489a));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.e8a;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getString(com.tencent.mm.R.string.oqs);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        rootView.setBackgroundColor(this.f118381d.getColor(com.tencent.mm.R.color.f478489a));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.b04 b04Var = r45.b04.kInteractionType_Like;
        arrayList.add(b04Var);
        arrayList.add(r45.b04.kInteractionType_Comment);
        arrayList.add(r45.b04.kInteractionType_Share);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = kz5.n0.F0(arrayList, new com.tencent.mm.plugin.finder.live.wish.widget.g()).iterator();
        while (it.hasNext()) {
            arrayList2.add(new ln2.c((r45.b04) it.next()));
        }
        this.f120700n = new com.tencent.mm.plugin.finder.live.wish.widget.i(b04Var, 0L, "", arrayList2);
        android.content.Context context = rootView.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        com.tencent.mm.plugin.finder.live.wish.widget.i iVar = this.f120700n;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.wish.widget.m mVar = new com.tencent.mm.plugin.finder.live.wish.widget.m(mMActivity, rootView, this.f118383f, iVar);
        final com.tencent.mm.plugin.finder.live.wish.widget.i iVar2 = this.f120700n;
        if (iVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mars.xlog.Log.i("InteractionWishContract.Presenter", "onAttach");
        iVar2.f120713i = new com.tencent.mm.plugin.finder.live.wish.widget.n(iVar2.f120708d);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.wish.widget.InteractionWishTypeContract$Presenter$onAttach$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.finder.live.wish.widget.n nVar = com.tencent.mm.plugin.finder.live.wish.widget.i.this.f120713i;
                if (nVar != null) {
                    return nVar;
                }
                kotlin.jvm.internal.o.o("convert");
                throw null;
            }
        }, iVar2.f120711g, false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.live.wish.widget.h(iVar2);
        iVar2.f120712h = wxRecyclerAdapter;
        iVar2.f120715n = mVar;
        android.view.View view = mVar.f120732e;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.tjp);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        mVar.f120738n = recyclerView;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(view.getContext()));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = mVar.f120738n;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("typeRecyclerView");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.wish.widget.i iVar3 = mVar.f120734g;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = iVar3.f120712h;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        recyclerView2.setAdapter(wxRecyclerAdapter2);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.tj_);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        mVar.f120739o = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.tjd);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        mVar.f120740p = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.tj9);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        mVar.f120735h = (com.tencent.mm.ui.widget.MMEditText) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.tja);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        mVar.f120737m = (android.view.ViewGroup) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.tjc);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById6;
        mVar.f120736i = mMEditText;
        mMEditText.setFilters(new android.text.InputFilter[]{zl2.r4.f473952c});
        long j17 = iVar3.f120709e;
        if (j17 > 0) {
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = mVar.f120735h;
            if (mMEditText2 == null) {
                kotlin.jvm.internal.o.o("wishCountEditText");
                throw null;
            }
            mMEditText2.setText(java.lang.String.valueOf(j17));
        }
        if (iVar3.f120710f.length() > 0) {
            com.tencent.mm.ui.widget.MMEditText mMEditText3 = mVar.f120736i;
            if (mMEditText3 == null) {
                kotlin.jvm.internal.o.o("performanceNameEditText");
                throw null;
            }
            mMEditText3.setText(iVar3.f120710f);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText4 = mVar.f120735h;
        if (mMEditText4 == null) {
            kotlin.jvm.internal.o.o("wishCountEditText");
            throw null;
        }
        mMEditText4.addTextChangedListener(new com.tencent.mm.plugin.finder.live.wish.widget.l(mVar));
        com.tencent.mm.ui.widget.MMEditText mMEditText5 = mVar.f120736i;
        if (mMEditText5 == null) {
            kotlin.jvm.internal.o.o("performanceNameEditText");
            throw null;
        }
        mMEditText5.addTextChangedListener(new com.tencent.mm.plugin.finder.live.wish.widget.k(mVar));
        com.tencent.mars.xlog.Log.i("InteractionWishContract.ViewCallback", "initView completed");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        com.tencent.mm.plugin.finder.live.wish.widget.i iVar = this.f120700n;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        r45.b04 b04Var = iVar.f120708d;
        if (b04Var == null) {
            b04Var = r45.b04.kInteractionType_Unknown;
        }
        r45.c04 c04Var = new r45.c04();
        c04Var.set(0, java.lang.Long.valueOf(b04Var.f370394d));
        com.tencent.mm.plugin.finder.live.wish.widget.i iVar2 = this.f120700n;
        if (iVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        c04Var.set(1, java.lang.Long.valueOf(iVar2.f120709e));
        com.tencent.mm.plugin.finder.live.wish.widget.i iVar3 = this.f120700n;
        if (iVar3 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        c04Var.set(4, iVar3.f120710f);
        c04Var.set(2, 0L);
        c04Var.set(3, 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interactionWishEditComplete with type=");
        sb6.append(b04Var);
        sb6.append(", target=");
        com.tencent.mm.plugin.finder.live.wish.widget.i iVar4 = this.f120700n;
        if (iVar4 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        sb6.append(iVar4);
        sb6.append(".wishCount");
        com.tencent.mars.xlog.Log.i("InteractionWishPanelWidget", sb6.toString());
        ((az2.f) ((jz5.n) this.f120701o).getValue()).a();
        ((com.tencent.mm.plugin.finder.live.plugin.wn0) this.f120699m).w1(c04Var, new com.tencent.mm.plugin.finder.live.wish.widget.c(this, c04Var), new com.tencent.mm.plugin.finder.live.wish.widget.d(this));
    }

    public final void y(r45.c04 interactionWishConfig, java.util.ArrayList supportWishTypes, java.util.HashMap wishDefaultTargetValues, boolean z17) {
        boolean b17;
        java.lang.String string;
        kotlin.jvm.internal.o.g(interactionWishConfig, "interactionWishConfig");
        kotlin.jvm.internal.o.g(supportWishTypes, "supportWishTypes");
        kotlin.jvm.internal.o.g(wishDefaultTargetValues, "wishDefaultTargetValues");
        w();
        com.tencent.mm.plugin.finder.live.wish.widget.i iVar = this.f120700n;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        java.lang.String str = "";
        if (supportWishTypes.isEmpty()) {
            com.tencent.mars.xlog.Log.e("InteractionWishContract.Presenter", "updateConfig fail.supportWishTypes is empty");
            iVar.f120708d = null;
            com.tencent.mm.plugin.finder.live.wish.widget.n nVar = iVar.f120713i;
            if (nVar == null) {
                kotlin.jvm.internal.o.o("convert");
                throw null;
            }
            nVar.f120742e = null;
            com.tencent.mm.plugin.finder.live.wish.widget.m mVar = iVar.f120715n;
            if (mVar != null) {
                mVar.g(0L, "", z17);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = iVar.f120712h;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
                return;
            } else {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = kz5.n0.F0(supportWishTypes, new com.tencent.mm.plugin.finder.live.wish.widget.g()).iterator();
        while (it.hasNext()) {
            arrayList.add(new ln2.c((r45.b04) it.next()));
        }
        java.util.ArrayList<so2.j5> arrayList2 = iVar.f120711g;
        if (arrayList2.size() != arrayList.size()) {
            b17 = false;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (so2.j5 j5Var : arrayList2) {
                ln2.c cVar = j5Var instanceof ln2.c ? (ln2.c) j5Var : null;
                r45.b04 b04Var = cVar != null ? cVar.f319877d : null;
                if (b04Var != null) {
                    arrayList3.add(b04Var);
                }
            }
            java.util.Set X0 = kz5.n0.X0(arrayList3);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                so2.j5 j5Var2 = (so2.j5) it6.next();
                ln2.c cVar2 = j5Var2 instanceof ln2.c ? (ln2.c) j5Var2 : null;
                r45.b04 b04Var2 = cVar2 != null ? cVar2.f319877d : null;
                if (b04Var2 != null) {
                    arrayList4.add(b04Var2);
                }
            }
            b17 = kotlin.jvm.internal.o.b(X0, kz5.n0.X0(arrayList4));
        }
        if (!b17) {
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = iVar.f120712h;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter2.E0(arrayList2);
        }
        int i17 = (int) interactionWishConfig.getLong(0);
        r45.b04 b04Var3 = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? null : r45.b04.kInteractionType_Share : r45.b04.kInteractionType_Comment : r45.b04.kInteractionType_Like : r45.b04.kInteractionType_Unknown;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (so2.j5 j5Var3 : arrayList2) {
            ln2.c cVar3 = j5Var3 instanceof ln2.c ? (ln2.c) j5Var3 : null;
            r45.b04 b04Var4 = cVar3 != null ? cVar3.f319877d : null;
            if (b04Var4 != null) {
                arrayList5.add(b04Var4);
            }
        }
        java.util.Set X02 = kz5.n0.X0(arrayList5);
        java.lang.Object Z = kz5.n0.Z(arrayList2);
        ln2.c cVar4 = Z instanceof ln2.c ? (ln2.c) Z : null;
        r45.b04 b04Var5 = cVar4 != null ? cVar4.f319877d : null;
        if (b04Var3 == null || !X02.contains(b04Var3)) {
            b04Var3 = b04Var5;
        }
        if (iVar.f120708d != b04Var3) {
            iVar.f120708d = b04Var3;
            com.tencent.mm.plugin.finder.live.wish.widget.n nVar2 = iVar.f120713i;
            if (nVar2 == null) {
                kotlin.jvm.internal.o.o("convert");
                throw null;
            }
            nVar2.f120742e = b04Var3;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = iVar.f120712h;
            if (wxRecyclerAdapter3 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter3.notifyDataSetChanged();
        }
        iVar.f120709e = interactionWishConfig.getLong(1) >= 0 ? interactionWishConfig.getLong(1) : 0L;
        iVar.f120716o = z17;
        if (!z17 && (string = interactionWishConfig.getString(4)) != null) {
            str = string;
        }
        iVar.f120710f = str;
        com.tencent.mm.plugin.finder.live.wish.widget.m mVar2 = iVar.f120715n;
        if (mVar2 != null) {
            mVar2.g(iVar.f120709e, str, z17);
        }
        iVar.f120714m = new java.util.HashMap(wishDefaultTargetValues);
    }
}
