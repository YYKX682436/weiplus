package zk3;

/* loaded from: classes8.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f473433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, zk3.g0 g0Var) {
        super(0);
        this.f473433d = multiTaskInfo;
        this.f473434e = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f473433d;
        if (multiTaskInfo != null) {
            java.lang.String str = multiTaskInfo.field_id;
            int i17 = multiTaskInfo.field_type;
            zk3.g0 g0Var = this.f473434e;
            int a76 = g0Var.a7(str, i17);
            if (a76 >= 0) {
                g0Var.f473452g.set(a76, new uk3.a(multiTaskInfo));
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = g0Var.f473462t;
                int a07 = a76 + (wxRecyclerAdapter != null ? wxRecyclerAdapter.a0() : 1);
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = g0Var.f473462t;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.notifyItemChanged(a07);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
