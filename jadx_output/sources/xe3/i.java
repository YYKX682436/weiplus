package xe3;

/* loaded from: classes15.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f453949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve3.o f453950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f453951f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(org.json.JSONObject jSONObject, ve3.o oVar, android.view.Surface surface) {
        super(1);
        this.f453949d = jSONObject;
        this.f453950e = oVar;
        this.f453951f = surface;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xe3.f it = (xe3.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        org.json.JSONObject jSONObject = this.f453949d;
        boolean optBoolean = jSONObject.optBoolean("autoPlay", false);
        boolean optBoolean2 = jSONObject.optBoolean("loop");
        ve3.o oVar = this.f453950e;
        it.d(optBoolean2, oVar);
        android.view.Surface surface = this.f453951f;
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "register surface " + surface);
        it.f453944d.setSurface(surface);
        if (optBoolean) {
            com.tencent.mars.xlog.Log.i("MB_External_surface_video_service", "autoPlay trigger startPlay");
            it.e(oVar);
        }
        return jz5.f0.f302826a;
    }
}
