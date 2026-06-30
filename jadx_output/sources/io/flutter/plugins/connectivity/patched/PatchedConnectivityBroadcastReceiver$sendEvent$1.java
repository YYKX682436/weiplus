package io.flutter.plugins.connectivity.patched;

@qz5.f(c = "io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$sendEvent$1", f = "PatchedConnectivityBroadcastReceiver.kt", l = {71, 72}, m = "invokeSuspend")
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class PatchedConnectivityBroadcastReceiver$sendEvent$1 extends qz5.l implements yz5.p {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PatchedConnectivityBroadcastReceiver$sendEvent$1(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver patchedConnectivityBroadcastReceiver, kotlin.coroutines.Continuation<? super io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$sendEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = patchedConnectivityBroadcastReceiver;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation<jz5.f0> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$sendEvent$1(this.this$0, continuation);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.StringBuilder sb6;
        io.flutter.plugins.connectivity.patched.PatchedConnectivity patchedConnectivity;
        java.lang.String str2;
        io.flutter.plugin.common.EventChannel.EventSink eventSink;
        io.flutter.plugins.connectivity.patched.PatchedConnectivity patchedConnectivity2;
        io.flutter.plugin.common.EventChannel.EventSink eventSink2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.label;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            str = this.this$0.TAG;
            sb6 = new java.lang.StringBuilder();
            sb6.append("sendEvent, networkType:");
            patchedConnectivity = this.this$0.connectivity;
            this.L$0 = str;
            this.L$1 = sb6;
            this.label = 1;
            java.lang.Object networkType = patchedConnectivity.networkType(this);
            if (networkType == aVar) {
                return aVar;
            }
            str2 = str;
            obj = networkType;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eventSink2 = (io.flutter.plugin.common.EventChannel.EventSink) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                eventSink2.success(obj);
                return jz5.f0.f302826a;
            }
            sb6 = (java.lang.StringBuilder) this.L$1;
            str2 = (java.lang.String) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        sb6.append((java.lang.String) obj);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        eventSink = this.this$0.events;
        if (eventSink != null) {
            patchedConnectivity2 = this.this$0.connectivity;
            this.L$0 = eventSink;
            this.L$1 = null;
            this.label = 2;
            java.lang.Object networkType2 = patchedConnectivity2.networkType(this);
            if (networkType2 == aVar) {
                return aVar;
            }
            eventSink2 = eventSink;
            obj = networkType2;
            eventSink2.success(obj);
        }
        return jz5.f0.f302826a;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation<? super jz5.f0> continuation) {
        return ((io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$sendEvent$1) create(y0Var, continuation)).invokeSuspend(jz5.f0.f302826a);
    }
}
