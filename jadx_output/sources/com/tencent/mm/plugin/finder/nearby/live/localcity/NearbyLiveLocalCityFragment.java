package com.tencent.mm.plugin.finder.nearby.live.localcity;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/localcity/NearbyLiveLocalCityFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NearbyLiveLocalCityFragment extends com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment {

    /* renamed from: s, reason: collision with root package name */
    public r45.dd2 f121486s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f121487t;

    public NearbyLiveLocalCityFragment() {
        super(com.tencent.mm.R.string.h7d, 1006);
        this.f121487t = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, fp2.d.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
        r45.dd2 dd2Var = this.f121486s;
        ip2.a aVar = ip2.a.f293612a;
        if (dd2Var == null) {
            r45.dd2 dd2Var2 = new r45.dd2();
            this.f121486s = dd2Var2;
            dd2Var2.set(0, 88889);
            java.lang.String str = "8003-" + c01.id.c();
            rq2.x xVar = rq2.x.f398914a;
            aVar.a(rq2.x.f398915b, this, str, "");
        }
        rq2.x.f398914a.c(this);
        aVar.b(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.NearbyLiveLocalCityFragment);
        aVar.Rj(this, iy1.a.PeopleNearby);
        aVar.ck(this, true);
        aVar.ik(this, 40, 24184);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ip2.a.f293613b = "";
        ip2.a.f293615d = "";
        ip2.a.f293614c = "";
        ip2.a.f293616e = true;
        ip2.a.f293620i = false;
        ip2.a.f293617f = "";
        ip2.a.f293618g = -1;
        ip2.a.f293619h = -1;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getActivity() != null) {
            ip2.a.f293612a.c(this);
        }
        ip2.a.f293620i = true;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f121487t && getActivity() != null) {
            ip2.a.f293612a.b(this);
        }
        this.f121487t = false;
        ip2.a.f293620i = false;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        super.p0();
        rq2.x.f398914a.d(this);
        ip2.a.f293612a.c(this);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 112;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public java.lang.String t0() {
        r45.dd2 dd2Var = this.f121486s;
        return java.lang.String.valueOf(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.getInteger(0)) : null);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    /* renamed from: u0 */
    public java.lang.String getF121516t() {
        return "8003";
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public java.lang.String w0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("112-");
        r45.dd2 dd2Var = this.f121486s;
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.getInteger(0)) : "");
        return sb6.toString();
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public int x0() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public void y0() {
        fp2.a aVar = ((fp2.d) j0(fp2.d.class)).f265300e;
        if (aVar != null) {
            aVar.B(false);
        } else {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public void z0() {
        fp2.a aVar = ((fp2.d) j0(fp2.d.class)).f265300e;
        if (aVar != null) {
            aVar.B(true);
        } else {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
    }
}
