package zs5;

/* loaded from: classes15.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f475463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f475464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f475465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f475466g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.iam_scan.e f475467h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(zs5.y yVar, long j17, long j18, java.nio.ByteBuffer byteBuffer, com.tencent.wechat.aff.iam_scan.e eVar) {
        super(0);
        this.f475463d = yVar;
        this.f475464e = j17;
        this.f475465f = j18;
        this.f475466g = byteBuffer;
        this.f475467h = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zs5.u uVar;
        zs5.y yVar = this.f475463d;
        long j17 = this.f475464e;
        long j18 = this.f475465f;
        java.nio.ByteBuffer byteBuffer = this.f475466g;
        java.util.List<com.tencent.wechat.aff.iam_scan.i0> list = this.f475467h.f216996d;
        if (list == null) {
            list = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!yVar.f475515p) {
            yVar.f475515p = true;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            et5.e eVar = yVar.f475517r;
            if (eVar != null) {
                eVar.a(com.tencent.wechat.aff.iam_scan.a0.DecodeSuccessCalledInNative);
            }
            zs5.u uVar2 = yVar.f475525z;
            uVar2.getClass();
            zs5.y yVar2 = uVar2.f475484a;
            com.tencent.wechat.aff.iam_scan.d1 d1Var = yVar2.f475508i;
            boolean z17 = false;
            if (d1Var != null && d1Var.f216985d == j17) {
                if (yVar2.f475509j == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AffScanDecodeQueue", "onDecodeSuccessInner scanReportInfo is null");
                    byte[] bArr = (byte[]) yVar2.f475519t.get(java.lang.Long.valueOf(j18));
                    if (bArr == null) {
                        jz5.l lVar = yVar2.f475520u;
                        if (lVar != null && ((java.lang.Number) lVar.f302833d).longValue() == j18) {
                            z17 = true;
                        }
                        if (z17) {
                            bArr = yVar2.f475521v;
                        }
                    }
                    uVar = uVar2;
                    yVar2.f475509j = new com.tencent.qbar.ScanIdentifyReportInfo(bArr, yVar2.f475502c, yVar2.f475503d, yVar2.f475504e);
                } else {
                    uVar = uVar2;
                }
                yVar2.f475519t.remove(java.lang.Long.valueOf(j18));
                java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) yVar2.f475518s.remove(java.lang.Long.valueOf(j18));
                com.tencent.wechat.aff.iam_scan.d1 d1Var2 = yVar2.f475508i;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - (d1Var2 != null ? d1Var2.f216988g : -1L);
                com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", "onDecodeSuccessInner sessionId: " + j17 + ", decodeResultList.size: " + list.size() + ", totalCost: " + currentTimeMillis2 + ", bufferKey: " + j18 + ", removeRet: " + byteBuffer2 + ", previewBuffer: " + byteBuffer);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("decode_success_cost_time", currentTimeMillis2);
                bundle.putParcelable("ScanIdentifyReportInfo.DecodeKey", yVar2.f475509j);
                for (com.tencent.wechat.aff.iam_scan.i0 i0Var : list) {
                    byte[] c17 = et5.g.c(i0Var);
                    java.lang.String a17 = et5.g.a(i0Var);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", "onDecodeSuccessInner result: " + a17 + ", charset: " + i0Var.f217057g);
                    com.tencent.qbar.WxQBarResult wxQBarResult = new com.tencent.qbar.WxQBarResult(i0Var.f217055e, i0Var.f217056f, a17, c17, i0Var.f217057g, i0Var.f217058h);
                    wxQBarResult.f215250m = i0Var.f217060m;
                    wxQBarResult.f215251n = i0Var.f217062o;
                    wxQBarResult.f215253p = true;
                    com.tencent.qbar.QbarNative$QBarPoint a18 = zs5.y.A.a(i0Var);
                    if (a18 != null) {
                        arrayList2.add(a18);
                        wxQBarResult.f215252o = new com.tencent.qbar.WxQBarPoint(a18);
                    }
                    arrayList.add(wxQBarResult);
                    if (!yVar2.f475501b.f475345a) {
                        break;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", "onDecodeSuccessInner finalResultList.size: " + arrayList.size());
                if (!arrayList.isEmpty()) {
                    d75.b.g(new zs5.s(uVar.f475484a, j17, arrayList, arrayList2, bundle));
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDecodeSuccessInner sessionId: ");
                sb6.append(j17);
                sb6.append(" != ");
                com.tencent.wechat.aff.iam_scan.d1 d1Var3 = yVar2.f475508i;
                sb6.append(d1Var3 != null ? java.lang.Long.valueOf(d1Var3.f216985d) : null);
                sb6.append(", sessionInfo invalid and ignore");
                com.tencent.mars.xlog.Log.w("MicroMsg.AffScanDecodeQueue", sb6.toString());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", "onDecodeSuccessInner cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
        return jz5.f0.f302826a;
    }
}
