package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderHomeTabFragment extends com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment {

    /* renamed from: n, reason: collision with root package name */
    public int f129263n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f129264o;

    /* renamed from: p, reason: collision with root package name */
    public int f129265p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f129266q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f129267r;

    /* renamed from: s, reason: collision with root package name */
    public android.os.Bundle f129268s;

    public FinderHomeTabFragment() {
        this.f129264o = "";
        this.f129266q = "";
        this.f129267r = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f129263n = -1;
        this.f129265p = -1;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        this.f129267r.set(true);
        super.o0();
    }

    public boolean onBackPressed() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        super.p0();
        this.f129268s = null;
    }

    public void s0() {
    }

    public void t0() {
    }

    public void u0(rn5.a extInfo) {
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
    }

    public void w0() {
    }

    public int x0() {
        return 0;
    }

    public FinderHomeTabFragment(int i17) {
        this.f129264o = "";
        this.f129266q = "";
        this.f129267r = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f129263n = -1;
        this.f129265p = i17;
    }

    public FinderHomeTabFragment(int i17, int i18) {
        this.f129264o = "";
        this.f129266q = "";
        this.f129267r = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f129263n = i17;
        this.f129265p = i18;
    }
}
