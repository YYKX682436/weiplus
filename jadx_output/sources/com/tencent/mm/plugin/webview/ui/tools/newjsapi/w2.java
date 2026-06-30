package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class w2 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186597e;

    public w2(nw4.k kVar, nw4.y2 y2Var) {
        this.f186596d = kVar;
        this.f186597e = y2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.x2.f186650d.e(this.f186596d, this.f186597e, i17, i18, intent);
    }
}
