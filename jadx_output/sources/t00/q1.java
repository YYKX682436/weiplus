package t00;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt00/q1;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCUserTicket;", "Lcom/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCUserInfo;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes9.dex */
public final class q1 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserTicket userTicket = (com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserTicket) obj;
        kotlin.jvm.internal.o.g(userTicket, "userTicket");
        java.lang.String str = userTicket.f65637d;
        int i17 = 0;
        if (!com.tencent.mm.storage.z3.O4(str) && !com.tencent.mm.storage.z3.N4(str)) {
            if (rVar != null) {
                int i18 = h20.e.f278265a;
                rVar.a(new com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserInfo("", "", 0, 1, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.nek)));
                return;
            }
            return;
        }
        ((j00.u1) ((c00.i3) i95.n0.c(c00.i3.class))).Ri(str, userTicket.f65638e);
        i95.m c17 = i95.n0.c(c00.f4.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c00.e4 wi6 = ((b00.t2) ((c00.f4) c17)).wi(str, null);
        if (com.tencent.mm.storage.z3.N4(str)) {
            int i19 = h20.e.f278265a;
            i17 = 1;
        } else {
            int i27 = h20.e.f278265a;
        }
        int wi7 = com.tencent.mm.storage.z3.N4(str) ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) : 1;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserInfo(wi6.f36967a, wi6.f36968b, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(wi7), ""));
        }
    }
}
