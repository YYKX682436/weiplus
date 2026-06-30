package s34;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s34.k f402650e;

    public h(s34.k kVar, java.lang.String str) {
        this.f402650e = kVar;
        this.f402649d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$1");
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f402649d, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        this.f402650e.f402686g = J2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$1");
    }
}
