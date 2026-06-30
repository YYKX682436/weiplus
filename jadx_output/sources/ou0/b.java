package ou0;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f348883a;

    /* renamed from: b, reason: collision with root package name */
    public final float f348884b;

    /* renamed from: c, reason: collision with root package name */
    public float f348885c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f348886d = new com.tencent.maas.base.Vec2(0.0f, 0.0f);

    /* renamed from: e, reason: collision with root package name */
    public boolean f348887e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f348888f;

    public b(float f17, float f18) {
        this.f348883a = f17;
        this.f348884b = f18;
        this.f348885c = f18;
    }

    public abstract void a(float f17);

    public abstract float b(float f17, float f18, float f19);

    public abstract boolean c();

    public final void d() {
        this.f348885c = this.f348884b;
        this.f348887e = false;
        this.f348888f = false;
    }

    public java.lang.String toString() {
        return "Flag(value=" + this.f348885c + ", has=" + this.f348887e + ", first=" + this.f348888f + ')';
    }
}
