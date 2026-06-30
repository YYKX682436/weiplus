package df2;

/* loaded from: classes10.dex */
public final class k9 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230559m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f230560n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f230561o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f230562p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230563q;

    /* renamed from: r, reason: collision with root package name */
    public if2.d0 f230564r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f230565s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230559m = "Finder.HotCommentAnimationController";
        this.f230560n = "hotcommentanimation";
        this.f230561o = new java.util.ArrayList();
        this.f230562p = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public final void Z6(r45.ii1 animationInfo) {
        kotlin.jvm.internal.o.g(animationInfo, "animationInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addAnimation ");
        boolean z17 = false;
        sb6.append(animationInfo.getString(0));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f230559m;
        com.tencent.mars.xlog.Log.i(str, sb7);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f230562p;
        concurrentLinkedQueue.add(animationInfo);
        kotlinx.coroutines.r2 r2Var = this.f230563q;
        if ((r2Var == null || ((kotlinx.coroutines.c3) r2Var).isCancelled()) ? false : true) {
            kotlinx.coroutines.r2 r2Var2 = this.f230563q;
            if (r2Var2 != null && !((kotlinx.coroutines.c3) r2Var2).A()) {
                z17 = true;
            }
            if (z17) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(str, "checkStartJob launch, animationPlayQueue size:" + concurrentLinkedQueue.size());
        this.f230563q = com.tencent.mm.plugin.finder.live.util.y.o(this, kotlinx.coroutines.q1.f310570c, null, new df2.h9(this, null), 2, null);
    }

    public final void a7() {
        java.lang.String str = this.f230559m;
        com.tencent.mars.xlog.Log.i(str, "checkInitView");
        if (!(!this.f230561o.isEmpty())) {
            com.tencent.mars.xlog.Log.i(str, "checkInitView but animationResourceList is empty, ignore");
            return;
        }
        android.view.View T6 = T6(com.tencent.mm.R.id.f4u, com.tencent.mm.R.id.f4t);
        if (T6 != null) {
            this.f230564r = new if2.d0(T6, this);
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) T6.findViewById(com.tencent.mm.R.id.h1a);
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.L1));
            this.f230565s = mMPAGView;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkInitView pagView:");
            com.tencent.mm.view.MMPAGView mMPAGView2 = this.f230565s;
            sb6.append(mMPAGView2 != null ? mMPAGView2.hashCode() : 0);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.kw1 kw1Var;
        java.util.LinkedList list;
        super.onLiveStart(hc1Var);
        java.util.ArrayList arrayList = this.f230561o;
        arrayList.clear();
        if (hc1Var != null && (kw1Var = (r45.kw1) hc1Var.getCustom(62)) != null && (list = kw1Var.getList(0)) != null) {
            arrayList.addAll(list);
        }
        com.tencent.mars.xlog.Log.i(this.f230559m, "onLiveStart animationList:".concat(kz5.n0.g0(arrayList, null, null, null, 0, null, df2.i9.f230385d, 31, null)));
        a7();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        this.f230562p.clear();
        this.f291103i = new df2.j9(this);
        a7();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f230562p.clear();
        this.f230565s = null;
    }
}
