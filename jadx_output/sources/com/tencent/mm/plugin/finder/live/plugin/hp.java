package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hp {
    public hp(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String str, int i17, java.lang.String str2, int i18, boolean z17, com.tencent.mm.plugin.finder.live.plugin.fp localGiftMsgParams, java.util.List list) {
        int i19;
        int i27;
        java.lang.String str3;
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(localGiftMsgParams, "localGiftMsgParams");
        java.lang.String str4 = "Finder.FinderLiveGiftSendPlugin";
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "addLocalGiftMsg giftId: " + str + " diffCnt: " + i18 + " isFromPatchSend: " + z17 + " comboId: " + str2);
        if (list == null || !(!list.isEmpty())) {
            i19 = 1;
        } else {
            i19 = 1;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "addLocalGiftMsg random gift, animation id:".concat(kz5.n0.g0(list, null, null, null, 0, null, com.tencent.mm.plugin.finder.live.plugin.gp.f112723d, 31, null)));
        }
        dk2.u7 u7Var = dk2.u7.f234181a;
        ce2.i e17 = u7Var.e(str);
        boolean g17 = u7Var.g(e17);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "addLocalGiftMsg giftInfo is null,giftId:" + str + ",cnt:" + i17 + ",comboId:" + str2 + ",diffCnt:" + i18);
            return;
        }
        r45.ch1 ch1Var = new r45.ch1();
        r45.cj1 cj1Var = new r45.cj1();
        cj1Var.set(0, e17.field_rewardProductId);
        cj1Var.set(3, e17.c1());
        r45.bt5 bt5Var = new r45.bt5();
        r45.b82 b82Var = localGiftMsgParams.f112584c;
        bt5Var.set(0, com.tencent.mm.protobuf.g.b(b82Var.toByteArray()));
        bt5Var.set(i19, 0);
        cj1Var.set(8, bt5Var);
        if (e17.Z0()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    r45.yv1 yv1Var = ((com.tencent.mm.plugin.finder.live.plugin.go0) it.next()).f112720a;
                    if (yv1Var != null) {
                        arrayList.add(yv1Var);
                    }
                }
            }
            cj1Var.getList(9).addAll(arrayList);
        } else if (e17.Y0()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (list != null) {
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    r45.ov1 ov1Var = ((com.tencent.mm.plugin.finder.live.plugin.go0) it6.next()).f112721b;
                    if (ov1Var != null) {
                        arrayList2.add(ov1Var);
                    }
                }
            }
            cj1Var.getList(11).addAll(arrayList2);
        } else {
            mm2.n2 n2Var = (mm2.n2) dk2.ef.f233372a.i(mm2.n2.class);
            if (((n2Var == null || n2Var.f329281i != i19) ? 0 : i19) != 0) {
                if (list != null) {
                    java.util.Iterator it7 = list.iterator();
                    i27 = 0;
                    while (it7.hasNext()) {
                        r45.c42 c42Var = ((com.tencent.mm.plugin.finder.live.plugin.go0) it7.next()).f112722c;
                        i27 += c42Var != null ? c42Var.getInteger(i19) : 0;
                    }
                } else {
                    i27 = 0;
                }
                cj1Var.set(12, java.lang.Integer.valueOf(i27));
            }
        }
        cj1Var.set(10, java.lang.Integer.valueOf(localGiftMsgParams.f112585d));
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(cj1Var.toByteArray()));
        r45.xn1 xn1Var = new r45.xn1();
        gk2.e eVar = localGiftMsgParams.f112582a;
        java.util.LinkedList linkedList2 = ((mm2.c1) eVar.a(mm2.c1.class)).f328812h;
        if (linkedList2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it8 = linkedList2.iterator();
            while (it8.hasNext()) {
                java.lang.Object next = it8.next();
                java.util.Iterator it9 = it8;
                java.lang.String str5 = str4;
                if (((r45.yl1) next).getInteger(0) != 4) {
                    arrayList3.add(next);
                }
                it8 = it9;
                str4 = str5;
            }
            str3 = str4;
            linkedList = new java.util.LinkedList(arrayList3);
        } else {
            str3 = "Finder.FinderLiveGiftSendPlugin";
            linkedList = null;
        }
        xn1Var.set(11, linkedList);
        zl2.r4 r4Var = zl2.r4.f473950a;
        xn1Var.set(0, r4Var.m0(eVar));
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var.set(13, xn1Var);
        ch1Var.set(1, 20009);
        com.tencent.mm.plugin.finder.live.util.l1 l1Var = new com.tencent.mm.plugin.finder.live.util.l1(ch1Var);
        l1Var.f115593h = str2;
        if (z17) {
            l1Var.f115594i = 0;
            l1Var.f115595m = i17;
        } else {
            l1Var.f115594i = i17;
            l1Var.f115595m = 1;
        }
        l1Var.f115590e = l1Var.f115594i > 1 ? g17 ? com.tencent.mm.plugin.finder.live.util.m1.f115619d : com.tencent.mm.plugin.finder.live.util.m1.f115621f : g17 ? com.tencent.mm.plugin.finder.live.util.m1.f115620e : com.tencent.mm.plugin.finder.live.util.m1.f115622g;
        java.lang.String str6 = localGiftMsgParams.f112583b;
        if (str6.length() == 0) {
            str6 = ((mm2.c1) eVar.a(mm2.c1.class)).f328852o;
        }
        kotlin.jvm.internal.o.g(str6, "<set-?>");
        l1Var.f115601s = str6;
        l1Var.f115604v = b82Var.getInteger(0) == 9;
        com.tencent.mars.xlog.Log.i(str3, "addLocalGiftMsg local add GiftShowInfo:" + l1Var + ",diffCnt:" + i18);
        ((com.tencent.mm.plugin.finder.live.util.j1) ((mm2.c1) eVar.a(mm2.c1.class)).f328806g).g(l1Var);
    }
}
