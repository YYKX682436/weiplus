package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinderLiveTagConstract {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$Presenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback;", "Companion", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Presenter implements fs2.a {

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int f122781i = 0;

        /* renamed from: d, reason: collision with root package name */
        public final java.util.ArrayList f122782d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f122783e;

        /* renamed from: f, reason: collision with root package name */
        public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f122784f;

        /* renamed from: g, reason: collision with root package name */
        public gk2.e f122785g;

        /* renamed from: h, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.ViewCallback f122786h;

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }
        }

        static {
            new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter.Companion(null);
        }

        public Presenter(java.util.ArrayList tagData, boolean z17) {
            kotlin.jvm.internal.o.g(tagData, "tagData");
            this.f122782d = tagData;
            this.f122783e = z17;
        }

        public void c(final com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.ViewCallback callback) {
            kotlin.jvm.internal.o.g(callback, "callback");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach tagData:");
            java.util.ArrayList arrayList = this.f122782d;
            sb6.append(arrayList);
            sb6.append(" hasNextAction:");
            sb6.append(this.f122783e);
            com.tencent.mars.xlog.Log.i("FinderLiveTagConstract.Presenter", sb6.toString());
            gk2.e eVar = dk2.ef.I;
            if (eVar == null) {
                eVar = new gk2.e("FinderLiveTagConstract");
            }
            this.f122785g = eVar;
            boolean z17 = false;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$Presenter$onAttach$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    kotlinx.coroutines.flow.j2 j2Var;
                    gk2.e eVar2 = gk2.e.f272471n;
                    return new com.tencent.mm.plugin.finder.convert.ym((eVar2 == null || (j2Var = ((mm2.g1) eVar2.a(mm2.g1.class)).f329072m) == null) ? null : (r45.fd2) ((kotlinx.coroutines.flow.h3) j2Var).getValue());
                }
            }, arrayList, false);
            wxRecyclerAdapter.f293105o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$Presenter$onAttach$2$1
                @Override // in5.x
                public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
                    java.util.LinkedList list;
                    in5.s0 holder = (in5.s0) k3Var;
                    kotlin.jvm.internal.o.g(adapter, "adapter");
                    kotlin.jvm.internal.o.g(view, "view");
                    kotlin.jvm.internal.o.g(holder, "holder");
                    int i18 = com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter.f122781i;
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter presenter = com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter.this;
                    presenter.getClass();
                    com.tencent.mars.xlog.Log.i("FinderLiveTagConstract.Presenter", "selected tagIndex:" + i17);
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.ViewCallback viewCallback = presenter.f122786h;
                    if (viewCallback != null) {
                        android.content.Intent intent = new android.content.Intent();
                        java.lang.Class<?> cls = (java.lang.Class) ((jz5.n) jz2.x0.B).getValue();
                        com.tencent.mm.ui.MMActivity mMActivity = viewCallback.f122788d;
                        intent.setClass(mMActivity, cls);
                        intent.putExtra("KEY_HAS_NEXT_ACTION", presenter.f122783e);
                        so2.j5 j5Var = (so2.j5) kz5.n0.a0(presenter.f122782d, i17);
                        r45.fd2 fd2Var = (j5Var == null || !(j5Var instanceof so2.u2)) ? null : ((so2.u2) j5Var).f410635d;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tagIndex:");
                        sb7.append(i17);
                        sb7.append(", selectTag:");
                        sb7.append(fd2Var != null ? fd2Var.getString(1) : null);
                        sb7.append(", selectTag.subList:");
                        sb7.append((fd2Var == null || (list = fd2Var.getList(2)) == null) ? null : java.lang.Integer.valueOf(list.size()));
                        com.tencent.mars.xlog.Log.i("FinderLiveTagConstract.Presenter", sb7.toString());
                        intent.putExtra("KEY_TAG_INFO", fd2Var != null ? fd2Var.toByteArray() : null);
                        mMActivity.startActivityForResult(intent, 1);
                    }
                }
            };
            this.f122784f = wxRecyclerAdapter;
            this.f122786h = callback;
            com.tencent.mm.ui.MMActivity mMActivity = callback.f122788d;
            android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.fmz);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            callback.f122790f = (android.widget.RelativeLayout) findViewById;
            android.view.View findViewById2 = mMActivity.findViewById(com.tencent.mm.R.id.f484824fn1);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            callback.f122791g = (android.widget.TextView) findViewById2;
            android.view.View findViewById3 = mMActivity.findViewById(com.tencent.mm.R.id.f484825fn2);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            android.view.View findViewById4 = mMActivity.findViewById(com.tencent.mm.R.id.f484823fn0);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            callback.f122792h = (android.widget.TextView) findViewById4;
            android.view.View findViewById5 = mMActivity.findViewById(com.tencent.mm.R.id.fmy);
            kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById5;
            callback.f122793i = recyclerView;
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMActivity));
            androidx.recyclerview.widget.RecyclerView recyclerView2 = callback.f122793i;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("tagRecyclerView");
                throw null;
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter presenter = callback.f122789e;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = presenter.f122784f;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            recyclerView2.setAdapter(wxRecyclerAdapter2);
            androidx.recyclerview.widget.RecyclerView recyclerView3 = callback.f122793i;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("tagRecyclerView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null && !zl2.r4.f473950a.Y1(mMActivity)) {
                marginLayoutParams.bottomMargin += com.tencent.mm.ui.bl.c(mMActivity);
            }
            android.widget.TextView textView = callback.f122791g;
            if (textView == null) {
                kotlin.jvm.internal.o.o("cancelBtn");
                throw null;
            }
            textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$ViewCallback$initView$2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.ViewCallback viewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.ViewCallback.this;
                    viewCallback.f122788d.setResult(0);
                    viewCallback.f122788d.finish();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            if (!lk5.s.b(mMActivity)) {
                android.widget.RelativeLayout relativeLayout = callback.f122790f;
                if (relativeLayout == null) {
                    kotlin.jvm.internal.o.o("header");
                    throw null;
                }
                android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin += com.tencent.mm.ui.bl.h(mMActivity);
                }
            }
            android.widget.TextView g17 = callback.g();
            gk2.e eVar2 = presenter.f122785g;
            if (eVar2 == null) {
                kotlin.jvm.internal.o.o("liveData");
                throw null;
            }
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) eVar2.a(mm2.g1.class)).f329072m;
            if ((j2Var != null ? (r45.fd2) ((kotlinx.coroutines.flow.h3) j2Var).getValue() : null) != null) {
                gk2.e eVar3 = presenter.f122785g;
                if (eVar3 == null) {
                    kotlin.jvm.internal.o.o("liveData");
                    throw null;
                }
                r45.fd2 fd2Var = (r45.fd2) ((kotlinx.coroutines.flow.h3) ((mm2.g1) eVar3.a(mm2.g1.class)).f329072m).getValue();
                java.lang.String string = fd2Var != null ? fd2Var.getString(1) : null;
                if (!(string == null || string.length() == 0)) {
                    z17 = true;
                }
            }
            g17.setEnabled(z17);
            if (presenter.f122783e) {
                callback.g().setText(mMActivity.getContext().getResources().getString(com.tencent.mm.R.string.f6o));
                callback.g().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$ViewCallback$initView$4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(view);
                        java.lang.Object[] array = arrayList2.toArray();
                        arrayList2.clear();
                        yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.ViewCallback.this.a();
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            } else {
                callback.g().setText(mMActivity.getContext().getResources().getString(com.tencent.mm.R.string.f490441v5));
                callback.g().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$ViewCallback$initView$5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(view);
                        java.lang.Object[] array = arrayList2.toArray();
                        arrayList2.clear();
                        yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.ViewCallback.this.a();
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            }
        }

        @Override // fs2.a
        public void onDetach() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$Presenter;", "Companion", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class ViewCallback implements fs2.c {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.ui.MMActivity f122788d;

        /* renamed from: e, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter f122789e;

        /* renamed from: f, reason: collision with root package name */
        public android.widget.RelativeLayout f122790f;

        /* renamed from: g, reason: collision with root package name */
        public android.widget.TextView f122791g;

        /* renamed from: h, reason: collision with root package name */
        public android.widget.TextView f122792h;

        /* renamed from: i, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView f122793i;

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }
        }

        static {
            new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.ViewCallback.Companion(null);
        }

        public ViewCallback(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter presenter) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(presenter, "presenter");
            this.f122788d = activity;
            this.f122789e = presenter;
        }

        public final void a() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishWithResult hasNextAction:");
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter presenter = this.f122789e;
            sb6.append(presenter.f122783e);
            com.tencent.mars.xlog.Log.i("FinderLiveTagConstract.ViewCallback", sb6.toString());
            boolean z17 = presenter.f122783e;
            com.tencent.mm.ui.MMActivity mMActivity = this.f122788d;
            if (!z17) {
                mMActivity.setResult(-1);
                mMActivity.finish();
                return;
            }
            new android.content.Intent();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_START_LIVE", true);
            mMActivity.setResult(-1, intent);
            mMActivity.finish();
        }

        public final android.widget.TextView g() {
            android.widget.TextView textView = this.f122792h;
            if (textView != null) {
                return textView;
            }
            kotlin.jvm.internal.o.o("actionBtn");
            throw null;
        }

        @Override // fs2.c
        public com.tencent.mm.ui.MMFragmentActivity getActivity() {
            return this.f122788d;
        }
    }
}
