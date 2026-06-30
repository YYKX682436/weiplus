package u56;

/* loaded from: classes16.dex */
public final class c extends java.util.concurrent.atomic.AtomicLong implements p56.n {

    /* renamed from: d, reason: collision with root package name */
    public boolean f424818d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f424819e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Throwable f424820f;

    /* renamed from: g, reason: collision with root package name */
    public final u56.b f424821g;

    public c(u56.b bVar) {
        this.f424821g = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        r14.f424818d = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x002a, code lost:
    
        r1 = r14.f424820f;
        r2 = r10.f403257m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x002e, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0030, code lost:
    
        r2.onError(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0034, code lost:
    
        r2.onCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u56.c.a():void");
    }

    public void b(java.lang.Throwable th6) {
        if (this.f424819e) {
            return;
        }
        this.f424820f = th6;
        this.f424819e = true;
        a();
    }

    @Override // p56.n
    public void d(long j17) {
        boolean z17;
        if (j17 == 0) {
            return;
        }
        while (true) {
            long j18 = get();
            boolean z18 = true;
            z17 = j18 == 0;
            long j19 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            if (j18 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                break;
            }
            if (j17 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                j19 = j17;
            } else {
                if (j18 <= com.tencent.wcdb.core.Database.DictDefaultMatchValue - j17) {
                    j19 = j18 + j17;
                }
                z18 = z17;
            }
            if (compareAndSet(j18, j19)) {
                z17 = z18;
                break;
            }
        }
        if (z17) {
            a();
        }
    }
}
