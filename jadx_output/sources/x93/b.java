package x93;

/* loaded from: classes8.dex */
public final class b implements qj5.q {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f452722a;

    public b(yz5.a pageIdProvider) {
        kotlin.jvm.internal.o.g(pageIdProvider, "pageIdProvider");
        this.f452722a = pageIdProvider;
    }

    @Override // qj5.q
    public java.lang.String a() {
        return null;
    }

    @Override // qj5.q
    public org.json.JSONObject f() {
        long longValue = ((java.lang.Number) this.f452722a.invoke()).longValue();
        if (longValue < 0) {
            com.tencent.mars.xlog.Log.w("LiteAppScreenshotShareProvider", "getGameCenterExtraData: invalid pageId=" + longValue);
            return null;
        }
        com.tencent.mm.plugin.lite.api.q a17 = x93.c.a(longValue);
        org.json.JSONObject jSONObject = a17 != null ? a17.f143447d : null;
        com.tencent.mars.xlog.Log.i("LiteAppScreenshotShareProvider", "getGameCenterExtraData: pageId=" + longValue + ", extraData=" + jSONObject);
        return jSONObject;
    }

    @Override // qj5.q
    public qj5.p h() {
        long longValue = ((java.lang.Number) this.f452722a.invoke()).longValue();
        if (longValue < 0) {
            com.tencent.mars.xlog.Log.w("LiteAppScreenshotShareProvider", "bizConfig: invalid pageId=" + longValue);
            return new qj5.p();
        }
        com.tencent.mm.plugin.lite.api.q a17 = x93.c.a(longValue);
        qj5.p pVar = new qj5.p();
        pVar.f363995a = a17 != null ? a17.f143444a : false;
        pVar.f363996b = a17 != null ? a17.f143445b : false;
        pVar.f363997c = a17 != null ? a17.f143446c : false;
        return pVar;
    }

    @Override // qj5.q
    public int i() {
        return 8;
    }
}
