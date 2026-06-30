package i62;

/* loaded from: classes13.dex */
public final class f extends com.tencent.mm.app.s2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.x2.n();
        i62.o oVar = i62.o.f288963a;
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.plugin.expt.resource.MMResReporter");
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }
}
