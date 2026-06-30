package nt;

/* loaded from: classes8.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        zo3.p.Ui().b(((com.tencent.mm.autogen.events.GetAppSettingEvent) iEvent).f54381g.f6950a);
        return false;
    }
}
