package df2;

/* loaded from: classes3.dex */
public final class qf extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231161m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231161m = "Finder.LiveCommentController";
    }

    public static final void Z6(df2.qf qfVar, mm2.e2 mode) {
        mm2.y1 P6 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
        mm2.e2 e2Var = P6 != null ? P6.f329552a : null;
        java.lang.String str = qfVar.f231161m;
        if (mode == e2Var) {
            com.tencent.mars.xlog.Log.i(str, "updateCommentConfig but newCommentMode:" + mode + " same with old value");
            return;
        }
        mm2.y1 P62 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
        if (P62 != null) {
            kotlin.jvm.internal.o.g(mode, "mode");
            com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "saveDanmakuMode mode:" + mode);
            if (mm2.x1.f329524a[mode.ordinal()] == 1) {
                gm0.j1.u().c().x(mm2.j2.I, 1);
            } else {
                gm0.j1.u().c().x(mm2.j2.I, 0);
            }
            P62.f329552a = mode;
        }
        com.tencent.mars.xlog.Log.i(str, "update commentMode baseConfig:" + ((mm2.j2) qfVar.business(mm2.j2.class)).P6());
        df2.ug ugVar = (df2.ug) qfVar.controller(df2.ug.class);
        if (ugVar != null) {
            ugVar.c7(java.lang.String.valueOf(mode));
        }
        mm2.y1 P63 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
        if (P63 != null) {
            c7(qfVar, P63, false, 2, null);
        }
        if (mode == mm2.e2.f328998e) {
            mm2.j2.T6((mm2.j2) qfVar.business(mm2.j2.class), 0, 1, null);
        }
    }

    public static void c7(df2.qf qfVar, mm2.y1 y1Var, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar;
        com.tencent.mm.plugin.finder.live.plugin.ap apVar;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar2;
        com.tencent.mm.plugin.finder.live.plugin.ap apVar2;
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        qfVar.getClass();
        int ordinal = y1Var.f329552a.ordinal();
        if (ordinal == 0) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            if (!r4Var.w1() && (apVar = (com.tencent.mm.plugin.finder.live.plugin.ap) qfVar.R6(com.tencent.mm.plugin.finder.live.plugin.ap.class)) != null) {
                apVar.K0(apVar.f113327i);
            }
            if (!r4Var.w1() && (mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) qfVar.R6(com.tencent.mm.plugin.finder.live.plugin.mg.class)) != null) {
                mgVar.K0(mgVar.f113327i);
            }
            qfVar.a7();
            if (((mm2.j2) qfVar.business(mm2.j2.class)).R6()) {
                df2.ug ugVar = (df2.ug) qfVar.controller(df2.ug.class);
                if (ugVar != null) {
                    ugVar.e7("showCommentDanmaku", z17);
                    return;
                }
                return;
            }
            df2.ug ugVar2 = (df2.ug) qfVar.controller(df2.ug.class);
            if (ugVar2 != null) {
                ugVar2.c7("updateCommentConfig");
                return;
            }
            return;
        }
        if (ordinal != 1) {
            return;
        }
        zl2.r4 r4Var2 = zl2.r4.f473950a;
        if (!r4Var2.w1() && (apVar2 = (com.tencent.mm.plugin.finder.live.plugin.ap) qfVar.R6(com.tencent.mm.plugin.finder.live.plugin.ap.class)) != null) {
            apVar2.K0(apVar2.f113327i);
        }
        if (!r4Var2.w1() && (mgVar2 = (com.tencent.mm.plugin.finder.live.plugin.mg) qfVar.R6(com.tencent.mm.plugin.finder.live.plugin.mg.class)) != null) {
            mgVar2.K0(mgVar2.f113327i);
        }
        qfVar.a7();
        if (((mm2.j2) qfVar.business(mm2.j2.class)).R6()) {
            df2.ug ugVar3 = (df2.ug) qfVar.controller(df2.ug.class);
            if (ugVar3 != null) {
                ugVar3.e7("showCommentAndPrivilegeDanmaku", z17);
                return;
            }
            return;
        }
        df2.ug ugVar4 = (df2.ug) qfVar.controller(df2.ug.class);
        if (ugVar4 != null) {
            ugVar4.e7("showCommentDanmaku", z17);
        }
    }

    public final void a7() {
        fe2.q qVar;
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        fe2.q qVar2 = (fe2.q) R6(fe2.q.class);
        if (qVar2 != null) {
            qVar2.K0(qVar2.f113327i);
        }
        if (((mm2.e0) business(mm2.e0.class)).P6() && ((mm2.j2) business(mm2.j2.class)).O6(U6()) && (qVar = (fe2.q) R6(fe2.q.class)) != null) {
            qVar.G1(this.f231161m + "_checkBoxVisible");
        }
    }

    public final void b7(java.lang.String str) {
        mm2.y1 y1Var;
        boolean U6 = U6();
        boolean a86 = ((mm2.c1) business(mm2.c1.class)).a8();
        boolean booleanValue = ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.j2) business(mm2.j2.class)).f329166n).getValue()).booleanValue();
        com.tencent.mars.xlog.Log.i(this.f231161m, str + " initFloatMsgConfig(" + hashCode() + "),isLandscape:" + U6 + ",liveStart:" + a86 + ",CommentConfig:" + ((mm2.j2) business(mm2.j2.class)).P6() + "enablePostPrivilegeFloatMsg:" + ((mm2.j2) business(mm2.j2.class)).R6() + ",customPrivilegeFloatMsgSwitch:" + ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.j2) business(mm2.j2.class)).f329169q).getValue()).booleanValue() + ",enableCommentFloatMsg:" + booleanValue + ",customCommentFloatMsgSwitch:" + ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.j2) business(mm2.j2.class)).f329165m).getValue()).booleanValue());
        mm2.y1 P6 = ((mm2.j2) business(mm2.j2.class)).P6();
        if (P6 != null) {
            P6.f329553b = ((mm2.j2) business(mm2.j2.class)).R6() && ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.j2) business(mm2.j2.class)).f329169q).getValue()).booleanValue();
        }
        mm2.w1 w1Var = mm2.y1.f329551e;
        boolean z17 = booleanValue && !((mm2.c1) business(mm2.c1.class)).N7();
        boolean z18 = ((mm2.j2) business(mm2.j2.class)).R6() && ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.j2) business(mm2.j2.class)).f329169q).getValue()).booleanValue();
        if (U6 && z17) {
            mm2.e2 e2Var = w1Var.a() ? mm2.e2.f328998e : mm2.e2.f328997d;
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_RANGE_INT_SYNC, 1);
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) m17).intValue();
            mm2.b2 b2Var = mm2.j2.F.c() ? mm2.b2.f328759d : intValue != 1 ? intValue != 2 ? mm2.b2.f328759d : mm2.b2.f328761f : mm2.b2.f328760e;
            java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_TRANS_INT_SYNC, 1);
            kotlin.jvm.internal.o.e(m18, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((java.lang.Integer) m18).intValue();
            mm2.d2 d2Var = intValue2 != 1 ? intValue2 != 2 ? mm2.d2.f328955f : mm2.d2.f328953d : mm2.d2.f328954e;
            com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "initFileCommentConfig landscape danmakuMode:" + (w1Var.a() ? 1 : 0) + ",danmakuRange:" + intValue + ",danmakuTrans:" + intValue2);
            y1Var = new mm2.y1(e2Var, z18, new mm2.z1(b2Var, d2Var), new mm2.c2(12000, 0));
        } else {
            y1Var = new mm2.y1(mm2.e2.f328997d, z18, new mm2.z1(mm2.b2.f328759d, mm2.d2.f328953d), new mm2.c2(6500, 0));
        }
        mm2.j2 j2Var = (mm2.j2) business(mm2.j2.class);
        j2Var.getClass();
        com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "saveCommentConfigInfo config:" + y1Var);
        j2Var.f329173u = y1Var;
        if (a86) {
            if (U6) {
                mm2.y1 P62 = ((mm2.j2) business(mm2.j2.class)).P6();
                if ((P62 != null ? P62.f329552a : null) == mm2.e2.f328998e) {
                    pm0.v.V(500L, new df2.bf(this));
                }
            }
            mm2.y1 P63 = ((mm2.j2) business(mm2.j2.class)).P6();
            if (P63 != null) {
                P63.f329553b = ((mm2.j2) business(mm2.j2.class)).R6() && ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.j2) business(mm2.j2.class)).f329169q).getValue()).booleanValue();
            }
            mm2.y1 P64 = ((mm2.j2) business(mm2.j2.class)).P6();
            if (P64 != null) {
                c7(this, P64, false, 2, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        com.tencent.mars.xlog.Log.i(this.f231161m, "activate");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        b7("onLiveStart");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        if (((mm2.c1) business(mm2.c1.class)).a8()) {
            b7("onViewMount");
        }
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.pf(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.ff(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.hf(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.nf(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.jf(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.lf(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.df(this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
    }
}
