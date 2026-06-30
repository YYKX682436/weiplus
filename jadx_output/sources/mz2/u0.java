package mz2;

/* loaded from: classes9.dex */
public class u0 extends com.tencent.mm.sdk.event.n {
    public u0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetWcPaySignEvent getWcPaySignEvent = (com.tencent.mm.autogen.events.GetWcPaySignEvent) iEvent;
        if (getWcPaySignEvent == null) {
            return false;
        }
        getWcPaySignEvent.f54421h.f8281a = com.tenpay.android.wechat.TenpayUtil.signWith3Des("passwd=" + getWcPaySignEvent.f54420g.f8195a);
        return false;
    }
}
