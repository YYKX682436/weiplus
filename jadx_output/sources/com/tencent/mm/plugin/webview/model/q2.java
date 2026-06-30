package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class q2 implements fl1.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.y2 f183070a;

    public q2(com.tencent.mm.plugin.webview.model.y2 y2Var) {
        this.f183070a = y2Var;
    }

    @Override // fl1.i1
    public void a(fl1.h1 item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.webview.model.y2 y2Var = this.f183070a;
        int i17 = item.f263786h;
        y2Var.f183201i = i17;
        com.tencent.mm.plugin.webview.model.e3 e3Var = y2Var.f183196d;
        if (e3Var == null) {
            return;
        }
        e3Var.f182859i = i17;
    }
}
