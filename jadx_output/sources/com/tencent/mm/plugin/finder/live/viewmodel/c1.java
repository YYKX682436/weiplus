package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class c1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f116965d;

    public c1(kotlin.jvm.internal.c0 c0Var) {
        this.f116965d = c0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f116965d.f310112d = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22385, 8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
