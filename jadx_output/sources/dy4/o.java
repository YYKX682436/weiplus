package dy4;

/* loaded from: classes8.dex */
public final class o extends cy4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.w f244692a;

    public o(dy4.w wVar) {
        this.f244692a = wVar;
    }

    @Override // cy4.f
    public void a() {
        dy4.w wVar = this.f244692a;
        try {
            wVar.a("onEnterFullscreen", wVar.c());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e(wVar.f244715a, "OnXWebVideoError fail", e17);
        }
    }

    @Override // cy4.f
    public void b() {
        dy4.w wVar = this.f244692a;
        try {
            wVar.a("onExitFullscreen", wVar.c());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e(wVar.f244715a, "OnXWebVideoError fail", e17);
        }
    }
}
