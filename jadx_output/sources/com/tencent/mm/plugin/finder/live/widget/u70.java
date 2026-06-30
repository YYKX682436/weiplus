package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class u70 extends if2.b implements ut3.d, if2.e {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f119954m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.sl f119955n;

    /* renamed from: o, reason: collision with root package name */
    public eg2.s0 f119956o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f119957p;

    /* renamed from: q, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f119958q;

    /* renamed from: r, reason: collision with root package name */
    public r45.yg7 f119959r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f119958q = kotlinx.coroutines.z0.b();
        this.f119959r = r45.yg7.FinderLiveImgSource_Unknown;
    }

    public static final void Z6(com.tencent.mm.plugin.finder.live.widget.u70 u70Var, java.lang.String str, java.lang.String str2) {
        android.view.View S6 = u70Var.S6(com.tencent.mm.R.id.f484765fg5);
        u70Var.f119954m = S6 != null ? (android.widget.ImageView) S6.findViewById(com.tencent.mm.R.id.ewg) : null;
        if (S6 != null) {
            S6.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.c70(u70Var));
        }
        if (S6 != null) {
            S6.addOnAttachStateChangeListener(new com.tencent.mm.plugin.finder.live.widget.d70(u70Var));
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "scene:" + str + ", url: " + str2);
        if (str2.length() > 0) {
            eg2.s0 s0Var = u70Var.f119956o;
            if (!kotlin.jvm.internal.o.b(str2, s0Var != null ? s0Var.f252632i : null)) {
                u70Var.a7();
                eg2.s0 s0Var2 = u70Var.f119956o;
                if (s0Var2 != null) {
                    s0Var2.a();
                }
            }
        }
        if (((mm2.n0) u70Var.business(mm2.n0.class)).Q6(xy2.c.e(u70Var.O6()))) {
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "checkCoverEnhanceIfNeeded: skip, co-live invitee");
        } else {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_PREVIOUS_COVER_ENHANCE_GUIDE_CNT_INT_SYNC, 0);
            ae2.in inVar = ae2.in.f3688a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3797k8).getValue()).r()).intValue();
            boolean e76 = u70Var.e7();
            boolean z17 = !zl2.r4.f473950a.T1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) u70Var.business(mm2.g1.class)).f329068f).getValue());
            if (!e76) {
                com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "checkCoverEnhanceIfNeeded: skip, coverEnhanceEnabled=false");
            } else if (z17) {
                if (str2.length() == 0) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "checkCoverEnhanceIfNeeded: skip, url is empty");
                } else if (r17 >= intValue) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "checkCoverEnhanceIfNeeded: skip, guideCnt=" + r17 + " >= guideLimit=" + intValue);
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "checkCoverEnhanceIfNeeded: will check, url=" + str2 + ", guideCnt=" + r17 + '/' + intValue);
                    if (u70Var.f119956o == null) {
                        u70Var.f119956o = new eg2.s0(u70Var.f119958q, u70Var.O6());
                    }
                    eg2.s0 s0Var3 = u70Var.f119956o;
                    if (s0Var3 != null) {
                        com.tencent.mm.plugin.finder.live.widget.a70 a70Var = new com.tencent.mm.plugin.finder.live.widget.a70(u70Var);
                        java.lang.String e17 = xy2.c.e(s0Var3.f252629f);
                        if (!(e17.length() == 0)) {
                            if (!(str2.length() == 0)) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("check: coverUrl=");
                                sb6.append(str2);
                                sb6.append(", scene=1, hasCheckCompleted=");
                                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = s0Var3.f252635l;
                                sb6.append(atomicBoolean.get());
                                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHDTaskChecker", sb6.toString());
                                if (atomicBoolean.get() && kotlin.jvm.internal.o.b(s0Var3.f252632i, str2)) {
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("check: already completed, directly callback with cached result, needEnhance=");
                                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = s0Var3.f252636m;
                                    sb7.append(atomicBoolean2);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHDTaskChecker", sb7.toString());
                                    if (atomicBoolean2.get()) {
                                        a70Var.a();
                                    } else {
                                        com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "cover does not need enhance");
                                    }
                                } else {
                                    s0Var3.a();
                                    s0Var3.f252577b.set(false);
                                    s0Var3.f252632i = str2;
                                    s0Var3.f252630g = e17;
                                    s0Var3.f252631h = 1;
                                    s0Var3.f252578c = kotlinx.coroutines.l.d(s0Var3.f252628e, null, null, new eg2.r0(s0Var3, str2, a70Var, e17, 1, null), 3, null);
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveHDTaskChecker", "check: invalid params, finderUsername=" + e17 + ", coverUrl=" + str2);
                        com.tencent.mars.xlog.Log.w("Finder.FinderStartLivePostCoverWidget", "cover enhance check failed");
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "checkCoverEnhanceIfNeeded: skip, coverEnhanceEnabledForLiveMode=false (gameMode)");
            }
        }
        android.widget.ImageView imageView = u70Var.f119954m;
        if (imageView != null) {
            if (com.tencent.mm.vfs.w6.j(str2)) {
                zl2.r4.f473950a.P(imageView, str2, java.lang.Math.min(imageView.getWidth(), 500), java.lang.Math.min(imageView.getHeight(), 500));
            } else {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.e().c(new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.I));
            }
        }
    }

    public final void a7() {
        com.tencent.mm.plugin.finder.live.widget.sl slVar = this.f119955n;
        if (slVar != null) {
            slVar.dismiss();
        }
        this.f119955n = null;
    }

    public final void b7(java.lang.String str) {
        com.tencent.mm.ui.MMActivity N6 = N6();
        if (N6 != null) {
            zl2.k kVar = zl2.k.f473851a;
            boolean e76 = e7();
            r45.bo1 bo1Var = r45.bo1.FinderLiveCoverImageEnhanceScene_CreateLive;
            com.tencent.mm.plugin.finder.live.widget.sl slVar = this.f119955n;
            boolean z17 = false;
            if (slVar != null && slVar.isShowing()) {
                z17 = true;
            }
            kVar.a(N6, str, 100111, null, e76, bo1Var, z17);
        }
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    public final void c7(boolean z17) {
        a7();
        eg2.s0 s0Var = this.f119956o;
        java.lang.String str = s0Var != null ? s0Var.f252633j : null;
        java.lang.String str2 = s0Var != null ? s0Var.f252634k : null;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("Finder.FinderStartLivePostCoverWidget", "enterEditWithCachedCover: no cached local path, fallback to selection");
            f7();
            return;
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(ml2.x3.f328230p);
        com.tencent.mm.ui.MMActivity N6 = N6();
        if (N6 != null) {
            zl2.k.f473851a.a(N6, str, 100111, str2, e7(), r45.bo1.FinderLiveCoverImageEnhanceScene_CreateLive, z17);
        }
    }

    public final java.lang.String d7() {
        java.lang.String str = zl2.r4.f473950a.T1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329068f).getValue()) ? (java.lang.String) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329079t).getValue() : (java.lang.String) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329075p).getValue();
        return str == null ? "" : str;
    }

    public final boolean e7() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_force_enable_cover_enhance, 0) == 1) {
            return true;
        }
        return gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ENABLE_COVER_ENHANCE_PREPARE_BOOLEAN_SYNC, false);
    }

    public final void f7() {
        if (!gm0.j1.u().l()) {
            db5.t7.l(O6());
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(O6(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.g70(this);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.h70(this);
        k0Var.C = new com.tencent.mm.plugin.finder.live.widget.i70(this);
        k0Var.f211856e = new com.tencent.mm.plugin.finder.live.widget.j70(this);
        k0Var.v();
    }

    public final void g7(ml2.x3 x3Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", x3Var.f328233d);
        jSONObject.put("sence", 1);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 7L, jSONObject.toString(), null, 4, null);
    }

    public final void h7(te2.k3 type) {
        kotlin.jvm.internal.o.g(type, "type");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f418165d);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 75L, jSONObject.toString(), null, 4, null);
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_extra_data", bundle);
        kotlin.jvm.internal.o.e(captureDataManager$CaptureVideoNormalModel, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("KSEGMENTMEDIAINFO", captureDataManager$CaptureVideoNormalModel);
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Override // if2.e
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.net.Uri data;
        java.lang.String str = null;
        if (i17 != 10010 && i17 != 10011) {
            if (i17 == 100111 && i18 == -1) {
                kotlinx.coroutines.l.d(this.f119958q, null, null, new com.tencent.mm.plugin.finder.live.widget.f70(intent, this, null), 3, null);
                return;
            }
            return;
        }
        if (i18 != -1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(ml2.x3.f328222e);
            g7(i17 == 10011 ? ml2.x3.f328226i : ml2.x3.f328227m);
            return;
        }
        if (intent != null && (data = intent.getData()) != null) {
            str = data.getPath();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context O6 = O6();
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            java.lang.String str2 = com.tencent.mm.plugin.finder.assist.e9.f102143l;
            ((ub0.r) oVar).getClass();
            str = com.tencent.mm.pluginsdk.ui.tools.l7.b(O6, intent, str2);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "filePath[" + str + "] " + intent);
        if (str == null || str.length() == 0) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(ml2.x3.f328222e);
        } else {
            b7(str);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(i17 == 10011 ? ml2.x3.f328228n : ml2.x3.f328229o);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new com.tencent.mm.plugin.finder.live.widget.l70(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new com.tencent.mm.plugin.finder.live.widget.n70(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new com.tencent.mm.plugin.finder.live.widget.p70(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new com.tencent.mm.plugin.finder.live.widget.r70(this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f119954m = null;
        a7();
        eg2.s0 s0Var = this.f119956o;
        if (s0Var != null) {
            s0Var.a();
        }
        this.f119956o = null;
    }

    @Override // ut3.d
    public void r3(boolean z17, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo, android.os.Bundle bundle) {
    }
}
