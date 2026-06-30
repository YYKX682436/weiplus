package z11;

/* loaded from: classes12.dex */
public class c implements w11.u {

    /* renamed from: d, reason: collision with root package name */
    public final w11.d2 f469273d;

    /* renamed from: e, reason: collision with root package name */
    public final int f469274e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.ew4 f469275f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.cx4 f469276g;

    public c(w11.d2 d2Var, o45.yh yhVar, int i17, r45.cx4 cx4Var) {
        this.f469273d = d2Var;
        this.f469275f = yhVar == null ? null : yhVar.f343039a;
        this.f469276g = cx4Var;
        this.f469274e = i17;
    }

    @Override // w11.u
    public boolean t(java.util.Queue queue) {
        r45.ew4 ew4Var = this.f469275f;
        if (ew4Var == null) {
            jx3.f.INSTANCE.idkeyStat(99L, 40L, 1L, false);
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncService", "%s run resp == null", this);
            return false;
        }
        if (10018 == x51.o1.f452064q) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncService", "%s Give up for test", this);
            return false;
        }
        r45.jj6 jj6Var = new r45.jj6();
        jj6Var.f377890n = 1;
        jj6Var.f377884e = true;
        jj6Var.f377883d = ew4Var;
        jj6Var.f377891o = this.f469274e;
        r45.cx4 cx4Var = this.f469276g;
        jj6Var.f377892p = cx4Var.f371899e;
        jj6Var.f377893q = cx4Var;
        w11.d2 d2Var = this.f469273d;
        d2Var.f442006h.b(jj6Var, this);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: z11.c$$a
            @Override // java.lang.Runnable
            public final void run() {
                z11.c cVar = z11.c.this;
                r45.ew4 ew4Var2 = cVar.f469275f;
                com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "%s onFinishCmd ContinueFlag[%s]", cVar, java.lang.Integer.valueOf(ew4Var2.f373760f));
                gm0.j1.u().c().w(8196, java.lang.Long.valueOf(ew4Var2.f373760f));
                if ((ew4Var2.f373760f & 256) != 0) {
                    com.tencent.mm.autogen.events.SnsSyncEvent snsSyncEvent = new com.tencent.mm.autogen.events.SnsSyncEvent();
                    snsSyncEvent.f54843g.f8611a = 2;
                    snsSyncEvent.e();
                    jx3.f.INSTANCE.idkeyStat(99L, 22L, 1L, false);
                }
            }
        };
        x51.q1 q1Var = d2Var.f441999a;
        q1Var.getClass();
        q1Var.a(runnable, 100L, true);
        jx3.f.INSTANCE.idkeyStat(99L, 21L, 1L, false);
        return true;
    }

    public java.lang.String toString() {
        return "NotifyData[" + hashCode() + "]";
    }
}
