package tk4;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic f419993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.d2 f419994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f419995f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic, bw5.d2 d2Var, tk4.c0 c0Var) {
        super(0);
        this.f419993d = tingAudioPushConfigLogic;
        this.f419994e = d2Var;
        this.f419995f = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic.N;
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic = this.f419993d;
        tingAudioPushConfigLogic.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickView, contentType = ");
        bw5.d2 d2Var = this.f419994e;
        sb6.append(d2Var.f26285i);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = tingAudioPushConfigLogic.f174639a;
        com.tencent.mars.xlog.Log.i(str, sb7);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map j17 = tingAudioPushConfigLogic.j(d2Var);
        ((java.util.HashMap) j17).put("view_id", "tyt_push_bubble");
        ((cy1.a) rVar).yj("view_clk", null, j17, 5, false);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.audiopush.RepairerConfigTingAudioPushPlayDirectly()) == 1;
        int i18 = d2Var.f26285i;
        if (i18 == 1) {
            com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct tingAudioPushLogStruct = new com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct();
            tingAudioPushLogStruct.f61302d = tingAudioPushConfigLogic.f174653o;
            tingAudioPushLogStruct.k();
            if (z17) {
                tingAudioPushConfigLogic.g(d2Var, false);
            }
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ting_audio_push_view_jump_square, 0) == 1;
            com.tencent.mars.xlog.Log.i(str, "onClickView, squareEnter = " + z18);
            boolean[] zArr = d2Var.f26287n;
            if (z18) {
                bw5.xa0 xa0Var = new bw5.xa0();
                xa0Var.f35038u = d2Var.v();
                boolean[] zArr2 = xa0Var.S;
                zArr2[15] = true;
                xa0Var.f35028h = zArr[3] ? d2Var.f26282f : com.tencent.mm.protobuf.g.f192155b;
                zArr2[5] = true;
                bw5.pp0 pp0Var = new bw5.pp0();
                pp0Var.f31785h = xa0Var;
                boolean[] zArr3 = pp0Var.E;
                zArr3[5] = true;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onEnterSquareWithRecommendInfo, listSourceContext ");
                sb8.append((zArr3[5] ? pp0Var.f31785h : new bw5.xa0()).b());
                sb8.append(", ");
                bw5.xa0 xa0Var2 = zArr3[5] ? pp0Var.f31785h : new bw5.xa0();
                bw5.n3 n3Var = xa0Var2.S[19] ? xa0Var2.f35042y : new bw5.n3();
                sb8.append(n3Var.f30473g[2] ? n3Var.f30471e : "");
                com.tencent.mars.xlog.Log.i(str, sb8.toString());
                ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).B(bw5.ar0.TingScene_PushBubbleScene, false, pp0Var, "3008");
            } else {
                com.tencent.mars.xlog.Log.i(str, "onEnterSquare, id:" + d2Var.b().c());
                bw5.ar0 ar0Var = bw5.ar0.TingScene_PushBubbleScene;
                bw5.xa0 xa0Var3 = new bw5.xa0();
                xa0Var3.f35038u = d2Var.v();
                boolean[] zArr4 = xa0Var3.S;
                zArr4[15] = true;
                xa0Var3.f35028h = zArr[3] ? d2Var.f26282f : com.tencent.mm.protobuf.g.f192155b;
                zArr4[5] = true;
                bw5.pp0 pp0Var2 = new bw5.pp0();
                pp0Var2.f31785h = xa0Var3;
                pp0Var2.E[5] = true;
                il4.e eVar = new il4.e(null, 0, 2101, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
                eVar.f292116m = java.lang.Boolean.TRUE;
                eVar.f292120q = true;
                qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
                android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
                kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(...)");
                bw5.o50 b17 = d2Var.b();
                kotlin.jvm.internal.o.f(b17, "getCategoryItem(...)");
                qk.f9.d(aj6, applicationContext, b17, null, qk.ja.f364191d, ar0Var, eVar, null, null, "3008", pp0Var2, false, com.tencent.mm.plugin.appbrand.jsapi.pay.p0.CTRL_INDEX, null);
            }
        } else if (i18 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct tingAudioPushLogStruct2 = new com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct();
            tingAudioPushLogStruct2.f61302d = tingAudioPushConfigLogic.f174654p;
            tingAudioPushLogStruct2.k();
            if (z17) {
                tingAudioPushConfigLogic.h(d2Var, false);
            }
            com.tencent.mars.xlog.Log.i(str, "onEnterSquare, id:" + d2Var.c().getListenId());
            bw5.lp0 lp0Var = new bw5.lp0();
            lp0Var.j(d2Var.c());
            lp0Var.g(d2Var.c().getListenId());
            il4.e eVar2 = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
            bw5.ar0 ar0Var2 = bw5.ar0.TingScene_UnDefined;
            eVar2.f292106c = 2101;
            qk.f9 aj7 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            java.lang.Object value = ((jz5.n) tingAudioPushConfigLogic.f174658t).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            rk4.k8 k8Var = (rk4.k8) aj7;
            kotlinx.coroutines.l.d(k8Var, null, null, new rk4.p7(k8Var, (android.content.Context) value, false, lp0Var, eVar2, null, null), 3, null);
        }
        this.f419995f.a(true);
        return jz5.f0.f302826a;
    }
}
