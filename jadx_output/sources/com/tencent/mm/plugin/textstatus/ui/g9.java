package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class g9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f173909d;

    public g9(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f173909d = textStatusEditActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f173909d;
        java.lang.String string = textStatusEditActivity.getString(com.tencent.mm.R.string.jvj);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        textStatusEditActivity.O7(string);
    }
}
