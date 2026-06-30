package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes12.dex */
public class j0 implements va3.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.p0 f144832a;

    public j0(com.tencent.mm.plugin.location.ui.impl.p0 p0Var) {
        this.f144832a = p0Var;
    }

    public void a() {
        com.tencent.mm.plugin.location.ui.impl.p0 p0Var = this.f144832a;
        p0Var.getClass();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        android.app.Activity activity = p0Var.f144728d;
        aVar.f211729s = of5.b.a(activity).getString(com.tencent.mm.R.string.k1w);
        aVar.f211732v = of5.b.a(activity).getString(com.tencent.mm.R.string.f490507x1);
        aVar.E = new com.tencent.mm.plugin.location.ui.impl.h0(p0Var);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(activity, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }
}
