package zi2;

/* loaded from: classes3.dex */
public final class h implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473109d;

    public h(zi2.w wVar) {
        this.f473109d = wVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "receive micTagChangeListener");
        java.util.Iterator it = this.f473109d.x1().t().iterator();
        while (it.hasNext()) {
            ((lj2.u0) it.next()).g();
        }
    }
}
