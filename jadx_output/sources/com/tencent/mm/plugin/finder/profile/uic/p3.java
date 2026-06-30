package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f124115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        super(0);
        this.f124115d = f4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView = (com.tencent.mm.plugin.finder.view.FinderJumpAnchorView) this.f124115d.getActivity().findViewById(com.tencent.mm.R.id.fz8);
        if (finderJumpAnchorView == null) {
            return null;
        }
        finderJumpAnchorView.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.o3(finderJumpAnchorView));
        return finderJumpAnchorView;
    }
}
