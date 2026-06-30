package ek2;

/* loaded from: classes3.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ek2.k3 f253492a = new ek2.k3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f253493b = ((ku5.t0) ku5.t0.f312615d).p("Finder.LiveGiftListResultProcessor");

    /* JADX WARN: Removed duplicated region for block: B:165:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ek2.k3 r17, r45.d81 r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 1605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ek2.k3.a(ek2.k3, r45.d81, int, int, int):void");
    }

    public final java.lang.String b(dm.o4 gift) {
        kotlin.jvm.internal.o.g(gift, "gift");
        return "localGift : [id:" + gift.field_rewardProductId + ", businessType:" + gift.field_businessType + ", thumbnailFileUrl:" + gift.field_thumbnailFileUrl + ", previewUrl:" + gift.field_previewPagUrl + ", animationUrl:" + gift.field_animationPagUrl + ", thumbnailMd5:" + gift.field_thumbnailMd5 + ", previewMd5:" + gift.field_previewPagMd5 + ", animationMd5:" + gift.field_animationPagMd5 + ", type:" + gift.field_giftType + ", name:" + gift.field_name + ", price:" + gift.field_price + "，flag:" + gift.field_flag + ", state:" + gift.field_state + ", landscapeUrl" + gift.field_landscapePagUrl + ", landscapeMd5" + gift.field_landscapePagMd5 + ']';
    }

    public final java.lang.String c(r45.kv1 gift) {
        kotlin.jvm.internal.o.g(gift, "gift");
        return "remoteGift : [id:" + gift.getString(0) + ", businessType:" + gift.getInteger(1) + ", thumbnailFileUrl:" + gift.getString(2) + ", previewUrl:" + gift.getString(3) + ", animationUrl:" + gift.getString(4) + ", thumbnailMd5:" + gift.getString(5) + ", previewMd5:" + gift.getString(6) + ", animationMd5:" + gift.getString(7) + ", type:" + gift.getInteger(10) + ", name:" + gift.getString(8) + ", price:" + gift.getFloat(9) + "，flag:" + gift.getInteger(12) + ", landscapeUrl" + gift.getString(13) + ", landscapeMd5" + gift.getString(14) + ']';
    }

    public final void d(be2.f fVar) {
        java.util.List<java.lang.String> list;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        dk2.u7 u7Var = dk2.u7.f234181a;
        java.util.Map map = dk2.u7.f234183c;
        kotlin.jvm.internal.o.f(map, "<get-gitTabCache>(...)");
        synchronized (map) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                if (str != null && (list = (java.util.List) entry.getValue()) != null) {
                    r45.sv1 sv1Var = new r45.sv1();
                    sv1Var.set(0, str);
                    sv1Var.set(1, new java.util.LinkedList());
                    for (java.lang.String str2 : list) {
                        r45.kv1 kv1Var = new r45.kv1();
                        kv1Var.set(0, str2);
                        sv1Var.getList(1).add(kv1Var);
                    }
                    linkedList.add(sv1Var);
                }
            }
        }
        fVar.y0(linkedList);
    }

    public final void e(java.util.LinkedList linkedList, boolean z17) {
        if (linkedList != null) {
            if (!z17) {
                dk2.u7 u7Var = dk2.u7.f234181a;
                dk2.u7.f234184d.clear();
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.sv1 sv1Var = (r45.sv1) it.next();
                java.lang.String string = sv1Var.getString(0);
                int integer = sv1Var.getInteger(2);
                int integer2 = sv1Var.getInteger(3);
                com.tencent.mm.protobuf.g byteString = sv1Var.getByteString(4);
                if (!(string == null || string.length() == 0) && integer > 0) {
                    dk2.u7 u7Var2 = dk2.u7.f234181a;
                    java.util.Map map = dk2.u7.f234184d;
                    kotlin.jvm.internal.o.f(map, "<get-giftTabGroupIdCache>(...)");
                    map.put(string, java.lang.Integer.valueOf(integer));
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateGroupPagingInfo] ");
                    sb6.append(z17 ? "incremental" : "full");
                    sb6.append(": groupName:");
                    sb6.append(string);
                    sb6.append(", groupId:");
                    sb6.append(integer);
                    sb6.append(", hasMore:");
                    sb6.append(integer2);
                    com.tencent.mars.xlog.Log.i("Finder.LiveGiftListResultProcessor", sb6.toString());
                }
                if (integer > 0) {
                    dk2.vc vcVar = new dk2.vc(false, null, 3, null);
                    vcVar.f234246a = integer2 > 0;
                    vcVar.f234247b = byteString;
                    dk2.ef efVar = dk2.ef.f233372a;
                    java.util.Map map2 = dk2.ef.O;
                    kotlin.jvm.internal.o.f(map2, "<get-groupGiftPagingInfo>(...)");
                    map2.put(java.lang.Integer.valueOf(integer), vcVar);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[updateGroupPagingInfo] groupId:");
                    sb7.append(integer);
                    sb7.append(", hasMore:");
                    sb7.append(vcVar.f234246a);
                    sb7.append(", lastBuffer size:");
                    sb7.append(byteString != null ? java.lang.Integer.valueOf(byteString.f192156a.length) : null);
                    com.tencent.mars.xlog.Log.i("Finder.LiveGiftListResultProcessor", sb7.toString());
                }
            }
        }
    }

    public final void f(java.util.List list, r45.r35 r35Var, boolean z17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.tencent.mm.plugin.finder.live.plugin.a1 a1Var;
        java.util.LinkedList list2;
        java.lang.Object obj3;
        java.util.LinkedList list3;
        java.lang.Object obj4;
        int i17 = 0;
        if (z17) {
            rl2.h Oj = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj();
            java.util.LinkedList<r45.kv1> linkedList = new java.util.LinkedList(list);
            if (r35Var != null && (list3 = r35Var.getList(0)) != null) {
                java.util.Iterator it = list3.iterator();
                while (it.hasNext()) {
                    r45.kv1 kv1Var = (r45.kv1) ((r45.yr5) it.next()).getCustom(0);
                    if (kv1Var != null) {
                        java.util.Iterator it6 = linkedList.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it6.next();
                            java.lang.String string = ((r45.kv1) obj4).getString(0);
                            java.lang.String string2 = kv1Var.getString(0);
                            if (string2 == null) {
                                string2 = "";
                            }
                            if (kotlin.jvm.internal.o.b(string, string2)) {
                                break;
                            }
                        }
                        if (obj4 == null) {
                            linkedList.add(kv1Var);
                        }
                    }
                }
            }
            for (r45.kv1 kv1Var2 : linkedList) {
                java.lang.String string3 = kv1Var2.getString(0);
                if (!(string3 == null || string3.length() == 0)) {
                    ce2.i b17 = ce2.i.U1.b(kv1Var2);
                    dk2.u7 u7Var = dk2.u7.f234181a;
                    java.util.Map map = dk2.u7.f234197q;
                    java.lang.Integer num = (java.lang.Integer) kz5.n0.m0(map.values());
                    java.lang.Integer num2 = (java.lang.Integer) map.get(string3);
                    b17.field_giftIndex = num2 != null ? num2.intValue() : num != null ? num.intValue() + 1 : 0;
                    kotlin.jvm.internal.o.f(map, "<get-giftSortMap>(...)");
                    map.put(string3, java.lang.Integer.valueOf(b17.field_giftIndex));
                    Oj.J0(b17);
                }
            }
            return;
        }
        rl2.h Oj2 = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj();
        java.util.List<ce2.i> z07 = Oj2.z0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateLocalGift] remoteGift = ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            arrayList.add(((r45.kv1) it7.next()).getString(8));
        }
        sb6.append(arrayList);
        sb6.append(", full replace");
        com.tencent.mars.xlog.Log.i("Finder.LiveGiftListResultProcessor", sb6.toString());
        java.util.LinkedList linkedList2 = new java.util.LinkedList(list);
        if (r35Var != null && (list2 = r35Var.getList(0)) != null) {
            java.util.Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                r45.kv1 kv1Var3 = (r45.kv1) ((r45.yr5) it8.next()).getCustom(0);
                if (kv1Var3 != null) {
                    java.util.Iterator it9 = linkedList2.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it9.next();
                        java.lang.String string4 = ((r45.kv1) obj3).getString(0);
                        java.lang.String string5 = kv1Var3.getString(0);
                        if (string5 == null) {
                            string5 = "";
                        }
                        if (kotlin.jvm.internal.o.b(string4, string5)) {
                            break;
                        }
                    }
                    if (obj3 == null) {
                        linkedList2.add(kv1Var3);
                    }
                }
            }
        }
        dk2.u7 u7Var2 = dk2.u7.f234181a;
        dk2.u7.f234197q.clear();
        if (z07.isEmpty()) {
            for (java.lang.Object obj5 : linkedList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.kv1 kv1Var4 = (r45.kv1) obj5;
                ce2.i b18 = ce2.i.U1.b(kv1Var4);
                b18.field_giftIndex = i17;
                dk2.u7 u7Var3 = dk2.u7.f234181a;
                java.util.Map map2 = dk2.u7.f234197q;
                kotlin.jvm.internal.o.f(map2, "<get-giftSortMap>(...)");
                map2.put(b18.field_rewardProductId, java.lang.Integer.valueOf(i17));
                ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj().J0(b18);
                com.tencent.mars.xlog.Log.i("Finder.LiveGiftListResultProcessor", f253492a.c(kv1Var4));
                i17 = i18;
            }
        } else {
            java.util.ArrayList<ce2.i> arrayList2 = new java.util.ArrayList();
            java.util.HashMap hashMap = new java.util.HashMap();
            for (ce2.i iVar : z07) {
                java.util.Iterator it10 = linkedList2.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        obj = it10.next();
                        if (com.tencent.mm.sdk.platformtools.t8.D0(((r45.kv1) obj).getString(0), iVar.field_rewardProductId)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                boolean z18 = obj == null;
                java.util.Iterator it11 = linkedList2.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it11.next();
                    r45.kv1 kv1Var5 = (r45.kv1) obj2;
                    if (com.tencent.mm.sdk.platformtools.t8.D0(kv1Var5.getString(0), iVar.field_rewardProductId) && !(com.tencent.mm.sdk.platformtools.t8.D0(kv1Var5.getString(2), iVar.field_thumbnailFileUrl) && com.tencent.mm.sdk.platformtools.t8.D0(kv1Var5.getString(3), iVar.field_previewPagUrl) && com.tencent.mm.sdk.platformtools.t8.D0(kv1Var5.getString(4), iVar.field_animationPagUrl) && com.tencent.mm.sdk.platformtools.t8.D0(kv1Var5.getString(13), iVar.field_landscapePagUrl))) {
                        break;
                    }
                }
                boolean z19 = obj2 != null;
                java.lang.String field_rewardProductId = iVar.field_rewardProductId;
                kotlin.jvm.internal.o.f(field_rewardProductId, "field_rewardProductId");
                hashMap.put(field_rewardProductId, java.lang.Integer.valueOf(iVar.field_state));
                if (z18 || z19) {
                    arrayList2.add(iVar);
                    java.lang.String field_rewardProductId2 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(field_rewardProductId2, "field_rewardProductId");
                    hashMap.put(field_rewardProductId2, 0);
                }
                com.tencent.mars.xlog.Log.i("Finder.LiveGiftListResultProcessor", "localGiftDeprecated:" + z18 + ", localGiftUrlDeprecated:" + z19 + ' ' + f253492a.b(iVar));
            }
            for (ce2.i iVar2 : arrayList2) {
                com.tencent.mars.xlog.Log.i("Finder.LiveGiftListResultProcessor", "remove " + Oj2.f397197e.delete("FinderLiveGiftInfo", "rewardProductId=?", new java.lang.String[]{"" + iVar2.field_rewardProductId}) + ' ' + f253492a.b(iVar2));
            }
            int i19 = 0;
            for (java.lang.Object obj6 : linkedList2) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.kv1 kv1Var6 = (r45.kv1) obj6;
                ce2.i b19 = ce2.i.U1.b(kv1Var6);
                java.lang.Integer num3 = (java.lang.Integer) hashMap.get(kv1Var6.getString(0));
                b19.field_state = num3 != null ? num3.intValue() : 0;
                b19.field_giftIndex = i19;
                dk2.u7 u7Var4 = dk2.u7.f234181a;
                java.util.Map map3 = dk2.u7.f234197q;
                kotlin.jvm.internal.o.f(map3, "<get-giftSortMap>(...)");
                map3.put(b19.field_rewardProductId, java.lang.Integer.valueOf(i19));
                ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj().J0(b19);
                com.tencent.mars.xlog.Log.i("Finder.LiveGiftListResultProcessor", f253492a.c(kv1Var6));
                i19 = i27;
            }
        }
        dk2.u7.f234181a.m();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.Map map4 = dk2.u7.f234185e;
        kotlin.jvm.internal.o.f(map4, "<get-giftCache>(...)");
        synchronized (map4) {
            java.util.Iterator it12 = map4.entrySet().iterator();
            while (it12.hasNext()) {
                linkedList3.add(((java.util.Map.Entry) it12.next()).getValue());
            }
        }
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null || (a1Var = (com.tencent.mm.plugin.finder.live.plugin.a1) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.a1.class)) == null) {
            return;
        }
        a1Var.u1(linkedList3);
    }
}
