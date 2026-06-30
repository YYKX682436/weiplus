package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j3 f124222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.tencent.mm.plugin.finder.profile.uic.j3 j3Var) {
        super(0);
        this.f124222d = j3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.j3 j3Var = this.f124222d;
        return new com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader(j3Var.getUsername(), j3Var.getContextObj(), j3Var.getActivity() instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaUI);
    }
}
