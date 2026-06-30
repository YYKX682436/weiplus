package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class p1 extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f144041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.e f144042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f144043c;

    public p1(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.util.ArrayList arrayList, com.tencent.mm.plugin.lite.api.e eVar) {
        this.f144043c = g1Var;
        this.f144041a = arrayList;
        this.f144042b = eVar;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, com.tencent.wechat.aff.udr.r rVar) {
        super.onCallBackFailAsync(j17, i17, i18, str, str2, i19, rVar);
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "batchCheck udr fail, appId: %s, errNo: %d, errCode: %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        e70.t tVar = e70.t.f249855d;
        com.tencent.mm.plugin.lite.logic.g1 g1Var = this.f144043c;
        com.tencent.mm.plugin.lite.api.e eVar = this.f144042b;
        java.util.ArrayList arrayList = this.f144041a;
        if (i17 == 1) {
            com.tencent.mm.plugin.lite.logic.g1.e(g1Var, arrayList, eVar, str);
            return;
        }
        if (eVar != null) {
            ((com.tencent.mm.plugin.lite.k0) eVar).a(arrayList);
        }
        ((java.util.concurrent.ConcurrentHashMap) g1Var.f143961o).remove(arrayList);
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String str, java.lang.String str2, int i17, com.tencent.wechat.aff.udr.r rVar) {
        super.onCallBackSuccessAsync(j17, str, str2, i17, rVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "batchCheck udr success, appId: %s", str);
        com.tencent.mm.plugin.lite.logic.g1.e(this.f144043c, this.f144041a, this.f144042b, str);
    }
}
