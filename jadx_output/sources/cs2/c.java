package cs2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f222060a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f222061b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f222062c;

    public c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f222060a = context;
        this.f222062c = new cs2.b(this);
    }

    public final void a() {
        java.lang.String str;
        if (this.f222061b) {
            return;
        }
        this.f222061b = true;
        com.tencent.mars.xlog.Log.i("FinderPreloadSearchWorker", "preload search execute");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128060zc).getValue()).r()).booleanValue()) {
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128042yc).getValue()).r()).intValue();
            if (intValue < 0) {
                str = "SearchPreload: OFF";
            } else {
                str = "SearchPreload: " + intValue + 's';
            }
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.finder.assist.v1.f102612b;
            android.content.Context context = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (context == null) {
                context = this.f222060a;
            }
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = str;
            e4Var.c();
        }
        ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).cj(123, 14);
        su4.f1 f1Var = (su4.f1) i95.n0.c(su4.f1.class);
        if (f1Var != null) {
            ((sg0.h3) f1Var).Ai(123, this.f222060a);
        }
    }
}
