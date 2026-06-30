package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.o f149059d;

    public n(com.tencent.mm.plugin.mmsight.segment.o oVar) {
        this.f149059d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.segment.MMSightEditUI mMSightEditUI = this.f149059d.f149062d;
        int i17 = com.tencent.mm.plugin.mmsight.segment.MMSightEditUI.f148857t;
        mMSightEditUI.getClass();
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = new com.tencent.mm.plugin.mmsight.ui.a2();
        mMSightEditUI.f148862h = a2Var;
        a2Var.f149284t = true;
        a2Var.f149288x = 2;
        a2Var.C = mMSightEditUI.f148868q;
        a2Var.f149280p = new com.tencent.mm.plugin.mmsight.segment.m(mMSightEditUI);
        a2Var.f149287w = mMSightEditUI.f148865n;
        a2Var.B = true;
        a2Var.d(mMSightEditUI, 512, mMSightEditUI.f148861g, mMSightEditUI.f148860f, mMSightEditUI.f148859e, mMSightEditUI.f148858d, mMSightEditUI.f148863i, mMSightEditUI.f148867p);
    }
}
