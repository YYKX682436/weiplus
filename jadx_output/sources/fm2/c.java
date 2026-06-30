package fm2;

/* loaded from: classes3.dex */
public abstract class c extends com.tencent.mm.plugin.finder.live.view.k0 {
    private co0.s liveCore;
    private um2.g liveEndUIC;
    private um2.b6 livePrepareUIC;
    private um2.x5 livingUIC;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, androidx.fragment.app.Fragment fragment, android.util.AttributeSet attributeSet) {
        super(context, fragment, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        this.livePrepareUIC = new um2.b6(mMActivity);
        this.livingUIC = new um2.x5(mMActivity);
        this.liveEndUIC = new um2.g(mMActivity);
    }

    public final co0.s getLiveCore() {
        return co0.b.f43709e2.c(getData().f309129d.f68537e);
    }

    public final um2.g getLiveEndUIC() {
        return this.liveEndUIC;
    }

    public final um2.b6 getLivePrepareUIC() {
        return this.livePrepareUIC;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public abstract /* synthetic */ int getLiveRole();

    public final um2.x5 getLivingUIC() {
        return this.livingUIC;
    }

    public final um2.b6 getPrepareUIC() {
        return this.livePrepareUIC;
    }

    public final um2.x5 getStartUIC() {
        return this.livingUIC;
    }

    public void prepareToStart(boolean z17) {
        com.tencent.mm.live.api.LiveConfig liveConfig;
        hm2.a aVar;
        hn0.r rVar;
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        co0.s E;
        kn0.p pVar;
        com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout renderRatioLayout;
        dk2.xf h17;
        um2.x5 x5Var = this.livingUIC;
        if (x5Var != null) {
            kz2.b bVar = kz2.b.f313858a;
            java.lang.String str = x5Var.f429032f;
            bVar.d(str, "startLive " + z17);
            boolean z18 = false;
            androidx.appcompat.app.AppCompatActivity activity = x5Var.f19605b;
            if (z17) {
                if (zl2.q4.f473933a.g() && (h17 = x5Var.h()) != null) {
                    ((dk2.r4) h17).q(null);
                }
                fm2.c cVar = x5Var.f19606c;
                if (cVar != null) {
                    com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(cVar, false, 1, null);
                }
                com.tencent.mm.plugin.finder.live.plugin.f10 f10Var = x5Var.f429077u;
                if (f10Var != null) {
                    f10Var.u1("");
                }
                com.tencent.mm.plugin.finder.live.plugin.be beVar = x5Var.f429080v;
                if (beVar != null) {
                    beVar.t1();
                }
                um2.x5.A(x5Var, true, false, false, 6, null);
                if (((mm2.c1) x5Var.c(mm2.c1.class)).a8()) {
                    um2.x5.p(x5Var, null, false, 3, null);
                }
                mm2.f6 f6Var = (mm2.f6) x5Var.c(mm2.f6.class);
                so2.j5 j5Var = ((mm2.f6) x5Var.f19609a.a(mm2.f6.class)).f329049w;
                c61.bc bcVar = j5Var instanceof c61.bc ? (c61.bc) j5Var : null;
                f6Var.f329050x = bcVar != null ? bcVar.c() : 0L;
                fm2.c cVar2 = x5Var.f19606c;
                if (cVar2 != null) {
                    zl2.r4.f473950a.E2(x5Var.f19609a, cVar2);
                }
                com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var = x5Var.f429041i;
                if (dk0Var != null && (renderRatioLayout = dk0Var.f112299p.getRenderRatioLayout()) != null) {
                    renderRatioLayout.post(new um2.i2(x5Var));
                }
                com.tencent.mm.plugin.finder.live.plugin.na naVar = x5Var.P0;
                if (naVar != null) {
                    naVar.C1();
                }
                com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = x5Var.Y;
                if (le0Var != null) {
                    le0Var.x1(((mm2.c1) x5Var.c(mm2.c1.class)).L9(), false);
                }
                fm2.c cVar3 = x5Var.f19606c;
                if (cVar3 != null) {
                    qo0.c.a(cVar3, qo0.b.C, null, 2, null);
                }
                um2.m.f428873a.b(x5Var);
                pm0.v.V(200L, new um2.j2(x5Var));
                ((we2.w) x5Var.c(we2.w.class)).N6();
                pm0.v.X(new um2.u4(x5Var, false));
                co0.s E2 = x5Var.E();
                if ((E2 != null && E2.X()) && (E = x5Var.E()) != null) {
                    zl2.r4 r4Var = zl2.r4.f473950a;
                    co0.s E3 = x5Var.E();
                    E.R0(E3 != null && (pVar = E3.D) != null && pVar.f309589i ? 5 : 2);
                }
                android.content.Intent intent = activity.getIntent();
                if (intent != null && intent.getBooleanExtra("intent_key_ignore_back", false)) {
                    z18 = true;
                }
                if (z18) {
                    com.tencent.mars.xlog.Log.i(str, "remove INTENT_KEY_IGNORE_BACK");
                    intent.removeExtra("intent_key_ignore_back");
                }
                com.tencent.mars.xlog.Log.i(str, "joinLiveByMiniWin audienceMode:" + ((mm2.c1) x5Var.c(mm2.c1.class)).P6());
                x5Var.W(true);
                fm2.c cVar4 = x5Var.f19606c;
                if (cVar4 == null || (data = cVar4.getData()) == null || (liveRoomControllerStore = data.f309131f) == null) {
                    return;
                }
                if2.z.f291153a.i(liveRoomControllerStore, new if2.w(liveRoomControllerStore));
                return;
            }
            int d17 = com.tencent.mm.ui.bl.d(activity);
            com.tencent.mars.xlog.Log.i(str, "setNavigationBarVisibilityReportFlag navigationBarHeight:" + d17 + " navigationBarHeight=" + d17);
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a(activity).c(zy2.ra.class))).P6("system_navigat_height", java.lang.String.valueOf(d17));
            java.lang.String str2 = "joinLive " + ((mm2.e1) x5Var.c(mm2.e1.class)).X6() + ",liveMode:" + ((mm2.c1) x5Var.c(mm2.c1.class)).f328801f2;
            com.tencent.mars.xlog.Log.i(str, str2);
            bVar.d(str, str2);
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("FINDER_LIVE_MMKV");
            java.lang.Long valueOf = M != null ? java.lang.Long.valueOf(M.getLong("VISITOR_GIFT_EFFECT_OFF_LIVE_ID", 0L)) : null;
            long j17 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0);
            ((mm2.c1) x5Var.c(mm2.c1.class)).f328894u5 = (j17 == 0 || valueOf == null || j17 != valueOf.longValue()) ? false : true;
            com.tencent.mars.xlog.Log.i(str, "initGiftEffectEnable giftEffectOffLiveId:" + valueOf + " curLiveId:" + j17);
            co0.s E4 = x5Var.E();
            if ((E4 == null || (rVar = E4.R1) == null) ? false : rVar.h()) {
                boolean z19 = ((mm2.w) x5Var.c(mm2.w.class)).O6() || (j65.e.b() && j65.e.g());
                com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = x5Var.f429038h;
                if (ob0Var != null) {
                    ob0Var.E1(z19);
                }
            }
            com.tencent.mm.plugin.finder.assist.y8.e(com.tencent.mm.plugin.finder.assist.y8.f102732a, "RV_VISITOR_" + ((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0), com.tencent.mm.plugin.finder.assist.t8.f102560f.f102540b, null, false, false, ((mm2.c1) x5Var.c(mm2.c1.class)).f328782b4, 28, null);
            dk2.u7.f234181a.i();
            dk2.tf tfVar = dk2.tf.f234133a;
            java.lang.String anchorUserName = ((mm2.c1) x5Var.c(mm2.c1.class)).f328852o;
            kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
            if (com.tencent.mm.sdk.platformtools.t8.K0(anchorUserName)) {
                com.tencent.mars.xlog.Log.e("FinderLive.FinderLiveWatchTimeMgr", "joinLive anchorUserName nil");
            } else {
                ((java.util.Map) ((jz5.n) dk2.tf.f234134b).getValue()).put(anchorUserName, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
            }
            te2.c4.f417919n.a(((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0));
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            java.lang.String str3 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a(activity).c(zy2.ra.class))).f135388t;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a(activity).c(zy2.ra.class))).f135387s;
            if (str4 == null) {
                str4 = "";
            }
            r0Var.getClass();
            if (r26.n0.B(str3, ",", false)) {
                str3 = r26.i0.t(str3, ",", ";", false);
            }
            r0Var.M = str3;
            r0Var.f327882u = str4;
            long longExtra = activity.getIntent().getLongExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", 0L);
            activity.getIntent().removeExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID");
            if (!activity.getIntent().hasExtra("key_ad_flag")) {
                mm2.e1 e1Var = (mm2.e1) x5Var.c(mm2.e1.class);
                km2.m mVar = x5Var.f19607d;
                e1Var.f328982i = (mVar == null || (liveConfig = mVar.f309129d) == null) ? 0 : java.lang.Integer.valueOf(liveConfig.X);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAdFlag from staticConfig:");
                java.lang.Integer num = ((mm2.e1) x5Var.c(mm2.e1.class)).f328982i;
                sb6.append(num != null ? num.intValue() : 0);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
            } else if (((mm2.e1) x5Var.c(mm2.e1.class)).f328982i == null) {
                ((mm2.e1) x5Var.c(mm2.e1.class)).f328982i = java.lang.Integer.valueOf(activity.getIntent().getIntExtra("key_ad_flag", 0));
                activity.getIntent().removeExtra("key_ad_flag");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setAdFlag from intent:");
                java.lang.Integer num2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328982i;
                sb7.append(num2 != null ? num2.intValue() : 0);
                com.tencent.mars.xlog.Log.i(str, sb7.toString());
            }
            if (longExtra != 0) {
                ((mm2.e1) x5Var.c(mm2.e1.class)).f328981h = longExtra;
                com.tencent.mars.xlog.Log.i(str, "get fromObjectId:".concat(pm0.v.u(longExtra)));
            }
            java.lang.String stringExtra = activity.getIntent().getStringExtra("KEY_ENTER_LIVE_QRCODE_URL");
            if (stringExtra == null) {
                stringExtra = "";
            }
            ((mm2.c1) x5Var.c(mm2.c1.class)).M8(stringExtra);
            activity.getIntent().putExtra("KEY_ENTER_LIVE_QRCODE_URL", "");
            com.tencent.mm.protobuf.g Mj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Mj();
            dk2.xf j18 = dk2.ef.f233372a.j(x5Var.f19606c);
            if (j18 != null) {
                ((dk2.r4) j18).E(x5Var.f19605b, ((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0), 2, Mj, new um2.s(new java.lang.ref.SoftReference(x5Var), str));
            }
            fm2.c cVar5 = x5Var.f19606c;
            if (cVar5 == null || (aVar = (hm2.a) cVar5.business(hm2.a.class)) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.LiveReportSlice", "markJoinStatusWaitResp");
            aVar.f282220f = 1;
        }
    }

    public final void setLiveCore(co0.s sVar) {
        this.liveCore = sVar;
    }

    public final void setLiveEndUIC(um2.g gVar) {
        this.liveEndUIC = gVar;
    }

    public final void setLivePrepareUIC(um2.b6 b6Var) {
        this.livePrepareUIC = b6Var;
    }

    public final void setLivingUIC(um2.x5 x5Var) {
        this.livingUIC = x5Var;
    }

    public void startToEnd() {
    }
}
