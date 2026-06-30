package dr0;

/* loaded from: classes12.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.t2 f242536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f242537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f242538f;

    public s2(dr0.t2 t2Var, boolean z17, java.util.List list) {
        this.f242536d = t2Var;
        this.f242537e = z17;
        this.f242538f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.t2 t2Var = this.f242536d;
        if (t2Var.a()) {
            dr0.a3.c(dr0.a3.f242403d.a());
            t2Var.c();
            dr0.x0.f242571a.b("recycle-" + t2Var.f242552a, "abort", "4");
            return;
        }
        boolean z17 = this.f242537e;
        boolean z18 = !z17;
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "ipc postCheckAlive: " + z18);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, new com.tencent.mm.ipcinvoker.type.IPCBoolean(z18), dr0.d1.class, new dr0.r2(t2Var, this.f242538f, z17));
    }
}
