package e21;

/* loaded from: classes11.dex */
public class i0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f246529d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f246530e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e21.l0 f246531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f246532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f246533h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f246534i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e21.l0 f246535m;

    public i0(e21.l0 l0Var, java.util.List list, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, e21.l0 l0Var2) {
        this.f246531f = l0Var;
        this.f246532g = list;
        this.f246533h = linkedList;
        this.f246534i = linkedList2;
        this.f246535m = l0Var2;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.util.List list = this.f246532g;
        int size = list.size();
        java.util.LinkedList linkedList = this.f246533h;
        int size2 = linkedList.size();
        int i17 = size < size2 ? size : size2;
        if (size != size2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OplogService", "summeroplog oplogSize[%d] not equal to resultSize[%d]! now size[%d] respIndex[%d]", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f246529d));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "RespHandler onTimerExpired respIndex:%d, successCount:%d, size:%d", java.lang.Integer.valueOf(this.f246529d), java.lang.Integer.valueOf(this.f246530e), java.lang.Integer.valueOf(i17));
        int i18 = this.f246529d;
        int i19 = 0;
        e21.l0 l0Var = this.f246531f;
        if (i18 >= i17) {
            l0Var.f246541d = false;
            if (this.f246530e > 0) {
                com.tencent.mm.sdk.platformtools.b4 b4Var = l0Var.f246549o;
                long j17 = ((lt0.f) l0Var.f246542e).size() > 0 ? 500L : 0L;
                b4Var.c(j17, j17);
            }
            return false;
        }
        int i27 = i18 + 20;
        if (i27 <= i17) {
            i17 = i27;
        }
        while (true) {
            int i28 = this.f246529d;
            if (i28 >= i17) {
                break;
            }
            int intValue = ((java.lang.Integer) linkedList.get(i28)).intValue();
            xg3.q0 q0Var = (xg3.q0) list.get(this.f246529d);
            int i29 = this.f246529d;
            java.util.LinkedList linkedList2 = this.f246534i;
            r45.g25 g25Var = i29 < linkedList2.size() ? (r45.g25) linkedList2.get(this.f246529d) : null;
            int i37 = q0Var.f454423b;
            com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "resp op:%s, result:%d, mapRecentDown: %d", e21.e0.f246510d.a(q0Var), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(((lt0.f) l0Var.f246542e).size()));
            com.tencent.mm.sdk.platformtools.u3.h(new e21.h0(this, q0Var, intValue, g25Var));
            if (intValue == 0 || intValue == -3400) {
                this.f246530e++;
                arrayList.add(q0Var);
                ((lt0.f) l0Var.f246542e).remove(java.lang.Integer.valueOf(i37));
            } else if (intValue == -433) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OplogService", "oplog not yet process, id:%d, cmd:%d", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(q0Var.b()));
            } else {
                java.lang.Integer num = (java.lang.Integer) ((lt0.f) l0Var.f246542e).i(java.lang.Integer.valueOf(i37));
                com.tencent.mars.xlog.Log.w("MicroMsg.OplogService", "summeroplog id:%d, inserttime:%d, mapCnt:%s", java.lang.Integer.valueOf(i37), java.lang.Long.valueOf(q0Var.f454424c), num);
                if (num == null) {
                    ((lt0.f) l0Var.f246542e).j(java.lang.Integer.valueOf(i37), 1);
                } else if (num.intValue() < 2) {
                    ((lt0.f) l0Var.f246542e).j(java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(num.intValue() + 1));
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.OplogService", "summeroplog LRUMap Max now id:%d, inserttime:%d", java.lang.Integer.valueOf(i37), java.lang.Long.valueOf(q0Var.f454424c));
                    arrayList.add(q0Var);
                }
            }
            l0Var.f246547m.a(q0Var, intValue);
            this.f246529d++;
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            gm0.j1.i();
            long F = gm0.j1.u().f273153f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            while (i19 < size3) {
                xg3.q0 q0Var2 = (xg3.q0) arrayList.get(i19);
                int count = l0Var.b().getCount();
                int m07 = l0Var.b().m0(q0Var2);
                l0Var.f246547m.b(q0Var2, (java.lang.Integer) ((lt0.f) l0Var.f246542e).get(java.lang.Integer.valueOf(q0Var2.f454423b)), count);
                ((lt0.f) l0Var.f246542e).remove(java.lang.Integer.valueOf(q0Var2.f454423b));
                i19++;
                com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "delete oplog %d/%d id:%d, cmd:%d, res:%s opt", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(size3), java.lang.Integer.valueOf(q0Var2.f454423b), java.lang.Integer.valueOf(q0Var2.b()), java.lang.Integer.valueOf(m07));
            }
            gm0.j1.i();
            gm0.j1.u().f273153f.w(java.lang.Long.valueOf(F));
        }
        return true;
    }

    public java.lang.String toString() {
        return super.toString() + "|RespHandler";
    }
}
