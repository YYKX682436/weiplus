package yf2;

/* loaded from: classes3.dex */
public final class i2 extends if2.b implements jm2.a {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f461717m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f461718n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f461719o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f461720p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView f461721q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f461722r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f461723s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f461724t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f461724t = jz5.h.b(new yf2.u1(this));
    }

    public final void Z6(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderStartLiveTopicCoverController", "applyInviteeVisibility: invitee=" + z17);
        int i17 = z17 ? 8 : 0;
        android.view.View view = this.f461719o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController", "applyInviteeVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController", "applyInviteeVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f461720p;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController", "applyInviteeVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController", "applyInviteeVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void a7(int i17) {
        if (((mm2.n0) business(mm2.n0.class)).Q6(xy2.c.e(O6()))) {
            com.tencent.mars.xlog.Log.i("FinderStartLiveTopicCoverController", "showEdit skip: co-live invitee");
            return;
        }
        android.widget.TextView textView = this.f461717m;
        if (textView != null) {
            textView.clearFocus();
        }
        android.view.View view = this.f461722r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController", "showEdit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController", "showEdit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView = this.f461721q;
        if (finderLiveDescEditView != null) {
            boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ENABLE_DESC_EXTEND_BOOLEAN_SYNC, false);
            java.lang.String str = (java.lang.String) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329076q).getValue();
            java.lang.String str2 = (java.lang.String) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329077r).getValue();
            yf2.g2 g2Var = new yf2.g2(this, i17);
            yf2.h2 h2Var = new yf2.h2(this);
            int i18 = com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView.f117603p;
            finderLiveDescEditView.c(o17, str, str2, false, g2Var, h2Var, false, "");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mars.xlog.Log.i("FinderStartLiveTopicCoverController", "createView: Creating topic and cover UI");
        this.f461717m = (android.widget.TextView) pluginLayout.findViewById(com.tencent.mm.R.id.icr);
        this.f461718n = pluginLayout.findViewById(com.tencent.mm.R.id.fga);
        this.f461719o = pluginLayout.findViewById(com.tencent.mm.R.id.ubf);
        this.f461720p = pluginLayout.findViewById(com.tencent.mm.R.id.f484609ti0);
        this.f461723s = pluginLayout.findViewById(com.tencent.mm.R.id.tvc);
        android.view.View rootView = pluginLayout.getRootView();
        android.view.ViewGroup viewGroup = rootView instanceof android.view.ViewGroup ? (android.view.ViewGroup) rootView : null;
        if (viewGroup != null) {
            android.content.Context context = pluginLayout.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView = new com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView(context);
            finderLiveDescEditView.setId(com.tencent.mm.R.id.fg6);
            finderLiveDescEditView.setVisibility(8);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 80;
            finderLiveDescEditView.setLayoutParams(layoutParams);
            finderLiveDescEditView.setBackgroundColor(pluginLayout.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
            finderLiveDescEditView.setFromScene(1);
            this.f461721q = finderLiveDescEditView;
            if (viewGroup instanceof android.widget.FrameLayout) {
                viewGroup.addView(finderLiveDescEditView);
            } else {
                pluginLayout.addView(finderLiveDescEditView);
            }
        }
        this.f461722r = pluginLayout.findViewById(com.tencent.mm.R.id.f484763fg3);
        long j17 = hl2.a.f282100b;
        com.tencent.mars.xlog.Log.i("FinderLiveCreateLivePrepareSwitch", "FINDER_LIVE_CREATE_LIVE_PREPARE_SWITCH_FLAG: " + j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FINDER_LIVE_CREATE_LIVE_PREPARE_SWITCH_FLAG enableDefaultTitle: ");
        long j18 = j17 & 2;
        sb6.append(j18 != 0);
        com.tencent.mars.xlog.Log.i("FinderLiveCreateLivePrepareSwitch", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("FinderLiveConfig FINDER_LIVE_START_LIVE_ENABLE_DEFAULT_TITLE_ON_FIRST_CREATE_LIVE: ");
        ae2.in inVar = ae2.in.f3688a;
        jz5.g gVar = ae2.in.f3697a8;
        sb7.append(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue());
        com.tencent.mars.xlog.Log.i("FinderLiveCreateLivePrepareSwitch", sb7.toString());
        boolean z17 = j18 != 0;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue();
        if (intValue != 0) {
            z17 = intValue == 1;
        }
        if (z17) {
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329076q).k(O6().getString(com.tencent.mm.R.string.f493766oz4));
        }
        android.view.View view = this.f461718n;
        if (view != null) {
            view.setOnClickListener(new yf2.y1(this));
        }
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.a2(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.c2(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.e2(this, null), 3, null);
        android.widget.TextView textView = this.f461717m;
        if (textView != null) {
            textView.setHint(zl2.q4.f473933a.n());
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView2 = this.f461721q;
        if (finderLiveDescEditView2 != null) {
            finderLiveDescEditView2.setFromScene(1);
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView3 = this.f461721q;
        if (finderLiveDescEditView3 != null) {
            finderLiveDescEditView3.setBackgroundColor(O6().getResources().getColor(com.tencent.mm.R.color.a9e));
        }
        android.widget.TextView textView2 = this.f461717m;
        if (textView2 != null) {
            textView2.setShowSoftInputOnFocus(false);
        }
        android.widget.TextView textView3 = this.f461717m;
        if (textView3 != null) {
            textView3.setOnClickListener(new yf2.v1(this));
        }
        mm2.n0 n0Var = (mm2.n0) business(mm2.n0.class);
        java.lang.String e17 = xy2.c.e(O6());
        Z6(n0Var.Q6(e17));
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.x1(n0Var, this, e17, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mars.xlog.Log.i("FinderStartLiveTopicCoverController", "onViewUnmount: Cleaning up topic and cover UI");
        com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView = this.f461721q;
        if (finderLiveDescEditView != null) {
            android.view.ViewParent parent = finderLiveDescEditView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(finderLiveDescEditView);
            }
        }
        this.f461717m = null;
        this.f461718n = null;
        this.f461719o = null;
        this.f461720p = null;
        this.f461721q = null;
        this.f461722r = null;
    }
}
