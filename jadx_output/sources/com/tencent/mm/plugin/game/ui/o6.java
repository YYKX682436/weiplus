package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public final class o6 implements qj5.q {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f141700a;

    public o6(yz5.a pageIdProvider) {
        kotlin.jvm.internal.o.g(pageIdProvider, "pageIdProvider");
        this.f141700a = pageIdProvider;
    }

    @Override // qj5.q
    public java.lang.String a() {
        return null;
    }

    @Override // qj5.q
    public org.json.JSONObject f() {
        long longValue = ((java.lang.Number) this.f141700a.invoke()).longValue();
        if (longValue < 0) {
            com.tencent.mars.xlog.Log.w("GameTabScreenshotShareProvider", "getGameCenterExtraData: invalid pageId=" + longValue);
            return null;
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        com.tencent.mm.plugin.lite.api.q a17 = x93.c.a(longValue);
        if (a17 != null) {
            return a17.f143447d;
        }
        return null;
    }

    @Override // qj5.q
    public qj5.p h() {
        long longValue = ((java.lang.Number) this.f141700a.invoke()).longValue();
        if (longValue < 0) {
            com.tencent.mars.xlog.Log.w("GameTabScreenshotShareProvider", "bizConfig: invalid pageId=" + longValue);
            return new qj5.p();
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        com.tencent.mm.plugin.lite.api.q a17 = x93.c.a(longValue);
        if (a17 == null) {
            return new qj5.p();
        }
        qj5.p pVar = new qj5.p();
        pVar.f363995a = a17.f143444a;
        pVar.f363996b = a17.f143445b;
        pVar.f363997c = a17.f143446c;
        return pVar;
    }

    @Override // qj5.q
    public int i() {
        return 8;
    }
}
