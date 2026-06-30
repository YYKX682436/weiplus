package fa3;

/* loaded from: classes10.dex */
public class g implements bi3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.g f260757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fa3.b f260758b;

    public g(fa3.b bVar, com.tencent.mm.plugin.lite.api.g gVar) {
        this.f260758b = bVar;
        this.f260757a = gVar;
    }

    @Override // bi3.e
    public void a() {
        float[] fArr;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera InitDoneCallback");
        fa3.b bVar = this.f260758b;
        bVar.f260729o = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = bVar.f260724j;
        if (mMSightRecordView != null) {
            fArr = mMSightRecordView.getSupportZoomMultiple();
            bVar.h();
        } else {
            fArr = null;
        }
        if (fArr != null && fArr.length > 0) {
            bVar.f260730p = fArr[fArr.length - 1];
        }
        hashMap.put("maxZoom", java.lang.Float.valueOf(bVar.f260730p));
        this.f260757a.f(hashMap);
        if (bVar.f260740z) {
            bVar.j(bVar.A, bVar.B);
        }
    }
}
