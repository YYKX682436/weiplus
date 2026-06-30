package rp2;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f398581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView) {
        super(1);
        this.f398581d = nearbyLivePreviewView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.s7 it = (r45.s7) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f398581d;
        mn0.b0 player = nearbyLivePreviewView.getPlayer();
        if (player != null) {
            android.content.Context context = nearbyLivePreviewView.getContext();
            if (!java.lang.Boolean.valueOf(context instanceof androidx.appcompat.app.AppCompatActivity).booleanValue()) {
                context = null;
            }
            if (context == null) {
                context = com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
            }
            ((mn0.y) player).r(nearbyLivePreviewView.i(context), nearbyLivePreviewView.P, it.getInteger(0), it.getInteger(1));
        }
        return jz5.f0.f302826a;
    }
}
