package xv2;

/* loaded from: classes10.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f457399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xv2.e f457400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ db2.p2 f457401c;

    public c(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, xv2.e eVar, db2.p2 p2Var) {
        this.f457399a = finderItem;
        this.f457400b = eVar;
        this.f457401c = p2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f457399a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setDumpCgiErrorType(fVar.f70615a);
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = finderItem.field_reportObject;
        if (finderFeedReportObject2 != null) {
            finderFeedReportObject2.setDumpCgiErrorCode(fVar.f70616b);
        }
        cu2.u.f222441a.l(finderItem);
        int i17 = fVar.f70615a;
        xv2.e eVar = this.f457400b;
        if (i17 != 0 || fVar.f70616b != 0) {
            eVar.f457406n = new tv2.x(eVar.f457403h, 2);
            eVar.f457407o.countDown();
            return jz5.f0.f302826a;
        }
        com.tencent.mars.xlog.Log.i(eVar.f457405m, "dumpcgi, waitType:" + ((r45.h31) fVar.f70618d).getInteger(2) + " url:" + ((r45.h31) fVar.f70618d).getString(0) + ", thumbUrl:" + ((r45.h31) fVar.f70618d).getString(1));
        db2.p2 p2Var = this.f457401c;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = (com.tencent.mm.protocal.protobuf.FinderObjectDesc) p2Var.f228114w.getCustom(2);
        if (finderObjectDesc != null && (media = finderObjectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
            java.lang.String string = ((r45.h31) fVar.f70618d).getString(0);
            if (string == null) {
                string = "";
            }
            finderMedia.setUrl(string);
            java.lang.String string2 = ((r45.h31) fVar.f70618d).getString(1);
            finderMedia.setThumbUrl(string2 != null ? string2 : "");
        }
        p2Var.f228114w.set(23, java.lang.Integer.valueOf(((r45.h31) fVar.f70618d).getInteger(2)));
        return java.lang.Boolean.valueOf(eVar.k(p2Var));
    }
}
