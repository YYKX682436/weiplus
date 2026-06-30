package ho1;

/* loaded from: classes15.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282796e;

    public r(ho1.v vVar, long j17) {
        this.f282795d = vVar;
        this.f282796e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho1.v vVar = this.f282795d;
        vVar.f282833e = null;
        ro1.g gVar = vVar.f282831c;
        long j17 = this.f282796e;
        if (gVar != null) {
            if (gVar == null) {
                kotlin.jvm.internal.o.o("mUDiskChannel");
                throw null;
            }
            if (gVar.uninit()) {
                com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
                if (t0Var != null) {
                    t0Var.P(j17, 0);
                    return;
                }
                return;
            }
        }
        com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
        if (t0Var2 != null) {
            t0Var2.P(j17, -1);
        }
    }
}
