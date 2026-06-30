package jk3;

/* loaded from: classes8.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk3.v f300108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.w60 f300109e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(jk3.v vVar, r45.w60 w60Var) {
        super(0);
        this.f300108d = vVar;
        this.f300109e = w60Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("auto hideUIC, id:");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300108d.f300077a;
        sb6.append(multiTaskInfo != null ? multiTaskInfo.field_id : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", sb6.toString());
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        r45.w60 w60Var = this.f300109e;
        if (w60Var == null || (str = w60Var.getString(3)) == null) {
            str = "";
        }
        ((com.tencent.mm.plugin.multitask.p1) l0Var).Vi(0, "MultiTaskForSnapshotMinusScreen", 1048576, str);
        return jz5.f0.f302826a;
    }
}
