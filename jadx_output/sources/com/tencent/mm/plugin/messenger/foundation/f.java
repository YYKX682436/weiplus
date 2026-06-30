package com.tencent.mm.plugin.messenger.foundation;

/* loaded from: classes11.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg3.e f148641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f148642e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vg3.e eVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f148641d = eVar;
        this.f148642e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.messenger.foundation.f(this.f148641d, this.f148642e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.messenger.foundation.f fVar = (com.tencent.mm.plugin.messenger.foundation.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.autogen.mmdata.rpt.relationUpdateActionReportStruct relationupdateactionreportstruct = new com.tencent.mm.autogen.mmdata.rpt.relationUpdateActionReportStruct();
        vg3.e eVar = this.f148641d;
        relationupdateactionreportstruct.f63144d = relationupdateactionreportstruct.b("requestPage", java.lang.String.valueOf(eVar.f436688a.f436686d), true);
        java.util.List list = eVar.f436692e;
        relationupdateactionreportstruct.f63145e = relationupdateactionreportstruct.b("toUsername", list != null ? kz5.n0.g0(list, "#", null, null, 0, null, null, 62, null) : null, true);
        relationupdateactionreportstruct.f63147g = eVar.f436689b.f436648d;
        relationupdateactionreportstruct.f63148h = eVar.f436690c.f436672d;
        relationupdateactionreportstruct.f63149i = relationupdateactionreportstruct.b("returnCode", java.lang.String.valueOf(eVar.f436691d), true);
        relationupdateactionreportstruct.f63150j = 1L;
        relationupdateactionreportstruct.f63151k = this.f148642e;
        if (com.tencent.mars.xlog.Log.isDebug()) {
            relationupdateactionreportstruct.o();
        }
        relationupdateactionreportstruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactOpReportService", "report page=" + relationupdateactionreportstruct.f63144d + ", toUsername=" + relationupdateactionreportstruct.f63145e + ", eventType=" + relationupdateactionreportstruct.f63147g + ", requestContent=" + relationupdateactionreportstruct.f63148h + ", returnCode=" + relationupdateactionreportstruct.f63149i + ", costTime=" + relationupdateactionreportstruct.f63151k);
        return jz5.f0.f302826a;
    }
}
