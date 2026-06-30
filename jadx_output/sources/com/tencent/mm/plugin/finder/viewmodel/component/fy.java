package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fy extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f134442d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.ey f134443e;

    /* renamed from: f, reason: collision with root package name */
    public final kd2.j0 f134444f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f134445g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134443e = new com.tencent.mm.plugin.finder.viewmodel.component.ey(this);
        this.f134444f = new kd2.j0();
        this.f134445g = "FinderRecoverPageUIC_" + hashCode() + '_' + java.lang.System.currentTimeMillis();
    }

    public static final androidx.recyclerview.widget.RecyclerView O6(com.tencent.mm.plugin.finder.viewmodel.component.fy fyVar) {
        android.view.View findViewById;
        if (fyVar.getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            androidx.appcompat.app.AppCompatActivity activity = fyVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            android.view.View view = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment().getView();
            findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.m6e) : null;
        } else {
            findViewById = fyVar.findViewById(com.tencent.mm.R.id.m6e);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = findViewById instanceof com.tencent.mm.view.RefreshLoadMoreLayout ? (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById : null;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout.getRecyclerView();
        }
        return null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        boolean z17 = getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI;
        com.tencent.mm.plugin.finder.viewmodel.component.ey eyVar = this.f134443e;
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            for (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment : ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getFragments()) {
                android.app.Activity context = getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                fc2.c Y6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).Y6(finderHomeTabFragment.f129265p);
                if (Y6 != null) {
                    Y6.a(eyVar);
                }
            }
        } else {
            android.app.Activity context2 = getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.a(eyVar);
            }
        }
        final androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MemberStatusEvent>(activity2) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderRecoverPageUIC$onCreateAfter$2
            {
                this.__eventId = -616994146;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MemberStatusEvent memberStatusEvent) {
                ya2.b2 contact;
                com.tencent.mm.autogen.events.MemberStatusEvent event = memberStatusEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.viewmodel.component.fy fyVar = com.tencent.mm.plugin.finder.viewmodel.component.fy.this;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = fyVar.f134442d;
                if (baseFinderFeed == null || (contact = baseFinderFeed.getContact()) == null) {
                    return false;
                }
                java.lang.String D0 = contact.D0();
                am.rj rjVar = event.f54494g;
                D0.equals(rjVar.f7823b);
                if (eo2.f.f255565a.d(java.lang.Integer.valueOf(rjVar.f7824c))) {
                    return false;
                }
                fyVar.f134444f.c();
                return false;
            }
        };
        kd2.j0 j0Var = this.f134444f;
        j0Var.getClass();
        java.lang.String recoverPageKey = this.f134445g;
        kotlin.jvm.internal.o.g(recoverPageKey, "recoverPageKey");
        xs.k1 k1Var = (xs.k1) i95.n0.c(xs.k1.class);
        if (k1Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderRecoverPageHelper", "ISecRecoveryDataService is null, skip");
            return;
        }
        j0Var.f306762a = recoverPageKey;
        com.tencent.mars.xlog.Log.i("Finder.FinderRecoverPageHelper", "start register, recoverPageKey: ".concat(recoverPageKey));
        ((q04.y) k1Var).wi(recoverPageKey, 2, j0Var);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f134444f.getClass();
        java.lang.String recoverPageKey = this.f134445g;
        kotlin.jvm.internal.o.g(recoverPageKey, "recoverPageKey");
        xs.k1 k1Var = (xs.k1) i95.n0.c(xs.k1.class);
        if (k1Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderRecoverPageHelper", "ISecRecoveryDataService is null, skip");
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderRecoverPageHelper", "removeRecoverPage start unregister, recoverPageKey: ".concat(recoverPageKey));
            ((q04.y) k1Var).Bi(recoverPageKey, 2);
        }
    }
}
