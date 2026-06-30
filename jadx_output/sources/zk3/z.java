package zk3;

/* loaded from: classes8.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f473525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, zk3.g0 g0Var) {
        super(0);
        this.f473525d = multiTaskInfo;
        this.f473526e = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f473525d;
        if (multiTaskInfo != null) {
            zk3.g0 g0Var = this.f473526e;
            g0Var.f473452g.add(0, new uk3.a(multiTaskInfo));
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = g0Var.f473462t;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemInserted(wxRecyclerAdapter.a0());
            }
            java.util.ArrayList arrayList = g0Var.f473452g;
            if (arrayList.size() == 1) {
                g0Var.d7(((uk3.a) arrayList.get(0)).f428524d, false, false);
            } else {
                g0Var.d7(null, true, false);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = g0Var.f473454i;
            if (wxRecyclerView != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(wxRecyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$onMultiTaskChange$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                wxRecyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$onMultiTaskChange$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
            g0Var.X6();
            try {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitask_max_item_num, 100);
                if (arrayList.size() > Ni) {
                    int size = arrayList.size();
                    for (int i17 = Ni; i17 < size; i17++) {
                        java.lang.Object obj = arrayList.get(i17);
                        kotlin.jvm.internal.o.f(obj, "get(...)");
                        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.i1.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = ((uk3.a) obj).f428524d;
                        com.tencent.mm.plugin.multitask.j0.We((com.tencent.mm.plugin.multitask.j0) c17, multiTaskInfo2.field_id, multiTaskInfo2.field_type, false, 4, null);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "INSERT, maxNum: " + Ni + ", curSize: " + arrayList.size());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "remove last multitask info error: %s", e17.getMessage());
            }
        }
        return jz5.f0.f302826a;
    }
}
