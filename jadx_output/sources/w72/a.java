package w72;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.DeleteFavoriteEvent deleteFavoriteEvent = (com.tencent.mm.autogen.events.DeleteFavoriteEvent) iEvent;
        am.w3 w3Var = deleteFavoriteEvent.f54084g;
        long j17 = w3Var.f8258a;
        int i17 = w3Var.f8259b;
        int i18 = w3Var.f8260c;
        java.lang.String str = w3Var.f8261d;
        o72.r2 r2Var = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.DelFavoriteItemListener", "do delete favitem, localId:%d sourceId:%s favId:%s delType:%s", java.lang.Long.valueOf(j17), null, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        am.x3 x3Var = deleteFavoriteEvent.f54085h;
        if (j17 != 0) {
            o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
            if (F == null) {
                F = new o72.r2();
                F.field_localId = j17;
            }
            F.field_transferCtx = str;
            x3Var.f8343a = o72.x1.k(F, null, i18);
            r2Var = F;
        } else {
            if (!android.text.TextUtils.isEmpty(null)) {
                ((a82.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).mj()).T6(null, str, null);
                throw null;
            }
            if (i17 != 0) {
                o72.r2 re6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(i17);
                if (re6 == null) {
                    re6 = new o72.r2();
                    re6.field_id = i17;
                }
                re6.field_transferCtx = str;
                x3Var.f8343a = o72.x1.k(re6, null, i18);
                r2Var = re6;
            }
        }
        if (r2Var != null) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Fav.DelFavoriteItemListener", "info is null, do nothing");
        return false;
    }
}
