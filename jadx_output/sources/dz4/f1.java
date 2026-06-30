package dz4;

/* loaded from: classes5.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ib f245239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.k1 f245240e;

    public f1(com.tencent.mm.pluginsdk.ui.chat.ib ibVar, dz4.k1 k1Var) {
        this.f245239d = ibVar;
        this.f245240e = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.k1 k1Var = this.f245240e;
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f245239d;
        try {
            ibVar.f();
            ibVar.setVisibility(8);
            android.view.ViewParent parent = ibVar.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(ibVar);
            }
            com.tencent.mars.xlog.Log.i(k1Var.f245318b, "closeVoiceInputView: panel closed and removed");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(k1Var.f245318b, "closeVoiceInputView: error closing panel", e17);
        }
    }
}
