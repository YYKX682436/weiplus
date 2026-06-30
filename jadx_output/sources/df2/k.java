package df2;

/* loaded from: classes3.dex */
public final class k extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230522m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f230523n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f230524o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.controller.gamependant.GamePendantContainer f230525p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.s f230526q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f230527r;

    /* renamed from: s, reason: collision with root package name */
    public r45.hc1 f230528s;

    /* renamed from: t, reason: collision with root package name */
    public r45.u12 f230529t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f230530u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230522m = "Finder.AnchorGamePendantController";
    }

    public final void Z6(android.content.Intent intent) {
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0)) : null;
        java.lang.String str = "checkCloseLive, doAction:" + valueOf + ", isLiveStarted:" + ((mm2.c1) business(mm2.c1.class)).a8();
        java.lang.String str2 = this.f230522m;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (valueOf != null && valueOf.intValue() == 14) {
            intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
            df2.y yVar = (df2.y) controller(df2.y.class);
            if (yVar != null) {
                yVar.Z6();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == 15) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_PARAMS_DO_ACTION_PARAMS");
            intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
            intent.removeExtra("KEY_PARAMS_DO_ACTION_PARAMS");
            com.tencent.mars.xlog.Log.i(str2, "show FullScreenWebView url:" + stringExtra);
            if (stringExtra == null || stringExtra.length() == 0) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", stringExtra);
            intent2.putExtra("convertActivityFromTranslucent", true);
            j45.l.j(O6(), "webview", ".ui.tools.WebViewUI", intent2, null);
        }
    }

    public final void a7(java.lang.String str, java.lang.String str2) {
        r45.k74 lite_app_info;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("event_name", str);
        jSONObject.put("event_data", str2);
        java.lang.String jSONObject2 = jSONObject.toString();
        java.lang.String str3 = this.f230522m;
        com.tencent.mars.xlog.Log.i(str3, "invokeLiteApp actionName:frontend/onLiveEvent, query:" + jSONObject2);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f230523n;
        if (finderJumpInfo == null || (lite_app_info = finderJumpInfo.getLite_app_info()) == null) {
            return;
        }
        java.lang.String string = lite_app_info.getString(0);
        if ((string == null || string.length() == 0) || !this.f230527r) {
            return;
        }
        com.tencent.mars.xlog.Log.i(str3, "invokeLiteApp actionName:frontend/onLiveEvent dispatch");
        if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(string)) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj(string, "frontend/onLiveEvent", jSONObject2);
        } else {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(string, 10, false, 10L, new df2.h(this, string, "frontend/onLiveEvent", jSONObject2));
        }
    }

    public final void b7() {
        a7("micMute", "{\"result\":" + ((mm2.c1) business(mm2.c1.class)).O4 + '}');
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onFloatMode() {
        super.onFloatMode();
        if (this.f230524o != null) {
            com.tencent.mars.xlog.Log.i(this.f230522m, "ANCHOR_SCREEN_CAST_LITEAPP 1");
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.S1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        android.view.View view = this.f230524o;
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        if (view instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView) {
            ((com.tencent.liteapp.ui.WxaLiteAppBaseView) view).g();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        fo0.n O;
        fo0.q qVar;
        android.view.View view;
        fo0.n O2;
        super.onLiveEnd();
        if (this.f230524o != null) {
            tn0.w0 Q6 = Q6();
            fo0.q qVar2 = (Q6 == null || (O2 = Q6.O()) == null) ? null : O2.f264826m;
            if (qVar2 != null) {
                qVar2.f264837b = new android.graphics.Point(com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480465yp), com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480464yo));
            }
            tn0.w0 Q62 = Q6();
            if (Q62 != null && (O = Q62.O()) != null && (qVar = O.f264826m) != null && (view = qVar.f264836a) != null) {
                android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
                if (viewGroup != null) {
                    viewGroup.requestDisallowInterceptTouchEvent(false);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/AnchorGamePendantController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/AnchorGamePendantController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            dk2.ef.s0(dk2.ef.f233372a, -1, null, null, null, false, 30, null);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, 0);
        jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "");
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        a7("liveEnd", jSONObject2);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.k74 lite_app_info;
        java.lang.String str;
        r45.nw1 nw1Var;
        r45.nw1 nw1Var2;
        r45.nw1 nw1Var3;
        r45.nw1 nw1Var4;
        r45.k74 lite_app_info2;
        r45.k74 lite_app_info3;
        r45.k74 lite_app_info4;
        r45.ic1 ic1Var;
        super.onLiveStart(hc1Var);
        this.f230528s = hc1Var;
        this.f230523n = (hc1Var == null || (ic1Var = (r45.ic1) hc1Var.getCustom(85)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ic1Var.getCustom(2);
        ae2.in inVar = ae2.in.f3688a;
        jz5.g gVar = ae2.in.N4;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue();
        java.lang.String str2 = "";
        java.lang.String str3 = this.f230522m;
        if (intValue == 1) {
            com.tencent.mars.xlog.Log.i(str3, "hardcode FINDER_LIVE_GAME_PENDANT_JUMP_INFO 1");
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            r45.k74 k74Var = new r45.k74();
            k74Var.set(0, "wxalite164e2507fd4448cd0599ab206c3ff653");
            k74Var.set(1, "pages/home");
            k74Var.set(2, "");
            finderJumpInfo.setLite_app_info(k74Var);
            this.f230523n = finderJumpInfo;
        } else if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == 2) {
            com.tencent.mars.xlog.Log.i(str3, "hardcode FINDER_LIVE_GAME_PENDANT_JUMP_INFO 2");
            this.f230523n = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pendantJumpInfo:");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = this.f230523n;
        sb6.append(finderJumpInfo2 != null ? java.lang.Integer.valueOf(finderJumpInfo2.getBusiness_type()) : null);
        sb6.append(", ");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = this.f230523n;
        sb6.append(finderJumpInfo3 != null ? java.lang.Integer.valueOf(finderJumpInfo3.getJumpinfo_type()) : null);
        sb6.append(", ");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo4 = this.f230523n;
        sb6.append((finderJumpInfo4 == null || (lite_app_info4 = finderJumpInfo4.getLite_app_info()) == null) ? null : lite_app_info4.getString(0));
        sb6.append(", ");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo5 = this.f230523n;
        sb6.append((finderJumpInfo5 == null || (lite_app_info3 = finderJumpInfo5.getLite_app_info()) == null) ? null : lite_app_info3.getString(1));
        sb6.append(", ");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo6 = this.f230523n;
        sb6.append((finderJumpInfo6 == null || (lite_app_info2 = finderJumpInfo6.getLite_app_info()) == null) ? null : lite_app_info2.getString(2));
        com.tencent.mars.xlog.Log.i(str3, sb6.toString());
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo7 = this.f230523n;
        if (finderJumpInfo7 != null && (lite_app_info = finderJumpInfo7.getLite_app_info()) != null) {
            java.lang.String string = lite_app_info.getString(0);
            if (!(string == null || string.length() == 0)) {
                if (this.f230524o == null) {
                    android.view.View oj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).oj(com.tencent.mm.sdk.platformtools.x2.f193071a, false, false, null);
                    this.f230524o = oj6;
                    ((com.tencent.liteapp.ui.WxaLiteAppBaseView) oj6).f46058y = true;
                    com.tencent.mars.xlog.Log.i(str3, "create lite app view:" + this.f230524o);
                }
                android.view.View view = this.f230524o;
                if (view != null) {
                    android.content.Context context = view.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.plugin.finder.live.controller.gamependant.GamePendantContainer gamePendantContainer = new com.tencent.mm.plugin.finder.live.controller.gamependant.GamePendantContainer(context);
                    this.f230525p = gamePendantContainer;
                    gamePendantContainer.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    this.f230526q = new kf2.a0(this);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("liteAppView:");
                    sb7.append(view.hashCode());
                    sb7.append(", liteAppStore:");
                    com.tencent.mm.plugin.lite.s sVar = this.f230526q;
                    sb7.append(sVar != null ? sVar.hashCode() : 0);
                    com.tencent.mars.xlog.Log.i(str3, sb7.toString());
                    q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("appId", string);
                    bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, lite_app_info.getString(1));
                    java.lang.String string2 = lite_app_info.getString(2);
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    java.lang.String e17 = xy2.c.e(context2);
                    ya2.b2 b17 = ya2.h.f460484a.b(e17);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("platId", 2);
                    jSONObject.put("nickname", b17 != null ? b17.w0() : "");
                    jSONObject.put("headImgUrl", b17 != null ? b17.getAvatarUrl() : "");
                    jSONObject.put("finderUsername", e17);
                    jSONObject.put("objectId", pm0.v.u(((mm2.e1) business(mm2.e1.class)).f328983m));
                    jSONObject.put("liveId", pm0.v.u(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0)));
                    jSONObject.put("startTime", ((mm2.e1) business(mm2.e1.class)).f328988r.getInteger(4));
                    jSONObject.put("gameAppid", ((mm2.e1) business(mm2.e1.class)).f328988r.getString(22));
                    r45.kc1 kc1Var = ((mm2.c1) business(mm2.c1.class)).f328840m;
                    if (kc1Var == null || (str = kc1Var.getString(0)) == null) {
                        str = "";
                    }
                    jSONObject.put("lawTips", str);
                    r45.hc1 hc1Var2 = this.f230528s;
                    jSONObject.put("onlineCnt", (hc1Var2 == null || (nw1Var4 = (r45.nw1) hc1Var2.getCustom(3)) == null) ? 0 : nw1Var4.getInteger(1));
                    r45.hc1 hc1Var3 = this.f230528s;
                    jSONObject.put("curParticipantCount", (hc1Var3 == null || (nw1Var3 = (r45.nw1) hc1Var3.getCustom(3)) == null) ? 0 : nw1Var3.getInteger(10));
                    r45.hc1 hc1Var4 = this.f230528s;
                    long j17 = 0;
                    jSONObject.put("likeCnt", (hc1Var4 == null || (nw1Var2 = (r45.nw1) hc1Var4.getCustom(3)) == null) ? 0L : nw1Var2.getLong(19));
                    r45.hc1 hc1Var5 = this.f230528s;
                    if (hc1Var5 != null && (nw1Var = (r45.nw1) hc1Var5.getCustom(3)) != null) {
                        j17 = nw1Var.getLong(50);
                    }
                    jSONObject.put("liveHeatValue", j17);
                    jSONObject.put("enableShowHeat", ((mm2.c1) business(mm2.c1.class)).f328862p3 && ((mm2.c1) business(mm2.c1.class)).m7());
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        if (string2 != null) {
                            str2 = string2;
                        }
                        jSONObject2 = new org.json.JSONObject(str2);
                    } catch (java.lang.Throwable unused) {
                    }
                    jSONObject2.put("init_data", jSONObject.toString());
                    com.tencent.mars.xlog.Log.i(str3, "initLiteAppData " + jSONObject2);
                    java.lang.String jSONObject3 = jSONObject2.toString();
                    kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                    bundle.putString("query", jSONObject3);
                    ((com.tencent.mm.feature.lite.i) g0Var).pk(view, bundle, true, false, this.f230526q, new df2.j(this));
                    tn0.w0 Q6 = Q6();
                    fo0.n O = Q6 != null ? Q6.O() : null;
                    if (O != null) {
                        fo0.q qVar = new fo0.q();
                        qVar.f264836a = this.f230525p;
                        qVar.f264838c = 0;
                        qVar.f264837b = new android.graphics.Point(500, 500);
                        qVar.f264839d = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a9e));
                        O.f264826m = qVar;
                    }
                }
            }
        }
        com.tencent.mm.ui.MMActivity N6 = N6();
        Z6(N6 != null ? N6.getIntent() : null);
    }

    @Override // if2.e
    public void onNewIntent(android.content.Intent intent) {
        Z6(intent);
    }

    @Override // if2.e
    public void resume() {
        com.tencent.mm.ui.MMActivity N6 = N6();
        Z6(N6 != null ? N6.getIntent() : null);
    }
}
