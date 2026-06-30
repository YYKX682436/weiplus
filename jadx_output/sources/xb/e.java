package xb;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f452864a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final xb.f f452865b;

    /* renamed from: c, reason: collision with root package name */
    public xb.c[] f452866c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Set f452867d;

    public e(xb.f fVar) {
        this.f452865b = fVar;
    }

    public void a(float f17) {
        java.util.ArrayList arrayList = this.f452864a;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            xb.d dVar = (xb.d) arrayList.get(i17);
            if (f17 == 1.0f) {
                dVar.f452849c = dVar.f452850d;
                dVar.f452861o = 0.0f;
                dVar.f452862p = 0.0f;
            }
            float f18 = dVar.f452848b.f452870c;
            float abs = ((java.lang.Math.abs(dVar.f452853g - dVar.f452852f) * f18) * f17) / f18;
            int i18 = (int) abs;
            float f19 = dVar.f452862p * (1.0f - f17);
            int i19 = dVar.f452863q;
            dVar.f452855i = ((abs - i18) * f18 * i19) + f19;
            dVar.f452854h = dVar.f452852f + (i18 * i19);
            dVar.f452856j = f18;
            float f27 = dVar.f452857k;
            dVar.f452858l = f27 + ((dVar.f452859m - f27) * f17);
        }
    }
}
