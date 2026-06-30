package t85;

/* loaded from: classes5.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String packDir) {
        kotlin.jvm.internal.o.g(packDir, "packDir");
        if (!com.tencent.mm.vfs.w6.j(packDir.concat("config.json"))) {
            return false;
        }
        int optInt = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(packDir.concat("config.json"))).optInt("cache_version", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.StickerPack", "checkLocalCacheVersion: " + optInt + ", 2");
        if (optInt >= 2) {
            return true;
        }
        com.tencent.mm.vfs.w6.f(packDir);
        return false;
    }
}
