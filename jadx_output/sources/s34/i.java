package s34;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s34.j f402658e;

    public i(s34.j jVar, java.lang.String str) {
        this.f402658e = jVar;
        this.f402657d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2$1");
        s34.k kVar = this.f402658e.f402672a;
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f402657d, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        kVar.f402686g = J2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2$1");
    }
}
