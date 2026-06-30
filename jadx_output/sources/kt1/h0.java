package kt1;

/* loaded from: classes4.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f311943a;

    /* renamed from: b, reason: collision with root package name */
    public final int f311944b;

    /* renamed from: c, reason: collision with root package name */
    public final int f311945c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f311946d = jz5.h.b(new kt1.d0(this));

    public h0(byte[] bArr, int i17, int i18) {
        this.f311943a = bArr;
        this.f311944b = i17;
        this.f311945c = i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x02d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kt1.h0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SyncTask(dataBytes=");
        byte[] bArr = this.f311943a;
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        sb6.append(", bizBit=");
        sb6.append(this.f311944b);
        sb6.append(", syncScene=");
        sb6.append(this.f311945c);
        sb6.append(" @");
        sb6.append(hashCode());
        sb6.append(')');
        return sb6.toString();
    }
}
