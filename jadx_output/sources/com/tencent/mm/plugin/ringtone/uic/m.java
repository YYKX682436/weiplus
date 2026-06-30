package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.m implements yz5.p {
    public m(java.lang.Object obj) {
        super(2, obj, com.tencent.mm.plugin.ringtone.uic.v.class, "onClickListen", "onClickListen(ILcom/tencent/mm/plugin/ringtone/data/RingtoneConvertData;)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.protobuf.g gVar;
        bw5.lp0 lp0Var;
        int intValue = ((java.lang.Number) obj).intValue();
        ox3.g p17 = (ox3.g) obj2;
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mm.plugin.ringtone.uic.v vVar = (com.tencent.mm.plugin.ringtone.uic.v) this.receiver;
        vVar.getClass();
        t45.o0 o0Var = p17.f349749d.f415622n;
        if (o0Var != null && (gVar = o0Var.f415625d) != null) {
            bw5.lb0 parseFrom = new bw5.lb0().parseFrom(gVar.f192156a);
            kotlin.jvm.internal.o.d(parseFrom);
            java.lang.String listenId = parseFrom.getListenId();
            if (listenId == null || listenId.length() == 0) {
                lp0Var = null;
            } else {
                bw5.v70 v70Var = new bw5.v70();
                v70Var.t(true);
                v70Var.y(parseFrom.f29714e);
                v70Var.u(parseFrom.getListenId());
                boolean[] zArr = parseFrom.f29724r;
                v70Var.x(zArr[3] ? parseFrom.f29715f : "");
                v70Var.r(parseFrom.f29718i);
                v70Var.p(zArr[4] ? parseFrom.f29716g : "");
                v70Var.q(parseFrom.b());
                java.lang.String c17 = parseFrom.c();
                if (!(c17 == null || c17.length() == 0)) {
                    java.lang.String d17 = parseFrom.d();
                    if (!(d17 == null || d17.length() == 0)) {
                        bw5.e70 e70Var = new bw5.e70();
                        e70Var.e(parseFrom.c());
                        e70Var.d(parseFrom.d());
                        v70Var.s(e70Var);
                    }
                }
                lp0Var = new bw5.lp0();
                lp0Var.j(v70Var);
                lp0Var.g(java.util.UUID.randomUUID().toString());
            }
            bw5.lp0 lp0Var2 = lp0Var;
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.app.Activity context = vVar.getContext();
            bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
            qk.f9.b(aj6, context, true, lp0Var2, new il4.e(null, 0, com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554419, null), null, null, null, null, 240, null);
            androidx.appcompat.app.AppCompatActivity activity = vVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ed0.z0.i1((ed0.z0) a17, 12L, intValue, p17, 0L, 8, null);
        }
        return jz5.f0.f302826a;
    }
}
