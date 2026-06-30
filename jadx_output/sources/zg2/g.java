package zg2;

/* loaded from: classes3.dex */
public final class g implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f472827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k0 f472828e;

    public g(com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData, androidx.lifecycle.k0 k0Var) {
        this.f472827d = liveMutableData;
        this.f472828e = k0Var;
    }

    @Override // androidx.lifecycle.k0
    public final void onChanged(java.lang.Object obj) {
        if (this.f472827d.f111660d) {
            return;
        }
        this.f472828e.onChanged(obj);
    }
}
