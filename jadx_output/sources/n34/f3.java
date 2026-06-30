package n34;

/* loaded from: classes10.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334596d;

    public f3(java.lang.String str) {
        this.f334596d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostDataOfPhotos$task$1");
        n34.h3.a(n34.h3.f334610d, this.f334596d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostDataOfPhotos$task$1");
    }
}
