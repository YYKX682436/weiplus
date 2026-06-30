package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class m4 implements dx4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.o4 f187409a;

    public m4(com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var) {
        this.f187409a = o4Var;
    }

    @Override // dx4.f
    public int a() {
        com.tencent.mm.plugin.webview.permission.d O;
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f187409a.G;
        if (r0Var == null || (O = r0Var.O()) == null) {
            return 0;
        }
        return O.f183390j;
    }

    @Override // dx4.f
    public int b() {
        return this.f187409a.f187476u;
    }

    @Override // dx4.f
    public int c() {
        return this.f187409a.f187475t;
    }

    @Override // dx4.f
    public com.tencent.mm.plugin.scanner.MultiCodeMaskView d() {
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = this.f187409a;
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = o4Var.f187472q;
        if (multiCodeMaskView == null) {
            return null;
        }
        multiCodeMaskView.setTopOffset(o4Var.c());
        return multiCodeMaskView;
    }

    @Override // dx4.f
    public android.app.Activity getContext() {
        return this.f187409a.f187462d;
    }

    @Override // dx4.f
    public com.tencent.mm.plugin.webview.core.r0 getController() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f187409a.G;
        kotlin.jvm.internal.o.d(r0Var);
        return r0Var;
    }

    @Override // dx4.f
    public int getWVTopOffset() {
        return this.f187409a.c();
    }
}
