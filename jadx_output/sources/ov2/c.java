package ov2;

/* loaded from: classes10.dex */
public final class c extends pv2.f {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f349169b = "PostLog.FinderPipeline";

    /* renamed from: c, reason: collision with root package name */
    public final pv2.c f349170c = new pv2.c("FinderPlDefault", 1);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f349171d;

    /* renamed from: e, reason: collision with root package name */
    public final ov2.d f349172e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f349173f;

    public c() {
        pv2.c cVar = new pv2.c("FinderPlResult", 1);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(1, new pv2.c("FinderPostPrepareStage", 1));
        linkedHashMap.put(2, new pv2.c("FinderMediaProcessStage", 1));
        linkedHashMap.put(3, new pv2.c("FinderUploadStage", 1));
        linkedHashMap.put(4, new pv2.c("FinderPostCgiStage", 1));
        linkedHashMap.put(100, cVar);
        this.f349171d = linkedHashMap;
        this.f349172e = new ov2.d();
        this.f349173f = new java.util.ArrayList();
    }

    public final void b(pv2.g gVar) {
        pv2.m c17;
        java.util.List list = this.f349173f;
        boolean z17 = !list.isEmpty();
        java.lang.String str = this.f349169b;
        if (z17) {
            com.tencent.mm.plugin.finder.storage.x80 x80Var = (com.tencent.mm.plugin.finder.storage.x80) ((java.util.ArrayList) list).remove(0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checking post-waiting ad draft from memory， next will post: ");
            sb6.append(x80Var != null ? java.lang.Long.valueOf(x80Var.field_localId) : null);
            sb6.append(' ');
            sb6.append(x80Var != null ? java.lang.Integer.valueOf(x80Var.field_createTime) : null);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (x80Var == null) {
                return;
            }
            a(new sv2.g(x80Var));
            com.tencent.mars.xlog.Log.i(str, "doNextPostDraft, localId:" + x80Var.field_localId);
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem L0 = ((c61.l7) i95.n0.c(c61.l7.class)).Pj().L0();
        if (L0 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checking post-waiting finder feed from db, next will post: ");
            sb7.append(L0.getLocalId());
            sb7.append(' ');
            sb7.append(L0.m132getCreateTime());
            sb7.append(' ');
            r45.qb4 postInfo = L0.getPostInfo();
            sb7.append(postInfo != null ? java.lang.Integer.valueOf(postInfo.getInteger(1)) : null);
            com.tencent.mars.xlog.Log.i(str, sb7.toString());
            pv2.m c18 = c(L0);
            if (c18 != null) {
                a(c18);
                return;
            }
            return;
        }
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        Oj.getClass();
        com.tencent.mm.plugin.finder.storage.x80 x80Var2 = new com.tencent.mm.plugin.finder.storage.x80();
        java.lang.String str2 = "SELECT * FROM FinderDraftItem  WHERE " + Oj.f222424e + " AND " + Oj.f222425f + " AND " + Oj.f222427h + " ORDER BY " + Oj.f222423d + ".localId ASC LIMIT 1";
        android.database.Cursor f17 = Oj.f222428i.f(str2, null, 2);
        com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorage", "getWaitingPost " + str2);
        if (f17.moveToFirst()) {
            x80Var2.convertFrom(f17);
            f17.close();
        } else {
            f17.close();
            x80Var2 = null;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("checking post-waiting finder draft from db, next will post: ");
        sb8.append(x80Var2 != null ? java.lang.Long.valueOf(x80Var2.field_localId) : null);
        sb8.append(' ');
        sb8.append(x80Var2 != null ? java.lang.Integer.valueOf(x80Var2.field_createTime) : null);
        com.tencent.mars.xlog.Log.i(str, sb8.toString());
        if (x80Var2 != null && (c17 = c(x80Var2)) != null) {
            a(c17);
        } else {
            if (gVar == null || kotlin.jvm.internal.o.b(gVar.b(), "PostFileClearStage")) {
                return;
            }
            a(new rv2.b());
        }
    }

    public final pv2.m c(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.finder.storage.FinderItem) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) obj;
            return finderItem.isMvFeed() ? new wv2.g(finderItem) : finderItem.isNewLife() ? new xv2.f(finderItem) : new tv2.p(finderItem);
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.storage.x80)) {
            return null;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127957u).getValue()).r()).intValue() == 0) {
            return null;
        }
        com.tencent.mm.plugin.finder.storage.x80 x80Var = (com.tencent.mm.plugin.finder.storage.x80) obj;
        return x80Var.field_objectType == 2 ? new sv2.c0(x80Var) : new sv2.r(x80Var);
    }
}
