package zk3;

/* loaded from: classes8.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f473477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f473478g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zk3.g0 g0Var, java.lang.String str, int i17, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        super(0);
        this.f473475d = g0Var;
        this.f473476e = str;
        this.f473477f = i17;
        this.f473478g = multiTaskInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zk3.h hVar;
        zk3.g0 g0Var = this.f473475d;
        java.lang.String str = this.f473476e;
        int i17 = this.f473477f;
        int a76 = g0Var.a7(str, i17);
        java.util.ArrayList arrayList = g0Var.f473452g;
        if (a76 >= 0) {
            arrayList.remove(a76);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = g0Var.f473462t;
            int a07 = (wxRecyclerAdapter != null ? wxRecyclerAdapter.a0() : 1) + a76;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = g0Var.f473462t;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.notifyItemRemoved(a07);
            }
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = null;
            int i18 = 0;
            if (arrayList.size() == 1) {
                g0Var.d7(((uk3.a) arrayList.get(0)).f428524d, false, false);
            } else {
                g0Var.d7(null, true, false);
            }
            g0Var.X6();
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = this.f473478g;
            if (multiTaskInfo2 == null) {
                if (str != null) {
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        uk3.a aVar = (uk3.a) next;
                        if (kotlin.jvm.internal.o.b(aVar.f428524d.field_id, str)) {
                            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo3 = aVar.f428524d;
                            if (multiTaskInfo3.field_type == i17) {
                                multiTaskInfo = multiTaskInfo3;
                                break;
                            }
                        }
                        i18 = i19;
                    }
                }
                multiTaskInfo2 = multiTaskInfo;
            }
            if (multiTaskInfo2 != null && (hVar = g0Var.f473459q) != null) {
                yk3.i iVar = (yk3.i) hVar;
                pk3.h c17 = iVar.c(multiTaskInfo2);
                if (c17 != null) {
                    c17.Q6(multiTaskInfo2, a76);
                }
                java.lang.String field_id = multiTaskInfo2.field_id;
                kotlin.jvm.internal.o.f(field_id, "field_id");
                iVar.g(field_id);
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "onGridItemDelete, id:%s", multiTaskInfo2.field_id);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "DELETE, curSize: " + arrayList.size());
        return jz5.f0.f302826a;
    }
}
