package com.tencent.mm.ui.chatting.component;

/* loaded from: classes.dex */
public final class ql implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f199792d;

    public ql(yb5.d dVar) {
        this.f199792d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb5.d dVar = this.f199792d;
        db5.t7.i(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.az9), com.tencent.mm.R.raw.icons_filled_ear);
    }
}
