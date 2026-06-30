package eb2;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f250863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eb2.b0 f250864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f250865f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f250866g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f250867h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ db2.u3 f250868i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.util.List list, eb2.b0 b0Var, int i17, boolean z17, boolean z18, db2.u3 u3Var) {
        super(5);
        this.f250863d = list;
        this.f250864e = b0Var;
        this.f250865f = i17;
        this.f250866g = z17;
        this.f250867h = z18;
        this.f250868i = u3Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.util.List list;
        java.util.ArrayList arrayList;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        r45.v61 v61Var = (r45.v61) obj4;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC, "headWording");
        if (m17 instanceof java.lang.String) {
        }
        java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC, "endWording");
        if (m18 instanceof java.lang.String) {
        }
        java.util.List list2 = this.f250863d;
        int i17 = this.f250865f;
        eb2.b0 b0Var = this.f250864e;
        if (intValue == 0 && intValue2 == 0) {
            jx3.f.INSTANCE.idkeyStat(1279L, 3L, 1L, false);
            java.util.LinkedList list3 = v61Var != null ? v61Var.getList(1) : null;
            kotlin.jvm.internal.o.d(list3);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (list2 != null) {
                linkedList.addAll(list2);
            }
            linkedList.addAll(list3);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj6 : linkedList) {
                if (hc2.o0.C((com.tencent.mm.protocal.protobuf.FinderObject) obj6)) {
                    arrayList2.add(obj6);
                }
            }
            cu2.t tVar = cu2.u.f222441a;
            list = tVar.j(arrayList2, hc2.d0.d(b0Var.f250715g), b0Var.f250716h);
            if (i17 != 2) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    arrayList3.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
                }
                tVar.m(arrayList3, hc2.d0.d(b0Var.f250715g), "", this.f250866g);
            }
        } else {
            jx3.f.INSTANCE.idkeyStat(1279L, 4L, 1L, false);
            list = null;
        }
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it6.next()));
            }
        } else {
            arrayList = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getHistory] tabType=");
        sb6.append(b0Var.f250715g);
        sb6.append(" list ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(",isFirstPage=");
        sb6.append(this.f250867h);
        sb6.append(" extraList=");
        sb6.append(list2 != null ? java.lang.Integer.valueOf(list2.size()) : null);
        sb6.append(" pullType=");
        sb6.append(i17);
        sb6.append(" continue_flag=");
        sb6.append(v61Var != null ? java.lang.Integer.valueOf(v61Var.getInteger(3)) : null);
        sb6.append(" errType=");
        sb6.append(intValue);
        sb6.append(" errCode=");
        sb6.append(intValue2);
        com.tencent.mars.xlog.Log.i("Finder.FinderLbsFeedFetcher", sb6.toString());
        com.tencent.mm.plugin.finder.feed.model.d dVar = new com.tencent.mm.plugin.finder.feed.model.d(arrayList, intValue, intValue2, str);
        dVar.f107776n = v61Var != null ? v61Var.getByteString(2) : null;
        if (intValue == 0 && intValue2 == 0) {
            dVar.f107770h = v61Var != null ? v61Var.getInteger(3) : 1;
        } else {
            dVar.f107770h = 1;
        }
        this.f250868i.a(dVar, i17);
        return jz5.f0.f302826a;
    }
}
