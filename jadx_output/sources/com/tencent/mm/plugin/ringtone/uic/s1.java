package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx3.e f158484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.x1 f158485e;

    public s1(qx3.e eVar, com.tencent.mm.plugin.ringtone.uic.x1 x1Var) {
        this.f158484d = eVar;
        this.f158485e = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f158484d.f367351a == c01.z1.r().hashCode()) {
            com.tencent.mm.plugin.ringtone.uic.x1 x1Var = this.f158485e;
            x1Var.f158542e = true;
            cy3.d dVar = x1Var.f158541d;
            if (dVar != null) {
                dVar.b(true);
            }
        }
    }
}
