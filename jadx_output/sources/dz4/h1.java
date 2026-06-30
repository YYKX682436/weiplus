package dz4;

/* loaded from: classes5.dex */
public final class h1 implements com.tencent.mm.pluginsdk.ui.chat.gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dz4.k1 f245276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.q0 f245277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f245278c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ib f245279d;

    public h1(dz4.k1 k1Var, dz4.q0 q0Var, int i17, com.tencent.mm.pluginsdk.ui.chat.ib ibVar) {
        this.f245276a = k1Var;
        this.f245277b = q0Var;
        this.f245278c = i17;
        this.f245279d = ibVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.gb
    public void a() {
        dz4.k1 k1Var = this.f245276a;
        java.lang.ref.WeakReference weakReference = ((ez4.u) k1Var.f245317a).f257944c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            com.tencent.mars.xlog.Log.w(k1Var.f245318b, "onClearBtnDown: activity invalid");
        } else {
            k1Var.b(this.f245277b, this.f245278c);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.gb
    public void b(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        dz4.k1 k1Var = this.f245276a;
        java.lang.ref.WeakReference weakReference = ((ez4.u) k1Var.f245317a).f257944c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            com.tencent.mars.xlog.Log.w(k1Var.f245318b, "onSendMsg: activity invalid");
            return;
        }
        java.lang.String str = k1Var.f245318b;
        k1Var.c(new dz4.g1(this.f245277b, text));
        this.f245279d.n();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.gb
    public void c(boolean z17) {
    }
}
