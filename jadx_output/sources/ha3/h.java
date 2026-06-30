package ha3;

/* loaded from: classes15.dex */
public final class h implements io.flutter.plugin.common.EventChannel.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f279868d;

    public h(ha3.v vVar) {
        this.f279868d = vVar;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        this.f279868d.f279951m = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        ha3.v vVar = this.f279868d;
        vVar.f279951m = eventSink;
        java.util.HashMap hashMap = vVar.f279943e;
        if (hashMap != null) {
            kotlin.jvm.internal.o.d(hashMap);
            vVar.b(hashMap);
        }
        java.util.HashMap hashMap2 = vVar.f279944f;
        if (hashMap2 != null) {
            kotlin.jvm.internal.o.d(hashMap2);
            java.lang.Object obj2 = hashMap2.get(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
            java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
            int intValue = num != null ? num.intValue() : 0;
            java.util.HashMap hashMap3 = vVar.f279944f;
            kotlin.jvm.internal.o.d(hashMap3);
            java.lang.Object obj3 = hashMap3.get(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
            java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str == null) {
                str = "";
            }
            java.lang.String valueOf = java.lang.String.valueOf(intValue);
            java.util.HashMap hashMap4 = vVar.f279944f;
            kotlin.jvm.internal.o.d(hashMap4);
            vVar.a(valueOf, str, hashMap4);
        }
    }
}
