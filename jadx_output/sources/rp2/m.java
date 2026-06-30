package rp2;

/* loaded from: classes10.dex */
public final class m implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f398589d;

    public m(com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView) {
        this.f398589d = nearbyLivePreviewView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        int i17 = com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView.T;
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f398589d;
        if (nearbyLivePreviewView.Q) {
            return;
        }
        nearbyLivePreviewView.Q = true;
        com.tencent.mm.plugin.finder.feed.uf ufVar = nearbyLivePreviewView.f121540x;
        if (ufVar != null) {
            ufVar.c();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        int i17 = com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView.T;
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f398589d;
        if (nearbyLivePreviewView.Q) {
            nearbyLivePreviewView.Q = false;
            com.tencent.mm.plugin.finder.feed.uf ufVar = nearbyLivePreviewView.f121540x;
            if (ufVar != null) {
                ufVar.e();
            }
        }
    }
}
