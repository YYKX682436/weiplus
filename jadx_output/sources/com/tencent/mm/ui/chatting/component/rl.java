package com.tencent.mm.ui.chatting.component;

/* loaded from: classes.dex */
public final class rl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f199863d;

    public rl(yb5.d dVar) {
        this.f199863d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb5.d dVar = this.f199863d;
        db5.t7.i(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.kds), com.tencent.mm.R.raw.icons_filled_volume_off);
    }
}
