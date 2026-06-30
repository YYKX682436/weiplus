package ka3;

/* loaded from: classes15.dex */
public final class k implements ka3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule f306077a;

    public k(com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule liteAppNFCModule) {
        this.f306077a = liteAppNFCModule;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:
    
        r0 = r1.registManager;
     */
    @Override // ka3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.String r0 = "resp"
            kotlin.jvm.internal.o.g(r6, r0)
            boolean r0 = ka3.b.a(r6)
            com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule r1 = r5.f306077a
            if (r0 == 0) goto L4f
            ka3.g r0 = com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule.access$getRegistManager$p(r1)
            if (r0 == 0) goto L4f
            com.tencent.mm.sdk.platformtools.o4 r2 = ra3.q.f393527a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f306071b
            r2.append(r3)
            r3 = 95
            r2.append(r3)
            org.json.JSONObject r3 = r0.f306070a
            java.lang.String r4 = "storeAppId"
            java.lang.String r3 = r3.optString(r4)
            java.lang.String r4 = "optString(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            ka3.f r0 = r0.f306075f
            org.json.JSONObject r0 = r0.f306066i
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.o.f(r0, r3)
            java.lang.String r3 = "key"
            kotlin.jvm.internal.o.g(r2, r3)
            com.tencent.mm.sdk.platformtools.o4 r3 = ra3.q.f393527a
            r3.putString(r2, r0)
        L4f:
            bd.e r0 = r1.getCallback()
            r1 = 0
            r0.a(r6, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka3.k.a(org.json.JSONObject):void");
    }
}
