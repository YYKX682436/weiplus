package zn0;

/* loaded from: classes3.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView f474324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zn0.a0 f474325f;

    public b0(zn0.a0 a0Var, java.lang.String str, android.view.TextureView textureView) {
        this.f474325f = a0Var;
        this.f474323d = str;
        this.f474324e = textureView;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        android.view.TextureView textureView = this.f474324e;
        java.util.HashMap hashMap = this.f474325f.f474307k;
        java.lang.String str2 = this.f474323d;
        hashMap.remove(str2);
        try {
            str = new org.json.JSONObject().put("timeout", true).put("userId", str2).put("textureView", textureView).put("visibility", textureView.getVisibility()).put("width", textureView.getWidth()).put("height", textureView.getHeight()).put("isAttachedToWindow", textureView.isAttachedToWindow()).put("isAvailable", textureView.isAvailable()).toString().replace(",", ";");
        } catch (java.lang.Exception unused) {
            str = "{\"timeout\":true}";
        }
        com.tencent.mars.xlog.Log.e("TRTCRemoteUserManager", str);
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct finderLiveErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct();
        finderLiveErrorReportStruct.f57145e = 400;
        finderLiveErrorReportStruct.p(str);
        finderLiveErrorReportStruct.k();
    }
}
