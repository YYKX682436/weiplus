package tk4;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic f419990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.d2 f419991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f419992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic, bw5.d2 d2Var, tk4.c0 c0Var) {
        super(0);
        this.f419990d = tingAudioPushConfigLogic;
        this.f419991e = d2Var;
        this.f419992f = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic.N;
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic = this.f419990d;
        tingAudioPushConfigLogic.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickPlay, contentType = ");
        bw5.d2 d2Var = this.f419991e;
        sb6.append(d2Var.f26285i);
        com.tencent.mars.xlog.Log.i(tingAudioPushConfigLogic.f174639a, sb6.toString());
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map j17 = tingAudioPushConfigLogic.j(d2Var);
        ((java.util.HashMap) j17).put("view_id", "tyt_push_bubble_play");
        ((cy1.a) rVar).yj("view_clk", null, j17, 5, false);
        int i18 = d2Var.f26285i;
        if (i18 == 1) {
            com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct tingAudioPushLogStruct = new com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct();
            tingAudioPushLogStruct.f61302d = tingAudioPushConfigLogic.f174651m;
            tingAudioPushLogStruct.k();
            tingAudioPushConfigLogic.g(d2Var, true);
        } else if (i18 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct tingAudioPushLogStruct2 = new com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct();
            tingAudioPushLogStruct2.f61302d = tingAudioPushConfigLogic.f174652n;
            tingAudioPushLogStruct2.k();
            tingAudioPushConfigLogic.h(d2Var, true);
        }
        this.f419992f.a(true);
        return jz5.f0.f302826a;
    }
}
