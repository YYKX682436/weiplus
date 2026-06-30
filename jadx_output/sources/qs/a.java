package qs;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.uz uzVar = ((com.tencent.mm.autogen.events.UpdateDeviceStepReqEvent) iEvent).f54915g;
        int i17 = uzVar.f8147a;
        int i18 = uzVar.f8148b;
        if (i18 == 1) {
            c81.b wi6 = c81.b.wi();
            wi6.requireAccountInitialized();
            com.tencent.mm.sdk.platformtools.o4 a17 = wi6.f39656d.a();
            if (a17 == null) {
                return false;
            }
            a17.putInt("last_m7_step_count", i17);
            return false;
        }
        if (i18 != 2) {
            return false;
        }
        c81.b wi7 = c81.b.wi();
        wi7.requireAccountInitialized();
        com.tencent.mm.sdk.platformtools.o4 a18 = wi7.f39656d.a();
        if (a18 == null) {
            return false;
        }
        a18.putInt("last_hk_step_count", i17);
        return false;
    }
}
