package dz4;

/* loaded from: classes12.dex */
public final class d0 implements dz4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.favorites.p f245192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f245194c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.k4 f245195d;

    public d0(com.tencent.wechat.aff.favorites.p pVar, dz4.j0 j0Var, long j17, dz4.k4 k4Var) {
        this.f245192a = pVar;
        this.f245193b = j0Var;
        this.f245194c = j17;
        this.f245195d = k4Var;
    }

    public void a(double d17, java.lang.String playId) {
        kotlin.jvm.internal.o.g(playId, "playId");
        com.tencent.wechat.aff.favorites.p pVar = this.f245192a;
        if (!kotlin.jvm.internal.o.b(playId, pVar.b())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterWeNoteNativeHelperImpl", "onPlayCompleted: skip, " + playId + ", " + pVar.b());
            return;
        }
        dz4.j0.a(this.f245193b, this.f245194c, playId, 1, pVar.f216852g);
        if (d17 >= 1.0d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayCompleted: destroying completed voice, playId=");
            sb6.append(playId);
            sb6.append(", path=");
            boolean[] zArr = pVar.f216854i;
            sb6.append(zArr[2] ? pVar.f216850e : "");
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", sb6.toString());
            java.lang.String str = zArr[2] ? pVar.f216850e : "";
            kotlin.jvm.internal.o.f(str, "getPath(...)");
            dz4.k4 k4Var = this.f245195d;
            k4Var.getClass();
            java.lang.String str2 = "destroy: path=" + str + ", currentPlayingPath=" + k4Var.f245329d;
            java.lang.String str3 = k4Var.f245326a;
            com.tencent.mars.xlog.Log.i(str3, str2);
            java.util.Map map = k4Var.f245327b;
            fz4.m mVar = (fz4.m) ((java.util.LinkedHashMap) map).get(str);
            if (mVar != null) {
                mVar.b();
            }
            map.remove(str);
            java.util.Map map2 = k4Var.f245328c;
            dz4.l lVar = (dz4.l) ((java.util.LinkedHashMap) map2).get(str);
            if (lVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterNoteVoiceProgressMonitor", "release: ");
                lVar.b();
                lVar.f245333d = null;
                lVar.f245330a.removeCallbacksAndMessages(null);
            }
            map2.remove(str);
            if (kotlin.jvm.internal.o.b(k4Var.f245329d, str)) {
                com.tencent.mars.xlog.Log.i(str3, "destroy: clearing currentPlayingPath from " + k4Var.f245329d + " to null");
                k4Var.f245329d = null;
                return;
            }
            if (k4Var.f245329d != null) {
                com.tencent.mars.xlog.Log.w(str3, "destroy: currentPlayingPath(" + k4Var.f245329d + ") != path(" + str + "), but still clearing due to completion");
                k4Var.f245329d = null;
            }
        }
    }

    public void b(java.lang.String playId) {
        kotlin.jvm.internal.o.g(playId, "playId");
        com.tencent.wechat.aff.favorites.p pVar = this.f245192a;
        if (kotlin.jvm.internal.o.b(playId, pVar.b())) {
            dz4.j0.a(this.f245193b, this.f245194c, playId, 0, pVar.f216853h * pVar.f216852g);
        }
    }
}
