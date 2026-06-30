package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.d4 f146692d;

    public a4(com.tencent.mm.plugin.luckymoney.ui.d4 d4Var) {
        this.f146692d = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.res.Resources resources;
        com.tencent.mm.plugin.luckymoney.ui.d4 d4Var = this.f146692d;
        androidx.appcompat.app.AppCompatActivity activity = d4Var.getActivity();
        androidx.appcompat.app.AppCompatActivity activity2 = d4Var.getActivity();
        db5.t7.m(activity, (activity2 == null || (resources = activity2.getResources()) == null) ? null : resources.getString(com.tencent.mm.R.string.lha));
    }
}
