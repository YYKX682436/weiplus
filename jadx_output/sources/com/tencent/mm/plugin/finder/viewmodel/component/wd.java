package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class wd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.yd f136338d;

    public wd(com.tencent.mm.plugin.finder.viewmodel.component.yd ydVar) {
        this.f136338d = ydVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.yd ydVar = this.f136338d;
        db5.d5 d5Var = ydVar.f136563r;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        ydVar.f136563r = null;
    }
}
