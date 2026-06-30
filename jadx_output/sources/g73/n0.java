package g73;

/* loaded from: classes15.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.handoff.model.HandOff f269310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        super(0);
        this.f269310d = handOff;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        g73.o0.f269316i.removeMessages(1);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = g73.o0.f269314g;
        com.tencent.mm.plugin.handoff.model.HandOff handOff = this.f269310d;
        if (concurrentHashMap.containsKey(handOff.getKey())) {
            g73.o0.f269311d.Ni(handOff.copy());
        } else {
            g73.o0.f269311d.Bi(handOff.copy());
        }
        return jz5.f0.f302826a;
    }
}
