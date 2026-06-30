package rj1;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo f396169d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo) {
        super(1);
        this.f396169d = tipsMsgInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.processes.s it = (com.tencent.luggage.sdk.processes.s) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo = this.f396169d;
        java.lang.String field_appId = tipsMsgInfo.field_appId;
        kotlin.jvm.internal.o.f(field_appId, "field_appId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(tipsMsgInfo);
        return new com.tencent.mm.plugin.appbrand.tipsmsg.AppBrandOnGetTipsMsg(field_appId, arrayList, true);
    }
}
