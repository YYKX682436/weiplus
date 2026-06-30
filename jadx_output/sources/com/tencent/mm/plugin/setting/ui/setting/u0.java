package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class u0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI f161592d;

    public u0(com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
        this.f161592d = colorfulChatroomQRCodeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f161592d;
        r14.y yVar = colorfulChatroomQRCodeUI.f160138t;
        yVar.f368636d = true;
        yVar.b();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = yVar.f368637e;
        if (k0Var != null) {
            k0Var.v();
        }
        v24.e.c(colorfulChatroomQRCodeUI.a7(), 21, 99, null, null, 0, 28, null);
        return true;
    }
}
