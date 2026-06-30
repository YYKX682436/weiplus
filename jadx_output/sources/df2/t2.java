package df2;

/* loaded from: classes3.dex */
public final class t2 extends if2.b implements mf2.c, com.tencent.mm.plugin.finder.live.view.s6 {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.r6 f231396m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f231397n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f231398o;

    /* renamed from: p, reason: collision with root package name */
    public if2.d0 f231399p;

    /* renamed from: q, reason: collision with root package name */
    public df2.a3 f231400q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f231401r;

    /* renamed from: s, reason: collision with root package name */
    public df2.l2 f231402s;

    /* renamed from: t, reason: collision with root package name */
    public df2.m2 f231403t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Boolean f231404u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f231405v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231402s = df2.l2.f230622d;
        this.f231403t = df2.m2.f230745d;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0132 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g7(df2.t2 r8, java.util.List r9, boolean r10, int r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.t2.g7(df2.t2, java.util.List, boolean, int, java.lang.Object):void");
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        df2.m2 m2Var;
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        if (e7()) {
            m2Var = df2.m2.f230747f;
        } else {
            m2Var = ((mm2.o4) business(mm2.o4.class)).E7() || ((mm2.o4) business(mm2.o4.class)).F7() ? df2.m2.f230746e : df2.m2.f230745d;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicCenterController", "onMicInfoChanged, oldState=" + this.f231403t + ", newState=" + m2Var);
        if (m2Var == this.f231403t) {
            return;
        }
        this.f231403t = m2Var;
        com.tencent.mars.xlog.Log.i("FinderLiveMicCenterController", "onMicInfoChanged, currentMicState=" + this.f231403t);
        int ordinal = this.f231403t.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            Z6(true);
        } else {
            if (ordinal != 2) {
                return;
            }
            a7(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(boolean r26) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.t2.Z6(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x017a, code lost:
    
        if (r5 == null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(boolean r28) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.t2.a7(boolean):void");
    }

    public final void b7() {
        android.view.View view;
        if2.d0 d0Var = this.f231399p;
        if (d0Var != null) {
            d0Var.a(8);
        }
        com.tencent.mm.plugin.finder.live.view.r6 r6Var = this.f231396m;
        if (r6Var != null && (view = r6Var.f116631a) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
        }
        f7();
        android.view.View view2 = this.f231397n;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterController", "finalizeDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterController", "finalizeDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f231398o;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterController", "finalizeDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterController", "finalizeDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final km2.q c7() {
        java.lang.Object obj;
        java.util.List list = ((mm2.o4) business(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                km2.q qVar = (km2.q) next;
                if (com.tencent.mm.sdk.platformtools.t8.D0(qVar != null ? qVar.f309170a : null, ((mm2.c1) business(mm2.c1.class)).m8())) {
                    obj = next;
                    break;
                }
            }
        }
        return (km2.q) obj;
    }

    public final int d7() {
        km2.q c76 = c7();
        if (c76 != null) {
            return c76.f309191v;
        }
        return 0;
    }

    public final boolean e7() {
        return ((mm2.o4) business(mm2.o4.class)).G7() && c7() != null;
    }

    public final void f7() {
        android.view.ViewGroup viewGroup;
        if (this.f231401r && (viewGroup = (android.view.ViewGroup) S6(com.tencent.mm.R.id.tp9)) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = -2;
            viewGroup.setLayoutParams(layoutParams);
            this.f231401r = false;
        }
    }

    @Override // mf2.c
    public void j2() {
        if (!e7()) {
            this.f231405v = false;
            return;
        }
        boolean z17 = pm0.v.z(d7(), 16);
        if (this.f231405v != z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicCenterController", "notifyOtherMicUserVolumeChange, mute by anchor changed: " + this.f231405v + " -> " + z17);
            this.f231405v = z17;
            g7(this, kz5.b0.c(com.tencent.mm.plugin.finder.live.view.n6.f116516d), false, 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mars.xlog.Log.i("FinderLiveMicCenterController", "onViewMount");
        this.f231397n = S6(com.tencent.mm.R.id.fox);
        this.f231398o = S6(com.tencent.mm.R.id.fow);
        this.f291103i = new df2.p2(this);
        ((mm2.o4) business(mm2.o4.class)).A.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.q2(this));
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mars.xlog.Log.i("FinderLiveMicCenterController", "onViewUnmount");
        df2.a3 a3Var = this.f231400q;
        if (a3Var != null) {
            a3Var.b();
        }
        this.f231402s = df2.l2.f230622d;
        f7();
        Z6(false);
        com.tencent.mm.plugin.finder.live.view.r6 r6Var = this.f231396m;
        if (r6Var != null) {
            android.animation.ValueAnimator valueAnimator = r6Var.f116646p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            r6Var.f116646p = null;
            android.animation.ValueAnimator valueAnimator2 = r6Var.f116647q;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            r6Var.f116647q = null;
            android.animation.ValueAnimator valueAnimator3 = r6Var.f116648r;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            r6Var.f116648r = null;
            android.animation.ValueAnimator valueAnimator4 = r6Var.f116649s;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            r6Var.f116649s = null;
            android.animation.ValueAnimator valueAnimator5 = r6Var.f116650t;
            if (valueAnimator5 != null) {
                valueAnimator5.cancel();
            }
            r6Var.f116650t = null;
        }
        this.f231396m = null;
        this.f231399p = null;
        this.f231400q = null;
        this.f231397n = null;
        this.f231398o = null;
    }
}
