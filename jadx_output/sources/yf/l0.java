package yf;

/* loaded from: classes7.dex */
public class l0 implements zf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f461409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461410b;

    public l0(yf.i0 i0Var, org.json.JSONObject jSONObject) {
        this.f461410b = i0Var;
        this.f461409a = jSONObject;
    }

    @Override // zf.b
    public void b(final java.lang.String str, java.lang.String str2) {
        final org.json.JSONObject jSONObject = this.f461409a;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
        yf.i0 i0Var = this.f461410b;
        if (!K0) {
            com.tencent.mars.xlog.Log.i(i0Var.x(), "operatePlayBgm, local file path:%s", str2);
            try {
                jSONObject.put("BGMFilePath", str2);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.LivePusherPluginHandler", "operatePlayBgm, set param fail", e17);
            }
            i0Var.G(new java.lang.Runnable() { // from class: yf.l0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yf.i0 i0Var2 = yf.l0.this.f461410b;
                    yf.o oVar = i0Var2.f461362i;
                    if (oVar == null || oVar.h("playBGM", jSONObject).f405688a == 0) {
                        return;
                    }
                    java.lang.String str3 = str;
                    com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.LivePusherPluginHandler", "operatePlayBgm, play bgm fail, url:%s", str3);
                    if (i0Var2.f461364n != null) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("url", str3);
                        ((bg1.q) i0Var2.f461364n).b(i0Var2.f252497d, jc1.g.f298941m, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, "play bgm fail", hashMap);
                    }
                }
            });
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.LivePusherPluginHandler", "operatePlayBgm, download file fail, url:%s", str);
        if (i0Var.f461364n != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", str);
            ((bg1.q) i0Var.f461364n).b(i0Var.f252497d, jc1.g.f298941m, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, "download file fail", hashMap);
        }
    }
}
