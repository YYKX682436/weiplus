package u34;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u34.g f424420d;

    public e(u34.g gVar) {
        this.f424420d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        this.f424420d.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene$1");
    }
}
