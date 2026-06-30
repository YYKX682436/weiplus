package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class op implements ek2.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pp f119311a;

    public op(com.tencent.mm.plugin.finder.live.widget.pp ppVar) {
        this.f119311a = ppVar;
    }

    @Override // ek2.n0
    public void a(int i17, int i18, java.lang.String str, r45.o71 resp) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderLiveMicRecommAnchorsCardPanelWidget", "doGetMicCandidateList resp.contacts:" + resp.getList(1).size());
        this.f119311a.f119401g.clear();
        if (resp.getList(1) != null) {
            java.util.ArrayList arrayList = this.f119311a.f119401g;
            java.util.LinkedList list = resp.getList(1);
            kotlin.jvm.internal.o.f(list, "getContacts(...)");
            com.tencent.mm.plugin.finder.live.widget.pp ppVar = this.f119311a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (true) {
                java.lang.Object obj3 = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.xn1 xn1Var = (r45.xn1) next;
                java.util.List list2 = ((mm2.o4) ppVar.f119395a.a(mm2.o4.class)).f329324s;
                kotlin.jvm.internal.o.f(list2, "<get-anchorPkMicUserList>(...)");
                synchronized (list2) {
                    java.util.Iterator it6 = list2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next2 = it6.next();
                        java.lang.String str2 = ((km2.q) next2).f309172c;
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                        if (kotlin.jvm.internal.o.b(str2, finderContact != null ? finderContact.getUsername() : null)) {
                            obj3 = next2;
                            break;
                        }
                    }
                }
                if (obj3 == null) {
                    arrayList2.add(next);
                }
            }
            com.tencent.mm.plugin.finder.live.widget.pp ppVar2 = this.f119311a;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj4 : arrayList2) {
                r45.xn1 xn1Var2 = (r45.xn1) obj4;
                java.util.List list3 = ((mm2.o4) ppVar2.f119395a.a(mm2.o4.class)).f329318o;
                kotlin.jvm.internal.o.f(list3, "<get-linkMicUserList>(...)");
                synchronized (list3) {
                    java.util.Iterator it7 = list3.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it7.next();
                        java.lang.String str3 = ((km2.q) obj2).f309172c;
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                        if (kotlin.jvm.internal.o.b(str3, finderContact2 != null ? finderContact2.getUsername() : null)) {
                            break;
                        }
                    }
                }
                if (obj2 == null) {
                    arrayList3.add(obj4);
                }
            }
            com.tencent.mm.plugin.finder.live.widget.pp ppVar3 = this.f119311a;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj5 : arrayList3) {
                r45.xn1 xn1Var3 = (r45.xn1) obj5;
                java.util.List list4 = ((mm2.o4) ppVar3.f119395a.a(mm2.o4.class)).f329319p;
                kotlin.jvm.internal.o.f(list4, "<get-recomApplylinkMicUserList>(...)");
                synchronized (list4) {
                    java.util.Iterator it8 = list4.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it8.next();
                        java.lang.String str4 = ((km2.q) obj).f309172c;
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0);
                        if (kotlin.jvm.internal.o.b(str4, finderContact3 != null ? finderContact3.getUsername() : null)) {
                            break;
                        }
                    }
                }
                if (!(((km2.q) obj) != null ? r7.m() : false)) {
                    arrayList4.add(obj5);
                }
            }
            arrayList.addAll(arrayList4);
            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.np(this.f119311a));
        }
    }
}
