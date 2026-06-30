package it4;

/* loaded from: classes9.dex */
public class l extends com.tencent.mm.sdk.event.n {
    public l() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OpenECardEvent openECardEvent = (com.tencent.mm.autogen.events.OpenECardEvent) iEvent;
        ((ht4.g) i95.n0.c(ht4.g.class)).getClass();
        openECardEvent.f54593g.getClass();
        android.content.Context context = (android.content.Context) openECardEvent.f54593g.f7355a.get();
        if (context == null) {
            return false;
        }
        jt4.f.d(1, null, "WEB_DEBIT", null, context, null);
        return false;
    }
}
