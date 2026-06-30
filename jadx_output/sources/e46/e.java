package e46;

/* loaded from: classes16.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f249438a = new byte[65536];

    /* renamed from: b, reason: collision with root package name */
    public int f249439b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f249440c;

    public e(e46.b bVar) {
    }

    public byte a(byte b17) {
        int i17 = this.f249439b;
        this.f249438a[i17] = b17;
        int i18 = (i17 + 1) & 65535;
        if (!this.f249440c && i18 < i17) {
            this.f249440c = true;
        }
        this.f249439b = i18;
        return b17;
    }
}
