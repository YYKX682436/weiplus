package qs3;

/* loaded from: classes15.dex */
public final class l0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarTipsView f366359a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.radar.ui.RadarTipsView radarTipsView, android.os.Looper looper) {
        super(looper);
        this.f366359a = radarTipsView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        int i18 = com.tencent.mm.plugin.radar.ui.RadarTipsView.f155018v;
        com.tencent.mm.plugin.radar.ui.RadarTipsView radarTipsView = this.f366359a;
        radarTipsView.getClass();
        if (i17 == 0) {
            radarTipsView.b();
            return;
        }
        if (i17 == radarTipsView.f155025m) {
            if (radarTipsView.f155031s && radarTipsView.f155032t) {
                java.lang.String string = radarTipsView.getContext().getString(com.tencent.mm.R.string.f492757hr4);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                radarTipsView.f(string, -1);
                return;
            }
            return;
        }
        if (i17 == radarTipsView.f155027o) {
            radarTipsView.e();
        } else if (i17 == radarTipsView.f155028p) {
            radarTipsView.a();
        }
    }
}
