package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public final class c1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f152592a;

    public c1(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f152592a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f152592a.B();
        com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152485q = null;
        com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152486r = null;
    }
}
