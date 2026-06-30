package dy4;

/* loaded from: classes15.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f244736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f244737f;

    public y0(dy4.f1 f1Var, int i17, int i18) {
        this.f244735d = f1Var;
        this.f244736e = i17;
        this.f244737f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.w wVar;
        dy4.f1 f1Var = this.f244735d;
        int i17 = this.f244736e;
        int i18 = this.f244737f;
        if (!f1Var.I) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onMediaPlayerVideoSizeChanged, mp released");
            return;
        }
        ye1.e eVar = f1Var.f244627n;
        int duration = eVar != null ? eVar.getDuration() : 0;
        com.tencent.mars.xlog.Log.i(f1Var.x(), "onVideoSizeChanged, width:%d, height:%d, duration:%d, mVideoHasPrepared:%b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(duration), java.lang.Boolean.valueOf(f1Var.f244635u));
        if (f1Var.f244635u && f1Var.f244627n != null && ((i17 != f1Var.f244637w || i18 != f1Var.f244638x || duration != f1Var.f244640y) && f1Var.J() && (wVar = f1Var.U) != null)) {
            java.lang.String str = wVar.f244715a;
            com.tencent.mars.xlog.Log.i(str, "onVideoSizeChange width=" + i17 + ", height=" + i18 + ", duration=" + duration);
            try {
                org.json.JSONObject c17 = wVar.c();
                c17.put("width", i17);
                c17.put("height", i18);
                double d17 = (duration * 1.0d) / 1000;
                wVar.f244718d = d17;
                c17.put("duration", d17);
                wVar.a("onVideoSizeChange", c17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e(str, "onVideoSizeChange fail", e17);
            }
        }
        f1Var.f244637w = i17;
        f1Var.f244638x = i18;
        f1Var.f244640y = duration;
        f1Var.s();
    }
}
