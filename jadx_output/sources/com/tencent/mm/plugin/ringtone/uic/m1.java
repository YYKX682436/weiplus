package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.x1 f158447d;

    public m1(com.tencent.mm.plugin.ringtone.uic.x1 x1Var) {
        this.f158447d = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.ringtone.uic.x1 x1Var = this.f158447d;
        x1Var.f158542e = false;
        cy3.d dVar = x1Var.f158541d;
        if (dVar != null) {
            dVar.b(false);
        }
    }
}
