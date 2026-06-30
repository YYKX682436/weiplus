package df2;

/* loaded from: classes3.dex */
public final class ud extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231510m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f231511n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f231512o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f231513p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f231514q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f231515r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f231516s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f231517t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Integer f231518u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f231519v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231510m = "Finder.LiveAnchorTaskBubbleController";
        this.f231511n = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f231517t = jz5.h.b(new df2.pd(this));
    }

    public final android.view.View Z6(r45.d62 d62Var) {
        android.view.View i76;
        int ordinal = d62Var.ordinal();
        if (ordinal != 4) {
            if (ordinal == 15) {
                if (!zl2.r4.F1(getStore().getLiveRoomData())) {
                    if (a7()) {
                        i76 = S6(com.tencent.mm.R.id.jrj);
                    } else {
                        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) controller(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
                        if (r5Var != null) {
                            i76 = r5Var.i7(d62Var);
                        }
                    }
                }
                i76 = null;
            } else if (ordinal != 22) {
                if (ordinal == 26) {
                    if (a7()) {
                        i76 = S6(com.tencent.mm.R.id.fbf);
                    }
                    i76 = null;
                } else if (ordinal == 40) {
                    i76 = a7() ? S6(com.tencent.mm.R.id.jrj) : S6(com.tencent.mm.R.id.ewg);
                } else if (ordinal == 43) {
                    if (a7()) {
                        i76 = S6(com.tencent.mm.R.id.f484541ek2);
                    }
                    i76 = null;
                } else if (ordinal == 44) {
                    if (a7()) {
                        i76 = S6(com.tencent.mm.R.id.mut);
                    }
                    i76 = null;
                } else if (ordinal != 59) {
                    if (ordinal == 60) {
                        if (a7()) {
                            i76 = S6(com.tencent.mm.R.id.jyy);
                        } else {
                            com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var2 = (com.tencent.mm.plugin.finder.live.viewmodel.r5) controller(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
                            if (r5Var2 != null) {
                                i76 = r5Var2.i7(d62Var);
                            }
                        }
                    }
                    i76 = null;
                } else if (a7()) {
                    i76 = S6(com.tencent.mm.R.id.f87);
                } else {
                    com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var3 = (com.tencent.mm.plugin.finder.live.viewmodel.r5) controller(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
                    if (r5Var3 != null) {
                        i76 = r5Var3.i7(d62Var);
                    }
                    i76 = null;
                }
            } else if (a7()) {
                i76 = S6(com.tencent.mm.R.id.jrj);
            } else {
                com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var4 = (com.tencent.mm.plugin.finder.live.viewmodel.r5) controller(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
                if (r5Var4 != null) {
                    i76 = r5Var4.i7(d62Var);
                }
                i76 = null;
            }
        } else if (a7()) {
            i76 = S6(com.tencent.mm.R.id.jrj);
        } else {
            com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var5 = (com.tencent.mm.plugin.finder.live.viewmodel.r5) controller(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
            if (r5Var5 != null) {
                i76 = r5Var5.i7(d62Var);
            }
            i76 = null;
        }
        if (i76 == null || !i76.isShown()) {
            return null;
        }
        return i76;
    }

    public final boolean a7() {
        return ((mm2.c1) business(mm2.c1.class)).a8();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        android.view.View view;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.view.View T6 = T6(com.tencent.mm.R.id.rnk, com.tencent.mm.R.id.rnn);
        if (T6 != null) {
            T6.setOnTouchListener(new df2.qd(this));
        } else {
            T6 = null;
        }
        this.f231512o = T6;
        if (T6 == null || (view = T6.findViewById(com.tencent.mm.R.id.rvc)) == null) {
            view = null;
        } else {
            view.setOnClickListener(new df2.rd(this));
        }
        this.f231513p = view;
        android.view.View view2 = this.f231512o;
        this.f231514q = view2 != null ? view2.findViewById(com.tencent.mm.R.id.rva) : null;
        android.view.View view3 = this.f231512o;
        this.f231515r = view3 != null ? view3.findViewById(com.tencent.mm.R.id.rv_) : null;
        android.view.View view4 = this.f231512o;
        this.f231516s = view4 != null ? (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.rvd) : null;
        android.view.View view5 = this.f231512o;
        if (view5 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view5, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = this.f231511n;
        liveMutableData.f111660d = true;
        liveMutableData.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.td(this));
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f231512o = null;
        this.f231513p = null;
        this.f231514q = null;
        this.f231515r = null;
        this.f231516s = null;
    }
}
