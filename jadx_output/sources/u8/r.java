package u8;

/* loaded from: classes15.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f425362a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.n f425363b;

    /* renamed from: c, reason: collision with root package name */
    public final int f425364c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f425365d;

    public r(boolean z17, java.lang.String str, int i17, byte[] bArr, int i18, int i19, byte[] bArr2) {
        int i27 = 1;
        t9.a.a((bArr2 == null) ^ (i17 == 0));
        this.f425362a = str;
        this.f425364c = i17;
        this.f425365d = bArr2;
        if (str != null && (str.equals("cbc1") || str.equals("cbcs"))) {
            i27 = 2;
        }
        this.f425363b = new q8.n(i27, bArr, i18, i19);
    }
}
