package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes.dex */
public final class mc implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f123979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f123980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f123981c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123982d;

    public mc(r45.qt2 qt2Var, long j17, int i17, java.lang.String str) {
        this.f123979a = qt2Var;
        this.f123980b = j17;
        this.f123981c = i17;
        this.f123982d = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[8];
        r45.qt2 qt2Var = this.f123979a;
        lVarArr[0] = new jz5.l("behaviour_session_id", qt2Var != null ? qt2Var.getString(0) : null);
        lVarArr[1] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        lVarArr[2] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[3] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
        lVarArr[4] = new jz5.l("ref_commentscene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(7)) : null);
        lVarArr[5] = new jz5.l("source_feedid", pm0.v.u(this.f123980b));
        lVarArr[6] = new jz5.l("source_feed_commentScene", java.lang.Integer.valueOf(this.f123981c));
        lVarArr[7] = new jz5.l("source_feed_sessionbuffer", this.f123982d);
        return kz5.c1.k(lVarArr);
    }
}
