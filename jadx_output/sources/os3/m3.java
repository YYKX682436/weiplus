package os3;

/* loaded from: classes8.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.NeedVerifyQQEvent f348151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.p3 f348152e;

    public m3(os3.p3 p3Var, com.tencent.mm.autogen.events.NeedVerifyQQEvent needVerifyQQEvent) {
        this.f348152e = p3Var;
        this.f348151d = needVerifyQQEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f348151d.f54518h.f7628a;
        os3.p3 p3Var = this.f348152e;
        if (!z17) {
            os3.o3 o3Var = p3Var.f348172d;
            if (o3Var != null) {
                o3Var.getClass();
                return;
            }
            return;
        }
        p3Var.getClass();
        if (java.lang.System.currentTimeMillis() - os3.p3.f348171f <= 600000 || !gm0.j1.b().m()) {
            return;
        }
        gm0.j1.d().g(new c01.ra(new os3.n3(p3Var), null));
    }
}
