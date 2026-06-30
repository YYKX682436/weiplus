package u85;

/* loaded from: classes10.dex */
public final class q extends u85.o {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f425722h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f425723i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f425724m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f425725n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.sticker.loader.StickerLoadInfo info) {
        super(info);
        kotlin.jvm.internal.o.g(info, "info");
        this.f425722h = "MicroMsg.StickerUrlTask";
        this.f425723i = info.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        u85.i iVar = u85.i.f425707a;
        java.lang.String str = u85.i.f425710d;
        sb6.append(str);
        sb6.append("preview/");
        this.f425724m = sb6.toString();
        this.f425725n = str + "preview.zip";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // fp0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u85.q.a():void");
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f425723i;
    }

    @Override // u85.o
    public void e(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f425722h, "onResult: " + z17 + ", " + this.f425719f.f193695m);
        super.e(z17);
    }
}
