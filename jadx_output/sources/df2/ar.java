package df2;

/* loaded from: classes3.dex */
public final class ar extends if2.b implements if2.e, mf2.a {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f229737m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f229738n;

    /* renamed from: o, reason: collision with root package name */
    public org.libpag.PAGFile f229739o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.rfx.RfxPagFile f229740p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f229741q;

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f229742r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f229743s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f229744t;

    /* renamed from: u, reason: collision with root package name */
    public int f229745u;

    /* renamed from: v, reason: collision with root package name */
    public r45.lv1 f229746v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.mc f229747w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229737m = "LiveProductGiftBubbleController";
        this.f229738n = ae2.in.f3688a.a(ym5.f6.f463303c2);
        this.f229741q = new com.tencent.mm.sdk.platformtools.b4("LiveProductGiftBubbleController::Timer", (com.tencent.mm.sdk.platformtools.a4) new df2.yq(this), true);
        this.f229742r = kotlinx.coroutines.flow.i3.a(-1);
        this.f229743s = kotlinx.coroutines.flow.i3.a(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(df2.ar r17, android.content.Context r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ar.Z6(df2.ar, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a7() {
        r45.uv1 uv1Var;
        r45.p42 p42Var;
        r45.uv1 uv1Var2;
        r45.p42 p42Var2;
        boolean e76 = e7(this.f229746v);
        java.lang.String str = this.f229737m;
        if (e76) {
            com.tencent.mars.xlog.Log.i(str, "followAttend failed, isAttend");
            return;
        }
        r45.lv1 lv1Var = this.f229746v;
        java.lang.Integer num = null;
        java.lang.String string = lv1Var != null ? lv1Var.getString(0) : null;
        if (string == null || string.length() == 0) {
            com.tencent.mars.xlog.Log.i(str, "followAttend failed, activityId:" + string);
            return;
        }
        r45.lv1 lv1Var2 = this.f229746v;
        java.lang.Integer valueOf = (lv1Var2 == null || (uv1Var2 = (r45.uv1) lv1Var2.getCustom(1)) == null || (p42Var2 = (r45.p42) uv1Var2.getCustom(10)) == null) ? null : java.lang.Integer.valueOf(p42Var2.getInteger(0));
        if ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 6)) {
            com.tencent.mm.plugin.finder.live.util.y.d(this, kotlinx.coroutines.q1.f310570c, null, new df2.kq(this, string, null), 2, null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("followAttend failed, attend_type:");
        r45.lv1 lv1Var3 = this.f229746v;
        if (lv1Var3 != null && (uv1Var = (r45.uv1) lv1Var3.getCustom(1)) != null && (p42Var = (r45.p42) uv1Var.getCustom(10)) != null) {
            num = java.lang.Integer.valueOf(p42Var.getInteger(0));
        }
        sb6.append(num);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    public final com.tencent.mm.view.MMPAGView b7() {
        android.view.View c76 = c7();
        if (c76 == null) {
            c76 = (android.view.ViewGroup) S6(com.tencent.mm.R.id.tiq);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) (c76 != null ? c76.findViewById(com.tencent.mm.R.id.f483053vc) : null);
        if (mMPAGView == null) {
            return null;
        }
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.f463303c2));
        return mMPAGView;
    }

    public final com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) S6(com.tencent.mm.R.id.tiq);
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        if (parent instanceof com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) {
            return (com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) parent;
        }
        return null;
    }

    public final android.widget.TextView d7() {
        android.view.View c76 = c7();
        if (c76 == null) {
            c76 = (android.view.ViewGroup) S6(com.tencent.mm.R.id.tiq);
        }
        return (android.widget.TextView) (c76 != null ? c76.findViewById(com.tencent.mm.R.id.odf) : null);
    }

    public final boolean e7(r45.lv1 lv1Var) {
        boolean z17 = pm0.v.z(lv1Var != null ? lv1Var.getInteger(7) : 0, 1);
        com.tencent.mars.xlog.Log.i(this.f229737m, "isAttend:" + z17);
        return z17;
    }

