package ho1;

/* loaded from: classes5.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.o0 f282850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f282851g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282852h;

    public x0(ho1.a1 a1Var, long j17, com.tencent.wechat.aff.affroam.o0 o0Var, com.tencent.wechat.aff.affroam.n0 n0Var, java.lang.String str) {
        this.f282848d = a1Var;
        this.f282849e = j17;
        this.f282850f = o0Var;
        this.f282851g = n0Var;
        this.f282852h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        mv.h0 h0Var;
        java.lang.String str = this.f282848d.f282622a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyStatusChanged pkgId=");
        long j17 = this.f282849e;
        sb6.append(j17);
        sb6.append(", taskType=");
        com.tencent.wechat.aff.affroam.o0 o0Var = this.f282850f;
        sb6.append(o0Var);
        sb6.append(", taskState=");
        com.tencent.wechat.aff.affroam.n0 n0Var = this.f282851g;
        sb6.append(n0Var);
        sb6.append(", summary=");
        sb6.append(this.f282852h);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        mv.f0 f0Var = mv.f0.f331501d;
        switch (n0Var) {
            case AFFROAM_TASK_STATE_INITED:
            case AFFROAM_TASK_STATE_COMPLETED:
            case AFFROAM_TASK_STATE_STOPPED:
            case AFFROAM_TASK_STATE_QUIT:
                ((nv.v1) i95.n0.c(nv.v1.class)).Ri(j17);
                return;
            case AFFROAM_TASK_STATE_PREPARING:
                f0Var = mv.f0.f331503f;
                break;
            case AFFROAM_TASK_STATE_RUNNING:
                f0Var = mv.f0.f331504g;
                break;
            case AFFROAM_TASK_STATE_PAUSED:
                f0Var = mv.f0.f331502e;
                break;
            case AFFROAM_TASK_STATE_ERROR:
                f0Var = mv.f0.f331502e;
                break;
            case AFFROAM_TASK_STATE_IMPORTING:
                f0Var = mv.f0.f331505h;
                break;
            case AFFROAM_TASK_STATE_DELETING:
                f0Var = mv.f0.f331506i;
                break;
            case AFFROAM_TASK_STATE_CONNECTING:
                f0Var = mv.f0.f331503f;
                break;
        }
        mv.f0 f0Var2 = f0Var;
        nv.v1 v1Var = (nv.v1) i95.n0.c(nv.v1.class);
        long j18 = this.f282849e;
        mv.g0 g0Var = mv.h0.f331509e;
        int i17 = o0Var.f215937d;
        g0Var.getClass();
        java.util.Iterator it = ((kz5.h) mv.h0.f331514m).iterator();
        while (true) {
            if (it.hasNext()) {
                h0Var = it.next();
                if (((mv.h0) h0Var).f331515d == i17) {
                }
            } else {
                h0Var = 0;
            }
        }
        mv.h0 h0Var2 = h0Var;
        kotlin.jvm.internal.o.d(h0Var2);
        v1Var.Di(j18, h0Var2, f0Var2, this.f282852h);
    }
}
