package op2;

/* loaded from: classes2.dex */
public final class b implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment f347238a;

    public b(com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment) {
        this.f347238a = nearbyLiveSquareTabFragment;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        android.content.Intent intent;
        jz5.l[] lVarArr = new jz5.l[2];
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = this.f347238a;
        lVarArr[0] = new jz5.l("live_tab_id", java.lang.Integer.valueOf(nearbyLiveSquareTabFragment.f121519s.getInteger(0)));
        androidx.fragment.app.FragmentActivity activity = nearbyLiveSquareTabFragment.getActivity();
        lVarArr[1] = new jz5.l("enter_from_type", (activity == null || (intent = activity.getIntent()) == null) ? null : java.lang.Integer.valueOf(intent.getIntExtra("enter_from_type", -1)));
        return kz5.c1.k(lVarArr);
    }
}
