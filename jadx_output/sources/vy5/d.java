package vy5;

/* loaded from: classes11.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f441519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver f441520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List list, dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f441519d = list;
        this.f441520e = connectivityBroadcastReceiver;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vy5.d(this.f441519d, this.f441520e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vy5.d dVar = (vy5.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver.f229415h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendEvent, networkType:");
        java.util.List list = this.f441519d;
        sb6.append(list);
        io.flutter.Log.i("MicroMsg.PatchedConnectivityBroadcastReceiver", sb6.toString());
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f441520e.f229418f;
        if (eventSink != null) {
            eventSink.success(list);
        }
        return jz5.f0.f302826a;
    }
}
