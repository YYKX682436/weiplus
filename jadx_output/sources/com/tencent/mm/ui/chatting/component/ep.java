package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class ep implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.gp f198994d;

    public ep(com.tencent.mm.ui.chatting.component.gp gpVar) {
        this.f198994d = gpVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        android.view.View view;
        com.tencent.mm.ui.chatting.component.gp gpVar = this.f198994d;
        if (gpVar.isShowing() && (view = gpVar.f199124g) != null) {
            int[] iArr = gpVar.f199127j;
            view.getLocationInWindow(iArr);
            gpVar.update((iArr[0] - gpVar.f199128k) + gpVar.f199130m, (iArr[1] - gpVar.f199129l) + gpVar.f199131n, -1, -1);
        }
        return true;
    }
}
