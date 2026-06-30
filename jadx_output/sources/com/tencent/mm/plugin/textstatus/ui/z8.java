package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class z8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.e8 f174480f;

    public z8(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity, java.lang.String str, com.tencent.mm.plugin.textstatus.ui.e8 e8Var) {
        this.f174478d = textStatusEditActivity;
        this.f174479e = str;
        this.f174480f = e8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.d8 d8Var = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174478d;
        java.lang.String path = this.f174479e;
        textStatusEditActivity.t7(path, 1);
        textStatusEditActivity.Q7();
        com.tencent.mm.plugin.textstatus.ui.e8 e8Var = this.f174480f;
        if (e8Var != null) {
            kotlin.jvm.internal.o.f(path, "$path");
            ((com.tencent.mm.plugin.textstatus.ui.j9) e8Var).a(path);
        }
    }
}
