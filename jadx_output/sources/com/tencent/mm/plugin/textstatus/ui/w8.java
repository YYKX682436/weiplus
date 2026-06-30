package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class w8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174405d;

    public w8(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174405d = textStatusEditActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object value = ((jz5.n) this.f174405d.f173609v).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((androidx.core.widget.NestedScrollView) value).e(130);
    }
}
