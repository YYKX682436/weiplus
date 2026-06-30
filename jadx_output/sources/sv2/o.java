package sv2;

/* loaded from: classes10.dex */
public final class o implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f413340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sv2.q f413341b;

    public o(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, sv2.q qVar) {
        this.f413340a = finderItem;
        this.f413341b = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f413340a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setDumpCgiErrorType(fVar.f70615a);
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = finderItem.field_reportObject;
        if (finderFeedReportObject2 != null) {
            finderFeedReportObject2.setDumpCgiErrorCode(fVar.f70616b);
        }
        cu2.o oVar = cu2.o.f222430a;
        sv2.q qVar = this.f413341b;
        oVar.b(qVar.f413343h);
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            qVar.f413347o = new sv2.c(qVar.f413343h, 2);
            qVar.f413348p.countDown();
            return jz5.f0.f302826a;
        }
        com.tencent.mars.xlog.Log.i(qVar.f413345m, "dumpcgi, waitType:" + ((r45.h31) fVar.f70618d).getInteger(2) + " url:" + ((r45.h31) fVar.f70618d).getString(0) + ", thumbUrl:" + ((r45.h31) fVar.f70618d).getString(1));
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = qVar.f413346n;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderItem2.getFeedObject().getObjectDesc();
        if (objectDesc2 != null && (media = objectDesc2.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
            java.lang.String string = ((r45.h31) fVar.f70618d).getString(0);
            if (string == null) {
                string = "";
            }
            finderMedia.setUrl(string);
            java.lang.String string2 = ((r45.h31) fVar.f70618d).getString(1);
            finderMedia.setThumbUrl(string2 != null ? string2 : "");
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderItem2.getFeedObject().getObjectDesc();
        if ((objectDesc3 != null ? objectDesc3.getClient_draft_ext_info() : null) == null && (objectDesc = finderItem2.getFeedObject().getObjectDesc()) != null) {
            objectDesc.setClient_draft_ext_info(new r45.zw0());
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4 = finderItem2.getFeedObject().getObjectDesc();
        r45.zw0 client_draft_ext_info = objectDesc4 != null ? objectDesc4.getClient_draft_ext_info() : null;
        if (client_draft_ext_info != null) {
            client_draft_ext_info.set(0, java.lang.Integer.valueOf(((r45.h31) fVar.f70618d).getInteger(2)));
        }
        return java.lang.Boolean.valueOf(qVar.k());
    }
}
