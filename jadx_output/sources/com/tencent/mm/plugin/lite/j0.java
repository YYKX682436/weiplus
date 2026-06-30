package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class j0 extends com.tencent.mm.network.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.w f143476d;

    public j0(com.tencent.mm.plugin.lite.w wVar) {
        this.f143476d = wVar;
    }

    @Override // com.tencent.mm.network.b0
    public void Xe(boolean z17, int i17) {
        com.tencent.mm.plugin.lite.w wVar = this.f143476d;
        wVar.f144528h = z17;
        wVar.f144529i = i17;
        com.tencent.mm.plugin.lite.w.l("app.networkInfoChange", wVar.g());
    }
}
