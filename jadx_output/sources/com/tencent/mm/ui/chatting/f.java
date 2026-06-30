package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class f implements com.tencent.mm.modelbase.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f200481d;

    public f(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f200481d = appAttachNewDownloadUI;
    }

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        float f17 = j18 == 0 ? 0.0f : (((float) j17) * 100.0f) / ((float) j18);
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f200481d;
        if (j17 < j18 && appAttachNewDownloadUI.f198101f.getVisibility() != 0) {
            appAttachNewDownloadUI.E7(true);
        }
        appAttachNewDownloadUI.f198101f.setProgress((int) f17);
    }
}
