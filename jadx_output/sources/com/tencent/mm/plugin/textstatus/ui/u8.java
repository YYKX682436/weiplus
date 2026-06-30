package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class u8 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174348d;

    public u8(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174348d = textStatusEditActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174348d;
        textStatusEditActivity.i7().post(new com.tencent.mm.plugin.textstatus.ui.t8(textStatusEditActivity));
        textStatusEditActivity.i7().getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
