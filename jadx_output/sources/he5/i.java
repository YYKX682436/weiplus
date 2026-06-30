package he5;

/* loaded from: classes9.dex */
public final class i implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final int f280936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f280937b;

    public i(int i17, int i18) {
        this.f280936a = i17;
        this.f280937b = i18;
    }

    @Override // he5.t
    public int a() {
        return this.f280937b;
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s sVar) {
        com.tencent.wechat.mm.brand_service.k c17;
        if (list == null) {
            return;
        }
        ((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).getClass();
        java.util.ArrayList<com.tencent.mm.storage.f9> arrayList = new java.util.ArrayList();
        com.tencent.wechat.mm.brand_service.g0 c18 = yw.a3.f466266a.c();
        java.util.LinkedList linkedList = (c18 == null || (c17 = c18.c(com.tencent.wcdb.core.Database.DictDefaultMatchValue, this.f280936a)) == null) ? null : c17.f218998d;
        if (linkedList != null) {
            for (int size = linkedList.size() - 1; -1 < size; size--) {
                ow.n nVar = ow.n.f349259a;
                java.lang.Object obj = linkedList.get(size);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                arrayList.add(nVar.b((com.tencent.wechat.mm.brand_service.j) obj));
            }
        }
        for (com.tencent.mm.storage.f9 f9Var : arrayList) {
            kotlin.jvm.internal.o.d(f9Var);
            list.add(f9Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBrandEcsTemplateMsgDataSource", "fillItem size:%d", java.lang.Integer.valueOf(list.size()));
        if (sVar != null) {
            ((hd5.f) sVar).a();
        }
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        if (oVar != null) {
            oVar.next();
        }
    }

    @Override // he5.t
    public void close() {
    }

    @Override // he5.t
    public long d() {
        return 0L;
    }
}
