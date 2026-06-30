package ha3;

/* loaded from: classes15.dex */
public final class w implements io.flutter.plugin.common.EventChannel.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.d0 f279958d;

    public w(ha3.d0 d0Var) {
        this.f279958d = d0Var;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        this.f279958d.f279821k = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        ha3.d0 d0Var = this.f279958d;
        d0Var.f279821k = eventSink;
        java.util.HashMap hashMap = d0Var.f279811a;
        if (hashMap != null) {
            kotlin.jvm.internal.o.d(hashMap);
            d0Var.b(hashMap);
        }
        java.util.HashMap hashMap2 = d0Var.f279812b;
        if (hashMap2 != null) {
            kotlin.jvm.internal.o.d(hashMap2);
            java.lang.Object obj2 = hashMap2.get(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
            java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
            int intValue = num != null ? num.intValue() : 0;
            java.util.HashMap hashMap3 = d0Var.f279812b;
            kotlin.jvm.internal.o.d(hashMap3);
            java.lang.Object obj3 = hashMap3.get(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
            java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str == null) {
                str = "";
            }
            java.lang.String valueOf = java.lang.String.valueOf(intValue);
            java.util.HashMap hashMap4 = d0Var.f279812b;
            kotlin.jvm.internal.o.d(hashMap4);
            d0Var.a(valueOf, str, hashMap4);
        }
    }
}
