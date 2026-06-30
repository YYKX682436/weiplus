package wk;

/* loaded from: classes12.dex */
public class g extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public sl.j f446871d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f446872e;

    public g() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        sl.j jVar;
        com.tencent.mm.autogen.events.ExtPlayerEvent extPlayerEvent = (com.tencent.mm.autogen.events.ExtPlayerEvent) iEvent;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(extPlayerEvent.f54204g.f7325b);
        am.m8 m8Var = extPlayerEvent.f54204g;
        if (K0 && m8Var.f7324a == 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtPlayerEventListener", "fileName(%s) is null or nil.", m8Var.f7325b);
        } else {
            int i17 = m8Var.f7324a;
            am.n8 n8Var = extPlayerEvent.f54205h;
            if (i17 == 1) {
                if (this.f446871d == null) {
                    this.f446871d = new sl.j(com.tencent.mm.sdk.platformtools.x2.f193071a, 0);
                } else if (!m8Var.f7325b.equals(this.f446872e)) {
                    if (this.f446871d.c()) {
                        this.f446871d.h(false);
                    }
                    this.f446872e = m8Var.f7325b;
                } else if (this.f446871d.b()) {
                    this.f446871d.e();
                    n8Var.getClass();
                } else if (this.f446871d.c()) {
                    n8Var.getClass();
                }
                sl.j jVar2 = this.f446871d;
                jVar2.f409043p = m8Var.f7328e;
                jVar2.f409042o = m8Var.f7329f;
                jVar2.g(m8Var.f7325b, m8Var.f7327d, m8Var.f7326c, -1);
                n8Var.getClass();
            } else if (i17 == 2) {
                sl.j jVar3 = this.f446871d;
                if (jVar3 != null) {
                    jVar3.h(false);
                }
            } else if (i17 == 4 && (jVar = this.f446871d) != null && jVar.c()) {
                this.f446871d.d(true);
                n8Var.getClass();
            }
        }
        return true;
    }
}
