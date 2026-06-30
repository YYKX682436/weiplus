package l44;

/* loaded from: classes4.dex */
public class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f316382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f316383f;

    public u4(java.lang.String str, long j17, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        this.f316381d = str;
        this.f316382e = j17;
        this.f316383f = finderObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f316382e;
        java.lang.String str = this.f316381d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$2");
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("ad_finder_feeds_preload_id_app_related", 0).edit().putLong(str, j17).commit();
            com.tencent.mars.xlog.Log.i("FinderAdPreloadHelper", "reqFinderFeedsObjectIds received, encryptedObjectId is " + str + ", objectId is " + j17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(this.f316383f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            zy2.u9 u9Var = l44.a5.f316032c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            ((com.tencent.mm.plugin.finder.service.b2) u9Var).a(42, arrayList, 0);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderAdPreloadHelper", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$2");
    }
}
