package ho1;

/* loaded from: classes15.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282771f;

    public o(java.lang.String str, ho1.v vVar, long j17) {
        this.f282769d = str;
        this.f282770e = vVar;
        this.f282771f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17 = this.f282771f;
        ho1.v vVar = this.f282770e;
        java.lang.String str = this.f282769d;
        if (str == null) {
            com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
            if (t0Var != null) {
                t0Var.h0(j17, -1, com.tencent.wechat.aff.affroam.a0.f215774m);
                return;
            }
            return;
        }
        ro1.g gVar = vVar.f282831c;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mUDiskChannel");
            throw null;
        }
        com.tencent.wechat.aff.affroam.a0 d17 = gVar.d(str);
        if (d17 == null) {
            com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
            if (t0Var2 != null) {
                t0Var2.h0(j17, -2, com.tencent.wechat.aff.affroam.a0.f215774m);
                return;
            }
            return;
        }
        com.tencent.wechat.aff.affroam.t0 t0Var3 = vVar.f282836h;
        if (t0Var3 != null) {
            t0Var3.h0(j17, 0, d17);
        }
    }
}
