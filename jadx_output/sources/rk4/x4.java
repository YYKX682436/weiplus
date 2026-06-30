package rk4;

/* loaded from: classes11.dex */
public final class x4 implements com.tencent.pigeon.ting.TingFinderSourceApi, io.flutter.embedding.engine.plugins.FlutterPlugin {
    @Override // com.tencent.pigeon.ting.TingFinderSourceApi
    public java.lang.String getSessionBuffer(java.lang.String feedId, long j17) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        long Z = pm0.v.Z(feedId);
        int i17 = (int) j17;
        ((c61.w8) paVar).getClass();
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return ((com.tencent.mm.plugin.finder.report.o3) c17).ek(Z, null, i17);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingFinderSourceApi.Companion companion = com.tencent.pigeon.ting.TingFinderSourceApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingFinderSourceApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingFinderSourceApi.Companion companion = com.tencent.pigeon.ting.TingFinderSourceApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingFinderSourceApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // com.tencent.pigeon.ting.TingFinderSourceApi
    public void requestMediaInfo(byte[] finderInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(finderInfo, "finderInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        rk4.k5.e("requestMediaInfo", "TingFinderSourcePlugin");
        bw5.e70 parseFrom = new bw5.e70().parseFrom(finderInfo);
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        java.lang.String tid = parseFrom.getTid();
        kotlin.jvm.internal.o.d(tid);
        ((c61.l7) b6Var).ml(r26.q0.c(tid), parseFrom.b(), 0, true, false, "", new rk4.w4(parseFrom, callback));
    }
}
