package vy5;

/* loaded from: classes11.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f441517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver f441518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f441518e = connectivityBroadcastReceiver;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vy5.c(this.f441518e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vy5.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f441517d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f441517d = 1;
            if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int i18 = dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver.f229415h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendCurrentStatusWithDelay, networkType:");
        dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver = this.f441518e;
        sb6.append(connectivityBroadcastReceiver.f229416d.b());
        io.flutter.Log.i("MicroMsg.PatchedConnectivityBroadcastReceiver", sb6.toString());
        io.flutter.plugin.common.EventChannel.EventSink eventSink = connectivityBroadcastReceiver.f229418f;
        if (eventSink != null) {
            eventSink.success(connectivityBroadcastReceiver.f229416d.b());
        }
        return jz5.f0.f302826a;
    }
}
