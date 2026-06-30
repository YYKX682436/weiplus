package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class h70 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f134592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.l70 f134594c;

    public h70(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.viewmodel.component.l70 l70Var) {
        this.f134592a = qt2Var;
        this.f134593b = baseFinderFeed;
        this.f134594c = l70Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        jz5.l[] lVarArr = new jz5.l[7];
        r45.qt2 qt2Var = this.f134592a;
        if (qt2Var == null || (str2 = qt2Var.getString(2)) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        if (qt2Var == null || (str3 = qt2Var.getString(1)) == null) {
            str3 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : "");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f134593b;
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        java.lang.String str5 = null;
        lVarArr[4] = new jz5.l("session_buffer", baseFinderFeed != null ? baseFinderFeed.g0() : null);
        android.app.Activity context = this.f134594c.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.o70 o70Var = (com.tencent.mm.plugin.finder.viewmodel.component.o70) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.o70.class);
        if (o70Var != null) {
            str4 = o70Var.P6(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L);
        } else {
            str4 = null;
        }
        lVarArr[5] = new jz5.l("current_language", str4);
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null) {
            str5 = feedObject.getUserName();
        }
        lVarArr[6] = new jz5.l("my_finder_username", str5);
        return kz5.c1.k(lVarArr);
    }
}
