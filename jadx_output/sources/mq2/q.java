package mq2;

/* loaded from: classes15.dex */
public final class q implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC f330760d;

    public q(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f330760d = nearbyPersonV1UIC;
    }

    @Override // i11.c
    public final boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC = this.f330760d;
        if (nearbyPersonV1UIC.f122103u) {
            return false;
        }
        nearbyPersonV1UIC.f122103u = true;
        if (nearbyPersonV1UIC.f122106x) {
            com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "dismissTipDialog");
            com.tencent.mm.ui.widget.dialog.u3 u3Var = nearbyPersonV1UIC.f122095m;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            nearbyPersonV1UIC.f122095m = null;
            com.tencent.mm.plugin.report.service.f0.e(11);
            return false;
        }
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = nearbyPersonV1UIC.f122095m;
            if (u3Var2 != null) {
                u3Var2.setMessage(nearbyPersonV1UIC.getString(com.tencent.mm.R.string.f492619h61));
            }
            nearbyPersonV1UIC.f122104v = new mq2.b(f18, f17, (int) d18);
            qa0.e eVar = (qa0.e) i95.n0.c(qa0.e.class);
            int i18 = nearbyPersonV1UIC.f122100r;
            mq2.b bVar = nearbyPersonV1UIC.f122104v;
            kotlin.jvm.internal.o.d(bVar);
            float f19 = bVar.f330719b;
            mq2.b bVar2 = nearbyPersonV1UIC.f122104v;
            kotlin.jvm.internal.o.d(bVar2);
            float f27 = bVar2.f330718a;
            mq2.b bVar3 = nearbyPersonV1UIC.f122104v;
            kotlin.jvm.internal.o.d(bVar3);
            int i19 = bVar3.f330720c;
            ((pa0.e) eVar).getClass();
            nearbyPersonV1UIC.f330722d = new an3.f(i18, f19, f27, i19, i17, "", "");
            com.tencent.mm.modelbase.r1 d27 = gm0.j1.d();
            java.lang.Object obj = nearbyPersonV1UIC.f330722d;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d27.g((com.tencent.mm.modelbase.m1) obj);
            com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "onGetLocation doScene");
        } else {
            com.tencent.mm.plugin.report.service.f0.e(11);
            com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "dismissTipDialog");
            com.tencent.mm.ui.widget.dialog.u3 u3Var3 = nearbyPersonV1UIC.f122095m;
            if (u3Var3 != null) {
                u3Var3.dismiss();
            }
            nearbyPersonV1UIC.f122095m = null;
            android.view.View findViewById = nearbyPersonV1UIC.getRootView().findViewById(com.tencent.mm.R.id.k5p);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$onLocationGet$1", "onGetLocation", "(ZFFIDDD)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$onLocationGet$1", "onGetLocation", "(ZFFIDDD)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ListView listView = nearbyPersonV1UIC.f122093h;
            kotlin.jvm.internal.o.d(listView);
            listView.setVisibility(8);
            nearbyPersonV1UIC.f122101s = true;
            if (!nearbyPersonV1UIC.f122105w && !com.tencent.mm.sdk.platformtools.n2.a()) {
                nearbyPersonV1UIC.f122105w = true;
                db5.e1.C(nearbyPersonV1UIC.getActivity(), nearbyPersonV1UIC.getString(com.tencent.mm.R.string.fs_), nearbyPersonV1UIC.getString(com.tencent.mm.R.string.f490573yv), nearbyPersonV1UIC.getString(com.tencent.mm.R.string.g6z), nearbyPersonV1UIC.getString(com.tencent.mm.R.string.f490347sg), false, new mq2.p(nearbyPersonV1UIC), null);
            }
        }
        return false;
    }
}
