package ns4;

/* loaded from: classes8.dex */
public final class z1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f339688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f339689e;

    public z1(java.util.LinkedList linkedList, com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f339688d = linkedList;
        this.f339689e = weCoinIncomeDetailView;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    @Override // db5.t4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMMMenuItemSelected(android.view.MenuItem r11, int r12) {
        /*
            r10 = this;
            java.util.LinkedList r11 = r10.f339688d
            java.lang.Object r11 = kz5.n0.a0(r11, r12)
            r45.y94 r11 = (r45.y94) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select encash, index:"
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = ", bizEncashItem:"
            r0.append(r12)
            r12 = 0
            r1 = 0
            if (r11 == 0) goto L25
            int r2 = r11.getInteger(r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L26
        L25:
            r2 = r1
        L26:
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            r3 = 1
            if (r11 == 0) goto L36
            java.lang.String r4 = r11.getString(r3)
            goto L37
        L36:
            r4 = r1
        L37:
            r0.append(r4)
            r0.append(r2)
            r2 = 4
            if (r11 == 0) goto L47
            com.tencent.mm.protobuf.f r4 = r11.getCustom(r2)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r4
            goto L48
        L47:
            r4 = r1
        L48:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MicroMsg.WeCoinIncomeDetailView"
            com.tencent.mars.xlog.Log.i(r4, r0)
            if (r11 == 0) goto L5e
            int r0 = r11.getInteger(r12)
            if (r0 != r3) goto L5e
            r0 = r3
            goto L5f
        L5e:
            r0 = r12
        L5f:
            if (r0 == 0) goto L7a
            com.tencent.mm.protobuf.f r0 = r11.getCustom(r2)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r0
            if (r0 != 0) goto L78
            com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView r0 = r10.f339689e
            ms4.t r0 = r0.f179176s
            if (r0 == 0) goto L72
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f331120r
            goto L78
        L72:
            java.lang.String r11 = "mViewModel"
            kotlin.jvm.internal.o.o(r11)
            throw r1
        L78:
            r5 = r0
            goto L84
        L7a:
            if (r11 == 0) goto L83
            com.tencent.mm.protobuf.f r0 = r11.getCustom(r2)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r0
            goto L78
        L83:
            r5 = r1
        L84:
            com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView r4 = r10.f339689e
            if (r11 == 0) goto L8e
            r0 = 2
            long r6 = r11.getLong(r0)
            goto L90
        L8e:
            r6 = 0
        L90:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            if (r11 == 0) goto L9a
            int r12 = r11.getInteger(r12)
        L9a:
            r7 = r12
            if (r11 == 0) goto La1
            java.lang.String r1 = r11.getString(r3)
        La1:
            r8 = r1
            if (r11 == 0) goto Lab
            r12 = 3
            java.lang.String r11 = r11.getString(r12)
            if (r11 != 0) goto Lad
        Lab:
            java.lang.String r11 = ""
        Lad:
            r9 = r11
            int r11 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView.E
            r4.W6(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ns4.z1.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }
}
