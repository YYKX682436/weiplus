package fo5;

/* loaded from: classes14.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265054d;

    public p(fo5.r0 r0Var) {
        this.f265054d = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "current ensure ring state: " + this.f265054d.f265102u);
        fo5.r0 r0Var = this.f265054d;
        if (r0Var.f265087f == er4.l.MAIN_UI_INVITED) {
            if (r0Var.c().b() == er4.d.EARPIECE && !this.f265054d.f265102u) {
                fo5.r0 r0Var2 = this.f265054d;
                if (!r0Var2.f265089h.f274464e) {
                    er4.x xVar = r0Var2.f265085d;
                    if (xVar != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "trigger Invited Delay Ringtone Ensure");
                        r0Var2.f265102u = true;
                        gp5.e eVar = r0Var2.f265089h;
                        java.lang.String name = xVar.getName();
                        kotlin.jvm.internal.o.f(name, "getName(...)");
                        er4.r rVar = r0Var2.f265083b;
                        er4.r rVar2 = er4.r.MP_ROOM_TYPE_VIDEO;
                        boolean z17 = rVar == rVar2;
                        er4.q qVar = r0Var2.f265084c;
                        er4.q qVar2 = er4.q.MP_ROOM_ROLE_CALLER;
                        boolean z18 = qVar == qVar2;
                        qo5.b bVar = qo5.b.f365663a;
                        eVar.a(name, z17, z18, qo5.b.f365666d, r0Var2.f265088g.a(rVar == rVar2, qVar == qVar2));
                        return;
                    }
                    return;
                }
            }
            if (this.f265054d.c().b() == er4.d.BLUETOOTH && this.f265054d.a()) {
                nq4.f fVar = nq4.f.f339014a;
                if (nq4.f.f339019f) {
                    return;
                }
                this.f265054d.s();
            }
        }
    }
}
