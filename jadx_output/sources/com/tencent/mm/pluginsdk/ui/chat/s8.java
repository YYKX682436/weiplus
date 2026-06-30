package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class s8 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190647d;

    public s8(com.tencent.mm.pluginsdk.ui.chat.h9 h9Var) {
        this.f190647d = h9Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f190647d.f190365k = null;
    }
}
