package ke5;

/* loaded from: classes9.dex */
public abstract class s extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public int f307122i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f307123j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f307124k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f307125l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f307126m;

    public s(yb5.d dVar, hd5.v vVar) {
        super(dVar, vVar);
        this.f307122i = 0;
        this.f307123j = 0L;
        this.f307124k = 0L;
        this.f307125l = 0L;
        this.f307126m = false;
    }

    @Override // ke5.a, ke5.f0
    public void a(hd5.n nVar, boolean z17, android.os.Bundle bundle) {
        this.f307126m = true;
        super.a(nVar, z17, bundle);
    }

    @Override // ke5.a, ke5.f0
    public void b(hd5.n nVar, boolean z17) {
        this.f307126m = true;
        a(nVar, z17, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0229  */
    @Override // ke5.a, hd5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.tencent.mm.ui.chatting.view.MMChattingListView r18, hd5.q r19) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.s.c(com.tencent.mm.ui.chatting.view.MMChattingListView, hd5.q):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0071, code lost:
    
        if (r9 > r4) goto L10;
     */
    @Override // ke5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public he5.t e(hd5.n r16, android.os.Bundle r17, hd5.q r18) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.s.e(hd5.n, android.os.Bundle, hd5.q):he5.t");
    }

    public boolean h() {
        return true;
    }

    public boolean i(int i17, int i18) {
        java.lang.String x17 = this.f307041b.x();
        long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(x17);
        int F2 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(x17, 0L, m07);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", x17, java.lang.Long.valueOf(m07), java.lang.Integer.valueOf(F2));
        return i18 - F2 <= i17;
    }

    @Override // ke5.f0
    public boolean isLoading() {
        return this.f307126m;
    }

    public boolean j(int i17, int i18, long j17) {
        java.lang.String x17 = this.f307041b.x();
        int F2 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(x17, 0L, j17);
        boolean z17 = i18 - F2 <= i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s isShowTopAll:%s", x17, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(F2), java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // ke5.a, ke5.f0
    public void onCancel() {
        super.onCancel();
        this.f307126m = false;
    }
}
