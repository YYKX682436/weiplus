package g73;

/* loaded from: classes15.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.handoff.model.HandOff f269267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        super(0);
        this.f269267d = handOff;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        g73.o0 o0Var = g73.o0.f269311d;
        com.tencent.mm.plugin.handoff.model.HandOff handOff = this.f269267d;
        o0Var.Jc(handOff);
        com.tencent.mars.xlog.Log.i("HandOffService", "onWebViewCreate: handOff id = " + handOff.getId() + ", key = " + handOff.getKey());
        return jz5.f0.f302826a;
    }
}
