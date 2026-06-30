package r36;

/* loaded from: classes16.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final r36.i0[] f369423a;

    /* renamed from: b, reason: collision with root package name */
    public final int f369424b;

    /* renamed from: c, reason: collision with root package name */
    public final int f369425c;

    public i0() {
        this.f369423a = new r36.i0[256];
        this.f369424b = 0;
        this.f369425c = 0;
    }

    public i0(int i17, int i18) {
        this.f369423a = null;
        this.f369424b = i17;
        int i19 = i18 & 7;
        this.f369425c = i19 == 0 ? 8 : i19;
    }
}
