package com.tencent.mm.ui.chatting.component;

/* loaded from: classes7.dex */
public final class g implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.k f199071d;

    public g(com.tencent.mm.ui.chatting.component.k kVar) {
        this.f199071d = kVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.ui.chatting.component.k kVar = this.f199071d;
        if (!kVar.m0() || kVar.f199326i) {
            return;
        }
        kVar.f198580d.N(true);
    }
}
