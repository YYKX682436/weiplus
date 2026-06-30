package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f131951a;

    /* renamed from: b, reason: collision with root package name */
    public wu5.c f131952b;

    public e1(long j17) {
    }

    public final void a() {
        wu5.c cVar = this.f131952b;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f131952b = null;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f131951a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f131951a = null;
    }
}
