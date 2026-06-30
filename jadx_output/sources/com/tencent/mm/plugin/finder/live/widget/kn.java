package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class kn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mn f118848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(com.tencent.mm.plugin.finder.live.widget.mn mnVar) {
        super(0);
        this.f118848d = mnVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.List list = ((mm2.o4) this.f118848d.f119085f.P0(mm2.o4.class)).f329318o;
        kotlin.jvm.internal.o.f(list, "<get-linkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((km2.q) obj).f309177h) {
                    arrayList.add(obj);
                }
            }
        }
        this.f118848d.f119097u.clear();
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f118848d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            km2.q qVar = (km2.q) it.next();
            java.lang.String str = qVar.f309172c;
            if (str != null) {
                mnVar.f119097u.put(str, qVar);
            }
        }
        com.tencent.mm.plugin.finder.live.widget.mn mnVar2 = this.f118848d;
        bm2.i4 i4Var = mnVar2.f119095s;
        java.util.List list2 = ((mm2.o4) mnVar2.f119085f.P0(mm2.o4.class)).f329319p;
        kotlin.jvm.internal.o.f(list2, "<get-recomApplylinkMicUserList>(...)");
        synchronized (list2) {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (((km2.q) obj2).f309177h) {
                    arrayList2.add(obj2);
                }
            }
        }
        i4Var.y(arrayList2);
        com.tencent.mm.plugin.finder.live.widget.mn mnVar3 = this.f118848d;
        bm2.i4 i4Var2 = mnVar3.f119095s;
        java.util.HashMap localApplyMicMap = mnVar3.f119097u;
        i4Var2.getClass();
        kotlin.jvm.internal.o.g(localApplyMicMap, "localApplyMicMap");
        i4Var2.f21973e = localApplyMicMap;
        com.tencent.mm.plugin.finder.live.widget.mn mnVar4 = this.f118848d;
        bm2.i4 i4Var3 = mnVar4.f119095s;
        java.util.List list3 = ((mm2.o4) mnVar4.f119085f.P0(mm2.o4.class)).f329324s;
        kotlin.jvm.internal.o.f(list3, "<get-anchorPkMicUserList>(...)");
        i4Var3.getClass();
        java.util.ArrayList arrayList3 = i4Var3.f21975g;
        arrayList3.clear();
        arrayList3.addAll(list3);
        this.f118848d.f119095s.notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
