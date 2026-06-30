package qs3;

/* loaded from: classes15.dex */
public final class g0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarTipsView f366348a;

    public g0(com.tencent.mm.plugin.radar.ui.RadarTipsView radarTipsView) {
        this.f366348a = radarTipsView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f366348a.setVisibility(8);
    }
}
