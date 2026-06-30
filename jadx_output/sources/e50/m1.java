package e50;

/* loaded from: classes15.dex */
public final class m1 implements io.flutter.plugin.common.BinaryMessenger {

    /* renamed from: a, reason: collision with root package name */
    public io.flutter.plugin.common.BinaryMessenger f249522a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f249523b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f249524c = new java.util.ArrayList();

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void send(java.lang.String channel, java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.o.g(channel, "channel");
        send(channel, byteBuffer, null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void setMessageHandler(java.lang.String channel, io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        kotlin.jvm.internal.o.g(channel, "channel");
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = this.f249522a;
        if (binaryMessenger != null) {
            kotlin.jvm.internal.o.d(binaryMessenger);
            binaryMessenger.setMessageHandler(channel, binaryMessageHandler);
        } else {
            ((java.util.ArrayList) this.f249524c).add(new e50.k1(channel, binaryMessageHandler));
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void send(java.lang.String channel, java.nio.ByteBuffer byteBuffer, io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply) {
        kotlin.jvm.internal.o.g(channel, "channel");
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = this.f249522a;
        if (binaryMessenger != null) {
            kotlin.jvm.internal.o.d(binaryMessenger);
            binaryMessenger.send(channel, byteBuffer, binaryReply);
        } else {
            ((java.util.ArrayList) this.f249523b).add(new e50.l1(channel, byteBuffer, binaryReply));
        }
    }
}
