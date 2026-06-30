package pd0;

/* loaded from: classes9.dex */
public class d1 extends com.tencent.mm.sdk.event.n {
    public d1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (((com.tencent.mm.autogen.events.EcsGiftNotifyEvent) iEvent).f54098g.f7127a != 1) {
            return false;
        }
        w04.l.INSTANCE.Y3(540999734);
        return false;
    }
}
