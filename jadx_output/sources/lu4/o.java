package lu4;

/* loaded from: classes7.dex */
public final class o implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu4.q f321446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f321447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321448f;

    public o(lu4.q qVar, int i17, java.lang.String str) {
        this.f321446d = qVar;
        this.f321447e = i17;
        this.f321448f = str;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o rr6, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        lu4.q qVar = this.f321446d;
        com.tencent.mars.xlog.Log.i(qVar.f321431c, "do cgi callback cmdId=" + this.f321447e);
        com.tencent.mm.modelbase.n nVar = rr6.f70711b;
        if (!com.tencent.mm.sdk.platformtools.t8.M0(nVar.f70700a.initialProtobufBytes())) {
            byte[] encode = android.util.Base64.encode(nVar.f70700a.initialProtobufBytes(), 2);
            kotlin.jvm.internal.o.f(encode, "encode(...)");
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
            java.lang.String str2 = new java.lang.String(encode, UTF_8);
            lu4.c.u((lu4.c) qVar.f321430b, this.f321448f, "'" + str2 + '\'', null, 4, null);
            return 0;
        }
        java.lang.String str3 = this.f321448f;
        qVar.getClass();
        r45.bk bkVar = new r45.bk();
        r45.ie ieVar = new r45.ie();
        bkVar.BaseResponse = ieVar;
        r45.du5 du5Var = new r45.du5();
        du5Var.c("fail response data is empty");
        ieVar.f376960e = du5Var;
        bkVar.BaseResponse.f376959d = -1;
        byte[] encode2 = android.util.Base64.encode(bkVar.toByteArray(), 2);
        kotlin.jvm.internal.o.f(encode2, "encode(...)");
        java.nio.charset.Charset UTF_82 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.o.f(UTF_82, "UTF_8");
        java.lang.String str4 = new java.lang.String(encode2, UTF_82);
        lu4.c.u((lu4.c) qVar.f321430b, str3, "'" + str4 + '\'', null, 4, null);
        return 0;
    }
}
