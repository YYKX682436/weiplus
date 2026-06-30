package qa3;

/* loaded from: classes15.dex */
public final class m implements com.tencent.websocket.a {
    @Override // com.tencent.websocket.a
    public void a(java.lang.String str, int i17, byte[] bArr, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppTestService", "recv from " + str + '(' + i17 + "), isText:" + z17);
        if (z17) {
            if (bArr == null) {
                return;
            }
            qa3.o.a(qa3.o.f361051a, bArr);
        }
    }

    @Override // com.tencent.websocket.a
    public void b(java.lang.String str, int i17, java.lang.String[] strArr, java.lang.String[] strArr2) {
        com.tencent.mars.xlog.Log.i("LiteAppTestService", "onHandShake, " + str + '(' + i17 + ')');
    }

    @Override // com.tencent.websocket.a
    public void c(java.lang.String str, int i17, boolean z17, java.lang.String[] strArr, java.lang.String[] strArr2, int i18, java.lang.String str2, java.lang.String[] strArr3, java.lang.String[] strArr4) {
        com.tencent.mars.xlog.Log.i("LiteAppTestService", "onOpen, " + str + '(' + i17 + "), isSuc:" + z17 + ", code:" + i18 + ", msg:" + str2);
        if (!z17 || str == null) {
            return;
        }
        qa3.o oVar = qa3.o.f361051a;
        qa3.o.f361052b = new jz5.l(str, java.lang.Integer.valueOf(i17));
        qa3.o.b(qa3.o.f361051a);
    }

    @Override // com.tencent.websocket.a
    public void d(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("LiteAppTestService", "socket close, " + str + '(' + i17 + ')');
        jz5.l lVar = qa3.o.f361052b;
        if (lVar != null) {
            kotlin.jvm.internal.o.d(lVar);
            if (((java.lang.Number) lVar.f302834e).intValue() == i17) {
                qa3.o.f361052b = null;
            }
        }
    }

    @Override // com.tencent.websocket.a
    public int doCertificateVerify(java.lang.String str, byte[][] bArr) {
        return 0;
    }
}
