package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class rd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.sd f199827d;

    public rd(com.tencent.mm.ui.chatting.component.sd sdVar) {
        this.f199827d = sdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.sd sdVar = this.f199827d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = sdVar.f199936e.f199426u;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        sdVar.f199936e.r0();
    }
}
