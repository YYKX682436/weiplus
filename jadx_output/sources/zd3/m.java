package zd3;

/* loaded from: classes7.dex */
public final class m extends zd3.a {
    @Override // lc3.c0
    public java.lang.String f() {
        return "reportEventForTPPlayer";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        int optInt = data.optInt(dm.i4.COL_ID);
        java.lang.String optString = data.optString("type");
        java.lang.String optString2 = data.optString("reportInfo");
        com.tencent.mars.xlog.Log.i("MB_External_surface", "reportEventForTPPlayer invoke data: " + data);
        if (kotlin.jvm.internal.o.b(optString, "video")) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData(ve3.u.f436110i, optInt, optString, optString2, null, 16, null), xd3.e.class, new zd3.l(this));
            return;
        }
        java.lang.String str = "type error: " + optString + ", only support video";
        com.tencent.mars.xlog.Log.e("MB_External_surface", "reportEventForTPPlayer " + str);
        s().invoke(j(lc3.x.f317937d, str));
    }
}
