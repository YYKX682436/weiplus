package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.z0 f121297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.finder.member.preview.z0 z0Var) {
        super(0);
        this.f121297d = z0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.member.preview.z0 z0Var = this.f121297d;
        androidx.appcompat.app.AppCompatActivity activity = z0Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        int i17 = z0Var.f121310m;
        return new com.tencent.mm.plugin.finder.member.preview.i0(mMActivity, 0, i17 != 0 ? i17 != 1 ? 0 : 208 : 207, (com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader) ((jz5.n) z0Var.f121317t).getValue());
    }
}
