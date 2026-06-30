package gf;

/* loaded from: classes7.dex */
public final class k0 implements gf.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f271101a = new java.util.HashMap();

    @Override // gf.a0
    public boolean a(int i17, int i18, int i19, int i27) {
        java.util.HashMap hashMap = this.f271101a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(i18);
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) hashMap.get(sb6.toString());
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i19, i27);
        }
        return surfaceTexture != null;
    }

    @Override // gf.a0
    public boolean b(int i17, int i18) {
        java.util.HashMap hashMap = this.f271101a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(i18);
        return hashMap.remove(sb6.toString()) != null;
    }

    @Override // gf.a0
    public boolean c(int i17, int i18, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        return false;
    }

    @Override // gf.a0
    public android.graphics.SurfaceTexture d(int i17, int i18) {
        kf.b bVar = new kf.b(0);
        java.util.HashMap hashMap = this.f271101a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(i18);
        hashMap.put(sb6.toString(), bVar);
        return bVar;
    }
}
