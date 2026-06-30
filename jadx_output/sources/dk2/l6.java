package dk2;

/* loaded from: classes3.dex */
public final class l6 implements ss5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f233720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f233721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f233722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f233723e;

    public l6(android.content.Context context, boolean z17, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.qt2 qt2Var, r45.hc1 hc1Var) {
        this.f233719a = context;
        this.f233720b = z17;
        this.f233721c = finderObject;
        this.f233722d = qt2Var;
        this.f233723e = hc1Var;
    }

    @Override // ss5.j0
    public void a(int i17, int i18, java.lang.String str, r45.r71 resp, int i19, java.lang.String str2) {
        byte[] bArr;
        r45.nw1 nw1Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        dk2.u6 u6Var = dk2.u6.f234171a;
        android.content.Context context = this.f233719a;
        boolean a17 = u6Var.a(context);
        r45.qt2 qt2Var = this.f233722d;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f233721c;
        boolean z17 = this.f233720b;
        if (a17 && !z17) {
            u6Var.e(context, finderObject, qt2Var, true);
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "live msg errCode = " + i18);
        }
        com.tencent.mm.protobuf.g byteString = resp.getByteString(4);
        byte[] g17 = byteString != null ? byteString.g() : dk2.u6.f234179i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveMsg return Cookie = ");
        byte[] bArr2 = g17 == null ? new byte[0] : g17;
        sb6.append(new com.tencent.mm.protobuf.g(bArr2, 0, bArr2.length).i());
        sb6.append(", resp.liveCloseFlag = ");
        sb6.append(resp.getInteger(7));
        sb6.append(", errCode = ");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", sb6.toString());
        long j17 = dk2.u6.f234176f;
        r45.nw1 nw1Var2 = (r45.nw1) resp.getCustom(3);
        if (j17 == (nw1Var2 != null ? nw1Var2.getLong(0) : -1L)) {
            long j18 = dk2.u6.f234180j;
            r45.nw1 nw1Var3 = (r45.nw1) resp.getCustom(3);
            if (j18 == (nw1Var3 != null ? nw1Var3.getLong(0) : -1L) && !z17) {
                r45.hc1 hc1Var = this.f233723e;
                dk2.u6.f234178h = hc1Var;
                com.tencent.mm.protobuf.g byteString2 = resp.getByteString(4);
                dk2.u6.f234179i = byteString2 != null ? byteString2.g() : null;
                if (resp.getInteger(7) > 0) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "live is end , return");
                    u6Var.e(context, null, null, false);
                    zl2.r4 r4Var = zl2.r4.f473950a;
                    if (!r4Var.x0() || (nw1Var = (r45.nw1) resp.getCustom(3)) == null) {
                        return;
                    }
                    long j19 = nw1Var.getLong(0);
                    java.lang.String username = finderObject.getUsername();
                    if (username == null) {
                        username = "";
                    }
                    zl2.r4.D2(r4Var, j19, username, 2, 0, 8, null);
                    return;
                }
                if (i18 == -100020) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "INVALID_COOKIES, but live in on, rejoinLive");
                    u6Var.e(context, null, null, false);
                    u6Var.c(context, finderObject, qt2Var);
                    return;
                }
                long integer = resp.getInteger(17) * 1000;
                if (integer == 0) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "liveMsgDelay == 0, set to 3000");
                    integer = 30000;
                }
                ae2.b2 b2Var = ae2.b2.f3461a;
                if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.b2.S).getValue()).r()).booleanValue()) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "维修厂开关开了，固定使用一个cookie");
                    com.tencent.mm.protobuf.g byteString3 = hc1Var.getByteString(1);
                    bArr = byteString3 != null ? byteString3.g() : null;
                } else {
                    bArr = g17;
                }
                u6Var.b(this.f233719a, this.f233721c, this.f233723e, this.f233722d, integer, this.f233720b, bArr);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "not current liveId or offline，stop.  offline = " + z17);
    }
}
