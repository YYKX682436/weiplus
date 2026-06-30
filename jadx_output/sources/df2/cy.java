package df2;

/* loaded from: classes3.dex */
public final class cy extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f229915m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f229916n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Vector f229917o;

    /* renamed from: p, reason: collision with root package name */
    public r45.u12 f229918p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f229919q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f229920r;

    /* renamed from: s, reason: collision with root package name */
    public int f229921s;

    /* renamed from: t, reason: collision with root package name */
    public int f229922t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229915m = "Live.MsgBoxSpamController";
        this.f229917o = new java.util.Vector();
        this.f229919q = new java.util.ArrayList();
        this.f229922t = 1;
    }

    public final void Z6() {
        synchronized (this.f229917o) {
            java.util.ArrayList<r45.u12> arrayList = new java.util.ArrayList();
            arrayList.addAll(this.f229917o);
            for (r45.u12 u12Var : arrayList) {
                this.f229917o.remove(u12Var);
                c7(u12Var);
            }
        }
        r45.u12 u12Var2 = this.f229918p;
        if (u12Var2 != null) {
            d7(u12Var2);
        }
    }

    public final void a7() {
        r45.u12 u12Var = new r45.u12();
        u12Var.f386927d = 1;
        u12Var.f386929f = "安全打击title";
        u12Var.f386930g = "安全打击弹框content";
        u12Var.f386935o = "安全打击弹框short_content";
        u12Var.f386931h = "btn_title";
        if (this.f229922t % 2 > 0) {
            u12Var.f386931h = "无异议";
            r45.v12 v12Var = new r45.v12();
            v12Var.f387797d = "alert_id";
            v12Var.f387798e = 8;
            v12Var.f387799f = "申请复核";
            v12Var.f387800g = "review_title";
            v12Var.f387801h = "review_content";
            u12Var.f386936p = v12Var;
        }
        c7(u12Var);
        this.f229922t++;
    }

    public final void b7() {
        this.f229921s++;
        r45.u12 u12Var = new r45.u12();
        u12Var.f386927d = 2;
        u12Var.f386929f = "直播间存在违规行为直播间存在违规行为直播间存在违规行为直播间存在违规行为直播间存在违规行为直播间存在违规行为";
        u12Var.f386930g = "直播主题涉及利用学生名义博眼球反反复复凤飞飞反反复复付反反复复否否否";
        u12Var.f386931h = "我知道了";
        u12Var.f386932i = "https://dldir1v6.qq.com/weixin/checkresupdate/error_3714145a95bf447b832dbcad240813e1.png";
        if (this.f229921s % 2 == 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            u12Var.f386939s = linkedList;
            linkedList.add("当前直播间涉及抽烟内容，请及时整改，否则直播可能会被限流或掐断");
            for (int i17 = 0; i17 < 15; i17++) {
                linkedList.add("直播主题涉及利用学生名义博眼球");
            }
            linkedList.add("昵称涉及低俗色情");
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            finderJumpInfo.setJumpinfo_type(2);
            finderJumpInfo.setWording("去申诉");
            com.tencent.mm.protocal.protobuf.Html5Info html5Info = new com.tencent.mm.protocal.protobuf.Html5Info();
            html5Info.setUrl("https://weixin110.qq.com/security/con/newreadtemplate?t=appeal/index.html&commentScene=0#/submit?live_key=75727970725641521766394783815&type=live&punish_id=FD202512221726301693418164&from_living=true&appeal_source=2");
            html5Info.setStyle(0);
            html5Info.setHeight_percent(0);
            finderJumpInfo.setHtml5_info(html5Info);
            u12Var.f386937q = finderJumpInfo;
            r45.w12 w12Var = new r45.w12();
            w12Var.f388781d = 1;
            u12Var.f386940t = w12Var;
        }
        d7(u12Var);
    }

    public final void c7(r45.u12 it) {
        df2.k kVar = (df2.k) controller(df2.k.class);
        if (kVar != null) {
            kotlin.jvm.internal.o.g(it, "it");
            com.tencent.mars.xlog.Log.i(kVar.f230522m, "notifyWarning FinderLiveMsgBoxInfo hash:" + it.hashCode() + ", type:" + it.f386927d + ", desc:" + it.f386935o);
            if (it.f386927d == 1 && !kotlin.jvm.internal.o.b(it, kVar.f230529t)) {
                kVar.f230529t = it;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 1);
                java.lang.String str = it.f386929f;
                if (str == null) {
                    str = "";
                }
                jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str);
                java.lang.String str2 = it.f386935o;
                jSONObject.put("desc", str2 != null ? str2 : "");
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                kVar.a7("liveWarning", jSONObject2);
            }
        }
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        java.util.Vector vector = this.f229917o;
        if (ubVar != null && !this.f229920r) {
            vector.remove(it);
            e7(it);
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f229915m, "processAlert, isPause:" + this.f229920r + ", add to pendingAlerts:" + it.hashCode() + ", " + it.toJSON());
        vector.add(it);
    }

    public final void d7(r45.u12 u12Var) {
        if (this.f291099e != null && !this.f229920r) {
            this.f229918p = null;
            e7(u12Var);
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f229915m, "processPopup, isPause:" + this.f229920r + ", set to pendingPopup:" + u12Var.hashCode() + ", " + u12Var.toJSON());
        this.f229918p = u12Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7(r45.u12 r25) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.cy.e7(r45.u12):void");
    }

    public final void f7(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, android.content.Context context) {
        java.lang.String str5 = "showAlertInfo type:" + i17 + ",title:" + str + ",content:" + str2 + ",buttonTitle:" + str3 + ",iconName:" + str4 + ",uiStyle:" + i18;
        java.lang.String str6 = this.f229915m;
        com.tencent.mars.xlog.Log.i(str6, str5);
        if (str != null) {
            try {
                int identifier = context.getResources().getIdentifier(str4, "drawable", context.getPackageName());
                int identifier2 = context.getResources().getIdentifier(str4, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, context.getPackageName());
                if (identifier2 != 0) {
                    identifier = identifier2;
                }
                if (identifier != 0) {
                    pm0.v.X(new df2.qx(context, str, identifier));
                } else {
                    pm0.v.X(new df2.rx(str, i18, context));
                }
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.E, "1", null, 4, null);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(str6, "showAlertInfo exception:" + e17.getMessage());
                pm0.v.X(new df2.rx(str, i18, context));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        java.util.Iterator it = this.f229919q.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.widget.dialog.j0 j0Var = (com.tencent.mm.ui.widget.dialog.j0) ((java.lang.ref.WeakReference) it.next()).get();
            if (j0Var != null) {
                if (!j0Var.isShowing()) {
                    j0Var = null;
                }
                if (j0Var != null) {
                    j0Var.dismiss();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0048 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLiveMsg(r45.r71 r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.cy.onLiveMsg(r45.r71):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onNormalMode() {
        super.onNormalMode();
        if (zl2.q4.f473933a.E()) {
            ae2.in inVar = ae2.in.f3688a;
            inVar.a0();
            inVar.U();
            inVar.V();
            java.lang.Object r17 = ((nb2.a) ((jz5.n) ae2.in.f3929y5).getValue()).r();
            if (!((java.lang.Boolean) r17).booleanValue()) {
                r17 = null;
            }
            java.lang.Boolean bool = (java.lang.Boolean) r17;
            if (bool != null) {
                bool.booleanValue();
                b7();
            }
            java.lang.Object r18 = ((nb2.a) ((jz5.n) ae2.in.A5).getValue()).r();
            if (!((java.lang.Boolean) r18).booleanValue()) {
                r18 = null;
            }
            java.lang.Boolean bool2 = (java.lang.Boolean) r18;
            if (bool2 != null) {
                bool2.booleanValue();
                a7();
            }
            java.lang.Object r19 = ((nb2.a) ((jz5.n) ae2.in.C5).getValue()).r();
            java.lang.Boolean bool3 = (java.lang.Boolean) (((java.lang.Boolean) r19).booleanValue() ? r19 : null);
            if (bool3 != null) {
                bool3.booleanValue();
                r45.u12 u12Var = new r45.u12();
                u12Var.f386927d = 0;
                u12Var.f386929f = "安全打击toast title";
                u12Var.f386930g = "安全打击toast content";
                u12Var.f386935o = "安全打击toast short_content";
                u12Var.f386931h = "btn_title";
                e7(u12Var);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        Z6();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f229919q.clear();
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f229916n;
        if (y1Var != null) {
            y1Var.q();
        }
        this.f229916n = null;
    }

    @Override // if2.e
    public void pause() {
        this.f229920r = true;
    }

    @Override // if2.e
    public void resume() {
        this.f229920r = false;
        Z6();
    }
}
