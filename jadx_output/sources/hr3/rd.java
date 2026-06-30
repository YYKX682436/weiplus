package hr3;

/* loaded from: classes3.dex */
public final class rd extends wm3.a implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f283950d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f283951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f283950d = jz5.h.b(new hr3.nd(this));
        jz5.h.b(new hr3.qd(this));
        this.f283951e = jz5.h.b(new hr3.od(activity, this));
    }

    public final com.tencent.mm.ui.tools.f5 T6() {
        return (com.tencent.mm.ui.tools.f5) ((jz5.n) this.f283951e).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        T6().f210400e = null;
        T6().d();
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureKeyboardUIC", "onDestroy, keyboardHeightProvider close");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 T6 = T6();
        if (T6 != null) {
            T6.d();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureKeyboardUIC", "onPause, keyboardHeightProvider close");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.ui.tools.f5 T6 = T6();
        if (T6 != null) {
            T6.f();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureKeyboardUIC", "onResume, keyboardHeightProvider start");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureKeyboardUIC", "onWindowFocusChanged, hasFocus:" + z17);
        if (z17) {
            com.tencent.mm.ui.tools.f5 T6 = T6();
            if (T6 != null) {
                T6.f();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureKeyboardUIC", "onWindowFocusChanged, keyboardHeightProvider start");
        }
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureKeyboardUIC", "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.LinearLayout) ((jz5.n) this.f283950d).getValue()).getLayoutParams();
        if (layoutParams != null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(layoutParams.height, i17);
            ofInt.addUpdateListener(new hr3.pd(layoutParams, this));
            ofInt.setDuration(175L);
            ofInt.start();
        }
    }
}
