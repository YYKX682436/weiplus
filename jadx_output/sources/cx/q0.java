package cx;

/* loaded from: classes7.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f224454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(yz5.q qVar) {
        super(1);
        this.f224454d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo build;
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse it = (com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        long errCode = it.getErrCode();
        yz5.q qVar = this.f224454d;
        if (errCode == 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf((int) it.getErrCode());
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseFrom = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.parseFrom(it.getData());
            kotlin.jvm.internal.o.f(parseFrom, "parseFrom(...)");
            qVar.invoke(valueOf, null, parseFrom);
        } else {
            if (it.getData() != null) {
                byte[] data = it.getData();
                boolean z17 = false;
                if (data != null) {
                    if (data.length == 0) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    build = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.parseFrom(it.getData());
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf((int) it.getErrCode());
                    java.lang.String errMsg = it.getErrMsg();
                    kotlin.jvm.internal.o.d(build);
                    qVar.invoke(valueOf2, errMsg, build);
                }
            }
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder newBuilder = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.newBuilder();
            newBuilder.setPos(-1);
            newBuilder.setSubPos(-1);
            build = newBuilder.build();
            java.lang.Integer valueOf22 = java.lang.Integer.valueOf((int) it.getErrCode());
            java.lang.String errMsg2 = it.getErrMsg();
            kotlin.jvm.internal.o.d(build);
            qVar.invoke(valueOf22, errMsg2, build);
        }
        return jz5.f0.f302826a;
    }
}
