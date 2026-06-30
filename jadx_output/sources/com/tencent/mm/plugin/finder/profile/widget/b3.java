package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class b3 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.f3 f124488a;

    public b3(com.tencent.mm.plugin.finder.profile.widget.f3 f3Var) {
        this.f124488a = f3Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.profile.widget.f3 f3Var = this.f124488a;
        return kz5.c1.k(new jz5.l("finder_context_id", f3Var.f124540b.getString(1)), new jz5.l("finder_tab_context_id", f3Var.f124540b.getString(2)), new jz5.l("comment_scene", java.lang.Integer.valueOf(f3Var.f124540b.getInteger(5))), new jz5.l("author_finder_username", xy2.c.e(f3Var.f124539a)));
    }
}
