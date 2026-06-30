package io.flutter.plugins.connectivity.patched;

@qz5.f(c = "io.flutter.plugins.connectivity.patched.PatchedConnectivity$networkType$2", f = "PatchedConnectivity.kt", l = {}, m = "invokeSuspend")
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class PatchedConnectivity$networkType$2 extends qz5.l implements yz5.p {
    int label;
    final /* synthetic */ io.flutter.plugins.connectivity.patched.PatchedConnectivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PatchedConnectivity$networkType$2(io.flutter.plugins.connectivity.patched.PatchedConnectivity patchedConnectivity, kotlin.coroutines.Continuation<? super io.flutter.plugins.connectivity.patched.PatchedConnectivity$networkType$2> continuation) {
        super(2, continuation);
        this.this$0 = patchedConnectivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation<jz5.f0> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.flutter.plugins.connectivity.patched.PatchedConnectivity$networkType$2(this.this$0, continuation);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String networkTypeLegacy;
        pz5.a aVar = pz5.a.f359186d;
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            android.net.NetworkCapabilities networkCapabilities = this.this$0.getConnectivityManager().getNetworkCapabilities(this.this$0.getConnectivityManager().getActiveNetwork());
            if (networkCapabilities == null) {
                return com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
            }
            if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3)) {
                return "wifi";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "mobile";
            }
            networkTypeLegacy = this.this$0.networkTypeLegacy();
            return networkTypeLegacy;
        } catch (java.lang.Exception unused) {
            return com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
        }
    }

    @Override // yz5.p
    public final java.lang.Object invoke(kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((io.flutter.plugins.connectivity.patched.PatchedConnectivity$networkType$2) create(y0Var, continuation)).invokeSuspend(jz5.f0.f302826a);
    }
}
