package s30;

/* loaded from: classes9.dex */
public class o0 extends com.tencent.mm.sdk.event.n {
    public o0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        h62.d vj6 = h62.d.vj();
        vj6.getClass();
        ((ku5.t0) ku5.t0.f312615d).l(new h62.b(vj6), 60000L, "manual_get_expt");
        h62.d.vj().Cj(false);
        vj6.Hj(2);
        return false;
    }
}
