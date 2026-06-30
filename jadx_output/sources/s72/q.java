package s72;

/* loaded from: classes12.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f404135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404137f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.List list, java.lang.String str, s72.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404135d = list;
        this.f404136e = str;
        this.f404137f = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s72.q(this.f404135d, this.f404136e, this.f404137f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        s72.h hVar;
        java.util.List list;
        int i17;
        int i18;
        boolean b76;
        s72.j0 j0Var;
        boolean z17;
        java.lang.String str2;
        java.util.List list2;
        java.lang.String str3;
        r45.tp0 tp0Var;
        java.lang.String str4;
        r45.bq0 bq0Var;
        boolean z18;
        s72.q qVar = this;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str5 = "";
        s72.h hVar2 = new s72.h(0, "", 0, 0);
        java.util.List list3 = qVar.f404135d;
        int size = list3.size();
        int i19 = 0;
        while (i19 < size) {
            r45.tp0 tp0Var2 = (r45.tp0) list3.get(i19);
            o72.d3 d3Var = o72.d3.f343321a;
            boolean p17 = o72.d3.f343324d.p();
            boolean z19 = o72.d3.f343325e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handleBatchGetXml] source=");
            java.lang.String str6 = qVar.f404136e;
            sb6.append(str6);
            sb6.append(", favId=");
            sb6.append(tp0Var2.f386638d);
            sb6.append(", status=");
            sb6.append(tp0Var2.f386639e);
            sb6.append(", needNextPage=");
            sb6.append(tp0Var2.f386645n);
            sb6.append(", needCheckXmlValid=");
            sb6.append(p17);
            sb6.append(", isLogicOpOpen=");
            sb6.append(z19);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", sb6.toString());
            boolean z27 = true;
            if (z19) {
                str = str5;
                if (tp0Var2.f386646o == 9001) {
                    o72.r2 re6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(tp0Var2.f386638d);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[handleBatchGetXml] source=");
                    sb7.append(str6);
                    sb7.append(", status detail not found, favId=");
                    sb7.append(tp0Var2.f386638d);
                    sb7.append(", localId=");
                    sb7.append(re6 != null ? new java.lang.Long(re6.field_localId) : null);
                    com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncService", sb7.toString());
                    s72.j0.f404069i.add(new java.lang.Integer(tp0Var2.f386638d));
                    if ((tp0Var2.f386641g & 1) != 0) {
                        o72.x1.k(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(tp0Var2.f386638d), null, 4);
                    }
                    hVar = hVar2;
                    list = list3;
                    i17 = size;
                    i18 = i19;
                    i19 = i18 + 1;
                    qVar = this;
                    hVar2 = hVar;
                    str5 = str;
                    size = i17;
                    list3 = list;
                }
            } else {
                str = str5;
            }
            if (tp0Var2.f386639e == 0 && tp0Var2.f386645n == 0) {
                s72.j0 j0Var2 = qVar.f404137f;
                if (z19) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[handleBatchGetXml] new, source=" + str6 + ", favId=" + tp0Var2.f386638d);
                    java.util.HashSet hashSet = s72.j0.f404069i;
                    j0Var2.getClass();
                    o72.r2 re7 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re((long) tp0Var2.f386638d);
                    if (re7 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncService", "[handleBatchGetXmlNew] item = null, continue, source=" + str6);
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(tp0Var2.f386640f)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncService", "[handleBatchGetXml] xml is null, continue, favId=" + tp0Var2.f386638d + ", source=" + str6);
                        pm0.z.a(com.tencent.mm.plugin.report.service.d1.f158158b, "batchget_xml_empty", true, null, null, false, false, new s72.v(str6, tp0Var2), 60, null);
                    } else {
                        if (re7.field_type == 18) {
                            r45.bq0 bq0Var2 = re7.field_favProto;
                            if ((bq0Var2 != null ? bq0Var2.E : 0) > 0 && !re7.I0()) {
                                o72.r2 r2Var = new o72.r2();
                                list2 = list3;
                                i17 = size;
                                r2Var.field_localId = re7.field_localId;
                                r2Var.field_id = tp0Var2.f386638d;
                                r2Var.field_updateSeq = tp0Var2.f386643i;
                                java.lang.String str7 = tp0Var2.f386640f;
                                r2Var.field_xml = str7;
                                if (o72.d2.a(str7)) {
                                    boolean U0 = r2Var.U0(tp0Var2.f386640f);
                                    if (!p17 || U0) {
                                        boolean z28 = re7.field_itemStatus != 13 && (re7.Q0() || re7.P0());
                                        r45.bq0 bq0Var3 = re7.field_favProto;
                                        if (bq0Var3 != null) {
                                            str3 = bq0Var3.R;
                                            list = list2;
                                        } else {
                                            list = list2;
                                            str3 = null;
                                        }
                                        r45.bq0 bq0Var4 = r2Var.field_favProto;
                                        boolean b17 = kotlin.jvm.internal.o.b(str3, bq0Var4 != null ? bq0Var4.R : null);
                                        i18 = i19;
                                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[checkConflict] isClientUploadingOrFailed=");
                                        sb8.append(z28);
                                        sb8.append(", isSameDevice=");
                                        sb8.append(b17);
                                        sb8.append(", favId=");
                                        sb8.append(r2Var.field_id);
                                        sb8.append(", localId=");
                                        s72.h hVar3 = hVar2;
                                        j0Var = j0Var2;
                                        sb8.append(re7.field_localId);
                                        sb8.append(", type=");
                                        sb8.append(re7.field_type);
                                        sb8.append(", status=");
                                        sb8.append(re7.field_itemStatus);
                                        sb8.append(", clientDeviceId=");
                                        r45.bq0 bq0Var5 = re7.field_favProto;
                                        sb8.append(bq0Var5 != null ? bq0Var5.R : null);
                                        sb8.append(", serverDeviceId=");
                                        r45.bq0 bq0Var6 = r2Var.field_favProto;
                                        sb8.append(bq0Var6 != null ? bq0Var6.R : null);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", sb8.toString());
                                        r45.bq0 bq0Var7 = re7.field_favProto;
                                        if (bq0Var7 == null || (bq0Var = r2Var.field_favProto) == null) {
                                            hVar = hVar3;
                                            tp0Var = tp0Var2;
                                            z17 = p17;
                                            str4 = str6;
                                            com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncService", "[checkConflict] favProto is null");
                                            z27 = false;
                                        } else {
                                            if (!z28) {
                                                hVar = hVar3;
                                                z18 = false;
                                            } else if (b17) {
                                                hVar = hVar3;
                                                int i27 = bq0Var.E;
                                                int i28 = bq0Var7.E;
                                                if (i27 == i28) {
                                                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[checkConflict] conflict from same device same version, localId=");
                                                    tp0Var = tp0Var2;
                                                    z17 = p17;
                                                    sb9.append(re7.field_localId);
                                                    sb9.append(", favId=");
                                                    sb9.append(re7.field_id);
                                                    sb9.append(", serverSeq=");
                                                    sb9.append(r2Var.field_updateSeq);
                                                    sb9.append(", updateSeq=");
                                                    sb9.append(re7.field_updateSeq);
                                                    sb9.append(", localSeq=");
                                                    sb9.append(re7.field_localSeq);
                                                    sb9.append(", version=");
                                                    sb9.append(i28);
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", sb9.toString());
                                                    re7.field_localSeq = re7.field_updateSeq;
                                                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(re7, dm.i4.COL_LOCALID);
                                                    str4 = str6;
                                                } else {
                                                    tp0Var = tp0Var2;
                                                    z17 = p17;
                                                    if (i27 > i28) {
                                                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("[checkConflict] server version bigger than local, localId=");
                                                        str4 = str6;
                                                        sb10.append(re7.field_localId);
                                                        sb10.append(", favId=");
                                                        sb10.append(re7.field_id);
                                                        sb10.append(", serverSeq=");
                                                        sb10.append(r2Var.field_updateSeq);
                                                        sb10.append(", updateSeq=");
                                                        sb10.append(re7.field_updateSeq);
                                                        sb10.append(", localSeq=");
                                                        sb10.append(re7.field_localSeq);
                                                        sb10.append(", clientVersion=");
                                                        sb10.append(i28);
                                                        sb10.append(", serverVersion=");
                                                        sb10.append(i27);
                                                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", sb10.toString());
                                                        re7.field_favProto.s(i27);
                                                        re7.field_localSeq = re7.field_updateSeq;
                                                        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(re7, dm.i4.COL_LOCALID);
                                                        ((a40.i) ((o72.u3) i95.n0.c(o72.u3.class))).getClass();
                                                        com.tencent.mm.plugin.fav.ui.a0.a(re7);
                                                    } else {
                                                        str4 = str6;
                                                        com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncService", "[checkConflict] server version (" + i27 + ") < client version (" + i28 + ')');
                                                    }
                                                }
                                            } else {
                                                com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[checkConflict] add failed item as new item");
                                                o72.u3 u3Var = (o72.u3) i95.n0.c(o72.u3.class);
                                                r45.bq0 bq0Var8 = re7.field_favProto;
                                                java.lang.String str8 = bq0Var8 != null ? bq0Var8.f370972q : null;
                                                if (str8 == null) {
                                                    str8 = str;
                                                }
                                                java.lang.String wi6 = ((a40.i) u3Var).wi(str8);
                                                com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[addClientItemAsNewItem] originFavId=" + re7.field_id + ", originLocalId=" + re7.field_localId + ", conflictTitle=" + wi6);
                                                z18 = false;
                                                re7.field_id = 0;
                                                hVar = hVar3;
                                                re7.field_localId = 0L;
                                                re7.field_localSeq = 0;
                                                re7.field_updateSeq = 0;
                                                re7.field_favProto.p(wi6);
                                                ((a40.i) ((o72.u3) i95.n0.c(o72.u3.class))).getClass();
                                                com.tencent.mm.plugin.fav.ui.a0.a(re7);
                                            }
                                            z27 = z18;
                                            tp0Var = tp0Var2;
                                            z17 = p17;
                                            str4 = str6;
                                        }
                                        if (z27) {
                                            com.tencent.mars.xlog.Log.w("MicroMsg.FavSyncService", "[handleBatchGetXml] is conflict, source=" + str4 + ", favId=" + r2Var.field_id + ", xml=" + tp0Var.f386640f);
                                            b76 = false;
                                        } else {
                                            tp0Var2 = tp0Var;
                                            str2 = str4;
                                            b76 = j0Var.b7(tp0Var2, hVar, z17, str2);
                                        }
                                    } else {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncService", "[handleBatchGetXml] xml illegal, source=" + str6 + ", favId=" + tp0Var2.f386638d + ", updateTime=" + tp0Var2.f386642h + ", updateSeq=" + tp0Var2.f386643i + "xml=" + tp0Var2.f386640f);
                                        pm0.z.a(com.tencent.mm.plugin.report.service.d1.f158158b, "batchget_xml_invalid", true, null, null, false, false, new s72.x(str6, tp0Var2), 60, null);
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncService", "[handleBatchGetXml] check illegal, source=" + str6 + ", xml = " + tp0Var2.f386640f);
                                    hVar2.f404046a = hVar2.f404046a + 1;
                                    java.lang.String field_xml = r2Var.field_xml;
                                    kotlin.jvm.internal.o.f(field_xml, "field_xml");
                                    hVar2.f404047b = field_xml;
                                    pm0.z.a(com.tencent.mm.plugin.report.service.d1.f158158b, "batchget_xml_invalid_android_old", true, null, null, false, false, new s72.w(str6, tp0Var2), 60, null);
                                }
                                i18 = i19;
                                list = list2;
                                b76 = false;
                                hVar = hVar2;
                            }
                        }
                        hVar = hVar2;
                        j0Var = j0Var2;
                        list = list3;
                        i17 = size;
                        i18 = i19;
                        z17 = p17;
                        str2 = str6;
                        b76 = j0Var.b7(tp0Var2, hVar, z17, str2);
                    }
                    list2 = list3;
                    i17 = size;
                    i18 = i19;
                    list = list2;
                    b76 = false;
                    hVar = hVar2;
                } else {
                    list = list3;
                    i17 = size;
                    i18 = i19;
                    hVar = hVar2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[handleBatchGetXml] old, source=" + str6 + ", favId=" + tp0Var2.f386638d);
                    java.util.HashSet hashSet2 = s72.j0.f404069i;
                    b76 = j0Var2.b7(tp0Var2, hVar, p17, str6);
                }
                if (!b76) {
                    i19 = i18 + 1;
                    qVar = this;
                    hVar2 = hVar;
                    str5 = str;
                    size = i17;
                    list3 = list;
                }
            } else {
                hVar = hVar2;
                list = list3;
                i17 = size;
                i18 = i19;
            }
            ((a82.v) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
            i19 = i18 + 1;
            qVar = this;
            hVar2 = hVar;
            str5 = str;
            size = i17;
            list3 = list;
        }
        return hVar2;
    }
}
