package i64;

/* loaded from: classes4.dex */
public class m0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f289235d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f289236e;

    /* renamed from: f, reason: collision with root package name */
    public final int f289237f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x028e A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x040c A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03c3 A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03aa A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x031e A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x030c A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0294 A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m0(java.lang.String r22, int r23, int r24, int r25, r45.e3 r26, r45.h3 r27, int r28, java.lang.String r29, int r30, int r31, int r32, int r33, int r34, com.tencent.mm.protobuf.g r35, com.tencent.mm.protobuf.g r36, java.lang.String r37, i64.w r38) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i64.m0.<init>(java.lang.String, int, int, int, r45.e3, r45.h3, int, java.lang.String, int, int, int, int, int, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, java.lang.String, i64.w):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        this.f289236e = u0Var;
        int dispatch = dispatch(sVar, this.f289235d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        return 1231;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        int i27 = this.f289237f;
        if (i18 != 0 || i19 != 0) {
            if (i27 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2044, 2);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2044, 4);
            }
        }
        r45.g3 g3Var = (r45.g3) this.f289235d.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAdExposure", "netId=" + i17 + ", errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str + ", reportExposureType=" + i27 + ", resp=" + g3Var.f374847d + ", msg=" + g3Var.f374848e);
        this.f289236e.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
    }
}
