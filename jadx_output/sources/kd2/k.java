package kd2;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.q f306765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.MultiTalkStatusEvent f306766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kd2.q qVar, com.tencent.mm.autogen.events.MultiTalkStatusEvent multiTalkStatusEvent) {
        super(0);
        this.f306765d = qVar;
        this.f306766e = multiTalkStatusEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (gm0.j1.a()) {
            kd2.q qVar = this.f306765d;
            if (qVar.u() && this.f306766e.f54506g.f6474a) {
                qVar.t0();
            }
        }
        return jz5.f0.f302826a;
    }
}
