package g73;

/* loaded from: classes15.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.handoff.model.HandOff f269264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        super(0);
        this.f269264d = handOff;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("HandOffService", "onQBFileDestroy");
        com.tencent.mm.plugin.handoff.model.HandOff handOff = g73.o0.f269313f;
        if (handOff != null) {
            handOff.update(this.f269264d);
            g73.o0.f269311d.Jc(handOff);
        }
        return jz5.f0.f302826a;
    }
}
