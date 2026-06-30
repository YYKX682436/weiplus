package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class a9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f173720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f173722f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.e8 f173723g;

    public a9(android.graphics.Bitmap bitmap, java.lang.String str, com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity, com.tencent.mm.plugin.textstatus.ui.e8 e8Var) {
        this.f173720d = bitmap;
        this.f173721e = str;
        this.f173722f = textStatusEditActivity;
        this.f173723g = e8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String path = this.f173721e;
        kotlin.jvm.internal.o.f(path, "$path");
        dj4.w.c(this.f173720d, path);
        com.tencent.mm.plugin.textstatus.ui.d8 d8Var = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f173722f;
        textStatusEditActivity.q7().post(new com.tencent.mm.plugin.textstatus.ui.z8(textStatusEditActivity, path, this.f173723g));
    }
}
