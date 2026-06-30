package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class l3 implements com.tencent.mm.plugin.mmsight.ui.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149364a;

    public l3(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149364a = sightCaptureUI;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.i0
    public void a(int i17) {
        di3.n nVar = this.f149364a.f149233i;
        if (nVar != null) {
            nVar.q(true, true, i17);
        }
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.i0
    public void b(int i17) {
        di3.n nVar = this.f149364a.f149233i;
        if (nVar != null) {
            nVar.q(false, true, i17);
        }
    }
}
