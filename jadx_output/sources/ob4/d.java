package ob4;

/* loaded from: classes4.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ob4.e f344096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f344097b;

    public d(ob4.e eVar, kotlinx.coroutines.q qVar) {
        this.f344096a = eVar;
        this.f344097b = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$cgi$1");
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$cgi$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi");
        ob4.e eVar = this.f344096a;
        java.lang.String str = eVar.f344098m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi");
        com.tencent.mars.xlog.Log.i(str, "scene:" + eVar.f70646f.f70712c + " errType:" + fVar.f70615a + " errCode:" + fVar.f70616b);
        int i17 = fVar.f70615a;
        kotlinx.coroutines.q qVar = this.f344097b;
        if (i17 == 0 && fVar.f70616b == 0 && fVar.f70618d != null) {
            fVar.f70620f.dead();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(fVar.f70618d));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$cgi$1");
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new ob4.b(fVar.f70615a, fVar.f70616b, fVar.f70617c))));
            fVar.f70620f.dead();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$cgi$1");
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$cgi$1");
        return f0Var;
    }
}
