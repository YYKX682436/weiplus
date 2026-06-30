package df2;

/* loaded from: classes3.dex */
public final class oj extends if2.b {
    public final jz5.g A;
    public final jz5.g B;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230971m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f230972n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f230973o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f230974p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f230975q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f230976r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f230977s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f230978t;

    /* renamed from: u, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230979u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.s f230980v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.HashMap f230981w;

    /* renamed from: x, reason: collision with root package name */
    public jz5.l f230982x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.r f230983y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Runnable f230984z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230971m = "LiveGameTeamUpController";
        this.f230972n = "closeSheetDone";
        this.f230973o = "closeSheet";
        this.f230974p = "closePlayTogetherActionSheet";
        this.f230975q = "joinByTeamCondition";
        this.f230976r = "setTeamConditon";
        this.f230977s = "getLiveCookies";
        this.f230978t = "init_data";
        this.f230981w = new java.util.HashMap();
        this.A = jz5.h.b(new df2.ej(this));
        this.B = jz5.h.b(new df2.fj(this));
    }

    public static final void Z6(df2.oj ojVar) {
        ojVar.getClass();
        java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tj(ojVar.h7())).iterator();
        while (it.hasNext()) {
            java.lang.Long l17 = (java.lang.Long) it.next();
            android.content.Intent intent = new android.content.Intent();
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            kotlin.jvm.internal.o.d(l17);
            long longValue = l17.longValue();
            ((com.tencent.mm.feature.lite.i) g0Var).getClass();
            com.tencent.mm.plugin.lite.LiteAppCenter.closeWindow(longValue, intent);
        }
        java.lang.Runnable runnable = ojVar.f230984z;
        if (runnable != null) {
            pm0.v.W(runnable);
        }
        ojVar.f230984z = null;
    }

    public static final void a7(df2.oj ojVar, org.json.JSONObject jSONObject) {
        ojVar.e7(null);
        if (jSONObject.optBoolean("isCancelPromoting", false)) {
            return;
        }
        java.lang.String optString = jSONObject.optString("toastWording", "");
        if (optString == null || optString.length() == 0) {
            return;
        }
        db5.t7.h(ojVar.O6(), optString);
        com.tencent.mars.xlog.Log.i(ojVar.f230971m, "toastMsg: " + optString);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b7(df2.oj r7, org.json.JSONObject r8) {
        /*
            r7.getClass()
            java.lang.String r0 = "joinTeamMode"
            boolean r1 = r8.has(r0)
            jz5.f0 r2 = jz5.f0.f302826a
            java.util.HashMap r3 = r7.f230981w
            r4 = 0
            if (r1 == 0) goto L64
            int r0 = r8.optInt(r0)
            java.lang.String r1 = r7.g7()
            java.lang.Object r1 = r3.get(r1)
            df2.zi r1 = (df2.zi) r1
            if (r1 == 0) goto L28
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r1.f231970a = r5
            r1 = r2
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 != 0) goto L3b
            java.lang.String r1 = r7.g7()
            df2.zi r5 = new df2.zi
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5.<init>(r6, r4)
            r3.put(r1, r5)
        L3b:
            java.lang.Class<mm2.g1> r1 = mm2.g1.class
            androidx.lifecycle.c1 r1 = r7.business(r1)
            mm2.g1 r1 = (mm2.g1) r1
            kotlinx.coroutines.flow.j2 r1 = r1.f329071i
            kotlinx.coroutines.flow.h3 r1 = (kotlinx.coroutines.flow.h3) r1
            java.lang.Object r1 = r1.getValue()
            r45.n73 r1 = (r45.n73) r1
            if (r1 == 0) goto L57
            r5 = 1
            com.tencent.mm.protobuf.f r1 = r1.getCustom(r5)
            r45.z53 r1 = (r45.z53) r1
            goto L58
        L57:
            r1 = r4
        L58:
            if (r1 != 0) goto L5b
            goto L64
        L5b:
            r5 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.set(r5, r0)
        L64:
            java.lang.String r0 = "gameTeamUpSpecialGiftSettingDetail"
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto Lac
            java.lang.String r8 = r8.optString(r0)
            r45.l73 r0 = new r45.l73
            r0.<init>()
            r1 = 2
            byte[] r8 = android.util.Base64.decode(r8, r1)
            if (r8 != 0) goto L7d
            goto L8d
        L7d:
            r0.parseFrom(r8)     // Catch: java.lang.Exception -> L81
            goto L8e
        L81:
            r8 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r0 = "safeParser"
            java.lang.String r1 = ""
            com.tencent.mm.sdk.platformtools.Log.a(r0, r1, r8)
        L8d:
            r0 = r4
        L8e:
            java.lang.String r8 = r7.g7()
            java.lang.Object r8 = r3.get(r8)
            df2.zi r8 = (df2.zi) r8
            if (r8 == 0) goto L9d
            r8.f231971b = r0
            goto L9e
        L9d:
            r2 = r4
        L9e:
            if (r2 != 0) goto Lac
            java.lang.String r7 = r7.g7()
            df2.zi r8 = new df2.zi
            r8.<init>(r4, r0)
            r3.put(r7, r8)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.oj.b7(df2.oj, org.json.JSONObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c7(df2.oj r22, org.json.JSONObject r23) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.oj.c7(df2.oj, org.json.JSONObject):boolean");
    }

    public final void d7() {
        android.view.View f76 = f7();
        if (f76 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f76, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController", "checkLocation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f76, "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController", "checkLocation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View f77 = f7();
        if (f77 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(f77, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController", "checkLocation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            f77.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(f77, "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController", "checkLocation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View f78 = f7();
        if (f78 != null) {
            f78.post(new df2.cj(this));
        }
    }

    public final void e7(java.lang.Runnable runnable) {
        this.f230984z = runnable;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notifyLiteAppEvent] event:");
        java.lang.String str = this.f230973o;
        sb6.append(str);
        sb6.append(", data:");
        sb6.append((java.lang.String) null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f230971m;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("event_name", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        try {
            com.tencent.mars.xlog.Log.i(str2, "invokeLiteApp actionName:frontend/onLiveEvent, query:" + jSONObject2);
            if (h7().length() == 0) {
                com.tencent.mars.xlog.Log.e(str2, "invokeLiteApp return");
            } else {
                com.tencent.mars.xlog.Log.i(str2, "invokeLiteApp actionName:frontend/onLiveEvent dispatch");
                if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(h7())) {
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj(h7(), "frontend/onLiveEvent", jSONObject2);
                } else {
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(h7(), 10, false, 10L, new df2.gj(this, "frontend/onLiveEvent", jSONObject2));
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(str2, "invokeLiteApp error: " + th6.getMessage());
        }
        kotlinx.coroutines.r2 r2Var = this.f230979u;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f230979u = com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.dj(this, null), 3, null);
    }

    public final android.view.View f7() {
        android.view.View T6 = T6(com.tencent.mm.R.id.ro9, com.tencent.mm.R.id.ro_);
        if (T6 == null) {
            return null;
        }
        T6.setOnTouchListener(new df2.bj(this));
        return T6;
    }

    public final java.lang.String g7() {
        java.lang.String string;
        r45.z53 z53Var;
        if (((mm2.c1) business(mm2.c1.class)).T7()) {
            r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329071i).getValue();
            if (n73Var == null || (z53Var = (r45.z53) n73Var.getCustom(1)) == null || (string = z53Var.getString(0)) == null) {
                return "";
            }
        } else {
            r45.xq1 xq1Var = ((mm2.c1) business(mm2.c1.class)).C2;
            if ((xq1Var == null || (string = xq1Var.getString(2)) == null) && (string = ((mm2.e1) business(mm2.e1.class)).f328988r.getString(22)) == null) {
                return "";
            }
        }
        return string;
    }

    public final java.lang.String h7() {
        r45.k74 lite_app_info;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo A7 = ((mm2.c1) business(mm2.c1.class)).A7();
        java.lang.String string = (A7 == null || (lite_app_info = A7.getLite_app_info()) == null) ? null : lite_app_info.getString(0);
        return string == null ? "" : string;
    }

    public final void i7(boolean z17, java.lang.String giftId) {
        kotlin.jvm.internal.o.g(giftId, "giftId");
        boolean w17 = zl2.r4.f473950a.w1();
        java.lang.String str = this.f230971m;
        if (w17) {
            com.tencent.mars.xlog.Log.i(str, "[notifyGiftSendEnd] anchor return");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", z17);
        jSONObject.put("giftId", giftId);
        if (zl2.q4.f473933a.E()) {
            android.content.Context O6 = O6();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
            e4Var.f211776c = "一起玩送礼结果回调: " + z17;
            e4Var.c();
        }
        com.tencent.mars.xlog.Log.i(str, "[notifyGiftSendEnd]  sendGiftResultCallBackId:" + this.f230982x + ", json:" + jSONObject);
        jz5.l lVar = this.f230982x;
        if (lVar != null) {
            long longValue = ((java.lang.Number) lVar.f302833d).longValue();
            int intValue = ((java.lang.Number) lVar.f302834e).intValue();
            com.tencent.mm.plugin.lite.s sVar = this.f230980v;
            if (sVar != null) {
                sVar.c(longValue, intValue, jSONObject.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0300 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k7(r45.r84 r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.oj.k7(r45.r84, android.os.Bundle):void");
    }

    public final void l7(com.tencent.mm.plugin.lite.s sVar) {
        try {
            if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(h7())) {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Zj(h7());
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(this.f230971m, "[onViewUnmount] e: " + th6.getMessage());
        }
        this.f230980v = sVar;
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        this.f230981w.clear();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        super.onLiveMsg(r71Var);
        android.view.View f76 = f7();
        boolean z17 = false;
        if (f76 != null && f76.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            d7();
        }
        ((mm2.c1) business(mm2.c1.class)).t9(r71Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r71Var.getCustom(44) : null);
        if (((mm2.c1) business(mm2.c1.class)).f328823i6 == null) {
            ((mm2.c1) business(mm2.c1.class)).s9(new r45.zq1());
        }
        r45.zq1 zq1Var = ((mm2.c1) business(mm2.c1.class)).f328823i6;
        if (zq1Var == null) {
            return;
        }
        zq1Var.set(1, r71Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r71Var.getCustom(44) : null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        com.tencent.mm.plugin.finder.live.plugin.c6 c6Var;
        r45.ic1 ic1Var;
        super.onLiveStart(hc1Var);
        ((mm2.c1) business(mm2.c1.class)).t9((hc1Var == null || (ic1Var = (r45.ic1) hc1Var.getCustom(85)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ic1Var.getCustom(8));
        if (!zl2.r4.f473950a.w1() || (c6Var = (com.tencent.mm.plugin.finder.live.plugin.c6) R6(com.tencent.mm.plugin.finder.live.plugin.c6.class)) == null) {
            return;
        }
        android.content.Context O6 = O6();
        android.app.Activity activity = O6 instanceof android.app.Activity ? (android.app.Activity) O6 : null;
        c6Var.t1(activity != null ? activity.getIntent() : null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = (com.tencent.mm.plugin.finder.live.view.k0) pluginLayout;
        ((mm2.c1) business(mm2.c1.class)).f328886t3.observe(k0Var, new df2.kj(this));
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        ((mm2.c1) business(mm2.c1.class)).J2.observe(k0Var, new df2.lj(this));
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f230983y = null;
        kotlinx.coroutines.r2 r2Var = this.f230979u;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f230979u = null;
        l7(null);
        this.f230982x = null;
        this.f230984z = null;
    }
}
