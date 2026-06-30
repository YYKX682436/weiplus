package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class ja implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174010d;

    public ja(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174010d = textStatusEditActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f174010d.G != null) {
            return;
        }
        kotlin.jvm.internal.o.o("vBack");
        throw null;
    }
}
