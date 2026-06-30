package df2;

/* loaded from: classes3.dex */
public final class cc extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.jc f229876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(df2.jc jcVar, java.lang.String str, java.lang.Class cls) {
        super(cls);
        this.f229876b = jcVar;
        this.f229877c = str;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i("LiveAnchorDataPanelController", "checkPollingBannerData: onPollingFail, source=" + this.f229877c + " ret=" + i17 + ", errMsg=" + errMsg);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    @Override // dk2.cb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.tencent.mm.protobuf.f r10) {
        /*
            r9 = this;
            r45.qb2 r10 = (r45.qb2) r10
            java.lang.String r0 = "result"
            kotlin.jvm.internal.o.g(r10, r0)
            r0 = 0
            com.tencent.mm.protobuf.f r1 = r10.getCustom(r0)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r1
            r2 = 0
            if (r1 == 0) goto L27
            int r3 = r1.getBusiness_type()
            r4 = 79
            if (r3 != r4) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = r0
        L1c:
            if (r3 == 0) goto L1f
            goto L20
        L1f:
            r1 = r2
        L20:
            if (r1 == 0) goto L27
            r45.k74 r1 = r1.getLite_app_info()
            goto L28
        L27:
            r1 = r2
        L28:
            df2.jc r3 = r9.f229876b
            r3.f230467n = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "checkPollingBannerData: onPollingSuccess, source="
            r1.<init>(r4)
            java.lang.String r4 = r9.f229877c
            r1.append(r4)
            java.lang.String r4 = ", liteAppInfo="
            r1.append(r4)
            r45.k74 r3 = r3.f230467n
            r1.append(r3)
            java.lang.String r3 = ", business_type="
            r1.append(r3)
            com.tencent.mm.protobuf.f r3 = r10.getCustom(r0)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r3
            if (r3 == 0) goto L58
            int r3 = r3.getBusiness_type()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L59
        L58:
            r3 = r2
        L59:
            r1.append(r3)
            java.lang.String r3 = ", jumpId="
            r1.append(r3)
            com.tencent.mm.protobuf.f r10 = r10.getCustom(r0)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r10 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r10
            if (r10 == 0) goto L6e
            java.lang.String r10 = r10.getJump_id()
            goto L6f
        L6e:
            r10 = r2
        L6f:
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            java.lang.String r0 = "LiveAnchorDataPanelController"
            com.tencent.mars.xlog.Log.i(r0, r10)
            df2.jc r3 = r9.f229876b
            r4 = 0
            r5 = 0
            df2.bc r6 = new df2.bc
            r6.<init>(r3, r2)
            r7 = 3
            r8 = 0
            com.tencent.mm.plugin.finder.live.util.y.o(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.cc.b(com.tencent.mm.protobuf.f):void");
    }
}
