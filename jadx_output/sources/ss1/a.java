package ss1;

/* loaded from: classes8.dex */
public final class a extends y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ss1.d f411882a;

    public a(ss1.d dVar) {
        this.f411882a = dVar;
    }

    @Override // y9.c
    public void a(android.view.View view, float f17) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // y9.c
    public void b(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged ");
        sb6.append(i17);
        sb6.append(", isShowing:");
        ss1.d dVar = this.f411882a;
        android.app.Dialog dialog = dVar.f411886e;
        sb6.append(dialog != null ? java.lang.Boolean.valueOf(dialog.isShowing()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizBottomSheet", sb6.toString());
        if (i17 == 5 || i17 == 4) {
            android.app.Dialog dialog2 = dVar.f411886e;
            kotlin.jvm.internal.o.d(dialog2);
            if (dialog2.isShowing()) {
                dVar.f();
            }
        }
    }
}
