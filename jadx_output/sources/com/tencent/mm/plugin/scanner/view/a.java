package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public class a extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.CardHighLightEdgeView f159920a;

    public a(com.tencent.mm.plugin.scanner.view.CardHighLightEdgeView cardHighLightEdgeView) {
        this.f159920a = cardHighLightEdgeView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.scanner.view.CardHighLightEdgeView cardHighLightEdgeView = this.f159920a;
        cardHighLightEdgeView.f159866i = currentTimeMillis;
        cardHighLightEdgeView.f159861d = java.util.Arrays.copyOf(cardHighLightEdgeView.f159862e, 4);
        cardHighLightEdgeView.invalidate();
    }
}
