package qr2;

/* loaded from: classes2.dex */
public final class b implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f366064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.z1 f366065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr2.c f366066c;

    public b(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.playlist.z1 z1Var, qr2.c cVar) {
        this.f366064a = qt2Var;
        this.f366065b = z1Var;
        this.f366066c = cVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        r45.vx0 vx0Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject3;
        r45.dm2 object_extend2;
        r45.vx0 vx0Var2;
        java.lang.String string;
        jz5.l[] lVarArr = new jz5.l[8];
        java.lang.String str3 = "";
        r45.qt2 qt2Var = this.f366064a;
        if (qt2Var == null || (str2 = qt2Var.getString(2)) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        if (qt2Var != null && (string = qt2Var.getString(1)) != null) {
            str3 = string;
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0));
        com.tencent.mm.plugin.finder.playlist.z1 z1Var = this.f366065b;
        lVarArr[3] = new jz5.l("collection_id", java.lang.Long.valueOf(z1Var.f122510f));
        qr2.c cVar = this.f366066c;
        com.tencent.mm.plugin.finder.playlist.z1 z1Var2 = cVar.f366068f;
        java.lang.Integer num = null;
        lVarArr[4] = new jz5.l("feedid", z1Var2 != null ? java.lang.Long.valueOf(z1Var2.f122509e) : null);
        com.tencent.mm.plugin.finder.playlist.z1 z1Var3 = cVar.f366068f;
        lVarArr[5] = new jz5.l("feed_episode", (z1Var3 == null || (feedObject2 = z1Var3.getFeedObject()) == null || (feedObject3 = feedObject2.getFeedObject()) == null || (object_extend2 = feedObject3.getObject_extend()) == null || (vx0Var2 = (r45.vx0) object_extend2.getCustom(0)) == null) ? null : java.lang.Integer.valueOf(vx0Var2.getInteger(6)));
        lVarArr[6] = new jz5.l("click_feedid", java.lang.Long.valueOf(z1Var.getItemId()));
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject4 = z1Var.getFeedObject();
        if (feedObject4 != null && (feedObject = feedObject4.getFeedObject()) != null && (object_extend = feedObject.getObject_extend()) != null && (vx0Var = (r45.vx0) object_extend.getCustom(0)) != null) {
            num = java.lang.Integer.valueOf(vx0Var.getInteger(6));
        }
        lVarArr[7] = new jz5.l("click_feed_episode", num);
        return kz5.c1.k(lVarArr);
    }
}
