package we2;

/* loaded from: classes3.dex */
public final class q implements we2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f445251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ we2.s f445252b;

    public q(gk2.e eVar, we2.s sVar) {
        this.f445251a = eVar;
        this.f445252b = sVar;
    }

    @Override // we2.a
    public java.util.List a() {
        return ((mm2.c1) this.f445251a.a(mm2.c1.class)).f328815h4;
    }

    @Override // we2.a
    public void b(android.view.View view, r45.oj1 msgJumpInfo) {
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var;
        com.tencent.mm.plugin.finder.live.widget.v6 v6Var;
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var2;
        com.tencent.mm.plugin.finder.live.widget.v6 v6Var2;
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(msgJumpInfo, "msgJumpInfo");
        we2.s sVar = this.f445252b;
        com.tencent.mars.xlog.Log.i(sVar.f445254f, "onCustomClick msgJumpInfo:" + msgJumpInfo.toJSON());
        int integer = msgJumpInfo.getInteger(0);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (integer == 1) {
            r45.rq1 rq1Var = (r45.rq1) msgJumpInfo.getCustom(1);
            if (rq1Var != null) {
                dk2.ef efVar = dk2.ef.f233372a;
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                if (k0Var == null || (c4Var2 = (com.tencent.mm.plugin.finder.live.plugin.c4) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.c4.class)) == null || (v6Var2 = c4Var2.E) == null) {
                    f0Var = null;
                } else {
                    v6Var2.k(rq1Var);
                }
                if (f0Var != null) {
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i(sVar.f445254f, "onCustomClick wording_info null");
            dk2.ef efVar2 = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
            if (k0Var2 == null || (c4Var = (com.tencent.mm.plugin.finder.live.plugin.c4) k0Var2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.c4.class)) == null || (v6Var = c4Var.E) == null) {
                return;
            }
            v6Var.k(null);
            return;
        }
        if (integer != 2) {
            com.tencent.mars.xlog.Log.i(sVar.f445254f, "onCustomClick jump_type invalid:" + msgJumpInfo.getInteger(0));
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) msgJumpInfo.getCustom(2);
        if (finderJumpInfo != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) msgJumpInfo.getCustom(2);
            if ((finderJumpInfo2 != null ? finderJumpInfo2.getReport_info() : null) != null) {
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) msgJumpInfo.getCustom(2);
                if (finderJumpInfo3 == null || (str = finderJumpInfo3.getReport_info()) == null) {
                    str = "";
                }
                boolean z17 = new cl0.g(str).optInt("platform_reminder_notification_biz_type", 0) == 2;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 2);
                jSONObject.put("card_type", z17 ? 2 : 1);
                java.lang.String str2 = sVar.f445254f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report anchor platform notice comment type = 2, cardType = ");
                sb6.append(z17 ? 2 : 1);
                sb6.append(", report str = ");
                sb6.append(jSONObject);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.f328361l2, jSONObject.toString(), null, 4, null);
            }
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(sVar.f445254f, "onCustomClick jump_info null");
        }
    }

    @Override // we2.a
    public void c(java.lang.String str) {
        android.content.Context context;
        com.tencent.mars.xlog.Log.i(this.f445252b.f445254f, "onCommentProfileClick username:" + str);
        if ((str == null || str.length() == 0) || zl2.r4.f473950a.c2(str)) {
            return;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null || (context = k0Var.getContext()) == null) {
            return;
        }
        dk2.q4.j(dk2.q4.f233938a, context, this.f445251a, false, str, null, false, null, 112, null);
    }

    @Override // we2.a
    public void d(dk2.zf msg, int i17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        dk2.t5 N6 = this.f445252b.N6();
        N6.getClass();
        if (msg.m() < N6.f234105d) {
            return;
        }
        if (msg.m() == N6.f234105d) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveCommentStickyHelper", "onDescShow only update pos new:" + i17 + " old:" + N6.f234104c);
            N6.f234104c = i17;
            return;
        }
        if (N6.f234106e) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveCommentStickyHelper", "cancel current sticky desc when new comes");
            N6.f234106e = false;
            yz5.p pVar = N6.f234109h;
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(N6.f234104c), java.lang.Boolean.FALSE);
            }
        }
        N6.f234104c = i17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        N6.f234103b = java.lang.System.currentTimeMillis();
        N6.f234105d = msg.m();
        N6.f234107f = true;
        N6.f234108g = false;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCommentStickyHelper", "onDescShow may sticky desc: targetStickyCommentMsgIndex:" + N6.f234104c + " targetStickyCommentMsgStartShowTime:" + N6.f234103b + " targetStickyCommentMsgSeq:" + N6.f234105d);
    }

    @Override // we2.a
    public void e(boolean z17) {
        ((mm2.x4) this.f445251a.a(mm2.x4.class)).f329540u = z17;
    }

    @Override // we2.a
    public int f() {
        return this.f445252b.f445257i;
    }

    @Override // we2.a
    public void g(java.lang.String str, java.lang.String str2) {
        ((mm2.m6) this.f445251a.a(mm2.m6.class)).f329244i.postValue(new mm2.j7(str, str2));
    }

    @Override // we2.a
    public boolean h(int i17) {
        java.lang.Boolean bool = (java.lang.Boolean) ((java.util.LinkedHashMap) ((mm2.x4) this.f445251a.a(mm2.x4.class)).f329542w).get(java.lang.Integer.valueOf(i17));
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // we2.a
    public r45.ze2 i() {
        return ((mm2.c1) this.f445251a.a(mm2.c1.class)).f328787c4;
    }

    @Override // we2.a
    public void j() {
        com.tencent.mm.plugin.finder.live.plugin.th0 th0Var;
        android.content.Context context;
        we2.s sVar = this.f445252b;
        com.tencent.mars.xlog.Log.i(sVar.f445254f, "onCommentFansClubClick");
        if (((mm2.c1) this.f445251a.a(mm2.c1.class)).m7()) {
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var == null || (th0Var = (com.tencent.mm.plugin.finder.live.plugin.th0) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.th0.class)) == null) {
                return;
            }
            th0Var.v1(com.tencent.mm.plugin.finder.live.plugin.eh0.f112421n);
            return;
        }
        com.tencent.mars.xlog.Log.i(sVar.f445254f, "onCommentFansClubClick intercepted: anchor disabled gift");
        dk2.ef efVar2 = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
        if (k0Var2 == null || (context = k0Var2.getContext()) == null) {
            return;
        }
        db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.dk_));
    }

    @Override // we2.a
    public void k(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        zl2.r4.f473950a.j1(context, this.f445251a);
    }

    @Override // we2.a
    public boolean l(int i17) {
        dk2.t5 N6 = this.f445252b.N6();
        return N6.f234106e && N6.f234104c == i17;
    }

    @Override // we2.a
    public java.util.Set m() {
        return ((mm2.x4) this.f445251a.a(mm2.x4.class)).f329541v;
    }

    @Override // we2.a
    public void n(java.lang.String str, java.lang.String str2) {
        android.content.Context context;
        we2.s sVar = this.f445252b;
        com.tencent.mars.xlog.Log.i(sVar.f445254f, "onCommentGiftClick rewardProductId:" + str + " toUsername:" + str2);
        gk2.e eVar = this.f445251a;
        if (!((mm2.c1) eVar.a(mm2.c1.class)).m7()) {
            com.tencent.mars.xlog.Log.i(sVar.f445254f, "onCommentGiftClick intercepted: anchor disabled gift");
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var == null || (context = k0Var.getContext()) == null) {
                return;
            }
            db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.dk_));
            return;
        }
        dk2.ef efVar2 = dk2.ef.f233372a;
        if (dk2.ef.f233380e != null) {
            r45.zb4 zb4Var = new r45.zb4();
            if (str == null) {
                str = "";
            }
            zb4Var.set(0, str);
            zb4Var.set(1, java.lang.Boolean.TRUE);
            if (!(str2 == null || str2.length() == 0)) {
                zb4Var.set(6, str2);
            }
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.s2) eVar.a(mm2.s2.class)).f329411p;
            if (liveMutableData != null) {
                liveMutableData.postValue(zb4Var);
            }
        }
    }

    @Override // we2.a
    public void o(boolean z17, int i17) {
        mm2.x4 x4Var = (mm2.x4) this.f445251a.a(mm2.x4.class);
        x4Var.f329542w.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
    }

    @Override // we2.a
    public com.tencent.mm.plugin.finder.live.view.k0 p() {
        dk2.ef efVar = dk2.ef.f233372a;
        return dk2.ef.f233380e;
    }

    @Override // we2.a
    public boolean q() {
        return ((mm2.m6) this.f445251a.a(mm2.m6.class)).f329248p;
    }

    @Override // we2.a
    public boolean r() {
        return ((mm2.c1) this.f445251a.a(mm2.c1.class)).R6();
    }

    @Override // we2.a
    public void s(java.lang.String str) {
        sf2.d3 d3Var;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null || (d3Var = (sf2.d3) k0Var.getController(sf2.d3.class)) == null) {
            return;
        }
        d3Var.w7(-1, fn2.u1.f264414i, fn2.v1.f264423f, str);
    }

    @Override // we2.a
    public boolean t() {
        dk2.ef efVar = dk2.ef.f233372a;
        return dk2.ef.f233384g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we2.a
    public void u(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        gk2.e eVar = this.f445251a;
        pq5.g l17 = new ek2.v2(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.e1) eVar.a(mm2.e1.class)).f328992v, ((mm2.e1) eVar.a(mm2.e1.class)).f328985o, str).l();
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            l17.f((im5.b) context);
        }
    }

    @Override // we2.a
    public boolean v(java.util.LinkedList linkedList) {
        return zl2.r4.f473950a.d2(this.f445251a, linkedList);
    }

    @Override // we2.a
    public java.lang.String w() {
        return ((mm2.c1) this.f445251a.a(mm2.c1.class)).f328852o;
    }

    @Override // we2.a
    public void x(android.app.Activity context, r45.v62 luckyMoneySendInfo, android.os.ResultReceiver resultReceiver, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(luckyMoneySendInfo, "luckyMoneySendInfo");
        dk2.xf k17 = dk2.ef.f233372a.k(this.f445251a);
        if (k17 != null) {
            ((dk2.r4) k17).W(context, luckyMoneySendInfo, resultReceiver, lVar);
        }
    }
}
