package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j2 f123580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.plugin.finder.profile.uic.j2 j2Var) {
        super(0);
        this.f123580d = j2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.j2 j2Var = this.f123580d;
        java.lang.String username = j2Var.getUsername();
        kotlin.jvm.internal.o.d(username);
        return new com.tencent.mm.plugin.finder.feed.model.FinderProfileCourseLoader(username, j2Var.getContextObj());
    }
}
