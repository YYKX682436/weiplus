package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.z0 f121301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.finder.member.preview.z0 z0Var) {
        super(0);
        this.f121301d = z0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        android.view.View view2;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.member.preview.z0 z0Var = this.f121301d;
        androidx.appcompat.app.AppCompatActivity activity = z0Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        int i17 = z0Var.f121310m;
        com.tencent.mm.plugin.finder.member.preview.j0 j0Var = new com.tencent.mm.plugin.finder.member.preview.j0(mMActivity, 0, i17 != 0 ? i17 != 1 ? 0 : 208 : 207, false, i17, z0Var.f121307g);
        androidx.fragment.app.Fragment fragment = z0Var.getFragment();
        if (fragment != null && (view2 = fragment.getView()) != null && (refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) view2.findViewById(com.tencent.mm.R.id.m6e)) != null) {
            j0Var.f106180m = refreshLoadMoreLayout;
        }
        androidx.fragment.app.Fragment fragment2 = z0Var.getFragment();
        j0Var.f121237v = (fragment2 == null || (view = fragment2.getView()) == null) ? null : view.findViewById(com.tencent.mm.R.id.f484229dg3);
        return j0Var;
    }
}
