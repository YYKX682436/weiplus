package df2;

/* loaded from: classes3.dex */
public final class hp extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.ip f230348b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(df2.ip ipVar, java.lang.Class cls) {
        super(cls);
        this.f230348b = ipVar;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i(this.f230348b.f230418m, "[polling] failed. retCode = " + i17 + ", errMsg = " + errMsg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
    
        if ((r13 - (r5 != null ? r5.getLong(0) : -1)) > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00de, code lost:
    
        if ((r13 - (r5 != null ? r5.getLong(0) : -1)) > 0) goto L35;
     */
    @Override // dk2.cb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.tencent.mm.protobuf.f r18) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.hp.b(com.tencent.mm.protobuf.f):void");
    }
}
