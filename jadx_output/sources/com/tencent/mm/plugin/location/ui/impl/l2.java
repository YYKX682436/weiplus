package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes8.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f144846d;

    public l2(com.tencent.mm.plugin.location.ui.impl.n2 n2Var, android.content.Context context) {
        this.f144846d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f144846d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.ju9), 0).show();
    }
}
