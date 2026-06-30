package f50;

/* loaded from: classes4.dex */
public final class w implements f50.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f50.w f259594a = new f50.w();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f259595b = new com.tencent.mm.sdk.platformtools.r2(100);

    @Override // f50.a0
    public com.tencent.mm.protobuf.f c(byte[] bArr, java.lang.String engineId) {
        kotlin.jvm.internal.o.g(engineId, "engineId");
        r45.u33 u33Var = new r45.u33();
        if (bArr != null) {
            try {
                u33Var.parseFrom(bArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        r45.v33 v33Var = new r45.v33();
        java.lang.String key = u33Var.f386984d;
        kotlin.jvm.internal.o.f(key, "key");
        java.lang.String str = (java.lang.String) f259595b.get(key);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterFuncCallService", "get: " + str + " for " + key);
        v33Var.f387851d = str;
        return v33Var;
    }
}
