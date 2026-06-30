package iu4;

/* loaded from: classes9.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu4.z f295048d;

    public y(iu4.z zVar) {
        this.f295048d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        iu4.z zVar = this.f295048d;
        zVar.f295050b.f181321s.removeCallbacks(this);
        zVar.f295049a.f295023c.b();
        com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI = zVar.f295050b;
        gestureGuardLogicUI.f181311f = 16;
        gestureGuardLogicUI.b7(1, true);
        zVar.f295050b.Y6();
    }
}
