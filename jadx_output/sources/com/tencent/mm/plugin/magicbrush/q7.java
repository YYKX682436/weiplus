package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes7.dex */
public final class q7 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.s7 f148104a;

    public q7(com.tencent.mm.plugin.magicbrush.s7 s7Var) {
        this.f148104a = s7Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MagicPkgFeatureService", "onEnterForeground");
        this.f148104a.Ui().getClass();
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("MagicPkgFeatureService", "onExitForeground");
    }
}
