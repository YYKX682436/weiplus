package iu4;

/* loaded from: classes9.dex */
public class z implements iu4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu4.d0 f295049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295050b;

    public z(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI, iu4.d0 d0Var) {
        this.f295050b = gestureGuardLogicUI;
        this.f295049a = d0Var;
    }

    @Override // iu4.c0
    public void onDone() {
        this.f295050b.f181321s.postDelayed(new iu4.y(this), 500L);
    }
}
