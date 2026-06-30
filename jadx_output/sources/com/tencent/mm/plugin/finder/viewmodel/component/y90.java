package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class y90 implements fz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler f136542d;

    public y90(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler) {
        this.f136542d = finderVideoRecycler;
    }

    @Override // fz2.b
    public void M7(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "onHeadsetStateChange on:" + z17);
        java.util.Iterator it = this.f136542d.f133683s.iterator();
        while (it.hasNext()) {
            ((fz2.b) it.next()).M7(z17);
        }
    }
}
