package mh2;

/* loaded from: classes10.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f326492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f326493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jh2.c f326494f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(mh2.f1 f1Var, java.util.List list, int i17, jh2.c cVar) {
        super(0);
        this.f326492d = f1Var;
        this.f326493e = list;
        this.f326494f = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mh2.f1 f1Var = this.f326492d;
        java.lang.String str = f1Var.f326330e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on bind with grove ");
        java.util.List list = this.f326493e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((jh2.b) it.next()).toString());
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView ktvRenderLayoutView = (com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView) f1Var.f326331f;
        ktvRenderLayoutView.getClass();
        oh2.r rVar = ktvRenderLayoutView.f111676h;
        rVar.getClass();
        list.size();
        rVar.f345421l = 0;
        rVar.f345411b.clear();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) rVar.f345416g;
        arrayList2.clear();
        arrayList2.addAll(list);
        f1Var.f326342q = true;
        this.f326494f.j();
        return jz5.f0.f302826a;
    }
}
