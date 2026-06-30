package if2;

/* loaded from: classes3.dex */
public abstract class b extends com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController implements if2.m0, mf2.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f291098d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.ub f291099e;

    /* renamed from: f, reason: collision with root package name */
    public int f291100f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f291101g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f291102h;

    /* renamed from: i, reason: collision with root package name */
    public if2.l0 f291103i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f291098d = "BaseLiveRoomController";
    }

    public static /* synthetic */ void Y6(if2.b bVar, qo0.b bVar2, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
        if ((i17 & 2) != 0) {
            bundle = null;
        }
        bVar.X6(bVar2, bundle);
    }

    public final com.tencent.mm.ui.MMActivity N6() {
        java.lang.Object obj = this.f291099e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            return (com.tencent.mm.ui.MMActivity) context;
        }
        return null;
    }

    public final android.content.Context O6() {
        com.tencent.mm.ui.MMActivity N6 = N6();
        if (N6 != null) {
            return N6;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    public final dk2.xf P6() {
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        if (ubVar != null) {
            return ubVar.provideFinderLiveAssistant();
        }
        return null;
    }

    public tn0.w0 Q6() {
        tn0.w0 tRTCLiveCore;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null && (tRTCLiveCore = k0Var.getTRTCLiveCore()) != null) {
            return tRTCLiveCore;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        return dk2.ef.f233378d;
    }

    public final com.tencent.mm.plugin.finder.live.plugin.l R6(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        if (ubVar != null) {
            return ubVar.getPlugin(modelClass);
        }
        return null;
    }

    public final android.view.View S6(int i17) {
        java.lang.Object obj = this.f291099e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view != null) {
            return view.findViewById(i17);
        }
        return null;
    }

    public final android.view.View T6(int i17, int i18) {
        java.lang.Object obj = this.f291099e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view == null) {
            return null;
        }
        android.view.View findViewById = view.findViewById(i18);
        if (findViewById != null) {
            return findViewById;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) view.findViewById(i17);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        return inflate instanceof android.view.View ? inflate : null;
    }

    public final boolean U6() {
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        android.content.res.Resources resources2;
        android.content.res.Resources resources3;
        android.content.res.Resources resources4;
        android.content.res.Configuration configuration2;
        java.lang.Object obj = this.f291099e;
        android.content.res.Configuration configuration3 = null;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        android.content.Context context = view != null ? view.getContext() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isLandscape orientation: ");
        sb6.append((context == null || (resources4 = context.getResources()) == null || (configuration2 = resources4.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration2.orientation));
        sb6.append(" context: ");
        sb6.append(context);
        sb6.append("  hashCode: ");
        android.content.res.Configuration configuration4 = (context == null || (resources3 = context.getResources()) == null) ? null : resources3.getConfiguration();
        sb6.append(configuration4 != null ? configuration4.hashCode() : 0);
        sb6.append(" configuration: ");
        if (context != null && (resources2 = context.getResources()) != null) {
            configuration3 = resources2.getConfiguration();
        }
        sb6.append(configuration3);
        com.tencent.mars.xlog.Log.i(this.f291098d, sb6.toString());
        return (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true;
    }

    public final void V6(java.lang.String tag, java.lang.String str) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(str, "str");
        com.tencent.mars.xlog.Log.i(tag, hashCode() + ' ' + str);
    }

    public final void W6(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (zl2.r4.f473950a.w1()) {
            callback.invoke();
            return;
        }
        this.f291101g = callback;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null) {
            k0Var.onPortraitAction(((mm2.c1) business(mm2.c1.class)).f328813h2, ((mm2.c1) business(mm2.c1.class)).f328807g2, null, null);
        }
    }

    public final void X6(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null) {
            k0Var.statusChange(status, bundle);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public final void afterViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        pluginLayout.postDelayed(new if2.a(this), 600L);
    }

    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        this.f291101g = null;
        this.f291102h = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
    }
}
