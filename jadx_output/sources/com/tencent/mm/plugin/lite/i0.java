package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class i0 extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.w f143475d;

    public i0(com.tencent.mm.plugin.lite.w wVar) {
        this.f143475d = wVar;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        com.tencent.mm.plugin.lite.w.l("app.networkInfoChange", this.f143475d.g());
    }
}
