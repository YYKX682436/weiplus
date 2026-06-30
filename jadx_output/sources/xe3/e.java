package xe3;

/* loaded from: classes15.dex */
public final class e implements rh3.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe3.f f453939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve3.o f453940e;

    public e(xe3.f fVar, ve3.o oVar) {
        this.f453939d = fVar;
        this.f453940e = oVar;
    }

    @Override // rh3.k
    public void b(rh3.o mp6, rh3.s mediaInfo) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("step 5 getVideoHeight ");
        xe3.f fVar = this.f453939d;
        sb6.append(fVar.f453944d.getVideoHeight());
        sb6.append(" getvideoWidth ");
        rh3.r rVar = fVar.f453944d;
        sb6.append(rVar.getVideoWidth());
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", sb6.toString());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH, rVar.getVideoWidth());
        jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT, rVar.getVideoHeight());
        java.lang.String jSONObject2 = jSONObject.toString();
        com.tencent.mm.ipcinvoker.r rVar2 = ((xd3.c) this.f453940e).f453616a;
        if (rVar2 != null) {
            rVar2.a(new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData(0, "", jSONObject2));
        }
    }
}
