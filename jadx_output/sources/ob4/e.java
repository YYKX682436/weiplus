package ob4;

/* loaded from: classes4.dex */
public abstract class e extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f344098m = "MicroMsg.SnsCgi";

    public final java.lang.Object s(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("await", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi");
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        pq5.g l17 = l();
        l17.K(new ob4.d(this, rVar));
        rVar.m(new ob4.c(l17));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("await", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi");
        return j17;
    }
}
