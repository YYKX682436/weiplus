package l46;

/* loaded from: classes13.dex */
public class e extends h46.a {

    /* renamed from: q, reason: collision with root package name */
    public int f316507q;

    /* renamed from: r, reason: collision with root package name */
    public l46.d f316508r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f316509s;

    public e(java.io.InputStream inputStream, int i17) {
        super(inputStream, i17);
        this.f316508r = l46.d.NO_BLOCK;
        int i18 = 0;
        long j17 = 0;
        while (true) {
            int i19 = i();
            if (i19 == -1) {
                throw new java.io.IOException("Premature end of stream reading size");
            }
            int i27 = i18 + 1;
            j17 |= (i19 & 127) << (i18 * 7);
            if ((i19 & 128) == 0) {
                this.f316507q = (int) j17;
                return;
            }
            i18 = i27;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x0101. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0127  */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l46.e.read(byte[], int, int):int");
    }
}
