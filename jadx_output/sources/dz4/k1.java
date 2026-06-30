package dz4;

/* loaded from: classes5.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f245317a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f245318b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.ib f245319c;

    /* renamed from: d, reason: collision with root package name */
    public int f245320d;

    public k1(ih0.p holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f245317a = holder;
        this.f245318b = "MicroMsg.WeNoteFlutterDictationHelper";
    }

    public final void a() {
        java.lang.String str = this.f245318b;
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f245319c;
        this.f245319c = null;
        if (ibVar == null) {
            return;
        }
        try {
            ibVar.animate().cancel();
            ibVar.f();
            ibVar.setVisibility(8);
            android.view.ViewParent parent = ibVar.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(ibVar);
            }
            com.tencent.mars.xlog.Log.i(str, "cleanupPanelSilently: panel cleaned up successfully");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "cleanupPanelSilently: error during cleanup", e17);
        }
    }

    public final void b(dz4.q0 callback, float f17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String str = this.f245318b;
        com.tencent.mars.xlog.Log.i(str, "closeVoiceInputView: start");
        java.lang.ref.WeakReference weakReference = ((ez4.u) this.f245317a).f257944c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            com.tencent.mars.xlog.Log.w(str, "closeVoiceInputView: activity invalid, cleanup silently");
            a();
            return;
        }
        c(new dz4.e1(callback));
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f245319c;
        boolean z17 = false;
        if (ibVar != null) {
            try {
                if (ibVar.getVisibility() == 0) {
                    if (ibVar.getParent() != null) {
                        z17 = true;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(str, "voiceInputIsShowing: error checking panel state", e17);
                this.f245319c = null;
            }
        }
        if (z17) {
            com.tencent.mm.pluginsdk.ui.chat.ib ibVar2 = this.f245319c;
            if (ibVar2 == null) {
                com.tencent.mars.xlog.Log.w(str, "closeVoiceInputView: panel is null");
                return;
            }
            this.f245319c = null;
            ibVar2.animate().cancel();
            ibVar2.animate().translationY(f17).withEndAction(new dz4.f1(ibVar2, this)).start();
        }
    }

    public final void c(yz5.a aVar) {
        java.lang.String str = this.f245318b;
        try {
            java.lang.ref.WeakReference weakReference = ((ez4.u) this.f245317a).f257944c;
            android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                aVar.invoke();
                return;
            }
            com.tencent.mars.xlog.Log.w(str, "safeNotifyCallback: activity invalid, skip");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "safeNotifyCallback: error during callback", e17);
        }
    }

    public final void d(int i17) {
        java.lang.ref.WeakReference weakReference = ((ez4.u) this.f245317a).f257944c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.String str = this.f245318b;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            com.tencent.mars.xlog.Log.w(str, "showVoiceInputPanel: activity invalid, cleanup");
            a();
            return;
        }
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f245319c;
        if (ibVar == null) {
            com.tencent.mars.xlog.Log.w(str, "showVoiceInputPanel: panel is null");
            return;
        }
        try {
            ibVar.k(true);
            ibVar.h();
            ibVar.setVisibility(0);
            ibVar.setTranslationY(i17);
            ibVar.animate().cancel();
            ibVar.animate().translationY(0.0f).withEndAction(new dz4.j1(ibVar)).start();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "showVoiceInputPanel: error during animation", e17);
            a();
        }
    }
}
