package yq5;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public long f464603a;

    /* renamed from: b, reason: collision with root package name */
    public float f464604b;

    /* renamed from: c, reason: collision with root package name */
    public int f464605c;

    public l() {
        int i17 = s26.f.f402379b;
        this.f464603a = java.lang.System.nanoTime() - s26.f.f402378a;
        this.f464604b = 1.0f;
        this.f464605c = 255;
    }

    public final void a(float f17) {
        if (f17 == this.f464604b) {
            return;
        }
        this.f464604b = f17;
        this.f464605c = (int) (f17 * 255);
    }
}
