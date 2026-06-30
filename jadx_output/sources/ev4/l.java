package ev4;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final fv4.i f256957a;

    /* renamed from: b, reason: collision with root package name */
    public tg0.z1 f256958b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f256959c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.websearch.searchplatformwebview.PlatformWebViewLifecycle$lifecycleObserver$1 f256960d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.x, com.tencent.mm.plugin.websearch.searchplatformwebview.PlatformWebViewLifecycle$lifecycleObserver$1] */
    public l(fv4.i logicCtx) {
        kotlin.jvm.internal.o.g(logicCtx, "logicCtx");
        this.f256957a = logicCtx;
        ?? r07 = new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.websearch.searchplatformwebview.PlatformWebViewLifecycle$lifecycleObserver$1
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                ev4.l lVar = ev4.l.this;
                lVar.f256957a.f267013g = true;
                tg0.z1 z1Var = lVar.f256958b;
                if (z1Var != null) {
                    ((ev4.k) z1Var).a();
                }
                lVar.f256958b = null;
                tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
                tg0.c2 c2Var = lVar.f256957a.f267009c;
                if (l1Var != null) {
                    ((yg0.o3) l1Var).hj(c2Var != null ? c2Var.f419056k : 0, true, c2Var != null ? c2Var.f419050e : null, c2Var != null ? c2Var.f419054i : null);
                }
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onResume(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                ev4.l lVar = ev4.l.this;
                if (lVar.f256959c) {
                    lVar.f256959c = false;
                    lVar.f256957a.f267008b.i();
                }
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onStop(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                ev4.l.this.f256959c = true;
            }
        };
        this.f256960d = r07;
        android.app.Activity a17 = logicCtx.a();
        if (a17 instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) a17).mo133getLifecycle().a(r07);
            this.f256958b = new ev4.k(a17, this);
        }
    }
}
