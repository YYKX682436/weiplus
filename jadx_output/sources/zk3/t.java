package zk3;

/* loaded from: classes8.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f473502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f473503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f473504g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f473505h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zk3.g0 g0Var, java.util.List list, boolean z17, boolean z18, boolean z19) {
        super(0);
        this.f473501d = g0Var;
        this.f473502e = list;
        this.f473503f = z17;
        this.f473504g = z18;
        this.f473505h = z19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        androidx.recyclerview.widget.y2 recycledViewPool;
        this.f473501d.f473452g.clear();
        java.util.List<com.tencent.mm.plugin.multitask.model.MultiTaskInfo> list = this.f473502e;
        if (list != null) {
            zk3.g0 g0Var = this.f473501d;
            for (com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo : list) {
                if (multiTaskInfo.field_type != -1) {
                    g0Var.f473452g.add(new uk3.a(multiTaskInfo));
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "unknown type, info: " + multiTaskInfo.toJSON());
                }
            }
        }
        boolean z17 = true;
        this.f473501d.f473451f = true;
        if (this.f473503f) {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f473501d.f473454i;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.removeAllViewsInLayout();
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f473501d.f473454i;
            if (wxRecyclerView3 != null && (recycledViewPool = wxRecyclerView3.getRecycledViewPool()) != null) {
                recycledViewPool.a();
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f473501d.f473462t;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.f213717v.clear();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "clear Pool and RemoveAllViews");
            if (this.f473502e != null) {
                ((d73.i) i95.n0.c(d73.i.class)).wd(this.f473502e);
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f473501d.f473462t;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
        if (this.f473504g) {
            this.f473501d.X6();
            if (this.f473501d.f473452g.size() == 1) {
                zk3.g0 g0Var2 = this.f473501d;
                g0Var2.d7(((uk3.a) g0Var2.f473452g.get(0)).f428524d, true, false);
            } else {
                this.f473501d.d7(null, true, false);
            }
        }
        if (this.f473505h && (wxRecyclerView = this.f473501d.f473454i) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initDataUI$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
            wxRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initDataUI$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        java.util.List list2 = this.f473502e;
        if (list2 != null && !list2.isEmpty()) {
            z17 = false;
        }
        if (z17 && ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).Di()) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.i1.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.multitask.j0.Ff((com.tencent.mm.plugin.multitask.j0) c17, 6, null, 0, 6, null);
        }
        return jz5.f0.f302826a;
    }
}
