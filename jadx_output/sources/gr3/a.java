package gr3;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f274838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f274840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f274841g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f274842h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f274843i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f274844m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f274845n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f274846o;

    public a(long j17, java.lang.String str, long j18, java.lang.Long l17, java.lang.Long l18, long j19, int i17, int i18, int i19) {
        this.f274838d = j17;
        this.f274839e = str;
        this.f274840f = j18;
        this.f274841g = l17;
        this.f274842h = l18;
        this.f274843i = j19;
        this.f274844m = i17;
        this.f274845n = i18;
        this.f274846o = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.mmdata.rpt.BrandCreatorProfileOperationStruct brandCreatorProfileOperationStruct = new com.tencent.mm.autogen.mmdata.rpt.BrandCreatorProfileOperationStruct();
        long j17 = this.f274838d;
        if (j17 == 0) {
            byte[] decode = android.util.Base64.decode(((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Bi(), 0);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            j17 = com.tencent.mm.sdk.platformtools.t8.V(new java.lang.String(decode, r26.c.f368865a), 0L);
        }
        java.lang.String str = this.f274839e;
        boolean z17 = str == null || str.length() == 0;
        long j18 = this.f274840f;
        if (z17 || j18 != 1) {
            if (this.f274841g == null) {
                brandCreatorProfileOperationStruct.f55438e = 0L;
            } else {
                brandCreatorProfileOperationStruct.f55438e = ((int) r6.longValue()) & io.flutter.embedding.android.KeyboardMap.kValueMask;
            }
        } else {
            brandCreatorProfileOperationStruct.f55438e = gr3.e.a(str, "").f274854a;
        }
        brandCreatorProfileOperationStruct.f55437d = j17;
        java.lang.Long l17 = this.f274842h;
        brandCreatorProfileOperationStruct.f55439f = l17 != null ? l17.longValue() : 0L;
        brandCreatorProfileOperationStruct.f55440g = this.f274843i;
        brandCreatorProfileOperationStruct.f55441h = j18;
        brandCreatorProfileOperationStruct.f55443j = this.f274844m;
        brandCreatorProfileOperationStruct.f55442i = brandCreatorProfileOperationStruct.b("SessionId", java.lang.String.valueOf(com.tencent.mm.storage.c2.f193803a), true);
        brandCreatorProfileOperationStruct.f55445l = this.f274845n;
        brandCreatorProfileOperationStruct.f55444k = this.f274846o;
        brandCreatorProfileOperationStruct.k();
    }
}
