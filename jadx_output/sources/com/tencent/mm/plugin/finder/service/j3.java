package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l3 f126090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f126091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.plugin.finder.service.l3 l3Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f126090d = l3Var;
        this.f126091e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.gl glVar;
        com.tencent.mm.plugin.finder.service.l3 l3Var = this.f126090d;
        android.os.PowerManager powerManager = (android.os.PowerManager) ((jz5.n) l3Var.f126125h).getValue();
        boolean z17 = !(powerManager != null ? powerManager.isInteractive() : true);
        l3Var.f126124g = z17;
        if (z17) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f126091e;
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = appCompatActivity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) appCompatActivity : null;
            if (mMFinderUI != null && (glVar = mMFinderUI.f128810i) != null) {
                ((com.tencent.mm.plugin.finder.report.a2) glVar).a("onScreenOff");
            }
        }
        i95.m c17 = i95.n0.c(zy2.gb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((au2.q) ((zy2.gb) c17)).f14088f = l3Var.f126124g;
        return jz5.f0.f302826a;
    }
}
