package com.tencent.mm.ui.chatting.component;

/* JADX INFO: Access modifiers changed from: package-private */
@yn.c(exportInterface = sb5.s.class)
/* loaded from: classes10.dex */
public class h3 extends com.tencent.mm.ui.chatting.component.a implements sb5.s {

    /* renamed from: e, reason: collision with root package name */
    public final l75.q0 f199138e = new com.tencent.mm.ui.chatting.component.i3(this);

    /* renamed from: f, reason: collision with root package name */
    public final l75.q0 f199139f = new com.tencent.mm.ui.chatting.component.j3(this);

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f199140g = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2, types: [com.tencent.mm.feature.finder.live.v4] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    public void C() {
        java.lang.String f27;
        sb5.z0 z0Var;
        java.lang.String str;
        java.lang.String str2;
        android.text.SpannableString spannableString;
        java.lang.String str3;
        boolean z17;
        java.lang.String str4;
        java.lang.String str5;
        ?? r212;
        ?? r202;
        boolean z18;
        java.lang.String str6;
        int i17;
        java.lang.String str7;
        boolean z19;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String h17 = com.tencent.mm.plugin.finder.service.m4.f126148a.h(this.f198580d.x());
        if (java.lang.Boolean.valueOf(com.tencent.mm.storage.z3.S3(h17)).booleanValue()) {
            zy2.dc hj6 = ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).hj(h17);
            f27 = hj6 != null ? ((ya2.b2) hj6).z0() : "";
            if (hj6 != null) {
                ya2.b2 b2Var = (ya2.b2) hj6;
                if (b2Var.field_authInfo != null) {
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    ya2.m1.f460511a.c(((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).f199692p.f208984q, b2Var.field_authInfo, 1);
                }
            }
        } else {
            com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(h17);
            f27 = q17 != null ? q17.f2() : "";
        }
        if (f27 == null) {
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).B0("");
        } else {
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).B0(f27);
        }
        zy2.dc fj6 = ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).fj(h17);
        if (fj6 != null) {
            sb5.z0 z0Var2 = (sb5.z0) this.f198580d.f460708c.a(sb5.z0.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.ArrayList arrayList = new java.util.ArrayList(32);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            try {
            } catch (java.lang.Exception e17) {
                e = e17;
                z0Var = z0Var2;
            }
            try {
                if (fj6 instanceof ya2.b2) {
                    ya2.b2 b2Var2 = (ya2.b2) fj6;
                    r45.zl1 zl1Var = b2Var2.field_badgeInfoList;
                    if (zl1Var == null || zl1Var.getList(0) == null || b2Var2.field_badgeInfoList.getList(0).size() == 0) {
                        z0Var = z0Var2;
                        str3 = "";
                    } else {
                        if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_HAS_GET_REWARD_BOOLEAN_SYNC, false)) {
                            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                            z0Var = z0Var2;
                            str3 = "";
                            r212 = new int[]{2, 4, 13, 15};
                            r202 = b2Var2.field_badgeInfoList.getList(0);
                            arrayList.addAll(((com.tencent.mm.feature.finder.live.v4) w0Var).yk(null, r202, r212, 2, 0));
                        } else {
                            z0Var = z0Var2;
                            str3 = "";
                            arrayList.addAll(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).yk(null, b2Var2.field_badgeInfoList.getList(0), new int[]{4, 13, 15}, 2, 0));
                        }
                        if (b2Var2.field_badgeInfoList.getList(0).size() <= 1) {
                            z19 = true;
                            sb7.append("isLocalFinderContact=true;");
                            z17 = z19;
                        }
                    }
                    z19 = false;
                    sb7.append("isLocalFinderContact=true;");
                    z17 = z19;
                } else {
                    z0Var = z0Var2;
                    str3 = "";
                    z17 = false;
                }
                boolean z27 = ((ya2.b2) fj6).field_is_my_member;
                boolean z28 = ((ya2.b2) fj6).field_follow_Flag == 1;
                if (z27) {
                    java.lang.String string = this.f198580d.g().getResources().getString(com.tencent.mm.R.string.cnl);
                    sb7.append("isMember=true;isFinderContact=true;");
                    str5 = string;
                    str4 = str3;
                } else if (z28 && z17) {
                    str4 = this.f198580d.g().getResources().getString(com.tencent.mm.R.string.cnj);
                    sb7.append("isFinderContact=true;followed;");
                    str5 = str3;
                } else {
                    sb7.append("isFinderContact=true;no follow;");
                    str4 = str3;
                    str5 = str4;
                }
                long j17 = ((ya2.b2) fj6).field_rewardTotalAmountInWecoin;
                try {
                    if (j17 > 0) {
                        r202 = "MicroMsg.ChattingBypComponent";
                        try {
                            r212 = "buildFinderCustomerInfo:";
                            z18 = z17;
                            str6 = this.f198580d.g().getResources().getString(com.tencent.mm.R.string.cnm, java.lang.Long.valueOf(j17));
                            sb7.append("isFinderContact=true;have wecoin;");
                            r202 = r202;
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            r212 = "buildFinderCustomerInfo:";
                            str2 = r202;
                            str = r212;
                            com.tencent.mars.xlog.Log.e(str2, str + e.getMessage());
                            spannableString = new android.text.SpannableString(sb6);
                            ((com.tencent.mm.ui.chatting.component.pe) z0Var).f199692p.e(spannableString);
                        }
                    } else {
                        r212 = "buildFinderCustomerInfo:";
                        r202 = "MicroMsg.ChattingBypComponent";
                        z18 = z17;
                        sb7.append("isFinderContact=true;no wecoin;");
                        str6 = str3;
                    }
                    long j18 = ((ya2.b2) fj6).field_interactionCount;
                    if (j17 != 0 || j18 <= 0) {
                        i17 = 0;
                        sb7.append("interactionCount=0;");
                        str7 = str3;
                    } else {
                        i17 = 0;
                        str7 = this.f198580d.g().getResources().getString(com.tencent.mm.R.string.cnk, java.lang.Long.valueOf(j18));
                        sb7.append("interactionCount=" + j18 + ";");
                    }
                    int size = arrayList.size();
                    sb7.append("spanSize=" + size);
                    for (int i18 = i17; i18 < size; i18++) {
                        sb6.append(" ");
                    }
                    sb6.append(str5);
                    sb6.append(str4);
                    if ((str4.length() > 0 || str5.length() > 0) && (str6.length() > 0 || str7.length() > 0)) {
                        sb6.append("  ");
                    }
                    sb6.append(str6);
                    sb6.append(str7);
                    if (android.text.TextUtils.isEmpty(str5) && android.text.TextUtils.isEmpty(str4) && android.text.TextUtils.isEmpty(str6) && android.text.TextUtils.isEmpty(str7) && size > 0) {
                        sb6.append(" ");
                    }
                    spannableString = new android.text.SpannableString(sb6);
                    int i19 = i17;
                    while (i19 < size) {
                        int i27 = size;
                        int i28 = i19 + 1;
                        spannableString.setSpan(arrayList.get(i19), i19, i28, 33);
                        i19 = i28;
                        size = i27;
                        arrayList = arrayList;
                    }
                    if (z27) {
                        int indexOf = sb6.indexOf(str5);
                        int length = str5.length() + indexOf;
                        spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#C5984C")), indexOf, length, 33);
                        spannableString.setSpan(new android.text.style.AbsoluteSizeSpan(i65.a.f(this.f198580d.g(), com.tencent.mm.R.dimen.f479788f9)), indexOf, length, 33);
                    } else if (z28 && z18) {
                        int indexOf2 = sb6.indexOf(str4);
                        int length2 = str4.length() + indexOf2;
                        spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#07C160")), indexOf2, length2, 33);
                        spannableString.setSpan(new android.text.style.AbsoluteSizeSpan(i65.a.f(this.f198580d.g(), com.tencent.mm.R.dimen.f479788f9)), indexOf2, length2, 33);
                    }
                    if (j17 > 0) {
                        int indexOf3 = sb6.indexOf(str6);
                        int length3 = str6.length() + indexOf3;
                        spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#FF6146")), indexOf3, length3, 33);
                        spannableString.setSpan(new android.text.style.AbsoluteSizeSpan(i65.a.f(this.f198580d.g(), com.tencent.mm.R.dimen.f479788f9)), indexOf3, length3, 33);
                    }
                    if (j17 == 0 && j18 > 0) {
                        int indexOf4 = sb6.indexOf(str7);
                        int length4 = str7.length() + indexOf4;
                        spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#FA9D3B")), indexOf4, length4, 33);
                        spannableString.setSpan(new android.text.style.AbsoluteSizeSpan(i65.a.f(this.f198580d.g(), com.tencent.mm.R.dimen.f479788f9)), indexOf4, length4, 33);
                    }
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    str = r212;
                    try {
                        sb8.append(str);
                        sb8.append((java.lang.Object) sb7);
                        str2 = r202;
                        try {
                            com.tencent.mars.xlog.Log.i(str2, sb8.toString());
                        } catch (java.lang.Exception e19) {
                            e = e19;
                            com.tencent.mars.xlog.Log.e(str2, str + e.getMessage());
                            spannableString = new android.text.SpannableString(sb6);
                            ((com.tencent.mm.ui.chatting.component.pe) z0Var).f199692p.e(spannableString);
                        }
                    } catch (java.lang.Exception e27) {
                        e = e27;
                        str2 = r202;
                    }
                } catch (java.lang.Exception e28) {
                    e = e28;
                }
            } catch (java.lang.Exception e29) {
                e = e29;
                str = "buildFinderCustomerInfo:";
                str2 = "MicroMsg.ChattingBypComponent";
                com.tencent.mars.xlog.Log.e(str2, str + e.getMessage());
                spannableString = new android.text.SpannableString(sb6);
                ((com.tencent.mm.ui.chatting.component.pe) z0Var).f199692p.e(spannableString);
            }
            ((com.tencent.mm.ui.chatting.component.pe) z0Var).f199692p.e(spannableString);
        }
    }

    @Override // sb5.s
    public boolean D(final sb5.q qVar) {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.tencent.mm.plugin.finder.viewmodel.component.dy dyVar = com.tencent.mm.plugin.finder.viewmodel.component.dy.f134172a;
        if (dyVar.b()) {
            dyVar.c(this.f198580d.g(), this.f198580d.t(), 2, new yz5.a() { // from class: com.tencent.mm.ui.chatting.component.h3$$a
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.ui.chatting.viewitems.nn$$a nn__a = (com.tencent.mm.ui.chatting.viewitems.nn$$a) sb5.q.this;
                    nn__a.f204940a.h0(nn__a.f204941b);
                    return null;
                }
            });
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.nn$$a nn__a = (com.tencent.mm.ui.chatting.viewitems.nn$$a) qVar;
        nn__a.f204940a.h0(nn__a.f204941b);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e;
        if (chatFooter == null || !com.tencent.mm.storage.z3.V3(this.f198580d.u().d1()) || (chatFooterPanel = chatFooter.getChatFooterPanel()) == null) {
            return;
        }
        chatFooterPanel.setShowSearch(false);
        chatFooterPanel.j();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        qb2.r1 r1Var = (qb2.r1) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Sj();
        int i17 = 0;
        r1Var.f361288i = false;
        r1Var.c(500L, qb2.c1.f361183f);
        ((b92.v1) ((zy2.z7) i95.n0.c(zy2.z7.class))).Ri(false);
        if (u()) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Kj().y0(this.f198580d.x());
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).pk().remove(this.f199138e);
            ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).rj(this.f199139f);
            ((com.tencent.mm.plugin.finder.extension.reddot.e1) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().S()).h(com.tencent.mm.storage.z3.S3(this.f198580d.t()) ? this.f198580d.t() : null, zy2.y8.G);
            java.lang.String x17 = this.f198580d.x();
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            yb5.d dVar = this.f198580d;
            if (dVar != null && dVar.g() != null) {
                i17 = this.f198580d.g().getIntent().getIntExtra("key_from_comment_scene", 0);
            }
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            java.lang.String a17 = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1.a(i17 + 100);
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            com.tencent.mm.plugin.finder.report.n nVar = com.tencent.mm.plugin.finder.report.p.f125227f;
            nVar.getClass();
            com.tencent.mm.autogen.mmdata.rpt.FinderChatEnterStruct finderChatEnterStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderChatEnterStruct();
            finderChatEnterStruct.f56591d = i17;
            if (Ri == null) {
                Ri = "";
            }
            finderChatEnterStruct.f56594g = finderChatEnterStruct.b("sessionid", Ri, true);
            if (a17 == null) {
                a17 = "";
            }
            finderChatEnterStruct.f56595h = finderChatEnterStruct.b("clicktabcontextid", a17, true);
            finderChatEnterStruct.f56592e = nVar.f125140b;
            finderChatEnterStruct.f56593f = finderChatEnterStruct.b("talkerUsername", nVar.f125141c, true);
            finderChatEnterStruct.f56597j = finderChatEnterStruct.b("chatSessionid", nVar.f125143e, true);
            finderChatEnterStruct.f56596i = finderChatEnterStruct.b("chatListSessionid", nVar.f125142d, true);
            finderChatEnterStruct.f56598k = c01.id.c() - nVar.f125147i;
            finderChatEnterStruct.f56599l = finderChatEnterStruct.b("chatName", nVar.f125144f, true);
            finderChatEnterStruct.f56600m = nVar.f125145g;
            finderChatEnterStruct.f56603p = nVar.f125146h;
            nVar.f125139a.post(new com.tencent.mm.plugin.finder.report.m(x17, nVar.f125147i, finderChatEnterStruct, nVar));
            nVar.f125140b = 0L;
            nVar.f125141c = "";
            nVar.f125142d = "";
            nVar.f125143e = "";
            nVar.f125144f = "";
            nVar.f125145g = 0L;
            nVar.f125146h = 0L;
            nVar.f125147i = 0L;
        }
    }

    @Override // yn.d
    public boolean M() {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        return com.tencent.wechat.aff.finder.FinderPrefetchManager.getInstance().canShowEduTipsWithKey(bw5.ms0.emFinderNewbieGuideType_PrivateMsgTips) && u();
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1010 && intent != null && intent.getBooleanExtra("KEY_HAS_CHANGE_ROLE", false)) {
            this.f198580d.g().finish();
            this.f198580d.g().overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
        }
    }

    @Override // yn.d
    public boolean b0() {
        boolean z17;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity context = this.f198580d.g();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.wechat.aff.finder.FinderPrefetchManager finderPrefetchManager = com.tencent.wechat.aff.finder.FinderPrefetchManager.getInstance();
        bw5.ms0 ms0Var = bw5.ms0.emFinderNewbieGuideType_PrivateMsgTips;
        if (finderPrefetchManager.canShowEduTipsWithKey(ms0Var)) {
            com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(context);
            e3Var.f(com.tencent.mm.R.layout.edk);
            android.view.View view = e3Var.f131959f;
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tud);
            kotlin.jvm.internal.o.d(textView);
            com.tencent.mm.ui.fk.a(textView);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tub);
            textView2.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.yu(e3Var));
            com.tencent.mm.ui.fk.a(textView2);
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tuc)).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.zu(context));
            e3Var.i();
            com.tencent.wechat.aff.finder.FinderPrefetchManager.getInstance().markShowOnceEduTipsWithKey(ms0Var);
            z17 = true;
        } else {
            z17 = false;
        }
        return z17 && u();
    }

    @Override // sb5.s
    public boolean e(java.lang.String str) {
        return com.tencent.mm.storage.z3.U3(str);
    }

    @Override // sb5.s
    public boolean i(java.lang.String str) {
        return com.tencent.mm.storage.z3.S3(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m0() {
        /*
            r20 = this;
            r0 = r20
            java.lang.Class<zy2.b6> r1 = zy2.b6.class
            i95.m r1 = i95.n0.c(r1)
            zy2.b6 r1 = (zy2.b6) r1
            yb5.d r2 = r0.f198580d
            android.app.Activity r2 = r2.g()
            c61.l7 r1 = (c61.l7) r1
            r1.getClass()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.o.g(r2, r1)
            boolean r1 = r2 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L22
            r1 = r2
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            goto L23
        L22:
            r1 = 0
        L23:
            if (r1 != 0) goto L2e
            java.lang.String r1 = "Finder.FinderCommonFeatureService"
            java.lang.String r2 = "tryShowOpenFinderEntranceDialogAfterPrivateMsg: activity is not AppCompatActivity, skip"
            com.tencent.mars.xlog.Log.i(r1, r2)
            goto L96
        L2e:
            com.tencent.mm.plugin.finder.view.s8 r4 = com.tencent.mm.plugin.finder.view.s8.f133027a
            com.tencent.mm.plugin.finder.view.h8 r15 = new com.tencent.mm.plugin.finder.view.h8
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            android.content.res.Resources r5 = r2.getResources()
            r6 = 2131781421(0x7f10672d, float:1.9194455E38)
            java.lang.String r6 = r5.getString(r6)
            java.lang.String r5 = "getString(...)"
            kotlin.jvm.internal.o.f(r6, r5)
            com.tencent.mm.plugin.finder.view.i8 r7 = com.tencent.mm.plugin.finder.view.i8.f132294e
            com.tencent.mm.plugin.finder.view.d8 r8 = com.tencent.mm.plugin.finder.view.d8.f131881e
            android.content.res.Resources r9 = r2.getResources()
            r10 = 2131781423(0x7f10672f, float:1.919446E38)
            java.lang.String r9 = r9.getString(r10)
            kotlin.jvm.internal.o.f(r9, r5)
            android.content.res.Resources r2 = r2.getResources()
            r10 = 2131781422(0x7f10672e, float:1.9194457E38)
            java.lang.String r10 = r2.getString(r10)
            kotlin.jvm.internal.o.f(r10, r5)
            c61.i7 r11 = new c61.i7
            r11.<init>(r1)
            r12 = 0
            java.lang.String r14 = "profile_set_entrance_open"
            java.lang.String r2 = "profile_set_entrance_unopen"
            java.lang.String r16 = "profile_set_entrance_halfscreen"
            r5 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            jz5.l r13 = new jz5.l
            java.lang.String r3 = "action_type"
            r13.<init>(r3, r5)
            java.util.Map r17 = kz5.b1.e(r13)
            r18 = 192(0xc0, float:2.69E-43)
            r19 = 0
            r13 = 0
            r5 = r15
            r3 = r15
            r15 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = "private_msg"
            gx2.q r1 = r4.e(r1, r2, r3)
            if (r1 == 0) goto L96
            r1 = 1
            r3 = r1
            goto L97
        L96:
            r3 = 0
        L97:
            if (r3 == 0) goto L9e
            yb5.d r1 = r0.f198580d
            r1.y()
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.h3.m0():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127784k5).getValue()).r()).booleanValue() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.h3.n0():void");
    }

    @Override // sb5.s
    public boolean u() {
        return com.tencent.mm.storage.z3.V3(this.f198580d.x());
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        android.view.View view;
        if (u()) {
            if (((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) this.f198580d.f460708c.a(sb5.e.class))).p0() && (view = this.f199140g) != null) {
                view.setBackgroundResource(com.tencent.mm.R.drawable.f481170md);
            }
            n0();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        ((qb2.r1) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Sj()).f361288i = true;
        ((b92.v1) ((zy2.z7) i95.n0.c(zy2.z7.class))).Ri(true);
        if (u()) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).pk().add(this.f199138e);
            ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).wi(this.f199139f);
            this.f198580d.f460717l.getStringExtra("Chat_User");
            C();
            zy2.g6 g6Var = (zy2.g6) i95.n0.c(zy2.g6.class);
            java.lang.String x17 = this.f198580d.x();
            ((com.tencent.mm.plugin.finder.service.v1) g6Var).getClass();
            if (!(x17.length() == 0)) {
                if (!com.tencent.mm.storage.z3.V3(x17)) {
                    throw new java.lang.RuntimeException("sessionId[" + x17 + "] is not session");
                }
                ((c61.l7) i95.n0.c(c61.l7.class)).Kj().y0(x17);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f198580d.x())) {
                ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.ui.chatting.component.k3(this, this.f198580d.v()));
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            com.tencent.mm.plugin.finder.service.m4 m4Var = com.tencent.mm.plugin.finder.service.m4.f126148a;
            java.lang.String h17 = m4Var.h(this.f198580d.x());
            if (com.tencent.mm.storage.z3.S3(this.f198580d.t())) {
                android.content.Intent intent = this.f198580d.g().getIntent();
                int intExtra = intent != null ? intent.getIntExtra("key_finder_enter_scene", 0) : 0;
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                java.lang.String x18 = this.f198580d.x();
                ((c61.l7) b6Var).getClass();
                pm0.v.K(null, new c61.i3(x18, intExtra));
            }
            zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
            long j17 = com.tencent.mm.storage.z3.S3(h17) ? 2L : 1L;
            java.lang.String x19 = this.f198580d.x();
            ((c61.w8) paVar).getClass();
            com.tencent.mm.plugin.finder.report.n nVar = com.tencent.mm.plugin.finder.report.p.f125227f;
            nVar.getClass();
            nVar.f125140b = j17;
            nVar.f125141c = h17;
            nVar.f125144f = x19;
            long c17 = c01.id.c();
            nVar.f125147i = c17;
            nVar.f125143e = java.lang.String.valueOf(c17);
            com.tencent.mm.plugin.finder.report.a6 a6Var = com.tencent.mm.plugin.finder.report.p.f125224c;
            if (a6Var.f124949a) {
                nVar.f125142d = a6Var.f124950b.f125079b;
            } else {
                com.tencent.mm.plugin.finder.report.a6 a6Var2 = com.tencent.mm.plugin.finder.report.p.f125223b;
                if (a6Var2.f124949a) {
                    nVar.f125142d = a6Var2.f124950b.f125079b;
                }
            }
            com.tencent.mars.xlog.Log.i("RecordFinderChatEnter", "onEnterChat:talkUserNameL" + nVar.f125141c + ", chatNameL" + nVar.f125144f + "， accountTypeL" + nVar.f125140b);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            boolean z17 = m4Var.e().J0(this.f198580d.x()).field_actionPermission == 0;
            ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127904r).getValue()).r()).intValue() == 1 && z17 && this.f199140g == null) {
                com.tencent.mm.ui.chatting.component.z4.j(this.f198580d.f460717l, com.tencent.mm.R.id.s_n);
                android.view.View c18 = this.f198580d.c(com.tencent.mm.R.id.s7o);
                this.f199140g = c18;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c18, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingFinderComponent", "onChattingEnterAnimStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c18, "com/tencent/mm/ui/chatting/component/ChattingFinderComponent", "onChattingEnterAnimStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int b17 = i65.a.b(this.f198580d.g(), 60);
                android.view.ViewGroup f17 = this.f198580d.p().f();
                if (!(f17.getTag(com.tencent.mm.R.id.bgd) instanceof java.lang.Integer)) {
                    f17.setTag(com.tencent.mm.R.id.bgd, java.lang.Integer.valueOf(b17));
                    f17.setPadding(f17.getPaddingLeft(), f17.getPaddingTop() + b17, f17.getPaddingRight(), f17.getPaddingBottom());
                    return;
                }
                int intValue = ((java.lang.Integer) f17.getTag(com.tencent.mm.R.id.bgd)).intValue();
                if (b17 != intValue) {
                    int i17 = b17 - intValue;
                    f17.setTag(com.tencent.mm.R.id.bgd, java.lang.Integer.valueOf(i17));
                    f17.setPadding(f17.getPaddingLeft(), f17.getPaddingTop() + i17, f17.getPaddingRight(), f17.getPaddingBottom());
                }
            }
        }
    }
}
