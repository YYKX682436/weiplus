package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class f9 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f134374a;

    /* renamed from: b, reason: collision with root package name */
    public long f134375b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f134376c;

    /* renamed from: d, reason: collision with root package name */
    public long f134377d;

    /* renamed from: e, reason: collision with root package name */
    public long f134378e;

    public f9() {
        super(android.os.Looper.getMainLooper());
        this.f134374a = true;
        this.f134375b = -1L;
        this.f134377d = -1L;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (!this.f134374a) {
            com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "skip carousel timer event when disable");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "handlerMessage for timer after ");
        if (msg.what == 1) {
            java.lang.Object obj = msg.obj;
            java.lang.ref.WeakReference weakReference = obj instanceof java.lang.ref.WeakReference ? (java.lang.ref.WeakReference) obj : null;
            java.lang.Object obj2 = weakReference != null ? weakReference.get() : null;
            in5.s0 s0Var = obj2 instanceof in5.s0 ? (in5.s0) obj2 : null;
            if (s0Var == null) {
                return;
            }
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
            if (finderDescPanelUIC != null) {
                finderDescPanelUIC.f7(s0Var);
            }
        }
    }
}
