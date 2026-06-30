package rp2;

/* loaded from: classes8.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f398584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f398585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z17, com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView) {
        super(0);
        this.f398584d = z17;
        this.f398585e = nearbyLivePreviewView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        so2.h1 h1Var;
        float f17 = this.f398584d ? 1.0f : 0.0f;
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f398585e;
        if (!(nearbyLivePreviewView.getAlpha() == f17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set alpha:");
            sb6.append(f17);
            sb6.append(" feedId: ");
            gp2.a aVar = nearbyLivePreviewView.f121529m;
            sb6.append((aVar == null || (h1Var = aVar.f274196c) == null) ? null : java.lang.Long.valueOf(h1Var.getItemId()));
            nearbyLivePreviewView.r(sb6.toString());
            nearbyLivePreviewView.setAlpha(f17);
        }
        return jz5.f0.f302826a;
    }
}
