package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class a2 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f122254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.e f122255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122256c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f122257d;

    public a2(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.playlist.e eVar, java.lang.String str, in5.s0 s0Var) {
        this.f122254a = qt2Var;
        this.f122255b = eVar;
        this.f122256c = str;
        this.f122257d = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        jz5.l[] lVarArr = new jz5.l[7];
        java.lang.String str4 = "";
        r45.qt2 qt2Var = this.f122254a;
        if (qt2Var == null || (str2 = qt2Var.getString(2)) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        if (qt2Var == null || (str3 = qt2Var.getString(1)) == null) {
            str3 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        if (qt2Var != null && (string = qt2Var.getString(0)) != null) {
            str4 = string;
        }
        lVarArr[2] = new jz5.l("behaviour_session_id", str4);
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0));
        lVarArr[4] = new jz5.l("collection_id", pm0.v.u(this.f122255b.f122291d.getLong(0)));
        lVarArr[5] = new jz5.l("finder_username", this.f122256c);
        lVarArr[6] = new jz5.l("profile_tab_name", this.f122257d.f293121e.getResources().getString(com.tencent.mm.R.string.ey7));
        return kz5.c1.k(lVarArr);
    }
}
