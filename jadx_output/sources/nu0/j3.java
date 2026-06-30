package nu0;

/* loaded from: classes5.dex */
public final class j3 implements com.tencent.maas.imagestudio.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f339990b;

    public j3(nu0.b4 b4Var, int i17) {
        this.f339989a = b4Var;
        this.f339990b = i17;
    }

    @Override // com.tencent.maas.imagestudio.h
    public final void a(java.lang.String str) {
        qg.a aVar;
        boolean z17 = str == null || str.length() == 0;
        int i17 = this.f339990b;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("ImageComp.MainComposingUIC", "[removeScene] position:" + i17 + " err:" + str);
            return;
        }
        nu0.b4 b4Var = this.f339989a;
        ju0.b bVar = b4Var.K;
        java.util.List list = bVar.f250921d;
        kotlin.jvm.internal.o.f(list, "getItems(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            aVar = qg.a.Unknown;
            if (!hasNext) {
                break;
            }
            java.lang.Object next = it.next();
            if (((ku0.a) next).f312060a.f475661a.getIdentifierType() != aVar) {
                arrayList.add(next);
            }
        }
        java.util.List V0 = kz5.n0.V0(arrayList);
        if (i17 >= 0) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
            if (i17 < arrayList2.size()) {
                arrayList2.remove(i17);
                if (arrayList2.size() < b4Var.n7()) {
                    arrayList2.add(new ku0.a(new zu0.a(new com.tencent.maas.instamovie.base.asset.MJAssetInfo(aVar, "", qg.c.Unknown), 0, 0), false, 2, null));
                }
                bVar.f301680g = b4Var.U6().a7();
                bVar.E(V0);
                java.util.ArrayList arrayList3 = b4Var.f339887w;
                if (i17 < arrayList3.size()) {
                    arrayList3.remove(i17);
                }
                b4Var.V6().o7();
            }
        }
    }
}
