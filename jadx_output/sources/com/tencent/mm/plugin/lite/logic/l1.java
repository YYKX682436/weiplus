package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes8.dex */
public class l1 implements kh0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.h f144006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144008c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f144009d;

    public l1(com.tencent.mm.plugin.lite.logic.g1 g1Var, com.tencent.mm.plugin.lite.api.h hVar, java.lang.String str, java.lang.String str2) {
        this.f144009d = g1Var;
        this.f144006a = hVar;
        this.f144007b = str;
        this.f144008c = str2;
    }

    @Override // kh0.e
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.lite.api.h hVar = this.f144006a;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkCustomDownloadLiteApp fail: %s", this.f144007b);
        } else {
            hVar.fail(this.f144008c, 5);
        }
    }

    @Override // kh0.e
    public void onSuccess(java.lang.String str) {
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = this.f144009d.y(str, null);
        com.tencent.mm.plugin.lite.api.h hVar = this.f144006a;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkCustomDownloadLiteApp success: %s", str);
        } else if (y17 != null) {
            hVar.success(y17, 0);
        } else {
            hVar.fail(str, 5);
        }
    }
}
