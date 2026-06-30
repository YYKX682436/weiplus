package df2;

/* loaded from: classes3.dex */
public final class pv extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231112m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f231113n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f231114o;

    /* renamed from: p, reason: collision with root package name */
    public vd2.j5 f231115p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231112m = "LiveViewConflictController";
        this.f231113n = new java.util.LinkedList();
        this.f231114o = new byte[0];
    }

    public final void Z6(vd2.j5 j5Var) {
        synchronized (this.f231114o) {
            if (!this.f231113n.contains(j5Var)) {
                this.f231113n.add(j5Var);
                java.util.LinkedList linkedList = this.f231113n;
                if (linkedList.size() > 1) {
                    kz5.g0.t(linkedList, new df2.ov());
                }
            }
        }
    }

    public final void a7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f231112m, "[clearAll] scene:" + str);
        synchronized (this.f231114o) {
            this.f231113n.clear();
            this.f231115p = null;
        }
    }

    public final void b7(vd2.j5 view) {
        kotlin.jvm.internal.o.g(view, "view");
        synchronized (this.f231114o) {
            if (kotlin.jvm.internal.o.b(view, this.f231115p)) {
                com.tencent.mars.xlog.Log.i(this.f231112m, "[hideViewSelf] hide curShowingView: " + view.Q());
                view.o1();
                this.f231115p = null;
                c7();
            } else if (this.f231113n.contains(view)) {
                com.tencent.mars.xlog.Log.i(this.f231112m, "[hideViewSelf] remove which is waiting: " + view.Q());
                this.f231113n.remove(view);
            } else {
                com.tencent.mars.xlog.Log.i(this.f231112m, "[hideViewSelf] view: " + view.Q() + " not in viewConflict, hide itself");
                view.o1();
            }
        }
    }

    public final void c7() {
        java.lang.Object pollFirst;
        java.lang.String str;
        synchronized (this.f231114o) {
            pollFirst = this.f231113n.pollFirst();
        }
        java.lang.String str2 = this.f231112m;
        vd2.j5 j5Var = (vd2.j5) pollFirst;
        if (j5Var == null || (str = j5Var.Q()) == null) {
            str = "null";
        }
        com.tencent.mars.xlog.Log.i(str2, "[pollNextAndNotifyShow] get next to Show:  ".concat(str));
        if (j5Var != null) {
            j5Var.C4();
        }
        this.f231115p = j5Var;
    }

    public final void d7(vd2.j5 view) {
        kotlin.jvm.internal.o.g(view, "view");
        synchronized (this.f231114o) {
            if (kotlin.jvm.internal.o.b(this.f231115p, view)) {
                com.tencent.mars.xlog.Log.i(this.f231112m, "[tryToShow] view:" + view.Q() + " showing already");
                return;
            }
            if (this.f231115p == null) {
                com.tencent.mars.xlog.Log.i(this.f231112m, "[tryToShow] curShowingView is null , " + view.Q() + " show");
                this.f231115p = view;
                view.C4();
            } else {
                int priority = view.priority();
                vd2.j5 j5Var = this.f231115p;
                kotlin.jvm.internal.o.d(j5Var);
                if (priority < j5Var.priority()) {
                    java.lang.String str = this.f231112m;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[tryToShow]  ");
                    sb6.append(view.Q());
                    sb6.append(" is higher than curShowingView:");
                    vd2.j5 j5Var2 = this.f231115p;
                    kotlin.jvm.internal.o.d(j5Var2);
                    sb6.append(j5Var2.Q());
                    com.tencent.mars.xlog.Log.i(str, sb6.toString());
                    vd2.j5 j5Var3 = this.f231115p;
                    if (j5Var3 != null) {
                        j5Var3.o1();
                    }
                    vd2.j5 j5Var4 = this.f231115p;
                    kotlin.jvm.internal.o.d(j5Var4);
                    Z6(j5Var4);
                    this.f231115p = view;
                    view.C4();
                } else {
                    int priority2 = view.priority();
                    vd2.j5 j5Var5 = this.f231115p;
                    kotlin.jvm.internal.o.d(j5Var5);
                    if (priority2 == j5Var5.priority()) {
                        java.lang.String str2 = this.f231112m;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[tryToShow]  ");
                        sb7.append(view.Q());
                        sb7.append(" is eqauls than curShowingView:");
                        vd2.j5 j5Var6 = this.f231115p;
                        kotlin.jvm.internal.o.d(j5Var6);
                        sb7.append(j5Var6.Q());
                        com.tencent.mars.xlog.Log.i(str2, sb7.toString());
                        this.f231115p = view;
                        view.C4();
                    } else {
                        java.lang.String str3 = this.f231112m;
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[tryToShow]  ");
                        sb8.append(view.Q());
                        sb8.append(" is lower than curShowingView:");
                        vd2.j5 j5Var7 = this.f231115p;
                        kotlin.jvm.internal.o.d(j5Var7);
                        sb8.append(j5Var7.Q());
                        com.tencent.mars.xlog.Log.i(str3, sb8.toString());
                        view.o1();
                        Z6(view);
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        a7("onLiveDeactivate");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        android.content.Context O6 = O6();
        com.tencent.mm.ui.MMActivity mMActivity = O6 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) O6 : null;
        boolean z17 = false;
        if (mMActivity != null) {
            com.tencent.mars.xlog.Log.i(this.f231112m, "[onViewUnmount] isFinishing:" + mMActivity.isFinishing() + ", isDestroyed:" + mMActivity.isDestroyed());
            if (mMActivity.isFinishing() || mMActivity.isDestroyed()) {
                z17 = true;
            }
        }
        if (z17) {
            a7("onViewUnmount");
        }
    }
}
