package k64;

/* loaded from: classes4.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e74.j f304604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f304605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304607g;

    public q(k64.r rVar, e74.j jVar, int i17, java.lang.String str, java.util.List list) {
        this.f304604d = jVar;
        this.f304605e = i17;
        this.f304606f = str;
        this.f304607g = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate$1");
        e74.j jVar = this.f304604d;
        if (jVar != null) {
            jVar.a(this.f304605e, this.f304606f, this.f304607g);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate$1");
    }
}
