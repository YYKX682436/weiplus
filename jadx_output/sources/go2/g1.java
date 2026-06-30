package go2;

/* loaded from: classes2.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC f273980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f273981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC finderMemberVideoTabContentUIC, androidx.fragment.app.Fragment fragment) {
        super(0);
        this.f273980d = finderMemberVideoTabContentUIC;
        this.f273981e = fragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.wl wlVar;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC finderMemberVideoTabContentUIC = this.f273980d;
        androidx.appcompat.app.AppCompatActivity activity = finderMemberVideoTabContentUIC.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.plugin.finder.feed.wl wlVar2 = new com.tencent.mm.plugin.finder.feed.wl((com.tencent.mm.ui.MMActivity) activity, 2, 204, false, finderMemberVideoTabContentUIC.f121117d, finderMemberVideoTabContentUIC.f121118e, finderMemberVideoTabContentUIC.f121120g, finderMemberVideoTabContentUIC.f121119f, finderMemberVideoTabContentUIC.f121121h, 0, 0, finderMemberVideoTabContentUIC.f121122i, 8, null);
        androidx.fragment.app.Fragment fragment = this.f273981e;
        android.view.View view = fragment.getView();
        if (view == null || (refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) view.findViewById(com.tencent.mm.R.id.m6e)) == null) {
            wlVar = wlVar2;
        } else {
            wlVar = wlVar2;
            wlVar.f106180m = refreshLoadMoreLayout;
            refreshLoadMoreLayout.setSuperNestedScroll(true);
        }
        android.view.View view2 = fragment.getView();
        wlVar.C = view2 != null ? view2.findViewById(com.tencent.mm.R.id.f484229dg3) : null;
        return wlVar;
    }
}
