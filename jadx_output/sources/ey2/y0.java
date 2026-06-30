package ey2;

/* loaded from: classes2.dex */
public final class y0 implements db2.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ey2.b1 f257580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.oq2 f257581c;

    public y0(int i17, ey2.b1 b1Var, r45.oq2 oq2Var) {
        this.f257579a = i17;
        this.f257580b = b1Var;
        this.f257581c = oq2Var;
    }

    @Override // db2.z2
    public void onCgiBack(int i17, int i18, java.lang.String str, db2.c3 resp, java.util.List interceptors) {
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(interceptors, "interceptors");
        ey2.b1 b1Var = this.f257580b;
        if (i17 != 0 || i18 != 0) {
            if (ey2.b1.f257325f.contains(java.lang.Integer.valueOf(i18))) {
                r45.oq2 Q6 = b1Var.Q6();
                Q6.set(0, java.lang.Integer.valueOf(c01.id.e()));
                int integer = this.f257581c.getInteger(1) * 2;
                if (integer < 300) {
                    integer = 300;
                }
                if (integer > 3600) {
                    integer = 3600;
                }
                Q6.set(1, java.lang.Integer.valueOf(integer));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LOCALBACKUP_PREFETCH_DISASTER_INFO_STRING, com.tencent.mm.sdk.platformtools.t8.l(Q6.toByteArray()));
                return;
            }
            return;
        }
        if (resp.getList(1).isEmpty()) {
            return;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LOCALBACKUP_PREFETCH_DISASTER_INFO_STRING, "");
        cu2.t tVar = cu2.u.f222441a;
        java.util.LinkedList list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
            kotlin.jvm.internal.o.d(finderObject);
            if (hc2.o0.C(finderObject)) {
                arrayList.add(obj);
            }
        }
        int i19 = this.f257579a;
        java.util.List j17 = tVar.j(arrayList, hc2.d0.d(i19), null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it = j17.iterator();
        while (it.hasNext()) {
            arrayList2.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it6.next()).getFeedObject();
            int e17 = c01.id.e();
            feedObject.m131setUnreadExpiredTimeVKZWuLQ(e17 + (((r45.fx2) resp.getCustom(17)) != null ? r3.getInteger(34) : 259200));
        }
        b1Var.R6(linkedList, hc2.d0.b(i19), 1);
    }
}
