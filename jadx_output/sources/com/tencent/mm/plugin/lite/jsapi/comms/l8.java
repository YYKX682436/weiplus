package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class l8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.o f143667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.p8 f143669f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(com.tencent.mm.plugin.lite.api.o oVar, java.lang.String str, com.tencent.mm.plugin.lite.jsapi.comms.p8 p8Var) {
        super(2);
        this.f143667d = oVar;
        this.f143668e = str;
        this.f143669f = p8Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.lite.jsapi.comms.j8 j8Var = (com.tencent.mm.plugin.lite.jsapi.comms.j8) obj2;
        com.tencent.mm.plugin.lite.api.o oVar = this.f143667d;
        if (booleanValue) {
            java.lang.String str = this.f143668e;
            if (str == null || str.length() == 0) {
                com.tencent.mars.xlog.Log.w("LiteAppSendVideoMessage", "doShare, thumbPath is empty");
                oVar.a("sendFileMessage fail, illegal video");
            } else if (j8Var != null) {
                com.tencent.mm.plugin.lite.jsapi.comms.p8 p8Var = this.f143669f;
                p8Var.getClass();
                p8Var.f143719a = j8Var;
            }
        } else {
            com.tencent.mars.xlog.Log.i("LiteAppSendVideoMessage", "doShare, fail since video illegal");
            oVar.a("sendFileMessage fail, fail since video illegal");
        }
        return jz5.f0.f302826a;
    }
}
