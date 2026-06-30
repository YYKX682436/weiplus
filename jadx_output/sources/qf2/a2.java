package qf2;

/* loaded from: classes3.dex */
public final class a2 extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public static final void Z6(km2.q qVar, r45.zz1 zz1Var) {
        r45.xn1 xn1Var = qVar.f309187r;
        if (xn1Var != null) {
            r45.xn1 xn1Var2 = (r45.xn1) zz1Var.getCustom(0);
            xn1Var.set(15, java.lang.Long.valueOf(xn1Var2 != null ? xn1Var2.getLong(15) : 0L));
        }
        if (!kotlin.jvm.internal.o.b(zz1Var.getString(2), qVar.B)) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicCoverController", "livemsg: user " + qVar.f309173d + " id " + qVar.f309170a + " board key change from " + qVar.B + " to " + zz1Var.getString(2));
        }
        qVar.B = zz1Var.getString(2);
        qVar.C = zz1Var.getInteger(3);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0262, code lost:
    
        if (((r7 == null || (r7 = r7.f309187r) == null) ? null : (r45.vy1) r7.getCustom(18)) == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0288, code lost:
    
        if (((r7 == null || (r7 = r7.f309187r) == null) ? null : (r45.vy1) r7.getCustom(18)) == null) goto L149;
     */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLiveMsg(r45.r71 r17) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.a2.onLiveMsg(r45.r71):void");
    }
}
