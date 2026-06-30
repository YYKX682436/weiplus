package kd2;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.q f306781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.VoipEvent f306782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kd2.q qVar, com.tencent.mm.autogen.events.VoipEvent voipEvent) {
        super(0);
        this.f306781d = qVar;
        this.f306782e = voipEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        if (gm0.j1.a()) {
            kd2.q qVar = this.f306781d;
            if (qVar.u() && ((i17 = this.f306782e.f54945g.f8415b) == 3 || i17 == 7)) {
                qVar.t0();
            }
        }
        return jz5.f0.f302826a;
    }
}
