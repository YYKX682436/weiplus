package cp2;

/* loaded from: classes2.dex */
public final class l0 implements c50.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f220845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220846b;

    public l0(gp2.l0 l0Var, cp2.v0 v0Var) {
        this.f220845a = l0Var;
        this.f220846b = v0Var;
    }

    @Override // c50.n0
    public void a(so2.j5 feed, org.json.JSONObject jsonObject, int i17) {
        r45.dd2 dd2Var;
        r45.dd2 dd2Var2;
        r45.dd2 dd2Var3;
        r45.s92 s92Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        cq2.r rVar = cq2.r.f221444a;
        android.content.Context context = this.f220845a.f274242a;
        r45.fd1 fd1Var = cp2.b.f220775x;
        int integer = (fd1Var == null || (s92Var = (r45.s92) fd1Var.getCustom(11)) == null) ? 0 : s92Var.getInteger(0);
        cp2.v0 v0Var = this.f220846b;
        androidx.fragment.app.Fragment fragment = v0Var.f220933m;
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = fragment instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) fragment : null;
        int integer2 = (nearbyLiveSquareTabFragment == null || (dd2Var3 = nearbyLiveSquareTabFragment.f121519s) == null) ? 0 : dd2Var3.getInteger(0);
        androidx.fragment.app.Fragment fragment2 = v0Var.f220933m;
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment2 = fragment2 instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) fragment2 : null;
        int integer3 = (nearbyLiveSquareTabFragment2 == null || (dd2Var2 = nearbyLiveSquareTabFragment2.f121520t) == null) ? 0 : dd2Var2.getInteger(0);
        androidx.fragment.app.Fragment fragment3 = v0Var.f220933m;
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment3 = fragment3 instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) fragment3 : null;
        rVar.a(context, i17, feed, jsonObject, integer, integer2, integer3, ((nearbyLiveSquareTabFragment3 == null || (dd2Var = nearbyLiveSquareTabFragment3.f121519s) == null) ? 0 : dd2Var.getInteger(0)) != 0);
    }
}
