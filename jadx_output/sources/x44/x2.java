package x44;

/* loaded from: classes4.dex */
public final class x2 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f451928a;

    public x2(yz5.p pVar) {
        this.f451928a = pVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$getSubBusinessInfo$1");
        yz5.p pVar = this.f451928a;
        if (i17 == 0 && i18 == 0) {
            try {
                fVar = oVar.f70711b.f70700a;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.ServiceChat", "there is a exception in " + e17.getMessage());
                pVar.invoke(1, "");
            }
            if (fVar != null) {
                if (fVar instanceof r45.qo3) {
                    kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetSubBusinessInfoResponse");
                    java.lang.String subBusinessUsername = ((r45.qo3) fVar).f384147d;
                    kotlin.jvm.internal.o.f(subBusinessUsername, "subBusinessUsername");
                    pVar.invoke(0, subBusinessUsername);
                } else {
                    com.tencent.mars.xlog.Log.e("SnsAdJs.ServiceChat", "the type of response is not GetSubBusinessInfoResponse");
                    pVar.invoke(1, "");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$getSubBusinessInfo$1");
            }
        }
        com.tencent.mars.xlog.Log.e("SnsAdJs.ServiceChat", "the getSubBusinessInfo error the error code is " + i18);
        pVar.invoke(1, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$getSubBusinessInfo$1");
    }
}
