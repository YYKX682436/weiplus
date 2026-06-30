package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class t9 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.u9 f190669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl5.i f190670e;

    public t9(com.tencent.mm.pluginsdk.ui.chat.u9 u9Var, fl5.i iVar) {
        this.f190669d = u9Var;
        this.f190670e = iVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.pluginsdk.ui.chat.u9 u9Var = this.f190669d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/SeqAutoCompleteHelper$supportAutoComplete$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        boolean z17 = false;
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ChatFooterKtHelper", th6, "supportAutoComplete err", new java.lang.Object[0]);
        }
        if (!u9Var.f190685a.L0()) {
            yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/chat/SeqAutoCompleteHelper$supportAutoComplete$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        fl5.i iVar = this.f190670e;
        if (i17 == 66) {
            z17 = com.tencent.mm.pluginsdk.ui.chat.u9.a(u9Var, keyEvent.getAction(), iVar);
        } else if (i17 == 67) {
            if (keyEvent.getAction() != 0) {
                u9Var.getClass();
            } else if (u9Var.d(iVar)) {
                z17 = true;
            }
        }
        yj0.a.i(z17, this, "com/tencent/mm/pluginsdk/ui/chat/SeqAutoCompleteHelper$supportAutoComplete$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return z17;
    }
}
