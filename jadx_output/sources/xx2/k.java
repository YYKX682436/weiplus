package xx2;

/* loaded from: classes3.dex */
public final class k extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx2.l f457976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f457977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f457978f;

    public k(xx2.l lVar, float f17, float f18) {
        this.f457976d = lVar;
        this.f457977e = f17;
        this.f457978f = f18;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        float f18 = this.f457978f;
        float f19 = this.f457977e;
        this.f457976d.b(f19 + (f17 * (f18 - f19)));
    }
}
