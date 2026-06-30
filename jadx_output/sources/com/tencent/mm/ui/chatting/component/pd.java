package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class pd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.le f199683d;

    public pd(com.tencent.mm.ui.chatting.component.le leVar) {
        this.f199683d = leVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.le leVar = this.f199683d;
        java.lang.Thread thread = leVar.f199429x;
        if (thread == null || !thread.isAlive()) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = leVar.f199426u;
        if (u3Var == null) {
            leVar.f199426u = db5.e1.Q(leVar.f198580d.g(), leVar.f198580d.g().getString(com.tencent.mm.R.string.f490573yv), leVar.f198580d.g().getString(com.tencent.mm.R.string.f490468vx), true, true, new com.tencent.mm.ui.chatting.component.de(leVar));
        } else {
            if (u3Var.isShowing()) {
                return;
            }
            leVar.f199426u.show();
        }
    }
}
