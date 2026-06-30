package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ff implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f134402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f134403b;

    public ff(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f134402a = qt2Var;
        this.f134403b = finderItem;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        r45.oz2 tmpl_info;
        r45.oz2 tmpl_info2;
        jz5.l[] lVarArr = new jz5.l[6];
        java.lang.String str2 = null;
        r45.qt2 qt2Var = this.f134402a;
        lVarArr[0] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f134403b;
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(finderItem.getId()));
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
        lVarArr[4] = new jz5.l("template_type", (objectDesc == null || (tmpl_info2 = objectDesc.getTmpl_info()) == null) ? null : java.lang.Integer.valueOf(tmpl_info2.getInteger(1)));
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderItem.getFeedObject().getObjectDesc();
        if (objectDesc2 != null && (tmpl_info = objectDesc2.getTmpl_info()) != null) {
            str2 = tmpl_info.getString(0);
        }
        lVarArr[5] = new jz5.l("templateid", str2);
        return kz5.c1.k(lVarArr);
    }
}
