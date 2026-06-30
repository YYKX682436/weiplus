package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public class i6 extends com.tencent.mm.plugin.finder.profile.uic.f6 {

    /* renamed from: e */
    public final jz5.g f123784e;

    /* renamed from: f */
    public final boolean f123785f;

    /* renamed from: g */
    public final com.tencent.mm.plugin.finder.viewmodel.component.ny f123786g;

    /* renamed from: h */
    public final r45.qt2 f123787h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123784e = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.h6(this));
        this.f123785f = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = parentFragment != null ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(parentFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar == null) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) a17;
        }
        this.f123786g = nyVar;
        this.f123787h = nyVar.V6();
    }

    public static /* synthetic */ void handleLoadState$default(com.tencent.mm.plugin.finder.profile.uic.i6 i6Var, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State state, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleLoadState");
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        i6Var.handleLoadState(state, str);
    }

    public void doRefreshRequest() {
    }

    public r45.qt2 getContextObj() {
        return this.f123787h;
    }

    public java.lang.String getFromUser() {
        return (java.lang.String) ((jz5.n) this.f123784e).getValue();
    }

    public boolean getHasFinderEntry() {
        return this.f123785f;
    }

    public ya2.b2 getProfileContact() {
        return ya2.h.f460484a.b(getUsername());
    }

    public java.lang.String getUsername() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final void handleLoadState(com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State state, java.lang.String str) {
        android.view.View inflate;
        kotlin.jvm.internal.o.g(state, "state");
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment == null) {
            return;
        }
        android.view.View view = fragment.getView();
        if (view == null || (inflate = view.findViewById(com.tencent.mm.R.id.rao)) == null) {
            android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(getContext());
            android.view.View view2 = fragment.getView();
            inflate = b17.inflate(com.tencent.mm.R.layout.doy, view2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view2 : null);
        }
        android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oao) : null;
        if (str != null && textView != null) {
            textView.setText(str);
        }
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.oav) : null;
        android.view.View findViewById2 = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.oai) : null;
        int i17 = com.tencent.mm.plugin.finder.profile.uic.g6.f123730a[state.ordinal()];
        if (i17 == 1) {
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (i17 == 2) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (findViewById != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 3) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (findViewById != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 != 4) {
            return;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (findViewById != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById, arrayList7.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById2 == null) {
            return;
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(findViewById2, arrayList8.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFragmentUIC", "handleLoadState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public boolean isSelf() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public boolean isSelfFlag() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelfFlag();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        int i17 = this.f123786g.f135390v;
        if (i17 == 1 || i17 == 2 || i17 == 14 || i17 == 15) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(1278L, 15L, 1L, false);
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            java.lang.String fromUser = getFromUser();
            if (fromUser == null) {
                fromUser = "";
            }
            java.lang.String username = getUsername();
            kotlin.jvm.internal.o.d(username);
            o3Var.getClass();
            java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + i17 + ",2," + fromUser + ",0," + username;
            com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", "18944 " + str);
            fVar.kvStat(18944, str);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        doRefreshRequest();
    }
}