    public final boolean f7() {
        kotlinx.coroutines.flow.j2 j2Var = this.f229743s;
        return ((java.lang.Number) ((kotlinx.coroutines.flow.h3) j2Var).getValue()).intValue() == 1 || ((java.lang.Number) ((kotlinx.coroutines.flow.h3) j2Var).getValue()).intValue() == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if ((r0 != null && r0.getInteger(6) == 3) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g7(boolean r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onBubbleStatusChanged isNewBubble:"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r5.f229737m
            com.tencent.mars.xlog.Log.i(r1, r0)
            r45.lv1 r0 = r5.f229746v
            r2 = 1
            if (r0 == 0) goto L28
            r3 = 0
            if (r0 == 0) goto L25
            r4 = 6
            int r0 = r0.getInteger(r4)
            r4 = 3
            if (r0 != r4) goto L25
            r0 = r2
            goto L26
        L25:
            r0 = r3
        L26:
            if (r0 == 0) goto L29
        L28:
            r3 = r2
        L29:
            if (r6 == 0) goto L42
            if (r3 != 0) goto L42
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r6 = r5.c7()
            if (r6 == 0) goto L36
            r6.e()
        L36:
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r6 = r5.c7()
            if (r6 == 0) goto L3f
            r6.d()
        L3f:
            r5.i7(r2)
        L42:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "onBubbleStatusChanged canHide:"
            r6.<init>(r0)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.tencent.mars.xlog.Log.i(r1, r6)
            if (r3 == 0) goto L5f
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r6 = r5.c7()
            if (r6 == 0) goto L62
            r6.c()
            goto L62
        L5f:
            r5.h7()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ar.g7(boolean):void");
    }

    public final void h7() {
        android.widget.TextView d76;
        java.lang.String str = this.f229737m;
        com.tencent.mars.xlog.Log.i(str, "refreshViews");
        if (this.f229746v != null) {
            android.widget.TextView d77 = d7();
            java.lang.CharSequence text = d77 != null ? d77.getText() : null;
            if ((text == null || text.length() == 0) && (d76 = d7()) != null) {
                d76.setVisibility(8);
            }
            r45.lv1 lv1Var = this.f229746v;
            java.lang.Integer valueOf = lv1Var != null ? java.lang.Integer.valueOf(lv1Var.getInteger(6)) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                r45.lv1 lv1Var2 = this.f229746v;
                if (lv1Var2 != null && lv1Var2.getInteger(6) == 1) {
                    int min = java.lang.Math.min(lv1Var2.getInteger(5), lv1Var2.getInteger(3) - c01.id.e());
                    kotlinx.coroutines.flow.h3 h3Var = (kotlinx.coroutines.flow.h3) this.f229742r;
                    int intValue = ((java.lang.Number) h3Var.getValue()).intValue();
                    com.tencent.mm.sdk.platformtools.b4 b4Var = this.f229741q;
                    if (intValue <= 0 || b4Var.e()) {
                        b4Var.d();
                        h3Var.k(java.lang.Integer.valueOf(min));
                        b4Var.c(1000L, 1000L);
                        com.tencent.mars.xlog.Log.i(str, "startCountDown remainTime:" + min);
                    } else {
                        h3Var.k(java.lang.Integer.valueOf(min));
                    }
                }
            } else if (valueOf != null && valueOf.intValue() == 2) {
                r45.lv1 lv1Var3 = this.f229746v;
                if (pm0.v.z(lv1Var3 != null ? lv1Var3.getInteger(7) : 0, 16)) {
                    android.widget.TextView d78 = d7();
                    if (d78 != null) {
                        d78.setText(O6().getResources().getString(com.tencent.mm.R.string.f491556nq3));
                    }
                } else {
                    android.widget.TextView d79 = d7();
                    if (d79 != null) {
                        d79.setText(O6().getResources().getString(com.tencent.mm.R.string.f491555nq2));
                    }
                }
                android.widget.TextView d710 = d7();
                if (d710 != null) {
                    d710.setVisibility(0);
                }
            } else if (valueOf != null && valueOf.intValue() == 3) {
                android.widget.TextView d711 = d7();
                if (d711 != null) {
                    d711.setText(O6().getResources().getString(com.tencent.mm.R.string.f491556nq3));
                }
                android.widget.TextView d712 = d7();
                if (d712 != null) {
                    d712.setVisibility(0);
                }
            }
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c76 = c7();
            if (c76 != null) {
                c76.setOnClickListener(new df2.wq(this));
            }
        }
    }

    public final void i7(int i17) {
        java.lang.String str;
        java.lang.String string;
        if (zl2.r4.f473950a.w1()) {
            com.tencent.mars.xlog.Log.i(this.f229737m, "report21084 type:" + i17 + ", but is anchor");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        r45.lv1 lv1Var = this.f229746v;
        java.lang.String str2 = "";
        if (lv1Var == null || (str = lv1Var.getString(0)) == null) {
            str = "";
        }
        jSONObject.put(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, str);
        r45.lv1 lv1Var2 = this.f229746v;
        if (lv1Var2 != null && (string = lv1Var2.getString(8)) != null) {
            str2 = string;
        }
        jSONObject.put("order_id", str2);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.L2, t17, 0L, null, null, null, null, null, 252, null);
    }

    public final void k7(boolean z17) {
        kotlinx.coroutines.r2 r2Var;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) S6(com.tencent.mm.R.id.tnp);
        boolean z18 = frameLayout != null && frameLayout.getVisibility() == 0;
        java.lang.String str = this.f229737m;
        if (z18 && z17) {
            com.tencent.mars.xlog.Log.i(str, "showCard but cardContainer is visible");
            return;
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) S6(com.tencent.mm.R.id.tnp);
        r45.lv1 lv1Var = this.f229746v;
        if (frameLayout2 == null || lv1Var == null) {
            r2Var = null;
        } else {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            r2Var = com.tencent.mm.plugin.finder.live.util.y.o(this, kotlinx.coroutines.internal.b0.f310484a, null, new df2.xq(lv1Var, z17, this, frameLayout2, null), 2, null);
        }
        if (r2Var == null) {
            com.tencent.mars.xlog.Log.i(str, "showCard, cardContainer:" + ((android.widget.FrameLayout) S6(com.tencent.mm.R.id.tnp)) + ", productGiftInfo:" + this.f229746v);
        }
    }

