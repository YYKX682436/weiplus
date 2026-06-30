package rr2;

/* loaded from: classes2.dex */
public final class a implements com.tencent.pigeon.finder.FinderPoiLbsNativeAPI, io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f399168d;

    public a(yz5.l onSelectLbsCb) {
        kotlin.jvm.internal.o.g(onSelectLbsCb, "onSelectLbsCb");
        this.f399168d = onSelectLbsCb;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.FinderPoiLbsNativeAPI.Companion companion = com.tencent.pigeon.finder.FinderPoiLbsNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.FinderPoiLbsNativeAPI.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        com.tencent.mars.xlog.Log.i("FinderPoiLbsPlugin", "[onAttachedToEngine]");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.FinderPoiLbsNativeAPI.Companion companion = com.tencent.pigeon.finder.FinderPoiLbsNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.FinderPoiLbsNativeAPI.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        com.tencent.mars.xlog.Log.i("FinderPoiLbsPlugin", "[onDetachedFromEngine]");
    }

    @Override // com.tencent.pigeon.finder.FinderPoiLbsNativeAPI
    public void onSelectLbs(byte[] lbs, java.lang.String city) {
        kotlin.jvm.internal.o.g(lbs, "lbs");
        kotlin.jvm.internal.o.g(city, "city");
        bw5.wj wjVar = new bw5.wj();
        wjVar.parseFrom(lbs);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onSelectLbs] ");
        boolean[] zArr = wjVar.f34751p;
        sb6.append(zArr[2] ? wjVar.f34743e : "");
        sb6.append(" city:");
        sb6.append(city);
        com.tencent.mars.xlog.Log.i("FinderPoiLbsPlugin", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = zArr[2] ? wjVar.f34743e : "";
        if (!(str == null || str.length() == 0)) {
            intent.putExtra("get_poi_classify_type", wjVar.f34747i);
            intent.putExtra("get_poi_address", zArr[4] ? wjVar.f34745g : "");
            intent.putExtra("get_poi_classify_id", zArr[1] ? wjVar.f34742d : "");
            intent.putExtra("get_poi_name", zArr[2] ? wjVar.f34743e : "");
            intent.putExtra("get_city", city);
        }
        this.f399168d.invoke(intent);
    }
}
