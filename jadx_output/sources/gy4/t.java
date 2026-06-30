package gy4;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy4.u f277624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(gy4.u uVar) {
        super(0);
        this.f277624d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String uuid;
        java.lang.String str;
        java.lang.String str2;
        mw4.n nVar = new mw4.n();
        gy4.u uVar = this.f277624d;
        gy4.d U6 = uVar.U6();
        if (U6 != null) {
            uuid = U6.f277592g;
            if (uuid == null) {
                kotlin.jvm.internal.o.o(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
                throw null;
            }
        } else {
            uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
        }
        java.lang.String str3 = uuid;
        gy4.d U62 = uVar.U6();
        if (U62 != null) {
            str = U62.f277591f;
            if (str == null) {
                kotlin.jvm.internal.o.o("host");
                throw null;
            }
        } else {
            str = "";
        }
        java.lang.String concat = "https://".concat(str);
        gy4.d U63 = uVar.U6();
        if (U63 != null) {
            java.lang.String str4 = U63.f277591f;
            if (str4 == null) {
                kotlin.jvm.internal.o.o("host");
                throw null;
            }
            str2 = str4;
        } else {
            str2 = null;
        }
        mw4.n.c(nVar, str3, concat, null, str2, 4, null);
        nVar.b("/chat/wechat/get-chat-records", uVar.f277630i);
        nVar.b("/chat/wechat/get-file-cdn-infos", uVar.f277631m);
        nVar.b("/chat/wechat/get-file-data", uVar.f277632n);
        return nVar.a();
    }
}
