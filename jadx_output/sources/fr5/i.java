package fr5;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.j f265962d;

    public i(fr5.j jVar) {
        this.f265962d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float interpolation;
        fr5.j jVar = this.f265962d;
        if (jVar.f265976j) {
            int i17 = jVar.f265970d;
            if (i17 <= 0) {
                interpolation = 1.0f;
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - jVar.f265975i;
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                interpolation = jVar.f265971e.getInterpolation(e06.p.e(((float) currentTimeMillis) / i17, 0.0f, 1.0f));
            }
            float f17 = jVar.f265969c;
            float f18 = jVar.f265968b;
            jVar.f265972f.invoke(java.lang.Float.valueOf(f18 + ((f17 - f18) * interpolation)));
            if (interpolation < 1.0f) {
                jVar.f265967a.postOnAnimation(jVar.f265974h);
            } else {
                jVar.f265976j = false;
                jVar.f265973g.invoke();
            }
        }
    }
}
