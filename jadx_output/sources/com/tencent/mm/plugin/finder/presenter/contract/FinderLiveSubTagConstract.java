package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinderLiveSubTagConstract {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$Presenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback;", "Companion", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Presenter implements fs2.a {

        /* renamed from: d, reason: collision with root package name */
        public final r45.fd2 f122763d;

        /* renamed from: e, reason: collision with root package name */
        public final java.util.ArrayList f122764e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f122765f;

        /* renamed from: g, reason: collision with root package name */
        public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f122766g;

        /* renamed from: h, reason: collision with root package name */
        public gk2.e f122767h;

        /* renamed from: i, reason: collision with root package name */
        public r45.fd2 f122768i;

        /* renamed from: m, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.convert.xm f122769m;

        /* renamed from: n, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.ViewCallback f122770n;

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }
        }

        static {
            new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.Presenter.Companion(null);
        }

        public Presenter(r45.fd2 fd2Var, java.util.ArrayList tagData, boolean z17) {
            kotlin.jvm.internal.o.g(tagData, "tagData");
            this.f122763d = fd2Var;
            this.f122764e = tagData;
            this.f122765f = z17;
        }

        public void c(final com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.ViewCallback callback) {
            kotlin.jvm.internal.o.g(callback, "callback");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach parentTag:");
            r45.fd2 fd2Var = this.f122763d;
            sb6.append(fd2Var != null ? fd2Var.getString(1) : null);
            sb6.append(" tagData:");
            java.util.ArrayList arrayList = this.f122764e;
            sb6.append(arrayList);
            sb6.append(" hasNextAction:");
            sb6.append(this.f122765f);
            com.tencent.mars.xlog.Log.i("FinderLiveSubTagConstract.Presenter", sb6.toString());
            gk2.e eVar = dk2.ef.I;
            if (eVar == null) {
                eVar = new gk2.e("FinderLiveSubTagConstract");
            }
            this.f122767h = eVar;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) eVar.a(mm2.g1.class)).f329072m;
            r45.fd2 fd2Var2 = j2Var != null ? (r45.fd2) ((kotlinx.coroutines.flow.h3) j2Var).getValue() : null;
            this.f122768i = fd2Var2;
            this.f122769m = new com.tencent.mm.plugin.finder.convert.xm(fd2Var2);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter$onAttach$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    com.tencent.mm.plugin.finder.convert.xm xmVar = com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.Presenter.this.f122769m;
                    if (xmVar != null) {
                        return xmVar;
                    }
                    kotlin.jvm.internal.o.o("convert");
                    throw null;
                }
            }, arrayList, false);
            wxRecyclerAdapter.f293105o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter$onAttach$2$1
                @Override // in5.x
                public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
                    java.lang.String str;
                    r45.fd2 fd2Var3;
                    in5.s0 holder = (in5.s0) k3Var;
                    kotlin.jvm.internal.o.g(adapter, "adapter");
                    kotlin.jvm.internal.o.g(view, "view");
                    kotlin.jvm.internal.o.g(holder, "holder");
                    if (holder.f293125i != null) {
                        r45.fd2 fd2Var4 = new r45.fd2();
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.Presenter presenter = com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.Presenter.this;
                        r45.fd2 fd2Var5 = presenter.f122763d;
                        fd2Var4.set(0, java.lang.Integer.valueOf(fd2Var5 != null ? fd2Var5.getInteger(0) : 0));
                        r45.fd2 fd2Var6 = presenter.f122763d;
                        if (fd2Var6 == null || (str = fd2Var6.getString(1)) == null) {
                            str = "";
                        }
                        fd2Var4.set(1, str);
                        java.lang.String str2 = null;
                        fd2Var4.set(2, fd2Var6 != null ? fd2Var6.getList(2) : null);
                        fd2Var4.set(3, ((so2.u2) holder.f293125i).f410635d);
                        fd2Var4.set(5, java.lang.Integer.valueOf(fd2Var6 != null ? fd2Var6.getInteger(5) : 0));
                        presenter.f122768i = fd2Var4;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.ViewCallback viewCallback = presenter.f122770n;
                        if (viewCallback != null) {
                            viewCallback.a();
                        }
                        com.tencent.mm.plugin.finder.convert.xm xmVar = presenter.f122769m;
                        if (xmVar == null) {
                            kotlin.jvm.internal.o.o("convert");
                            throw null;
                        }
                        xmVar.f104962e = presenter.f122768i;
                        adapter.notifyDataSetChanged();
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("sub tag item click. selectedTag:[");
                        r45.fd2 fd2Var7 = presenter.f122768i;
                        sb7.append(fd2Var7 != null ? fd2Var7.getString(1) : null);
                        sb7.append('-');
                        r45.fd2 fd2Var8 = presenter.f122768i;
                        if (fd2Var8 != null && (fd2Var3 = (r45.fd2) fd2Var8.getCustom(3)) != null) {
                            str2 = fd2Var3.getString(1);
                        }
                        sb7.append(str2);
                        sb7.append(']');
                        com.tencent.mars.xlog.Log.i("FinderLiveSubTagConstract.Presenter", sb7.toString());
                    }
                }
            };
            this.f122766g = wxRecyclerAdapter;
            this.f122770n = callback;
            com.tencent.mm.ui.MMActivity mMActivity = callback.f122772d;
            android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.fme);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            callback.f122774f = (android.widget.RelativeLayout) findViewById;
            android.view.View findViewById2 = mMActivity.findViewById(com.tencent.mm.R.id.fmg);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            callback.f122775g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
            android.view.View findViewById3 = mMActivity.findViewById(com.tencent.mm.R.id.fmh);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            callback.f122776h = (android.widget.TextView) findViewById3;
            android.view.View findViewById4 = mMActivity.findViewById(com.tencent.mm.R.id.fmf);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            callback.f122777i = (android.widget.TextView) findViewById4;
            android.view.View findViewById5 = mMActivity.findViewById(com.tencent.mm.R.id.fmd);
            kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById5;
            callback.f122778m = recyclerView;
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMActivity));
            androidx.recyclerview.widget.RecyclerView recyclerView2 = callback.f122778m;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("tagRecyclerView");
                throw null;
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.Presenter presenter = callback.f122773e;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = presenter.f122766g;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            recyclerView2.setAdapter(wxRecyclerAdapter2);
            androidx.recyclerview.widget.RecyclerView recyclerView3 = callback.f122778m;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("tagRecyclerView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null && !lk5.s.b(mMActivity)) {
                marginLayoutParams.bottomMargin += com.tencent.mm.ui.bl.c(mMActivity);
            }
            android.widget.TextView textView = callback.f122776h;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleTv");
                throw null;
            }
            r45.fd2 fd2Var3 = presenter.f122763d;
            textView.setText(fd2Var3 != null ? fd2Var3.getString(1) : null);
            android.widget.RelativeLayout relativeLayout = callback.f122774f;
            if (relativeLayout == null) {
                kotlin.jvm.internal.o.o("header");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null && !lk5.s.b(mMActivity)) {
                marginLayoutParams2.topMargin += com.tencent.mm.ui.bl.h(mMActivity);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = callback.f122775g;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("cancelBtn");
                throw null;
            }
            weImageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback$initView$3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.ViewCallback viewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.ViewCallback.this;
                    viewCallback.f122772d.setResult(0);
                    viewCallback.f122772d.finish();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            callback.a();
            if (presenter.f122765f) {
                android.widget.TextView textView2 = callback.f122777i;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("actionBtn");
                    throw null;
                }
                textView2.setText(mMActivity.getContext().getResources().getString(com.tencent.mm.R.string.f6o));
            } else {
                android.widget.TextView textView3 = callback.f122777i;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("actionBtn");
                    throw null;
                }
                textView3.setText(mMActivity.getContext().getResources().getString(com.tencent.mm.R.string.f490441v5));
            }
            android.widget.TextView textView4 = callback.f122777i;
            if (textView4 != null) {
                textView4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback$initView$4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        r45.fd2 fd2Var4;
                        r45.fd2 fd2Var5;
                        r45.fd2 fd2Var6;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(view);
                        java.lang.Object[] array = arrayList2.toArray();
                        arrayList2.clear();
                        yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("select live tag finish. lastTag:[");
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.ViewCallback viewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.ViewCallback.this;
                        gk2.e eVar2 = viewCallback.f122773e.f122767h;
                        if (eVar2 == null) {
                            kotlin.jvm.internal.o.o("liveData");
                            throw null;
                        }
                        kotlinx.coroutines.flow.j2 j2Var2 = ((mm2.g1) eVar2.a(mm2.g1.class)).f329072m;
                        sb7.append((j2Var2 == null || (fd2Var6 = (r45.fd2) ((kotlinx.coroutines.flow.h3) j2Var2).getValue()) == null) ? null : fd2Var6.getString(1));
                        sb7.append('-');
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.Presenter presenter2 = viewCallback.f122773e;
                        gk2.e eVar3 = presenter2.f122767h;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.o.o("liveData");
                            throw null;
                        }
                        r45.fd2 fd2Var7 = (r45.fd2) ((kotlinx.coroutines.flow.h3) ((mm2.g1) eVar3.a(mm2.g1.class)).f329072m).getValue();
                        sb7.append((fd2Var7 == null || (fd2Var5 = (r45.fd2) fd2Var7.getCustom(3)) == null) ? null : fd2Var5.getString(1));
                        sb7.append("] selectedTag:[");
                        r45.fd2 fd2Var8 = presenter2.f122768i;
                        sb7.append(fd2Var8 != null ? fd2Var8.getString(1) : null);
                        sb7.append('-');
                        r45.fd2 fd2Var9 = presenter2.f122768i;
                        sb7.append((fd2Var9 == null || (fd2Var4 = (r45.fd2) fd2Var9.getCustom(3)) == null) ? null : fd2Var4.getString(1));
                        sb7.append(']');
                        com.tencent.mars.xlog.Log.i("FinderLiveSubTagConstract.ViewCallback", sb7.toString());
                        gk2.e eVar4 = presenter2.f122767h;
                        if (eVar4 == null) {
                            kotlin.jvm.internal.o.o("liveData");
                            throw null;
                        }
                        ((kotlinx.coroutines.flow.h3) ((mm2.g1) eVar4.a(mm2.g1.class)).f329072m).k(presenter2.f122768i);
                        com.tencent.mm.ui.MMActivity mMActivity2 = viewCallback.f122772d;
                        mMActivity2.setResult(-1);
                        mMActivity2.finish();
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            } else {
                kotlin.jvm.internal.o.o("actionBtn");
                throw null;
            }
        }

        @Override // fs2.a
        public void onDetach() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$Presenter;", "Companion", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class ViewCallback implements fs2.c {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.ui.MMActivity f122772d;

        /* renamed from: e, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.Presenter f122773e;

        /* renamed from: f, reason: collision with root package name */
        public android.widget.RelativeLayout f122774f;

        /* renamed from: g, reason: collision with root package name */
        public com.tencent.mm.ui.widget.imageview.WeImageView f122775g;

        /* renamed from: h, reason: collision with root package name */
        public android.widget.TextView f122776h;

        /* renamed from: i, reason: collision with root package name */
        public android.widget.TextView f122777i;

        /* renamed from: m, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView f122778m;

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }
        }

        static {
            new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.ViewCallback.Companion(null);
        }

        public ViewCallback(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.Presenter presenter) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(presenter, "presenter");
            this.f122772d = activity;
            this.f122773e = presenter;
        }

        public final void a() {
            android.widget.TextView textView = this.f122777i;
            if (textView == null) {
                kotlin.jvm.internal.o.o("actionBtn");
                throw null;
            }
            r45.fd2 fd2Var = this.f122773e.f122768i;
            boolean z17 = false;
            if (fd2Var != null) {
                java.lang.String string = fd2Var.getString(1);
                if (!(string == null || string.length() == 0)) {
                    z17 = true;
                }
            }
            textView.setEnabled(z17);
        }

        @Override // fs2.c
        public com.tencent.mm.ui.MMFragmentActivity getActivity() {
            return this.f122772d;
        }
    }
}
