package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class ra implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f201340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f201341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.sa f201342f;

    public ra(com.tencent.mm.ui.chatting.gallery.sa saVar, int i17, int i18) {
        this.f201342f = saVar;
        this.f201340d = i17;
        this.f201341e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        com.tencent.mm.ui.chatting.gallery.sa saVar = this.f201342f;
        objArr[0] = java.lang.Integer.valueOf(saVar.f201371d.H);
        int i17 = this.f201340d;
        if (i17 <= 0) {
            i17 = saVar.f201371d.G * 1000;
        }
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(this.f201341e);
        objArr[3] = 1;
        com.tencent.mm.ui.chatting.gallery.ta taVar = saVar.f201371d;
        objArr[4] = taVar.f201422J;
        objArr[5] = java.lang.Integer.valueOf(taVar.I);
        com.tencent.mm.ui.chatting.gallery.ta taVar2 = saVar.f201371d;
        objArr[6] = taVar2.L;
        objArr[7] = java.lang.Long.valueOf(taVar2.K);
        g0Var.d(12084, objArr);
    }
}
