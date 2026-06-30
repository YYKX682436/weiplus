package rp2;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f398587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView) {
        super(2);
        this.f398587d = nearbyLivePreviewView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        yz5.p pVar = this.f398587d.f121541y;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue2));
        }
        return jz5.f0.f302826a;
    }
}
