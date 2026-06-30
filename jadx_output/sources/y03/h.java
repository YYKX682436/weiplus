package y03;

/* loaded from: classes14.dex */
public class h implements androidx.lifecycle.y {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f458644d;

    /* renamed from: e, reason: collision with root package name */
    public y03.i f458645e = null;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f458646f = null;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.b0 f458647g = new androidx.lifecycle.b0(this, true);

    public h(android.graphics.SurfaceTexture surfaceTexture) {
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0();
        this.f458644d = surfaceTexture;
        j0Var.observe(this, new androidx.lifecycle.k0() { // from class: y03.h$$b
            @Override // androidx.lifecycle.k0
            public final void onChanged(java.lang.Object obj) {
                android.util.Size size = (android.util.Size) obj;
                y03.i iVar = y03.h.this.f458645e;
                if (iVar != null) {
                    iVar.a(size.getWidth(), size.getHeight());
                }
            }
        });
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f458647g;
    }
}
