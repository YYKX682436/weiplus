package df2;

/* loaded from: classes10.dex */
public final class qr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr(df2.lt ltVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231184d = ltVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.qr(this.f231184d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.qr qrVar = (df2.qr) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qrVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        java.lang.String str;
        r45.bm1 bm1Var;
        r45.bm1 bm1Var2;
        r45.bm1 bm1Var3;
        java.util.LinkedList list;
        r45.bm1 bm1Var4;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        while (!((mm2.c1) this.f231184d.business(mm2.c1.class)).f328814h3.isEmpty()) {
            df2.lt ltVar = this.f231184d;
            synchronized (ltVar.f230713u) {
                r45.am1 am1Var = (r45.am1) ((mm2.c1) ltVar.business(mm2.c1.class)).f328814h3.poll();
                if (am1Var != null) {
                    java.util.Iterator it = ltVar.f230717y.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i18 = -1;
                            break;
                        }
                        in5.c cVar = (in5.c) it.next();
                        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
                        if (kotlin.jvm.internal.o.b((hVar == null || (bm1Var4 = hVar.f233545h) == null) ? null : bm1Var4.getString(0), am1Var.getString(0))) {
                            break;
                        }
                        i18++;
                    }
                    if (i18 != -1 && ltVar.f230717y.size() > 0) {
                        java.lang.Object obj2 = ltVar.f230717y.get(i18);
                        dk2.h hVar2 = obj2 instanceof dk2.h ? (dk2.h) obj2 : null;
                        if (((hVar2 == null || (bm1Var3 = hVar2.f233545h) == null || (list = bm1Var3.getList(13)) == null) ? 0 : list.size()) != am1Var.getList(1).size() && hVar2 != null) {
                            hVar2.f233544g = 0;
                        }
                        if (am1Var.getList(1).size() > 0) {
                            r45.bm1 bm1Var5 = hVar2 != null ? hVar2.f233545h : null;
                            if (bm1Var5 != null) {
                                bm1Var5.set(13, am1Var.getList(1));
                            }
                        }
                        java.lang.String str2 = df2.lt.W;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("version banner livemsg ");
                        sb6.append((hVar2 == null || (bm1Var2 = hVar2.f233545h) == null) ? null : new java.lang.Integer(bm1Var2.getInteger(19)));
                        sb6.append(" , wording: ");
                        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) am1Var.getCustom(2);
                        sb6.append(finderJumpInfo != null ? finderJumpInfo.getWording() : null);
                        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", sb6.toString());
                        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) am1Var.getCustom(2);
                        if (finderJumpInfo2 != null) {
                            dk2.h hVar3 = new dk2.h(finderJumpInfo2);
                            java.util.Iterator it6 = ltVar.f230716x.iterator();
                            int i19 = 0;
                            while (true) {
                                if (!it6.hasNext()) {
                                    i17 = -1;
                                    break;
                                }
                                in5.c cVar2 = (in5.c) it6.next();
                                dk2.h hVar4 = cVar2 instanceof dk2.h ? (dk2.h) cVar2 : null;
                                if (kotlin.jvm.internal.o.b((hVar4 == null || (bm1Var = hVar4.f233545h) == null) ? null : bm1Var.getString(0), am1Var.getString(0))) {
                                    i17 = i19;
                                    break;
                                }
                                i19++;
                            }
                            ltVar.f230716x.set(i17, hVar3);
                            r45.bm1 bm1Var6 = hVar3.f233545h;
                            if (bm1Var6 != null && bm1Var6.getBoolean(20)) {
                                jz5.l lVar = ltVar.V;
                                java.lang.String str3 = lVar != null ? (java.lang.String) lVar.f302833d : null;
                                java.lang.String str4 = lVar != null ? (java.lang.String) lVar.f302834e : null;
                                if (str3 != null && str4 != null) {
                                    java.lang.String str5 = df2.lt.W;
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                    sb7.append("banner cacheInfo clear id: ");
                                    sb7.append(str4);
                                    sb7.append(" url ");
                                    sb7.append(str3);
                                    sb7.append(" , new info : id ");
                                    r45.bm1 bm1Var7 = hVar3.f233545h;
                                    sb7.append(bm1Var7 != null ? bm1Var7.getString(0) : null);
                                    sb7.append(" wording ");
                                    sb7.append(hVar3.f233541d.getWording());
                                    sb7.append(" needPreload ");
                                    r45.bm1 bm1Var8 = hVar3.f233545h;
                                    sb7.append(bm1Var8 != null ? new java.lang.Integer(bm1Var8.getInteger(1)) : null);
                                    com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", sb7.toString());
                                    ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).Ai(str3);
                                    ltVar.U.put(str4, new java.lang.Long(0L));
                                }
                                if (bm1Var6.getInteger(1) == 1) {
                                    com.tencent.mm.protocal.protobuf.Html5Info html5_info = hVar3.f233541d.getHtml5_info();
                                    if (html5_info == null || (str = html5_info.getUrl()) == null) {
                                        str = "";
                                    }
                                    df2.lt.a7(ltVar, str, bm1Var6);
                                }
                            }
                            if (!kotlin.jvm.internal.o.b(hVar2 != null ? hVar2.f233541d : null, finderJumpInfo2)) {
                                ltVar.f230717y.set(i18, hVar3);
                                if (i18 == ltVar.f230712t % ltVar.f230717y.size()) {
                                    java.lang.String str6 = df2.lt.W;
                                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                    sb8.append("notify index: ");
                                    sb8.append(i18);
                                    sb8.append(", wording: ");
                                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) am1Var.getCustom(2);
                                    sb8.append(finderJumpInfo3 != null ? finderJumpInfo3.getWording() : null);
                                    com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", sb8.toString());
                                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = ltVar.f230707o;
                                    if (wxRecyclerAdapter != null) {
                                        wxRecyclerAdapter.notifyItemChanged(ltVar.f230712t, "bannerselected");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
