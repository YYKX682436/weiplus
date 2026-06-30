package u4;

/* loaded from: classes13.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final float f424547a;

    /* renamed from: b, reason: collision with root package name */
    public final float f424548b;

    /* renamed from: c, reason: collision with root package name */
    public final float f424549c;

    /* renamed from: d, reason: collision with root package name */
    public final float f424550d;

    /* renamed from: e, reason: collision with root package name */
    public final float f424551e;

    /* renamed from: f, reason: collision with root package name */
    public final float f424552f;

    /* renamed from: g, reason: collision with root package name */
    public final float f424553g;

    /* renamed from: h, reason: collision with root package name */
    public final float f424554h;

    public t(android.view.View view) {
        this.f424547a = view.getTranslationX();
        this.f424548b = view.getTranslationY();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        this.f424549c = n3.a1.l(view);
        this.f424550d = view.getScaleX();
        this.f424551e = view.getScaleY();
        this.f424552f = view.getRotationX();
        this.f424553g = view.getRotationY();
        this.f424554h = view.getRotation();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof u4.t)) {
            return false;
        }
        u4.t tVar = (u4.t) obj;
        return tVar.f424547a == this.f424547a && tVar.f424548b == this.f424548b && tVar.f424549c == this.f424549c && tVar.f424550d == this.f424550d && tVar.f424551e == this.f424551e && tVar.f424552f == this.f424552f && tVar.f424553g == this.f424553g && tVar.f424554h == this.f424554h;
    }

    public int hashCode() {
        float f17 = this.f424547a;
        int floatToIntBits = (f17 != 0.0f ? java.lang.Float.floatToIntBits(f17) : 0) * 31;
        float f18 = this.f424548b;
        int floatToIntBits2 = (floatToIntBits + (f18 != 0.0f ? java.lang.Float.floatToIntBits(f18) : 0)) * 31;
        float f19 = this.f424549c;
        int floatToIntBits3 = (floatToIntBits2 + (f19 != 0.0f ? java.lang.Float.floatToIntBits(f19) : 0)) * 31;
        float f27 = this.f424550d;
        int floatToIntBits4 = (floatToIntBits3 + (f27 != 0.0f ? java.lang.Float.floatToIntBits(f27) : 0)) * 31;
        float f28 = this.f424551e;
        int floatToIntBits5 = (floatToIntBits4 + (f28 != 0.0f ? java.lang.Float.floatToIntBits(f28) : 0)) * 31;
        float f29 = this.f424552f;
        int floatToIntBits6 = (floatToIntBits5 + (f29 != 0.0f ? java.lang.Float.floatToIntBits(f29) : 0)) * 31;
        float f37 = this.f424553g;
        int floatToIntBits7 = (floatToIntBits6 + (f37 != 0.0f ? java.lang.Float.floatToIntBits(f37) : 0)) * 31;
        float f38 = this.f424554h;
        return floatToIntBits7 + (f38 != 0.0f ? java.lang.Float.floatToIntBits(f38) : 0);
    }
}
