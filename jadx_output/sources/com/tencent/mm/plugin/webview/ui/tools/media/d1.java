package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes.dex */
public final class d1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.e1 f185755d;

    public d1(com.tencent.mm.plugin.webview.ui.tools.media.e1 e1Var) {
        this.f185755d = e1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        this.f185755d.g();
        return true;
    }
}
