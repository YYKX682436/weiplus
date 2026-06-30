package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class o1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.s1 f185299d;

    public o1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.plugin.webview.model.s1 s1Var) {
        this.f185299d = s1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f185299d);
    }
}
