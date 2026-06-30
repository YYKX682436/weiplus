package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.a2 f149421d;

    public t1(com.tencent.mm.plugin.mmsight.ui.a2 a2Var) {
        this.f149421d = a2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149421d;
        a2Var.f149276l.setFooterVisible(false);
        a2Var.f149276l.setActionBarVisible(false);
        a2Var.f149276l.setActivated(false);
        com.tencent.mm.plugin.mmsight.ui.a2.a(a2Var, true);
    }
}
