package dt;

/* loaded from: classes8.dex */
public final class g extends com.tencent.mm.sdk.event.n {
    public g() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent event = (com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.AesGcmSessionKeySwitchListener", "DynamicConfigUpdatedEvent update AesGcmSessionKeySwitch");
        com.tencent.mm.modelbase.a.b();
        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193054b, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, dt.c4.class);
        return false;
    }
}
