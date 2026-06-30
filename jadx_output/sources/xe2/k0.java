package xe2;

/* loaded from: classes3.dex */
public final class k0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453875c = "LiveGiftWallInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        java.util.Iterator it = msgList.iterator();
        while (it.hasNext()) {
            r45.ch1 ch1Var = (r45.ch1) it.next();
            com.tencent.mars.xlog.Log.i(this.f453875c, "msgType = " + ch1Var.getInteger(1));
            gk2.e eVar = this.f445267a;
            ((com.tencent.mm.plugin.finder.live.util.j1) ((mm2.c1) eVar.a(mm2.c1.class)).f328806g).b(new ug2.c(ch1Var));
            zl2.r4 r4Var = zl2.r4.f473950a;
            if (!r4Var.y1(eVar) && r4Var.g0() == 1 && ch1Var.getInteger(1) == 20090) {
                r45.xn1 xn1Var = (r45.xn1) ch1Var.getCustom(13);
                if (r4Var.c2((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername())) {
                    ae2.in inVar = ae2.in.f3688a;
                    if (((java.lang.Boolean) ae2.in.f3745f6.r()).booleanValue() || !gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GIFT_WALL_FIRST_TOP_BOOLEAN_SYNC, false)) {
                        if (!gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_VISITOR_HONOR_RANK_SWITCH_ENABLE_BOOLEAN_SYNC, false)) {
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GIFT_WALL_FIRST_TOP_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                            pm0.v.X(new xe2.j0(ch1Var));
                        }
                    }
                }
            }
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20090, 20091, 20092};
    }
}
