package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class h0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.p0 f144823d;

    public h0(com.tencent.mm.plugin.location.ui.impl.p0 p0Var) {
        this.f144823d = p0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.location.ui.impl.p0 p0Var = this.f144823d;
        p0Var.X.e(false);
        p0Var.Y.h();
        p0Var.Y.b(2);
        p0Var.f144864p0.c();
        p0Var.f144728d.finish();
    }
}
