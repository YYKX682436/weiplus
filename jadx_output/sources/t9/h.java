package t9;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f416513a;

    /* renamed from: b, reason: collision with root package name */
    public final int f416514b;

    /* renamed from: c, reason: collision with root package name */
    public final int f416515c;

    /* renamed from: d, reason: collision with root package name */
    public final long f416516d;

    public h(byte[] bArr, int i17) {
        t9.o oVar = new t9.o(bArr, bArr.length);
        oVar.e(i17 * 8);
        oVar.d(16);
        oVar.d(16);
        oVar.d(24);
        oVar.d(24);
        this.f416513a = oVar.d(20);
        this.f416514b = oVar.d(3) + 1;
        this.f416515c = oVar.d(5) + 1;
        this.f416516d = ((oVar.d(4) & 15) << 32) | (oVar.d(32) & io.flutter.embedding.android.KeyboardMap.kValueMask);
    }
}
