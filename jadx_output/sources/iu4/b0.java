package iu4;

/* loaded from: classes9.dex */
public class b0 implements iu4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu4.d0 f295016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295017b;

    public b0(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI, iu4.d0 d0Var) {
        this.f295017b = gestureGuardLogicUI;
        this.f295016a = d0Var;
    }

    @Override // iu4.c0
    public void onDone() {
        this.f295017b.f181311f = 0;
        iu4.d0 d0Var = this.f295016a;
        d0Var.f295023c.b();
        d0Var.f295023c.setEnableInput(true);
    }
}
