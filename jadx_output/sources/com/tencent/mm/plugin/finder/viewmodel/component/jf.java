package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class jf implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f134862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f134863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f134864c;

    public jf(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.plugin.finder.storage.FinderItem finderItem2) {
        this.f134862a = qt2Var;
        this.f134863b = finderItem;
        this.f134864c = finderItem2;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        r45.qt2 qt2Var = this.f134862a;
        lVarArr[0] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(this.f134863b.getId()));
        lVarArr[4] = new jz5.l("template_follow_object_id", pm0.v.u(this.f134864c.getId()));
        return kz5.c1.k(lVarArr);
    }
}
