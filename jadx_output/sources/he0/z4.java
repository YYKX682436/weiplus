package he0;

/* loaded from: classes.dex */
public class z4 extends com.tencent.mm.sdk.event.n {
    public z4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.OpenCanvasLsn");
        com.tencent.mm.autogen.events.OpenCanvasEvent openCanvasEvent = (com.tencent.mm.autogen.events.OpenCanvasEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.OpenCanvasLsn");
        am.jn jnVar = openCanvasEvent.f54590g;
        if (jnVar.f7057f == 1) {
            c17 = za4.s1.b().d(jnVar.f7052a, jnVar.f7053b, jnVar.f7054c, jnVar.f7055d);
        } else {
            long E1 = com.tencent.mm.sdk.platformtools.t8.E1(jnVar.f7052a);
            java.lang.String Q = ca4.m0.Q(jnVar.f7058g);
            java.lang.String str = jnVar.f7059h;
            int i17 = jnVar.f7056e;
            za4.a aVar = new za4.a();
            aVar.f471056d = false;
            c17 = za4.s1.b().c(E1, jnVar.f7054c, jnVar.f7060i, jnVar.f7055d, i17, Q, str, aVar);
        }
        openCanvasEvent.f54591h.f7171a = c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OpenCanvasLsn");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OpenCanvasLsn");
        return false;
    }
}
