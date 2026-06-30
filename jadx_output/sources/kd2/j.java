package kd2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.q f306760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.MultiTalkActionEvent f306761e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kd2.q qVar, com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent) {
        super(0);
        this.f306760d = qVar;
        this.f306761e = multiTalkActionEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (gm0.j1.a()) {
            kd2.q qVar = this.f306760d;
            if (qVar.u() && this.f306761e.f54504g.f6259a == 3) {
                qVar.t0();
            }
        }
        return jz5.f0.f302826a;
    }
}
