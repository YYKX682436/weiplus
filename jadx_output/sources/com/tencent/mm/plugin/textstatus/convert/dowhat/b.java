package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.dowhat.i f173223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f173224e;

    public b(com.tencent.mm.plugin.textstatus.convert.dowhat.i iVar, android.content.Context context) {
        this.f173223d = iVar;
        this.f173224e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f173224e;
        kotlin.jvm.internal.o.f(context, "$context");
        com.tencent.mm.plugin.textstatus.convert.dowhat.i iVar = this.f173223d;
        iVar.getClass();
        java.lang.Object systemService = context.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(iVar.f173238i, 0);
    }
}
