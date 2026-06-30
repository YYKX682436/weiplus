package com.tencent.mm.plugin.finder.nearby.base;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class AbsNearByFragment extends com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment {

    /* renamed from: n, reason: collision with root package name */
    public final int f121458n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f121459o;

    /* renamed from: p, reason: collision with root package name */
    public final int f121460p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f121461q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f121462r;

    public AbsNearByFragment() {
        this.f121461q = "";
        this.f121462r = "";
        this.f121459o = "";
        this.f121460p = -1;
    }

    public void A0() {
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        super.p0();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    public int r0() {
        return 0;
    }

    public java.lang.String s0() {
        if (android.text.TextUtils.isEmpty(this.f121462r) && !android.text.TextUtils.isEmpty(t0())) {
            this.f121462r = t0() + '-' + c01.id.c();
        }
        return this.f121462r;
    }

    public java.lang.String t0() {
        return "";
    }

    /* renamed from: u0, reason: from getter */
    public java.lang.String getF121461q() {
        return this.f121461q;
    }

    public java.lang.String w0() {
        return "1001";
    }

    public int x0() {
        return 3;
    }

    public void y0() {
    }

    public void z0() {
    }

    public AbsNearByFragment(int i17, int i18) {
        this.f121459o = "";
        this.f121461q = "";
        this.f121462r = "";
        this.f121458n = i17;
        this.f121460p = i18;
    }
}
