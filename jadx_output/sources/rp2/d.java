package rp2;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f398578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView) {
        super(0);
        this.f398578d = nearbyLivePreviewView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NearbyLivePreviewView, live url=");
        gp2.a aVar = this.f398578d.f121529m;
        sb6.append(aVar != null ? aVar.f274206a : null);
        return sb6.toString();
    }
}
