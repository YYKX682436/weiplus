package qs3;

/* loaded from: classes8.dex */
public final class f0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarStateView f366346a;

    public f0(com.tencent.mm.plugin.radar.ui.RadarStateView radarStateView) {
        this.f366346a = radarStateView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = com.tencent.mm.plugin.radar.ui.RadarStateView.f155011m;
        com.tencent.mm.plugin.radar.ui.RadarStateView radarStateView = this.f366346a;
        radarStateView.d();
        radarStateView.c();
    }
}
