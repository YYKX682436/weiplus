package dy4;

/* loaded from: classes15.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f244704e;

    public s0(dy4.f1 f1Var, int i17) {
        this.f244703d = f1Var;
        this.f244704e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.w wVar;
        dy4.f1 f1Var = this.f244703d;
        int i17 = this.f244704e;
        if (!f1Var.I) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onMediaPlayerBufferingUpdate, mp released");
            return;
        }
        if (i17 != f1Var.f244642z) {
            f1Var.f244642z = i17;
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onBufferingUpdate, percent:%s", java.lang.Integer.valueOf(i17));
        }
        if (f1Var.J() && f1Var.f244635u && (wVar = f1Var.U) != null) {
            try {
                org.json.JSONObject c17 = wVar.c();
                c17.put("buffered", i17);
                wVar.a("onVideoBufferUpdate", c17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e(wVar.f244715a, "OnXWebVideoProgress fail", e17);
            }
        }
    }
}
