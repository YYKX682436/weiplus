package w8;

/* loaded from: classes15.dex */
public final class v implements q8.e {

    /* renamed from: d, reason: collision with root package name */
    public boolean f443785d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f443786e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f443787f;

    /* renamed from: g, reason: collision with root package name */
    public q8.g f443788g;

    /* renamed from: a, reason: collision with root package name */
    public final t9.a0 f443782a = new t9.a0(0);

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f443784c = new t9.p(4096);

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f443783b = new android.util.SparseArray();

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    @Override // q8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(q8.f r17, q8.k r18) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.v.a(q8.f, q8.k):int");
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f443788g = gVar;
        gVar.b(new q8.l(-9223372036854775807L));
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        byte[] bArr = new byte[14];
        ((q8.b) fVar).b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        q8.b bVar = (q8.b) fVar;
        bVar.a(bArr[13] & 7, false);
        bVar.b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // q8.e
    public void release() {
    }

    @Override // q8.e
    public void seek(long j17, long j18) {
        this.f443782a.f416491c = -9223372036854775807L;
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f443783b;
            if (i17 >= sparseArray.size()) {
                return;
            }
            w8.u uVar = (w8.u) sparseArray.valueAt(i17);
            uVar.f443780f = false;
            uVar.f443775a.b();
            i17++;
        }
    }
}
