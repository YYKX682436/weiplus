package qf2;

/* loaded from: classes3.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f362503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f362504f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(xg2.h hVar, kotlin.coroutines.Continuation continuation, qf2.v0 v0Var, java.util.HashMap hashMap) {
        super(2, continuation);
        this.f362502d = hVar;
        this.f362503e = v0Var;
        this.f362504f = hashMap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.o0(this.f362502d, continuation, this.f362503e, this.f362504f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.o0 o0Var = (qf2.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList<r45.yz1> list;
        km2.q qVar;
        java.lang.String str;
        java.util.LinkedList list2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        r45.w22 w22Var;
        java.util.LinkedList list3;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.rt1 rt1Var = (r45.rt1) ((xg2.i) this.f362502d).f454393b;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = zn0.x.f474414a.f474415a;
        kotlin.jvm.internal.o.f(arrayList, "getRemoteUserConfigList(...)");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zn0.v vVar = (zn0.v) it.next();
            if (vVar != null) {
                java.lang.String str2 = vVar.f474406d;
                kotlin.jvm.internal.o.f(str2, "getUserName(...)");
                hashMap.put(str2, vVar);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getNewAnchorPkInfoData success new_pk_mic_infos: ");
        r45.wz1 wz1Var = (r45.wz1) rt1Var.getCustom(1);
        sb6.append((wz1Var == null || (list3 = wz1Var.getList(12)) == null) ? null : new java.lang.Integer(list3.size()));
        sb6.append(" configSize: ");
        sb6.append(hashMap.size());
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", sb6.toString());
        r45.wz1 wz1Var2 = (r45.wz1) rt1Var.getCustom(1);
        if (wz1Var2 != null && (w22Var = (r45.w22) wz1Var2.getCustom(13)) != null) {
            com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "originMicPkData = " + ((mm2.o4) this.f362503e.business(mm2.o4.class)).W);
            mm2.o4 o4Var = (mm2.o4) this.f362503e.business(mm2.o4.class);
            java.lang.String string = w22Var.getString(0);
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = w22Var.getString(1);
            if (string2 == null) {
                string2 = "";
            }
            o4Var.W = new km2.c(string, string2, w22Var.getLong(2));
            ((mm2.o4) this.f362503e.business(mm2.o4.class)).X = false;
            com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "newMicPkData = " + ((mm2.o4) this.f362503e.business(mm2.o4.class)).W);
        }
        r45.wz1 wz1Var3 = (r45.wz1) rt1Var.getCustom(1);
        if (wz1Var3 != null && (list2 = wz1Var3.getList(12)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (!com.tencent.mm.sdk.platformtools.t8.D0(((r45.yz1) obj2).getString(2), ((mm2.c1) this.f362503e.business(mm2.c1.class)).m8())) {
                    arrayList2.add(obj2);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                r45.yz1 yz1Var = (r45.yz1) next;
                if (((mm2.o4) this.f362503e.business(mm2.o4.class)).P.contains(yz1Var.getString(2)) && this.f362504f.get(yz1Var.getString(2)) == null) {
                    arrayList3.add(next);
                }
            }
            com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "getNewAnchorPkInfoData filter size: " + arrayList3.size());
            java.util.Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                r45.yz1 yz1Var2 = (r45.yz1) it7.next();
                if (hashMap.containsKey(yz1Var2.getString(2))) {
                    java.lang.String string3 = yz1Var2.getString(2);
                    r45.xn1 xn1Var = (r45.xn1) yz1Var2.getCustom(3);
                    java.lang.String headUrl = (xn1Var == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact4.getHeadUrl();
                    r45.xn1 xn1Var2 = (r45.xn1) yz1Var2.getCustom(3);
                    java.lang.String username = (xn1Var2 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact3.getUsername();
                    r45.xn1 xn1Var3 = (r45.xn1) yz1Var2.getCustom(3);
                    java.lang.String nickname = (xn1Var3 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact2.getNickname();
                    java.lang.String string4 = yz1Var2.getString(0);
                    int integer = yz1Var2.getInteger(6);
                    r45.xn1 xn1Var4 = (r45.xn1) yz1Var2.getCustom(3);
                    java.lang.String string5 = xn1Var4 != null ? xn1Var4.getString(8) : null;
                    r45.xn1 xn1Var5 = (r45.xn1) yz1Var2.getCustom(3);
                    r45.xn1 xn1Var6 = (r45.xn1) yz1Var2.getCustom(3);
                    km2.q qVar2 = new km2.q(string3, headUrl, username, nickname, 2, string4, null, true, integer, null, null, 0, 0, false, string5, false, 0L, xn1Var5, false, null, xn1Var6 != null ? (r45.ba4) xn1Var6.getCustom(16) : null, 0, 0, 0L, null, null, 0L, null, 0, 0L, null, null, null, -1196544, 1, null);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getNewAnchorPkInfoData anchorNick: ");
                    r45.xn1 xn1Var7 = (r45.xn1) yz1Var2.getCustom(3);
                    sb7.append((xn1Var7 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var7.getCustom(0)) == null) ? null : finderContact.getNickname());
                    com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", sb7.toString());
                    java.util.List list4 = ((mm2.o4) this.f362503e.business(mm2.o4.class)).f329319p;
                    kotlin.jvm.internal.o.f(list4, "<get-recomApplylinkMicUserList>(...)");
                    pm0.v.I(list4, new qf2.m0(qVar2));
                    ((mm2.o4) this.f362503e.business(mm2.o4.class)).L7(qVar2);
                    c61.ac acVar = (c61.ac) i95.n0.c(c61.ac.class);
                    java.lang.String str3 = qVar2.f309172c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    ((b92.g1) acVar).getClass();
                    mk2.h hVar = mk2.h.f327133a;
                    hVar.d(str3);
                    c61.ac acVar2 = (c61.ac) i95.n0.c(c61.ac.class);
                    java.lang.String str4 = qVar2.f309172c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    ((b92.g1) acVar2).getClass();
                    hVar.b(str4);
                    ((mm2.o4) this.f362503e.business(mm2.o4.class)).V6(((mm2.o4) this.f362503e.business(mm2.o4.class)).T7(yz1Var2.getList(5)), yz1Var2.getString(0), 0);
                } else {
                    com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "add pk mic not in configMap,sdkId: " + yz1Var2.getString(2));
                }
            }
            if (arrayList3.size() > 0) {
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                tn0.w0 w0Var = dk2.ef.f233378d;
                if (w0Var != null) {
                    w0Var.M0(false);
                }
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.List<km2.q> list5 = ((mm2.o4) this.f362503e.business(mm2.o4.class)).f329324s;
        kotlin.jvm.internal.o.f(list5, "<get-anchorPkMicUserList>(...)");
        synchronized (list5) {
            for (km2.q qVar3 : list5) {
                if (qVar3 != null && (str = qVar3.f309170a) != null) {
                    hashMap2.put(str, qVar3);
                }
            }
        }
        r45.wz1 wz1Var4 = (r45.wz1) rt1Var.getCustom(1);
        if (wz1Var4 != null && (list = wz1Var4.getList(12)) != null) {
            for (r45.yz1 yz1Var3 : list) {
                if (hashMap2.containsKey(yz1Var3.getString(2)) && (qVar = (km2.q) hashMap2.get(yz1Var3.getString(2))) != null) {
                    qVar.G = yz1Var3.getString(0);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
