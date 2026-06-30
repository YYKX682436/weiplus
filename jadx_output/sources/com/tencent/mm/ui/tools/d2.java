package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class d2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210348d;

    public d2(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210348d = cropImageNewUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f210348d.f210002h.b();
        return true;
    }
}
