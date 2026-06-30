package cu2;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final cu2.o f222430a = new cu2.o();

    public final void a(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = draftItem.t0().getFeedObject().getObjectDesc();
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media = objectDesc != null ? objectDesc.getMedia() : null;
        if (media == null || media.size() <= 0) {
            return;
        }
        r45.fc4 fc4Var = new r45.fc4();
        for (r45.mb4 mb4Var : bu2.z.h(media)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String string = mb4Var.getString(16);
            java.lang.String str = "";
            if (string == null) {
                string = "";
            }
            sb6.append(string);
            java.lang.String string2 = mb4Var.getString(20);
            if (string2 == null) {
                string2 = "";
            }
            sb6.append(string2);
            mb4Var.set(23, sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.lang.String string3 = mb4Var.getString(41);
            if (string3 == null) {
                string3 = "";
            }
            sb7.append(string3);
            java.lang.String string4 = mb4Var.getString(42);
            if (string4 == null) {
                string4 = "";
            }
            sb7.append(string4);
            mb4Var.set(40, sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.lang.String string5 = mb4Var.getString(0);
            if (string5 == null) {
                string5 = "";
            }
            sb8.append(string5);
            java.lang.String string6 = mb4Var.getString(18);
            if (string6 == null) {
                string6 = "";
            }
            sb8.append(string6);
            mb4Var.set(11, sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            java.lang.String string7 = mb4Var.getString(1);
            if (string7 == null) {
                string7 = "";
            }
            sb9.append(string7);
            java.lang.String string8 = mb4Var.getString(19);
            if (string8 == null) {
                string8 = "";
            }
            sb9.append(string8);
            mb4Var.set(12, sb9.toString());
            java.lang.String string9 = mb4Var.getString(28);
            if (string9 == null) {
                string9 = "";
            }
            mb4Var.set(35, string9);
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            java.lang.String string10 = mb4Var.getString(25);
            if (string10 == null) {
                string10 = "";
            }
            sb10.append(string10);
            java.lang.String string11 = mb4Var.getString(26);
            if (string11 == null) {
                string11 = "";
            }
            sb10.append(string11);
            mb4Var.set(27, sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            java.lang.String string12 = mb4Var.getString(62);
            if (string12 == null) {
                string12 = "";
            }
            sb11.append(string12);
            java.lang.String string13 = mb4Var.getString(63);
            if (string13 != null) {
                str = string13;
            }
            sb11.append(str);
            mb4Var.set(65, sb11.toString());
            fc4Var.getList(0).add(mb4Var);
        }
        draftItem.t0().field_mediaExtList = fc4Var;
    }

    public final boolean b(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateOrCreateLocalDraft, " + draftItem.v0());
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        long j17 = draftItem.field_localId;
        if (j17 == 0) {
            long L0 = Oj.L0(draftItem);
            com.tencent.mm.autogen.events.FinderDraftOpEvent finderDraftOpEvent = new com.tencent.mm.autogen.events.FinderDraftOpEvent();
            am.ab abVar = finderDraftOpEvent.f54270g;
            abVar.f6144a = 100;
            abVar.f6145b = L0;
            finderDraftOpEvent.e();
            com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateOrCreateLocalDraft save all, " + draftItem.v0());
            return true;
        }
        com.tencent.mm.plugin.finder.storage.x80 D0 = Oj.D0(j17);
        if (D0 != null && D0.field_version <= draftItem.field_version) {
            Oj.W0(j17, draftItem);
            com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateOrCreateLocalDraft save id, " + draftItem.v0());
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Finder.LogPost updateOrCreateLocalDraft cannot update, exist:");
        sb6.append(D0 != null);
        sb6.append(", version:");
        sb6.append((D0 != null ? D0.field_version : 0) <= draftItem.field_version);
        com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorageLogic", sb6.toString());
        return false;
    }

    public final void c(com.tencent.mm.plugin.finder.storage.x80 draftItem, com.tencent.mm.protocal.protobuf.FinderObject svrFinderObj) {
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        kotlin.jvm.internal.o.g(svrFinderObj, "svrFinderObj");
        com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updatePostSvrDraft, " + draftItem.v0());
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        long j17 = draftItem.field_localId;
        com.tencent.mm.plugin.finder.storage.x80 D0 = Oj.D0(j17);
        if (D0 != null && D0.field_version > draftItem.field_version) {
            com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updatePostSvrDraft, just save id");
            draftItem.field_objectId = svrFinderObj.getId();
            Oj.W0(j17, draftItem);
        } else {
            if (D0 == null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updatePostSvrDraft, deleted");
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updatePostSvrDraft, overwrite");
            draftItem.field_localFlag = 4;
            draftItem.field_objectId = svrFinderObj.getId();
            draftItem.L = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.c(svrFinderObj, null, draftItem.field_localId);
            a(draftItem);
            Oj.W0(draftItem.field_localId, draftItem);
        }
    }

    public final java.util.ArrayList d(java.util.List svrFinderObjs) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        kotlin.jvm.internal.o.g(svrFinderObjs, "svrFinderObjs");
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = svrFinderObjs.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
            com.tencent.mm.plugin.finder.storage.x80 J0 = Oj.J0(finderObject.getId());
            cu2.o oVar = f222430a;
            if (J0 == null) {
                com.tencent.mm.plugin.finder.storage.x80 x80Var = new com.tencent.mm.plugin.finder.storage.x80();
                x80Var.field_localFlag = 4;
                r45.ec1 ec1Var = new r45.ec1();
                ec1Var.set(0, finderObject);
                x80Var.field_finderItem = ec1Var;
                x80Var.field_objectType = finderObject.getObjectType();
                x80Var.field_postIntent = "";
                x80Var.field_originMvInfo = null;
                x80Var.field_objectId = finderObject.getId();
                x80Var.field_markDeleted = 0;
                x80Var.field_version = 0;
                oVar.a(x80Var);
                Oj.L0(x80Var);
                arrayList.add(x80Var);
                com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateSvrDrafts, create, " + x80Var.v0());
            } else if (J0.field_markDeleted == 0) {
                if ((4 & J0.field_localFlag) != 0) {
                    J0.L = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.c(finderObject, null, J0.field_localId);
                    oVar.a(J0);
                    long id6 = finderObject.getId();
                    J0.w0();
                    android.content.ContentValues convertTo = J0.convertTo();
                    convertTo.remove("rowid");
                    Oj.f222428i.p("FinderDraftItem", convertTo, "objectId=?", new java.lang.String[]{"" + id6});
                    com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateSvrDrafts, update, " + J0.v0());
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateSvrDrafts, drop, " + J0.v0());
                }
                arrayList.add(J0);
            }
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
            if (objectDesc != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateSvrDrafts, full_cover_url:" + finderMedia.getFull_cover_url() + " full_cover_url_token:" + finderMedia.getFull_cover_url_token());
            }
        }
        return arrayList;
    }
}
