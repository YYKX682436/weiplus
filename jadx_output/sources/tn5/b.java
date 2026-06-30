package tn5;

/* loaded from: classes15.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public float f420854d;

    /* renamed from: e, reason: collision with root package name */
    public final int f420855e;

    /* renamed from: f, reason: collision with root package name */
    public int f420856f;

    /* renamed from: g, reason: collision with root package name */
    public long f420857g = android.view.animation.AnimationUtils.currentAnimationTimeMillis();

    /* renamed from: h, reason: collision with root package name */
    public float f420858h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tn5.f f420859i;

    public b(tn5.f fVar, float f17, int i17) {
        this.f420859i = fVar;
        this.f420854d = f17;
        this.f420855e = i17;
        fVar.f420868a.getF213750w().postDelayed(this, 10);
        float f18 = this.f420854d;
        tn5.a aVar = fVar.f420869b;
        if (f18 > 0.0f) {
            aVar.e(sn5.b.f410159r);
        } else {
            aVar.e(sn5.b.f410161t);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        double pow;
        tn5.f fVar = this.f420859i;
        if (fVar.f420871d != this || fVar.f420869b.f420851b.f410172h) {
            return;
        }
        float f17 = this.f420854d;
        mn5.b bVar = fVar.f420870c;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("cValues");
            throw null;
        }
        int abs = java.lang.Math.abs(bVar.f330209b);
        int i17 = this.f420855e;
        if (abs < java.lang.Math.abs(i17)) {
            this.f420856f = this.f420856f + 1;
            pow = java.lang.Math.pow(0.95d, r2 * 2);
        } else if (i17 != 0) {
            this.f420856f = this.f420856f + 1;
            pow = java.lang.Math.pow(0.45d, r2 * 2);
        } else {
            this.f420856f = this.f420856f + 1;
            pow = java.lang.Math.pow(0.85d, r2 * 2);
        }
        this.f420854d = f17 * ((float) pow);
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        float f18 = this.f420854d * ((((float) (currentAnimationTimeMillis - this.f420857g)) * 1.0f) / 1000);
        if (java.lang.Math.abs(f18) >= 1.0f) {
            this.f420857g = currentAnimationTimeMillis;
            float f19 = this.f420858h + f18;
            this.f420858h = f19;
            fVar.f420868a.u(f19);
            fVar.f420868a.getF213750w().postDelayed(this, 10);
            return;
        }
        tn5.a aVar = fVar.f420869b;
        sn5.b bVar2 = aVar.f420852c;
        boolean z17 = bVar2.f410170f;
        if (z17 && bVar2.f410168d) {
            aVar.e(sn5.b.f410158q);
        } else if (z17 && bVar2.f410169e) {
            aVar.e(sn5.b.f410160s);
        }
        fVar.f420871d = null;
        mn5.b bVar3 = fVar.f420870c;
        if (bVar3 == null) {
            kotlin.jvm.internal.o.o("cValues");
            throw null;
        }
        if (java.lang.Math.abs(bVar3.f330209b) >= java.lang.Math.abs(i17)) {
            android.content.Context context = fVar.f420868a.getContext();
            if (fVar.f420870c == null) {
                kotlin.jvm.internal.o.o("cValues");
                throw null;
            }
            fVar.a(i17, 0, fVar.f420868a.getInterpolator(), 10 * java.lang.Math.min(java.lang.Math.max((int) ym5.x.b(context, java.lang.Math.abs(r2.f330209b - i17)), 30), 100));
        }
    }
}
