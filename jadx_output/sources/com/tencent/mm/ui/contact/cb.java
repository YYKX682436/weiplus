package com.tencent.mm.ui.contact;

/* loaded from: classes8.dex */
public class cb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f206646d;

    public cb(android.app.Activity activity) {
        this.f206646d = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f206646d.finish();
    }
}
