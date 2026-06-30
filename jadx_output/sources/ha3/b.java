package ha3;

/* loaded from: classes15.dex */
public final class b implements io.flutter.plugin.common.EventChannel.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.g f279798d;

    public b(ha3.g gVar) {
        this.f279798d = gVar;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        this.f279798d.f279861l = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        ha3.g gVar = this.f279798d;
        gVar.f279861l = eventSink;
        java.util.HashMap hashMap = gVar.f279850a;
        if (hashMap != null) {
            kotlin.jvm.internal.o.d(hashMap);
            gVar.b(hashMap);
        }
        java.util.HashMap hashMap2 = gVar.f279851b;
        if (hashMap2 != null) {
            kotlin.jvm.internal.o.d(hashMap2);
            java.lang.Object obj2 = hashMap2.get(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
            java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
            int intValue = num != null ? num.intValue() : 0;
            java.util.HashMap hashMap3 = gVar.f279851b;
            kotlin.jvm.internal.o.d(hashMap3);
            java.lang.Object obj3 = hashMap3.get(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
            java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str == null) {
                str = "";
            }
            java.lang.String valueOf = java.lang.String.valueOf(intValue);
            java.util.HashMap hashMap4 = gVar.f279851b;
            kotlin.jvm.internal.o.d(hashMap4);
            gVar.a(valueOf, str, hashMap4);
        }
    }
}
