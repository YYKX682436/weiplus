package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class z implements com.tencent.mm.plugin.mmsight.ui.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.x f149451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton f149452b;

    public z(com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton, com.tencent.mm.plugin.mmsight.ui.x xVar) {
        this.f149452b = mMSightRecordButton;
        this.f149451a = xVar;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.x
    public void a(boolean z17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MMSightRecordButton", "outer, onProgressFinish", new java.lang.Object[0]);
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = this.f149452b;
        mMSightRecordButton.c();
        mMSightRecordButton.g(new com.tencent.mm.plugin.mmsight.ui.y(this, z17));
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.x
    public void b(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.mmsight.ui.x xVar = this.f149451a;
        if (xVar != null) {
            xVar.b(arrayList);
        }
    }
}