    public final void l7(r45.lv1 info) {
        kotlin.jvm.internal.o.g(info, "info");
        r45.lv1 lv1Var = this.f229746v;
        java.lang.String str = this.f229737m;
        boolean z17 = true;
        if (lv1Var != null && kotlin.jvm.internal.o.b(info.getString(8), lv1Var.getString(8))) {
            int integer = lv1Var.getInteger(6);
            int integer2 = info.getInteger(6);
            int integer3 = lv1Var.getInteger(5);
            int integer4 = info.getInteger(5);
            com.tencent.mars.xlog.Log.i(str, "localStatus:" + integer + ", remoteStatus:" + integer2 + ", localRemainTime:" + integer3 + ", remoteRemainTime:" + integer4);
            if (integer2 != 1 || integer4 >= integer3) {
                if (integer2 == 1 && integer3 < integer4) {
                    com.tencent.mars.xlog.Log.i(str, "remainTime RemoteItem:" + integer2 + " invalid");
                } else if ((integer2 == 1 && integer != 1) || (integer2 == 2 && integer == 3)) {
                    com.tencent.mars.xlog.Log.i(str, "status RemoteItem:" + integer2 + " invalid");
                }
                z17 = false;
            }
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e(str, "invalid remote info");
            return;
        }
        this.f229746v = info;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        com.tencent.mm.plugin.finder.live.util.y.o(this, kotlinx.coroutines.internal.b0.f310484a, null, new df2.zq(lv1Var, info, this, null), 2, null);
        com.tencent.mars.xlog.Log.i(str, "gift info updated to " + info.toJSON());
        ((kotlinx.coroutines.flow.h3) this.f229743s).k(java.lang.Integer.valueOf(info.getInteger(6)));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c76 = c7();
        if (c76 != null) {
            c76.setSceneStateListener(new df2.rq(this));
        }
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c77 = c7();
        if (c77 != null) {
            c77.b();
        }
        if (this.f229746v != null) {
            g7(true);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        com.tencent.mm.plugin.finder.live.util.y.o(this, kotlinx.coroutines.internal.b0.f310484a, null, new df2.vq(this, null), 2, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mm.view.MMPAGView b76 = b7();
        if (b76 != null) {
            b76.n();
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) S6(com.tencent.mm.R.id.tnp);
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) S6(com.tencent.mm.R.id.tnp);
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        this.f229747w = null;
    }
}
