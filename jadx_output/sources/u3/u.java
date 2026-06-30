package u3;

/* loaded from: classes13.dex */
public final class u extends u3.s {

    /* renamed from: t, reason: collision with root package name */
    public u3.v f424236t;

    /* renamed from: u, reason: collision with root package name */
    public float f424237u;

    public u(java.lang.Object obj, u3.t tVar) {
        super(obj, tVar);
        this.f424236t = null;
        this.f424237u = Float.MAX_VALUE;
    }

    @Override // u3.s
    public void b() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new android.util.AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f424230f) {
            c(true);
        }
        float f17 = this.f424237u;
        if (f17 != Float.MAX_VALUE) {
            u3.v vVar = this.f424236t;
            if (vVar == null) {
                this.f424236t = new u3.v(f17);
            } else {
                vVar.f424246i = f17;
            }
            this.f424237u = Float.MAX_VALUE;
        }
    }

    public void e() {
        u3.v vVar = this.f424236t;
        if (vVar == null) {
            throw new java.lang.UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d17 = (float) vVar.f424246i;
        if (d17 > Float.MAX_VALUE) {
            throw new java.lang.UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        float f17 = this.f424231g;
        if (d17 < f17) {
            throw new java.lang.UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = java.lang.Math.abs(this.f424233i * 0.75f);
        vVar.f424241d = abs;
        vVar.f424242e = abs * 62.5d;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new android.util.AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z17 = this.f424230f;
        if (z17 || z17) {
            return;
        }
        this.f424230f = true;
        if (!this.f424227c) {
            this.f424226b = this.f424229e.a(this.f424228d);
        }
        float f18 = this.f424226b;
        if (f18 > Float.MAX_VALUE || f18 < f17) {
            throw new java.lang.IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        java.lang.ThreadLocal threadLocal = u3.f.f424209f;
        if (threadLocal.get() == null) {
            threadLocal.set(new u3.f());
        }
        u3.f fVar = (u3.f) threadLocal.get();
        java.util.ArrayList arrayList = fVar.f424211b;
        if (arrayList.size() == 0) {
            if (fVar.f424213d == null) {
                fVar.f424213d = new u3.e(fVar.f424212c);
            }
            u3.e eVar = (u3.e) fVar.f424213d;
            eVar.f424207b.postFrameCallback(eVar.f424208c);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public u(java.lang.Object obj, u3.t tVar, float f17) {
        super(obj, tVar);
        this.f424236t = null;
        this.f424237u = Float.MAX_VALUE;
        this.f424236t = new u3.v(f17);
    }
}
