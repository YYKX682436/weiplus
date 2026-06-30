package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class r implements com.tencent.mm.plugin.voip.model.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.s f149754a;

    public r(com.tencent.mm.plugin.multitalk.ilinkservice.s sVar) {
        this.f149754a = sVar;
    }

    @Override // com.tencent.mm.plugin.voip.model.b
    public int a(byte[] bArr, int i17) {
        if (this.f149754a.f149763e != 2) {
            return -1;
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.getClass();
        return com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.GetAudioData(bArr, i17) < 0 ? -1 : 0;
    }
}
