package g73;

/* loaded from: classes15.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.handoff.model.HandOff f269258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        super(0);
        this.f269258d = handOff;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("HandOffService", "onQBFileCreate");
        g73.o0.f269319o = true;
        com.tencent.mm.plugin.handoff.model.HandOff handOff = this.f269258d;
        g73.o0.f269313f = handOff;
        g73.o0.f269311d.Ma(handOff);
        return jz5.f0.f302826a;
    }
}
