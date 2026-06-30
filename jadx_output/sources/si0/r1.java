package si0;

/* loaded from: classes4.dex */
public final class r1 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.sns.PlatformUserDatePickerApi, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f408162d;

    @Override // com.tencent.pigeon.sns.PlatformUserDatePickerApi
    public void choosePickerDate(byte[] dateInfo, long j17, long j18, yz5.l callback) {
        bw5.lk0 parseFrom;
        kotlin.jvm.internal.o.g(dateInfo, "dateInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserDatePickerFlutterPlugin", "choosePickerDate");
        android.app.Activity activity = this.f408162d;
        if (activity == null || (parseFrom = new bw5.lk0().parseFrom(dateInfo)) == null) {
            return;
        }
        ca4.r0 r0Var = new ca4.r0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = parseFrom.f29835d.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            bw5.tk0 tk0Var = (bw5.tk0) it.next();
            java.lang.String valueOf = java.lang.String.valueOf(tk0Var.f33497d);
            java.lang.String valueOf2 = java.lang.String.valueOf(tk0Var.f33498e);
            long j19 = tk0Var.f33499f;
            if (!kotlin.jvm.internal.o.b(str, valueOf)) {
                arrayList = new java.util.ArrayList();
                linkedHashMap = new java.util.LinkedHashMap();
                r0Var.f40009a.add(valueOf);
                r0Var.f40010b.add(arrayList);
                java.util.Map map = r0Var.f40011c;
                kotlin.jvm.internal.o.f(map, "map");
                ((java.util.HashMap) map).put(valueOf, linkedHashMap);
                str = valueOf;
            }
            arrayList.add(valueOf2);
            linkedHashMap.put(valueOf2, java.lang.Long.valueOf(j19));
        }
        java.util.ArrayList arrayList2 = r0Var.f40009a;
        java.util.ArrayList arrayList3 = r0Var.f40010b;
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(activity, arrayList2, arrayList3);
        c0Var.g(android.view.View.inflate(activity, com.tencent.mm.R.layout.f489532cv2, null));
        int indexOf = arrayList2.indexOf(java.lang.String.valueOf(j17));
        c0Var.j(java.lang.Math.max(indexOf, 0), java.lang.Math.max(indexOf < 0 ? 0 : ((java.util.List) arrayList3.get(indexOf)).indexOf(java.lang.String.valueOf(j18)), 0));
        c0Var.f212259t = new si0.q1(r0Var, callback, c0Var);
        c0Var.l();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f408162d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformUserDatePickerApi.Companion companion = com.tencent.pigeon.sns.PlatformUserDatePickerApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformUserDatePickerApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f408162d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f408162d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformUserDatePickerApi.Companion companion = com.tencent.pigeon.sns.PlatformUserDatePickerApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformUserDatePickerApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f408162d = binding.getActivity();
    }
}
