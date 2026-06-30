package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f185683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f185684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f185686g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f185687h;

    public m6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, db5.g4 g4Var, android.graphics.drawable.Drawable drawable, java.lang.String str, boolean z17) {
        this.f185687h = c6Var;
        this.f185683d = g4Var;
        this.f185684e = drawable;
        this.f185685f = str;
        this.f185686g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f185687h;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = c6Var.f184044J;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        int max = java.lang.Math.max(0, this.f185683d.y(7));
        if (this.f185687h.o(this.f185683d, max, this.f185684e, this.f185685f, this.f185686g)) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = c6Var.f184044J;
            int size = k0Var2.L.size();
            com.tencent.mm.ui.widget.dialog.l1 l1Var = k0Var2.f211868l1;
            if (l1Var == null || max < 0 || max >= size) {
                return;
            }
            l1Var.notifyItemInserted(max);
        }
    }
}
