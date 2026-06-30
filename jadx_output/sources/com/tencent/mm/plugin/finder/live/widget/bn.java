package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class bn extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mn f117911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(com.tencent.mm.plugin.finder.live.widget.mn mnVar) {
        super(2);
        this.f117911d = mnVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        java.util.ArrayList arrayList;
        java.lang.Object obj4;
        int intValue = ((java.lang.Number) obj).intValue();
        r45.mu2 searchInfo = (r45.mu2) obj2;
        kotlin.jvm.internal.o.g(searchInfo, "searchInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invite search panel item click, nickname:");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) searchInfo.getCustom(0);
        jz5.f0 f0Var = null;
        sb6.append(finderContact != null ? finderContact.getNickname() : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", sb6.toString());
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) searchInfo.getCustom(0);
        if (finderContact2 != null) {
            com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f117911d;
            java.lang.String username = finderContact2.getUsername();
            java.util.List list = ((mm2.o4) mnVar.f119085f.P0(mm2.o4.class)).f329324s;
            kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj3).f309172c, username)) {
                        break;
                    }
                }
            }
            if (obj3 != null) {
                qo0.c cVar = mnVar.f119084e;
                qo0.b bVar = qo0.b.M3;
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.String username2 = finderContact2.getUsername();
                if (username2 == null) {
                    username2 = "";
                }
                bundle.putString("PARAM_FINDER_LIVE_MIC_USER_NAME", username2);
                cVar.statusChange(bVar, bundle);
            } else if (((mm2.y2) mnVar.f119085f.P0(mm2.y2.class)).N6(true, 1, false)) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                mnVar.a();
                mnVar.f119085f.C1();
                km2.q qVar = (km2.q) mnVar.f119097u.get(finderContact2.getUsername());
                if (qVar != null) {
                    qVar.f309181l = 6;
                    r45.xn1 xn1Var = qVar.f309187r;
                    if (xn1Var != null) {
                        android.os.Bundle bundle3 = new android.os.Bundle();
                        bundle3.putByteArray("PARAM_FINDER_LIVE_BYTES_DATA", xn1Var.toByteArray());
                        mnVar.f119084e.statusChange(qo0.b.Y3, bundle3);
                    } else {
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "invite search panel item click, accept pk, but selectUser.contact is null.");
                    }
                    mnVar.f119095s.notifyDataSetChanged();
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "invite search panel item click, accept pk.");
                } else {
                    java.util.List list2 = ((mm2.o4) mnVar.f119085f.P0(mm2.o4.class)).f329319p;
                    if (list2 != null) {
                        synchronized (list2) {
                            java.util.Iterator it6 = list2.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = it6.next();
                                if (kotlin.jvm.internal.o.b(((km2.q) obj4).f309172c, finderContact2.getUsername())) {
                                    break;
                                }
                            }
                        }
                        km2.q qVar2 = (km2.q) obj4;
                        if (qVar2 != null) {
                            if (qVar2.m()) {
                                qVar2.f309181l = 6;
                                qo0.c cVar2 = mnVar.f119084e;
                                qo0.b bVar2 = qo0.b.M3;
                                android.os.Bundle bundle4 = new android.os.Bundle();
                                java.lang.String username3 = finderContact2.getUsername();
                                if (username3 == null) {
                                    username3 = "";
                                }
                                bundle4.putString("PARAM_FINDER_LIVE_MIC_USER_NAME", username3);
                                cVar2.statusChange(bVar2, bundle4);
                            } else {
                                r45.xn1 xn1Var2 = new r45.xn1();
                                xn1Var2.set(0, finderContact2);
                                qVar2.f309181l = 6;
                                com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "invite search panel item click, apply pk.");
                                fj2.s.f263183a.d(ml2.q2.f327839x1, mnVar.B, new hi2.a(xn1Var2));
                                bundle2.putByteArray("PARAM_FINDER_LIVE_BYTES_DATA", xn1Var2.toByteArray());
                                bundle2.putInt("PARAM_FINDER_LIVE_ANCHOR_APPLY_SCENE", 3);
                                mnVar.f119084e.statusChange(qo0.b.X3, bundle2);
                            }
                            mnVar.f119095s.notifyDataSetChanged();
                            f0Var = jz5.f0.f302826a;
                        }
                    }
                    if (f0Var == null) {
                        java.util.List list3 = ((mm2.o4) mnVar.f119085f.P0(mm2.o4.class)).f329319p;
                        if (list3 != null) {
                            java.lang.String headUrl = finderContact2.getHeadUrl();
                            java.lang.String username4 = finderContact2.getUsername();
                            java.lang.String nickname = finderContact2.getNickname();
                            com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo = finderContact2.getAuthInfo();
                            java.lang.String signature = finderContact2.getSignature();
                            r45.xn1 xn1Var3 = new r45.xn1();
                            xn1Var3.set(0, finderContact2);
                            km2.q qVar3 = new km2.q("", headUrl, username4, nickname, 2, "", null, true, 0, authInfo, signature, 0, 0, false, "", false, 0L, xn1Var3, false, null, null, 0, 0, 0L, null, null, 0L, null, 0, 0L, null, null, null, -149504, 1, null);
                            qVar3.f309181l = 6;
                            list3.add(qVar3);
                        }
                        bm2.i4 i4Var = mnVar.f119095s;
                        java.util.List list4 = ((mm2.o4) mnVar.f119085f.P0(mm2.o4.class)).f329319p;
                        kotlin.jvm.internal.o.f(list4, "<get-recomApplylinkMicUserList>(...)");
                        synchronized (list4) {
                            arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj5 : list4) {
                                if (((km2.q) obj5).f309177h) {
                                    arrayList.add(obj5);
                                }
                            }
                        }
                        i4Var.y(arrayList);
                        r45.xn1 xn1Var4 = new r45.xn1();
                        xn1Var4.set(0, finderContact2);
                        mnVar.f119095s.notifyDataSetChanged();
                        fj2.s.f263183a.d(ml2.q2.f327839x1, mnVar.B, new hi2.a(xn1Var4));
                        bundle2.putByteArray("PARAM_FINDER_LIVE_BYTES_DATA", xn1Var4.toByteArray());
                        bundle2.putInt("PARAM_FINDER_LIVE_ANCHOR_APPLY_SCENE", 3);
                        mnVar.f119084e.statusChange(qo0.b.X3, bundle2);
                    }
                }
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f327830q, finderContact2.getUsername(), -1, -1);
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "onInviteAnchor click invalid pos: " + intValue + ", applyNick: " + finderContact2.getNickname());
            }
        }
        return jz5.f0.f302826a;
    }
}
