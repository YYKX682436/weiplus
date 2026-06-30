package k23;

/* loaded from: classes12.dex */
public final class c2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303542d;

    public c2(k23.j2 j2Var) {
        this.f303542d = j2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch$setupModeTouchListeners$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.d(motionEvent);
        k23.j2 j2Var = this.f303542d;
        j2Var.getClass();
        int action = motionEvent.getAction();
        k23.n1 n1Var = j2Var.B;
        boolean z17 = true;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        z17 = false;
                    }
                } else if (j2Var.f303597o == k23.f0.f303564f) {
                    n1Var.b(motionEvent.getY());
                }
            }
            if (j2Var.f303597o != k23.f0.f303564f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "点击左侧键盘，打开输入面板");
                k23.k1 k1Var = j2Var.f303596n;
                if (k1Var != null) {
                    k1Var.a();
                }
            } else if (n1Var.f303628d) {
                n1Var.c();
            } else {
                n1Var.c();
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "点按左侧麦克风，切换到语音模式");
                k23.f0 f0Var = k23.f0.f303565g;
                if (j2Var.f303597o != f0Var) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "用户切换模式: " + j2Var.f303597o + " -> " + f0Var);
                    j2Var.l();
                    j2Var.f303599q = false;
                    j2Var.f303597o = f0Var;
                    j2Var.p(f0Var, true);
                    k23.k1 k1Var2 = j2Var.f303596n;
                    if (k1Var2 != null) {
                        k1Var2.d(f0Var);
                    }
                }
            }
            n1Var.f303627c = false;
        } else if (j2Var.f303597o == k23.f0.f303564f) {
            n1Var.a(motionEvent.getY());
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch$setupModeTouchListeners$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
