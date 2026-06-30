package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class wg implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f129989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI f129990b;

    public wg(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI finderSettingInfoUI) {
        this.f129989a = qt2Var;
        this.f129990b = finderSettingInfoUI;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        r45.qt2 qt2Var = this.f129989a;
        return kz5.c1.k(new jz5.l("behaviour_session_id", qt2Var.getString(0)), new jz5.l("finder_context_id", qt2Var.getString(1)), new jz5.l("finder_tab_context_id", qt2Var.getString(2)), new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var.getInteger(5))), new jz5.l("ref_commentscene", java.lang.Integer.valueOf(qt2Var.getInteger(7))), new jz5.l("finder_username", this.f129990b.f128722d));
    }
}
