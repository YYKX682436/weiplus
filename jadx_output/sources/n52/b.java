package n52;

/* loaded from: classes4.dex */
public final class b implements n52.e {

    /* renamed from: a, reason: collision with root package name */
    public final n52.d f335116a;

    /* renamed from: b, reason: collision with root package name */
    public final long f335117b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f335119d = null;

    /* renamed from: c, reason: collision with root package name */
    public long f335118c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f335120e = new n52.a(this, android.os.Looper.getMainLooper());

    public b(n52.d dVar, long j17) {
        this.f335116a = dVar;
        this.f335117b = j17;
    }

    @Override // n52.e
    public void a(android.view.View view, int i17) {
        java.lang.ref.WeakReference weakReference = this.f335119d;
        if (weakReference != null) {
            if ((weakReference != null ? (android.view.View) weakReference.get() : null) != null) {
                return;
            }
        }
        this.f335119d = new java.lang.ref.WeakReference(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if ((r0 != null ? (android.view.View) r0.get() : null) == null) goto L10;
     */
    @Override // n52.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.view.View r7, int r8, int r9) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.f335118c
            long r2 = r0 - r2
            long r4 = r6.f335117b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L38
            r6.f335118c = r0
            java.lang.ref.WeakReference r0 = r6.f335119d
            if (r0 == 0) goto L20
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 != 0) goto L27
        L20:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r7)
            r6.f335119d = r0
        L27:
            android.os.Message r7 = android.os.Message.obtain()
            r0 = 100
            r7.what = r0
            r7.arg1 = r8
            r7.arg2 = r9
            android.os.Handler r8 = r6.f335120e
            r8.sendMessage(r7)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n52.b.b(android.view.View, int, int):void");
    }
}
