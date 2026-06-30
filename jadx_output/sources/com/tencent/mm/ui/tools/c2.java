package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class c2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210310d;

    public c2(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210310d = cropImageNewUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f210310d.f210002h.a();
        return true;
    }
}
