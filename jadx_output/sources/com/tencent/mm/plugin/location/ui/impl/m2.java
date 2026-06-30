package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes8.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f144852d;

    public m2(com.tencent.mm.plugin.location.ui.impl.n2 n2Var, android.content.Context context) {
        this.f144852d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f144852d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.jua), 0).show();
    }
}
