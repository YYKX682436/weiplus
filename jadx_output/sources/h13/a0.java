package h13;

/* loaded from: classes8.dex */
public final class a0 implements xg3.e0 {
    public void b(int i17, r45.g25 g25Var, xg3.q0 option) {
        boolean z17;
        kotlin.jvm.internal.o.g(option, "option");
        h13.l0 l0Var = (h13.l0) i95.n0.c(h13.l0.class);
        l0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "[onOpLogResult] ret:%s %s", java.lang.Integer.valueOf(i17), option);
        if (option.b() != 213) {
            if (option.b() == 214) {
                com.tencent.mm.protobuf.f fVar = option.f454431j;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.DelForcePush");
                r45.fc0 fc0Var = (r45.fc0) fVar;
                int i18 = fc0Var.f374195e;
                if (i17 == 0) {
                    ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).wi(fc0Var.f374194d, i18, c01.id.c() / 1000);
                    j13.a aVar = j13.a.f297177d;
                    java.lang.String ForcePushId = fc0Var.f374194d;
                    kotlin.jvm.internal.o.f(ForcePushId, "ForcePushId");
                    z17 = aVar.d(ForcePushId);
                } else {
                    z17 = false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "[onOpLogResult] DelForcePush id:%s ret:%s isDeleteLocal:%s", fc0Var.f374194d, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar2 = option.f454431j;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AddForcePush");
        r45.i4 i4Var = (r45.i4) fVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "[onOpLogResult] AddForcePush ForcePushId:%s", i4Var.f376716d);
        if (i17 != 0 || l0Var.f278141d) {
            j13.a aVar2 = j13.a.f297177d;
            java.lang.String ForcePushId2 = i4Var.f376716d;
            kotlin.jvm.internal.o.f(ForcePushId2, "ForcePushId");
            aVar2.J0(ForcePushId2, -1);
            ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).wi(i4Var.f376716d, 6, c01.id.c() / 1000);
            return;
        }
        j13.a aVar3 = j13.a.f297177d;
        java.lang.String ForcePushId3 = i4Var.f376716d;
        kotlin.jvm.internal.o.f(ForcePushId3, "ForcePushId");
        aVar3.J0(ForcePushId3, 1);
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).wi(i4Var.f376716d, 1, c01.id.c() / 1000);
    }
}
