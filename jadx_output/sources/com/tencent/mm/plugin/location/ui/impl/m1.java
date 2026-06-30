package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class m1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144851d;

    public m1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144851d = x1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144851d;
        x1Var.f144924n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.tencent.mm.plugin.location.ui.impl.PickPoi pickPoi = x1Var.f144924n;
        pickPoi.f144704f.clearAnimation();
        pickPoi.f144704f.startAnimation(pickPoi.f144703e);
    }
}
