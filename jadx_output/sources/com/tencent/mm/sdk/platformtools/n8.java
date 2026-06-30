package com.tencent.mm.sdk.platformtools;

/* loaded from: classes4.dex */
public class n8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f192883d;

    public n8(com.tencent.mm.sdk.platformtools.o8 o8Var, android.view.View view) {
        this.f192883d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f192883d.setPressed(false);
    }
}
