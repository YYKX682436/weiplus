package rz3;

/* loaded from: classes15.dex */
public final class i extends rz3.g {

    /* renamed from: g, reason: collision with root package name */
    public final rz3.d f401814g;

    /* renamed from: h, reason: collision with root package name */
    public final sz3.v0 f401815h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f401816i;

    public i(android.content.Context context, java.lang.String session, int i17, int i18, boolean z17, com.tencent.scanlib.ui.ScanView scanView, rz3.c uiCallback, com.tencent.mm.plugin.scanner.view.s loadingViewModel, sz3.q aiImageHandleCallback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(scanView, "scanView");
        kotlin.jvm.internal.o.g(uiCallback, "uiCallback");
        kotlin.jvm.internal.o.g(loadingViewModel, "loadingViewModel");
        kotlin.jvm.internal.o.g(aiImageHandleCallback, "aiImageHandleCallback");
        this.f401814g = new rz3.d(session, i17, i18, z17, scanView, uiCallback, loadingViewModel);
        this.f401815h = new sz3.v0(context, aiImageHandleCallback);
    }

    @Override // rz3.a
    public void b(long j17, java.lang.Object obj) {
        sz3.v0 v0Var;
        rz3.h hVar = (rz3.h) obj;
        if (this.f401816i) {
            return;
        }
        if (hVar != null && hVar.f401812a == 1) {
            java.lang.Object obj2 = hVar.f401813b;
            if (obj2 instanceof android.os.Bundle) {
                rz3.d dVar = this.f401814g;
                if (dVar != null) {
                    dVar.b(j17, (android.os.Bundle) obj2);
                    return;
                }
                return;
            }
        }
        if (hVar != null && hVar.f401812a == 2) {
            java.lang.Object obj3 = hVar.f401813b;
            if (!(obj3 instanceof sz3.c1) || (v0Var = this.f401815h) == null) {
                return;
            }
            v0Var.b(j17, (sz3.c1) obj3);
        }
    }

    @Override // rz3.g
    public void c(long j17, boolean z17) {
    }

    @Override // rz3.a
    public void destroy() {
        this.f401816i = true;
        rz3.d dVar = this.f401814g;
        if (dVar != null) {
            dVar.destroy();
        }
        sz3.v0 v0Var = this.f401815h;
        if (v0Var != null) {
            v0Var.destroy();
        }
    }
}
