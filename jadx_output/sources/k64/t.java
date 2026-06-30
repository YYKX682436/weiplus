package k64;

/* loaded from: classes4.dex */
public abstract class t {
    public static final com.tencent.mm.protobuf.f a(com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResponseBuffer", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEndKt");
        kotlin.jvm.internal.o.g(m1Var, "<this>");
        com.tencent.mm.network.v0 reqResp = m1Var.getReqResp();
        if (reqResp == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResponseBuffer", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEndKt");
            return null;
        }
        if (!(reqResp instanceof com.tencent.mm.modelbase.o)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResponseBuffer", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEndKt");
            return null;
        }
        com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) reqResp).f70711b.f70700a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResponseBuffer", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEndKt");
        return fVar;
    }
}
