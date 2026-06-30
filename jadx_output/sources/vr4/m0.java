package vr4;

/* loaded from: classes9.dex */
public class m0 extends com.tencent.mm.sdk.event.n {
    public m0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetFTFNecessaryElementsEvent getFTFNecessaryElementsEvent = (com.tencent.mm.autogen.events.GetFTFNecessaryElementsEvent) iEvent;
        if (!(getFTFNecessaryElementsEvent instanceof com.tencent.mm.autogen.events.GetFTFNecessaryElementsEvent)) {
            return false;
        }
        am.uf ufVar = getFTFNecessaryElementsEvent.f54393g;
        at4.v1 v1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13997f;
        ufVar.getClass();
        java.lang.String q17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().q();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(q17);
        am.uf ufVar2 = getFTFNecessaryElementsEvent.f54393g;
        if (K0) {
            ufVar2.getClass();
        } else {
            java.lang.String str = "";
            for (int i17 = 0; i17 < q17.length() - 1; i17++) {
                str = str + "*";
            }
            q17.substring(q17.length() - 1, q17.length());
            ufVar2.getClass();
        }
        return true;
    }
}
