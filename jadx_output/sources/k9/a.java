package k9;

/* loaded from: classes15.dex */
public final class a extends i9.b {

    /* renamed from: m, reason: collision with root package name */
    public final k9.j f305450m;

    public a(java.util.List list) {
        super("DvbDecoder");
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        int i17 = 0 + 1;
        int i18 = i17 + 1;
        int i19 = ((bArr[0] & 255) << 8) | (bArr[i17] & 255);
        int i27 = i18 + 1;
        this.f305450m = new k9.j(i19, (bArr[i27] & 255) | ((bArr[i18] & 255) << 8));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 k9.k, still in use, count: 2, list:
          (r3v0 k9.k) from 0x02f1: PHI (r3v1 k9.k) = (r3v0 k9.k), (r3v8 k9.k) binds: [B:101:0x02e7, B:140:0x0422] A[DONT_GENERATE, DONT_INLINE]
          (r3v0 k9.k) from 0x024c: MOVE (r26v3 k9.k) = (r3v0 k9.k)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // i9.b
    public i9.d f(byte[] r48, int r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.a.f(byte[], int, boolean):i9.d");
    }
}
