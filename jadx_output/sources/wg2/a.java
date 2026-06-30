package wg2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final wg2.a f445720a = new wg2.a();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.handoff.model.HandOff f445721b;

    public final boolean a() {
        com.tencent.mm.plugin.appbrand.service.b6 b6Var = (com.tencent.mm.plugin.appbrand.service.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.b6.class);
        if (b6Var == null) {
            return false;
        }
        com.tencent.mm.modelsimple.t tVar = (com.tencent.mm.modelsimple.t) b6Var;
        if (!c01.d9.b().F()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHandOffUtil", "not wxOnline");
            return false;
        }
        if (tVar.Bi()) {
            return true;
        }
        java.util.Iterator it = ((java.util.ArrayList) tVar.Ai()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.service.v6 v6Var = (com.tencent.mm.plugin.appbrand.service.v6) it.next();
            int i17 = v6Var.f88808c;
            if (i17 == 15 || i17 == 14) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHandOffUtil", "online type:" + v6Var.f88806a + " version:" + v6Var.f88807b);
                if (ug3.i.f427543q >= (v6Var.f88808c == 15 ? 1661142272 : 318898176)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        java.lang.String key = handOff != null ? handOff.getKey() : null;
        com.tencent.mm.plugin.handoff.model.HandOff handOff2 = f445721b;
        if (kotlin.jvm.internal.o.b(key, handOff2 != null ? handOff2.getKey() : null)) {
            return;
        }
        com.tencent.mm.plugin.handoff.model.HandOff handOff3 = f445721b;
        if (handOff3 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHandOffUtil", "delete previous handoff: " + handOff3);
            ((d73.i) i95.n0.c(d73.i.class)).A8(handOff3.getKey());
        }
        f445721b = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHandOffUtil", "save currentHandOffKey " + ((java.lang.String) null));
        com.tencent.mm.sdk.platformtools.o4.L().remove("FinderLiveHandOffUtil_current");
    }

    public final com.tencent.mm.plugin.handoff.model.HandOff c(gk2.e eVar) {
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveHandOffUtil", "liveContext is null");
            return null;
        }
        ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveHandOffUtil", "contact is null username: " + ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
            return null;
        }
        mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
        i95.m c17 = i95.n0.c(b70.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String w07 = b17.w0();
        java.lang.String avatarUrl = b17.getAvatarUrl();
        java.lang.String objectId = java.lang.String.valueOf(e1Var.f328983m);
        java.lang.String nonceId = e1Var.f328992v;
        java.lang.String key = java.lang.String.valueOf(e1Var.f328988r.getLong(0));
        kotlin.jvm.internal.o.g(objectId, "objectId");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(key, "liveId");
        kotlin.jvm.internal.o.g(key, "key");
        return new com.tencent.mm.plugin.handoff.model.HandOffFinderLive(w07, avatarUrl, objectId, nonceId, key, 1, "", "", key);
    }
}
