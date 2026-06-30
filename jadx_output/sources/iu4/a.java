package iu4;

/* loaded from: classes9.dex */
public class a implements iu4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView f295012a;

    public a(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI, com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView) {
        this.f295012a = patternLockView;
    }

    @Override // iu4.c0
    public void onDone() {
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView = this.f295012a;
        patternLockView.b();
        patternLockView.setEnableInput(true);
    }
}
