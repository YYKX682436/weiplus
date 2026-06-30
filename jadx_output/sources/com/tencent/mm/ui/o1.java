package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.BaseActivity f209444d;

    public o1(com.tencent.mm.ui.BaseActivity baseActivity) {
        this.f209444d = baseActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f209444d.supportInvalidateOptionsMenu();
    }
}
