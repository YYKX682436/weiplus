package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class k0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.p0 f144837d;

    public k0(com.tencent.mm.plugin.location.ui.impl.p0 p0Var) {
        this.f144837d = p0Var;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return false;
        }
        if (d17 >= 4.0d) {
            com.tencent.mm.plugin.location.ui.impl.p0 p0Var = this.f144837d;
            za3.i1 i1Var = p0Var.X;
            if (!i1Var.f470951i) {
                i1Var.f470956n = false;
                i1Var.d(true);
                p0Var.T.setSelected(false);
            }
        }
        return true;
    }
}
