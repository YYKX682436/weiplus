package df2;

/* loaded from: classes3.dex */
public final class t6 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f231415m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f231416n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f231417o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f231418p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.b f231419q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f231420r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.r2 f231421s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Map f231422t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Map f231423u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231419q = new df2.k6(this);
        this.f231420r = "";
        this.f231422t = new java.util.LinkedHashMap();
        this.f231423u = new java.util.LinkedHashMap();
    }

    public static final boolean Z6(df2.t6 t6Var, java.lang.String str, float f17, java.lang.String str2, java.lang.String str3, float f18, float f19, float f27, float f28, java.lang.String str4, java.lang.String str5) {
        kn0.p pVar;
        t6Var.getClass();
        if (((java.lang.Number) ae2.in.f3688a.G().r()).intValue() == 0) {
            return false;
        }
        tn0.w0 w0Var = dk2.ef.f233378d;
        if ((w0Var == null || (pVar = w0Var.D) == null || !pVar.f309589i) ? false : true) {
            return false;
        }
        java.lang.String f76 = t6Var.f7(str);
        if (f76.length() == 0) {
            com.tencent.mars.xlog.Log.i("Finder.GestureEffectPagController", "#executeAnimationCommand widgetBucketKey is empty, return");
        }
        df2.e6 e6Var = (df2.e6) ((java.util.LinkedHashMap) t6Var.f231422t).get(f76);
        if (e6Var != null) {
            kotlinx.coroutines.r2 r2Var = e6Var.f230039f;
            if ((r2Var != null && r2Var.a()) || e6Var.f230036c.f()) {
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.GestureEffectPagController", "#executeAnimationCommand ready: sdkUserId=" + str + " aspect=" + f17 + " gestureId=" + str2 + " randomId=" + str3 + " transX=" + f18 + " transY=" + f19 + " rotation=" + f27 + " scale=" + f28 + " giftComboId=" + str4 + " giftSoundId=" + str5);
        com.tencent.mm.plugin.finder.live.util.y.d(t6Var, null, null, new df2.h6(t6Var, str, str2, f17, f18, f19, f27, f28, str4, str5, null), 3, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(df2.t6 r18, r45.ir1 r19, df2.e6 r20, sg2.d r21, float r22, float r23, float r24, float r25, java.lang.String r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.t6.a7(df2.t6, r45.ir1, df2.e6, sg2.d, float, float, float, float, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(df2.t6 r16, r45.ir1 r17, df2.e6 r18, sg2.d r19, float r20, float r21, float r22, float r23, java.lang.String r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.t6.b7(df2.t6, r45.ir1, df2.e6, sg2.d, float, float, float, float, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c7() {
        com.tencent.mars.xlog.Log.i("Finder.GestureEffectPagController", "#cleanAllStreamWidget");
        java.util.Map map = this.f231422t;
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
            ((df2.e6) entry.getValue()).f230036c.n();
            android.widget.FrameLayout frameLayout = ((df2.e6) entry.getValue()).f230034a;
            android.view.ViewParent parent = frameLayout.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        ((java.util.LinkedHashMap) map).clear();
    }

    public final void d7(int i17, java.lang.String comboId, long j17) {
        kotlin.jvm.internal.o.g(comboId, "comboId");
        com.tencent.mars.xlog.Log.i("Finder.GestureEffectPagController", "#enterGiftMode " + i17 + ' ' + comboId + " totalShowTime=" + j17);
        if (((java.lang.Number) ae2.in.f3688a.G().r()).intValue() == 0) {
            return;
        }
        if (!(in0.q.f292769b2 != null)) {
            com.tencent.mars.xlog.Log.i("Finder.GestureEffectPagController", "#enterGiftMode not anchor, return");
            return;
        }
        e7();
        if (j17 == 0) {
            return;
        }
        kotlinx.coroutines.r2 r2Var = this.f231421s;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f231421s = com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new df2.f6(this, comboId, j17, i17, null), 3, null);
    }

    public final void e7() {
        com.tencent.mars.xlog.Log.i("Finder.GestureEffectPagController", "#exitGiftMode");
        this.f231420r = "";
        android.widget.LinearLayout linearLayout = this.f231416n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (df2.d6.f229944n.c(getStore().getLiveRoomData())) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.GestureEffectPagController", "#exitGiftMode turn off elable.");
        df2.n5 n5Var = (df2.n5) controller(df2.n5.class);
        if (n5Var == null) {
            return;
        }
        n5Var.Z6(false);
    }

    public final java.lang.String f7(java.lang.String str) {
        return str.length() == 0 ? "anchor_self" : (kotlin.jvm.internal.o.b(str, ((mm2.e1) business(mm2.e1.class)).f328987q.f380301n) || this.f231423u.containsKey(str)) ? str : "";
    }

    public final void g7(java.util.LinkedHashMap map) {
        kotlin.jvm.internal.o.g(map, "map");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : map.entrySet()) {
            sb6.append(((java.lang.String) entry.getKey()) + ':' + entry.getValue() + ' ');
        }
        com.tencent.mars.xlog.Log.i("Finder.GestureEffectPagController", "#cleanAllStreamWidget " + ((java.lang.Object) sb6));
        java.util.Map map2 = this.f231423u;
        ((java.util.LinkedHashMap) map2).clear();
        map2.putAll(map);
        c7();
    }

    public final void h7(java.lang.String info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (in0.q.f292769b2 != null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        if (((java.lang.Number) ae2.in.f3688a.G().r()).intValue() == 0) {
            com.tencent.mars.xlog.Log.i("Finder.GestureEffectPagController", "#onViewMount FINDER_LIVE_GESTURE_EFFECT_CONFIG false");
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) T6(com.tencent.mm.R.id.ezp, com.tencent.mm.R.id.ezo);
        if (viewGroup != null) {
            this.f231415m = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.gqn);
            if (in0.q.f292769b2 != null) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            this.f231416n = (android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.gqr);
            this.f231417o = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.gqq);
            this.f231418p = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.gqs);
            viewGroup.requestLayout();
        }
        boolean z17 = in0.q.f292769b2 != null;
        yz5.b l17 = this.f231419q;
        if (z17) {
            tn0.w0 w0Var = dk2.ef.f233378d;
            if (w0Var != null) {
                kotlin.jvm.internal.o.g(l17, "l");
                ((java.util.ArrayList) w0Var.C1).add(l17);
            }
            if (in0.q.f292769b2 == null) {
                in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
            }
            in0.q qVar = in0.q.f292769b2;
            kotlin.jvm.internal.o.d(qVar);
            qVar.Y1 = new df2.i6(this);
            return;
        }
        tn0.w0 w0Var2 = dk2.ef.f233378d;
        if (w0Var2 != null) {
            kotlin.jvm.internal.o.g(l17, "l");
            ((java.util.ArrayList) w0Var2.C1).add(l17);
        } else if (pluginLayout instanceof com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout) {
            ws2.k1 a17 = ws2.k1.f449066r.a();
            kotlin.jvm.internal.o.g(l17, "l");
            ((java.util.ArrayList) a17.f449069a).add(l17);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        android.widget.LinearLayout linearLayout = this.f231416n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f231416n = null;
        this.f231417o = null;
        this.f231418p = null;
        this.f231415m = null;
        this.f231420r = "";
        e7();
        c7();
        boolean z17 = in0.q.f292769b2 != null;
        yz5.b l17 = this.f231419q;
        if (z17) {
            tn0.w0 w0Var = dk2.ef.f233378d;
            if (w0Var != null) {
                kotlin.jvm.internal.o.g(l17, "l");
                ((java.util.ArrayList) w0Var.C1).remove(l17);
            }
            if (in0.q.f292769b2 == null) {
                in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
            }
            in0.q qVar = in0.q.f292769b2;
            kotlin.jvm.internal.o.d(qVar);
            qVar.Y1 = null;
            return;
        }
        tn0.w0 w0Var2 = dk2.ef.f233378d;
        if (w0Var2 != null) {
            kotlin.jvm.internal.o.g(l17, "l");
            ((java.util.ArrayList) w0Var2.C1).remove(l17);
        } else if (pluginLayout instanceof com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout) {
            ws2.k1 a17 = ws2.k1.f449066r.a();
            kotlin.jvm.internal.o.g(l17, "l");
            ((java.util.ArrayList) a17.f449069a).remove(l17);
        }
    }
}
