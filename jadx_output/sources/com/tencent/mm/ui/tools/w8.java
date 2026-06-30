package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class w8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f210883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.c9 f210884e;

    public w8(com.tencent.mm.ui.tools.c9 c9Var, android.app.Activity activity) {
        this.f210884e = c9Var;
        this.f210883d = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.c9 c9Var = this.f210884e;
        if (c9Var.f210321f == null) {
            com.tencent.mars.xlog.Log.w(c9Var.f210316a, "on post expand search menu, but item is null");
            return;
        }
        com.tencent.mars.xlog.Log.i(c9Var.f210316a, "try to expand action view, searchViewExpand %B", java.lang.Boolean.valueOf(c9Var.f210318c));
        if (c9Var.f210317b) {
            com.tencent.mm.ui.tools.z8 z8Var = c9Var.f210332q;
            if (z8Var != null) {
                z8Var.expandActionView();
            }
        } else {
            com.tencent.mm.ui.tools.z8 z8Var2 = c9Var.f210332q;
            if (z8Var2 != null) {
                z8Var2.expandActionView();
            }
        }
        android.view.View actionView = c9Var.f210321f.getActionView();
        if (actionView == null || !c9Var.f210318c) {
            return;
        }
        actionView.findViewById(com.tencent.mm.R.id.d98).requestFocus();
        if (c9Var.i()) {
            c9Var.f210322g.postDelayed(new com.tencent.mm.ui.tools.v8(this, actionView), 128L);
        }
    }
}
