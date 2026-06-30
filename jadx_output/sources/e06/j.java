package e06;

/* loaded from: classes5.dex */
public final class j extends kz5.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f246212d;

    /* renamed from: e, reason: collision with root package name */
    public final int f246213e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f246214f;

    /* renamed from: g, reason: collision with root package name */
    public int f246215g;

    public j(int i17, int i18, int i19) {
        this.f246212d = i19;
        this.f246213e = i18;
        boolean z17 = true;
        if (i19 <= 0 ? i17 < i18 : i17 > i18) {
            z17 = false;
        }
        this.f246214f = z17;
        this.f246215g = z17 ? i17 : i18;
    }

    @Override // kz5.x0
    public int b() {
        int i17 = this.f246215g;
        if (i17 != this.f246213e) {
            this.f246215g = this.f246212d + i17;
        } else {
            if (!this.f246214f) {
                throw new java.util.NoSuchElementException();
            }
            this.f246214f = false;
        }
        return i17;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f246214f;
    }
}
