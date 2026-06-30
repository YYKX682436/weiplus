package mq2;

/* loaded from: classes15.dex */
public final class a0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC f330717d;

    public a0(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f330717d = nearbyPersonV1UIC;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC = this.f330717d;
        if (itemId == 1) {
            nearbyPersonV1UIC.f122100r = 4;
            nearbyPersonV1UIC.f122099q = false;
            gm0.j1.u().c().w(16386, java.lang.Integer.valueOf(nearbyPersonV1UIC.f122100r));
            nearbyPersonV1UIC.X6();
        } else if (itemId == 2) {
            nearbyPersonV1UIC.f122100r = 3;
            nearbyPersonV1UIC.f122099q = false;
            gm0.j1.u().c().w(16386, java.lang.Integer.valueOf(nearbyPersonV1UIC.f122100r));
            nearbyPersonV1UIC.X6();
        } else if (itemId == 3) {
            nearbyPersonV1UIC.f122100r = 1;
            nearbyPersonV1UIC.f122099q = false;
            gm0.j1.u().c().w(16386, java.lang.Integer.valueOf(nearbyPersonV1UIC.f122100r));
            nearbyPersonV1UIC.X6();
        } else if (itemId == 4) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(nearbyPersonV1UIC.getActivity(), "com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI");
            intent.putExtra("k_say_hi_type", 2);
            nearbyPersonV1UIC.getActivity().startActivityForResult(intent, com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION);
            com.tencent.mm.plugin.finder.extension.reddot.ga gaVar = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a;
            androidx.appcompat.app.AppCompatActivity activity = nearbyPersonV1UIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            gaVar.o(2, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NearbyPeopleBubble");
        } else if (itemId == 5) {
            ((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).getClass();
            nearbyPersonV1UIC.f330723e = new an3.f(2, 0.0f, 0.0f, 0, 0, "", "");
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            java.lang.Object obj = nearbyPersonV1UIC.f330723e;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d17.g((com.tencent.mm.modelbase.m1) obj);
            nearbyPersonV1UIC.f122095m = db5.e1.Q(nearbyPersonV1UIC.getActivity(), nearbyPersonV1UIC.getString(com.tencent.mm.R.string.f490573yv), nearbyPersonV1UIC.getString(com.tencent.mm.R.string.h5z), true, true, new mq2.w(nearbyPersonV1UIC));
        }
        rq2.u.f398889a.a(menuItem.getItemId());
    }
}
