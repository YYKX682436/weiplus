package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.fa f146787d;

    public ca(com.tencent.mm.plugin.luckymoney.ui.fa faVar) {
        this.f146787d = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.res.Resources resources;
        com.tencent.mm.plugin.luckymoney.ui.fa faVar = this.f146787d;
        androidx.appcompat.app.AppCompatActivity activity = faVar.getActivity();
        androidx.appcompat.app.AppCompatActivity activity2 = faVar.getActivity();
        db5.t7.m(activity, (activity2 == null || (resources = activity2.getResources()) == null) ? null : resources.getString(com.tencent.mm.R.string.lha));
    }
}
