package ho1;

/* loaded from: classes15.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f282758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282759f;

    public n(ho1.v vVar, java.util.ArrayList arrayList, long j17) {
        this.f282757d = vVar;
        this.f282758e = arrayList;
        this.f282759f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho1.v vVar = this.f282757d;
        ro1.g gVar = vVar.f282831c;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mUDiskChannel");
            throw null;
        }
        java.util.ArrayList l17 = gVar.l(this.f282758e);
        boolean isEmpty = l17.isEmpty();
        long j17 = this.f282759f;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.e(vVar.f282829a, "Get dir sizes failed!");
            com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
            if (t0Var != null) {
                t0Var.t0(j17, -2, new java.util.ArrayList());
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "Get dir sizes count: " + l17.size());
        com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
        if (t0Var2 != null) {
            t0Var2.t0(j17, 0, l17);
        }
    }
}
