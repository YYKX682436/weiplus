package s30;

/* loaded from: classes.dex */
public class u0 extends com.tencent.mm.sdk.event.n {
    public u0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SystemUpgradeIListener", "system upgrade start to get expt app");
        h62.d.vj().Cj(false);
        h62.d.vj().Hj(3);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(863L, 175L, 1L);
        return false;
    }
}
