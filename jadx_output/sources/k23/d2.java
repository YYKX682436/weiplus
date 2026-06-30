package k23;

/* loaded from: classes12.dex */
public final class d2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303556d;

    public d2(k23.j2 j2Var) {
        this.f303556d = j2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch$setupModeTouchListeners$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.d(motionEvent);
        k23.j2 j2Var = this.f303556d;
        boolean z17 = true;
        if (j2Var.f303597o != k23.f0.f303564f) {
            int action = motionEvent.getAction();
            k23.n1 n1Var = j2Var.C;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        n1Var.b(motionEvent.getY());
                    } else if (action != 3) {
                        z17 = false;
                    }
                }
                n1Var.c();
                n1Var.f303627c = false;
            } else {
                n1Var.a(motionEvent.getY());
            }
        } else if (motionEvent.getAction() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "键盘模式：点击右侧按钮，打开输入面板");
            k23.k1 k1Var = j2Var.f303596n;
            if (k1Var != null) {
                k1Var.a();
            }
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch$setupModeTouchListeners$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
