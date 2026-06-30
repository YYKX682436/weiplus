package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public class iz extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f134771d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f134772e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f134773f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f134774g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f134775h;

    /* renamed from: i, reason: collision with root package name */
    public int f134776i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f134777m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f134778n;

    /* renamed from: o, reason: collision with root package name */
    public int f134779o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f134780p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134774g = new java.util.ArrayList();
        this.f134778n = "";
    }

    public final void O6() {
        if ((!this.f134774g.isEmpty()) && this.f134779o == 1) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f134772e;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            android.view.View view = this.f134773f;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC", "updateList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC", "updateList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f134772e;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        android.view.View view2 = this.f134773f;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC", "updateList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC", "updateList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderSelfContinueWatchUIC$onCreate$2] */
    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f134779o = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_CONTINUE_WATCH_INT_SYNC, 0);
        this.f134773f = findViewById(com.tencent.mm.R.id.v3k);
        this.f134772e = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.szy);
        new com.tencent.mm.plugin.finder.viewmodel.component.uy().b(this.f134772e);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f134772e;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
        }
        com.tencent.mm.plugin.finder.viewmodel.component.yy yyVar = new com.tencent.mm.plugin.finder.viewmodel.component.yy(new in5.s() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderSelfContinueWatchUIC$onCreate$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.viewmodel.component.xy(com.tencent.mm.plugin.finder.viewmodel.component.iz.this);
            }
        }, this.f134774g);
        this.f134775h = yyVar;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f134772e;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(yyVar);
        }
        com.tencent.mm.plugin.finder.view.SpringBackLayout springBackLayout = (com.tencent.mm.plugin.finder.view.SpringBackLayout) findViewById(com.tencent.mm.R.id.szz);
        if (springBackLayout != null) {
            springBackLayout.setMoveToEdgeCallback(new com.tencent.mm.plugin.finder.viewmodel.component.az(springBackLayout, this));
        }
        final androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderContinueWatchEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderContinueWatchEvent>(activity) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderSelfContinueWatchUIC$onCreate$4
            {
                this.__eventId = 785522696;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderContinueWatchEvent finderContinueWatchEvent) {
                com.tencent.mm.autogen.events.FinderContinueWatchEvent event = finderContinueWatchEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.bz(event, com.tencent.mm.plugin.finder.viewmodel.component.iz.this));
                return true;
            }
        };
        this.f134771d = iListener;
        iListener.alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.sdk.event.IListener iListener = this.f134771d;
        if (iListener != null) {
            iListener.dead();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134774g = new java.util.ArrayList();
        this.f134778n = "";
    }
}
