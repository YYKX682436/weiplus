package xp5;

/* loaded from: classes15.dex */
public final class e extends com.tencent.mm.weapp_core.CronetWebSocket {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xp5.f f455966a;

    public e(xp5.f fVar) {
        this.f455966a = fVar;
    }

    @Override // com.tencent.mm.weapp_core.CronetWebSocket
    public void onConnectClose(long j17, int i17, java.lang.String reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        xp5.f fVar = this.f455966a;
        java.lang.Object obj = fVar.f455967a.get(java.lang.Long.valueOf(j17));
        kotlin.jvm.internal.o.d(obj);
        com.tencent.mars.xlog.Log.i("LiteAppTestService", "websocket onClose, code: " + i17 + ", reason: " + reason + ", url: " + ((qa3.n) ((xp5.d) obj)).f361050a);
        disposeConnect(j17);
        fVar.f455967a.remove(java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.mm.weapp_core.CronetWebSocket
    public void onConnectError(long j17, long j18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        xp5.f fVar = this.f455966a;
        java.lang.Object obj = fVar.f455967a.get(java.lang.Long.valueOf(j17));
        kotlin.jvm.internal.o.d(obj);
        com.tencent.mars.xlog.Log.i("LiteAppTestService", "websocket onError, code: " + ((int) j18) + ", reason: " + errMsg + ", url: " + ((qa3.n) ((xp5.d) obj)).f361050a);
        disposeConnect(j17);
        fVar.f455967a.remove(java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.mm.weapp_core.CronetWebSocket
    public void onConnectOpen(long j17, java.util.Map headers) {
        kotlin.jvm.internal.o.g(headers, "headers");
        java.lang.Object obj = this.f455966a.f455967a.get(java.lang.Long.valueOf(j17));
        kotlin.jvm.internal.o.d(obj);
        com.tencent.mars.xlog.Log.i("LiteAppTestService", "websocket onOpen: " + ((qa3.n) ((xp5.d) obj)).f361050a);
        qa3.o.b(qa3.o.f361051a);
    }

    @Override // com.tencent.mm.weapp_core.CronetWebSocket
    public void onMessageBinary(long j17, java.nio.ByteBuffer message) {
        kotlin.jvm.internal.o.g(message, "message");
        java.lang.Object obj = this.f455966a.f455967a.get(java.lang.Long.valueOf(j17));
        kotlin.jvm.internal.o.d(obj);
        int remaining = message.remaining();
        byte[] bArr = new byte[remaining];
        message.get(bArr);
        com.tencent.mars.xlog.Log.i("LiteAppTestService", "websocket onBinaryMessage: size: " + remaining + ", url: " + ((qa3.n) ((xp5.d) obj)).f361050a);
        qa3.o.a(qa3.o.f361051a, bArr);
    }

    @Override // com.tencent.mm.weapp_core.CronetWebSocket
    public void onMessageText(long j17, java.lang.String message) {
        kotlin.jvm.internal.o.g(message, "message");
        java.lang.Object obj = this.f455966a.f455967a.get(java.lang.Long.valueOf(j17));
        kotlin.jvm.internal.o.d(obj);
        com.tencent.mars.xlog.Log.i("LiteAppTestService", "websocket onMessage: size: " + message + ", url: " + ((qa3.n) ((xp5.d) obj)).f361050a);
        qa3.o oVar = qa3.o.f361051a;
        byte[] bytes = message.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        qa3.o.a(oVar, bytes);
    }
}
