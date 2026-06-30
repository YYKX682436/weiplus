package io.flutter.plugins.connectivity.patched;

@qz5.f(c = "io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin$onMethodCall$1", f = "PatchedConnectivityPlugin.kt", l = {47}, m = "invokeSuspend")
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class PatchedConnectivityPlugin$onMethodCall$1 extends qz5.l implements yz5.p {
    final /* synthetic */ io.flutter.plugin.common.MethodCall $call;
    final /* synthetic */ io.flutter.plugin.common.MethodChannel.Result $result;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PatchedConnectivityPlugin$onMethodCall$1(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result, io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin patchedConnectivityPlugin, kotlin.coroutines.Continuation<? super io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin$onMethodCall$1> continuation) {
        super(2, continuation);
        this.$call = methodCall;
        this.$result = result;
        this.this$0 = patchedConnectivityPlugin;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation<jz5.f0> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin$onMethodCall$1(this.$call, this.$result, this.this$0, continuation);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.flutter.plugin.common.MethodChannel.Result result;
        io.flutter.plugins.connectivity.patched.PatchedConnectivity patchedConnectivity;
        io.flutter.plugin.common.MethodChannel.Result result2;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.label;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!kotlin.jvm.internal.o.b(this.$call.method, "check")) {
                this.$result.notImplemented();
                return jz5.f0.f302826a;
            }
            result = this.$result;
            patchedConnectivity = this.this$0.connectivity;
            if (patchedConnectivity != null) {
                this.L$0 = result;
                this.label = 1;
                java.lang.Object networkType = patchedConnectivity.networkType(this);
                if (networkType == aVar) {
                    return aVar;
                }
                result2 = result;
                obj = networkType;
            }
            result2 = result;
            str = com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
            result2.success(str);
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        result2 = (io.flutter.plugin.common.MethodChannel.Result) this.L$0;
        kotlin.ResultKt.throwOnFailure(obj);
        str = (java.lang.String) obj;
        if (str == null) {
            result = result2;
            result2 = result;
            str = com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
        }
        result2.success(str);
        return jz5.f0.f302826a;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation<? super jz5.f0> continuation) {
        return ((io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin$onMethodCall$1) create(y0Var, continuation)).invokeSuspend(jz5.f0.f302826a);
    }
}
