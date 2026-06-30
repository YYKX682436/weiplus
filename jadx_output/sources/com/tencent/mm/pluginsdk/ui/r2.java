package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public final class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.SpeechInputLayout f191096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f191097e;

    public r2(com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout, android.view.MotionEvent motionEvent) {
        this.f191096d = speechInputLayout;
        this.f191097e = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout = this.f191096d;
        if (speechInputLayout.f189833r) {
            speechInputLayout.f189834s = true;
            com.tencent.mm.pluginsdk.ui.w2 w2Var = speechInputLayout.f189831p;
            if (w2Var != null) {
                android.view.MotionEvent motionEvent = this.f191097e;
                w2Var.c(motionEvent.getRawX(), motionEvent.getRawY());
            }
        }
    }
}
