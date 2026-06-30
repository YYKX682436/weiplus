package com.tencent.mm.plugin.finder.nearby.person;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/person/NearbyPersonFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NearbyPersonFragment extends com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment {
    public NearbyPersonFragment() {
        super(com.tencent.mm.R.string.h7e, 1003);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public void A0() {
        if (getActivity() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.UIComponentFragment", "onMenuClick()");
            return;
        }
        com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC = (com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC) j0(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC.class);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) nearbyPersonV1UIC.getActivity(), 1, false);
        nearbyPersonV1UIC.H = k0Var;
        k0Var.f211872n = mq2.z.f330769d;
        k0Var.f211881s = new mq2.a0(nearbyPersonV1UIC);
        k0Var.C = mq2.b0.f330721a;
        k0Var.p(mq2.c0.f330725d);
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = nearbyPersonV1UIC.H;
        if (k0Var2 != null) {
            k0Var2.v();
        }
        rq2.u.f398889a.b(5L);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
        rq2.x.f398914a.c(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.NearbyPersonFragment);
        aVar.Rj(this, iy1.a.PeopleNearby);
        aVar.ck(this, true);
        aVar.ik(this, 40, 24184);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        ((com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC) j0(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC.class)).onRequestPermissionsResult(i17, permissions, grantResults);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        super.p0();
        rq2.x.f398914a.d(this);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 77;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    /* renamed from: u0 */
    public java.lang.String getF121516t() {
        return "1003";
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public java.lang.String w0() {
        return "77-1003";
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public int x0() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public void y0() {
        if (getActivity() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.UIComponentFragment", "onActionbarClick()");
        }
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public void z0() {
        if (getActivity() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.UIComponentFragment", "onActionbarDoubleClick()");
            return;
        }
        android.widget.ListView listView = ((com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC) j0(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC.class)).f122093h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(listView);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "onActionbarDoubleClick", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        com.tencent.mm.sdk.platformtools.m.a((android.widget.ListView) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "onActionbarDoubleClick", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
    }
}
