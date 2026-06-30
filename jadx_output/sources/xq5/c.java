package xq5;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.ZoomImageView f456126d;

    public c(com.tencent.mm.zoomimage.ZoomImageView zoomImageView) {
        this.f456126d = zoomImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.lifecycle.o b17;
        br5.e eVar;
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView = this.f456126d;
        if (zoomImageView.isAttachedToWindow()) {
            androidx.lifecycle.y a17 = androidx.lifecycle.n1.a(zoomImageView);
            if (a17 == null || (b17 = a17.mo133getLifecycle()) == null) {
                android.content.Context context = zoomImageView.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                b17 = dr5.c.b(context);
            }
            if (b17 == null || (eVar = zoomImageView.get_subsamplingEngine()) == null) {
                return;
            }
            com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = eVar.f23754c;
            m0Var.getClass();
            zq5.b.d();
            if (kotlin.jvm.internal.o.b(m0Var.f215011t, b17)) {
                return;
            }
            androidx.lifecycle.o oVar = m0Var.f215011t;
            androidx.lifecycle.v vVar = m0Var.f215005n;
            if (oVar != null) {
                oVar.c(vVar);
            }
            m0Var.f215011t = b17;
            if (m0Var.f214997f != null) {
                b17.a(vVar);
            }
        }
    }
}
