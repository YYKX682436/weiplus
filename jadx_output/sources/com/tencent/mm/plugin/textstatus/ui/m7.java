package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class m7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174097d;

    public m7(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f174097d = textStatusDoWhatActivityV2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174097d;
        android.view.ViewGroup viewGroup = textStatusDoWhatActivityV2.f173539g;
        if (!textStatusDoWhatActivityV2.c7().y() || viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnPreDrawListener(new com.tencent.mm.plugin.textstatus.ui.j6(viewGroup, textStatusDoWhatActivityV2));
    }
}
