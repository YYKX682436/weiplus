package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f210918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.z2 f210919e;

    public y2(com.tencent.mm.ui.tools.z2 z2Var, android.view.MotionEvent motionEvent) {
        this.f210919e = z2Var;
        this.f210918d = motionEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.z2 z2Var = this.f210919e;
        if (z2Var.f210937d.f210025u) {
            android.os.Message message = new android.os.Message();
            message.what = 4661;
            message.obj = this.f210918d;
            z2Var.f210937d.f210027w.sendMessage(message);
            z2Var.f210937d.f210025u = false;
        }
    }
}
