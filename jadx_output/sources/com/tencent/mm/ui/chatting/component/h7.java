package com.tencent.mm.ui.chatting.component;

/* loaded from: classes10.dex */
public final class h7 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.k7 f199154d;

    public h7(com.tencent.mm.ui.chatting.component.k7 k7Var) {
        this.f199154d = k7Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        java.util.Objects.toString(view);
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
        ((jz5.n) this.f199154d.f199351b).getValue();
    }
}
