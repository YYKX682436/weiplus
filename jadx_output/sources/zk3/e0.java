package zk3;

/* loaded from: classes8.dex */
public final class e0 implements kk3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473440a;

    public e0(zk3.g0 g0Var) {
        this.f473440a = g0Var;
    }

    @Override // kk3.b
    public final void a(java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "refreshData, info.size: " + list.size());
        pm0.v.X(new zk3.d0(list, this.f473440a));
    }
}
