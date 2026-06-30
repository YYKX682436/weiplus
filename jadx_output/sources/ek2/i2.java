package ek2;

/* loaded from: classes3.dex */
public final class i2 extends ek2.g0 {
    public final ek2.h2 A;
    public final org.json.JSONObject B;
    public final r45.g82 C;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253466u;

    /* renamed from: v, reason: collision with root package name */
    public final int f253467v;

    /* renamed from: w, reason: collision with root package name */
    public final int f253468w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f253469x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f253470y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f253471z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(long j17, long j18, java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, java.lang.String sendGiftTargetUserName, r45.qt2 qt2Var, java.lang.String str5, int i19, com.tencent.mm.protobuf.g gVar, byte[] bArr, java.lang.Integer num, java.util.List prepareRewardSendInfo, java.lang.String str6, java.lang.String str7, ek2.h2 h2Var) {
        super(null, 1, null);
        boolean z17;
        r45.yi6 Q0;
        gk2.e eVar;
        kotlinx.coroutines.flow.f3 f3Var;
        r45.a84 a84Var;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> list;
        kotlin.jvm.internal.o.g(sendGiftTargetUserName, "sendGiftTargetUserName");
        kotlin.jvm.internal.o.g(prepareRewardSendInfo, "prepareRewardSendInfo");
        this.f253466u = str;
        this.f253467v = i17;
        this.f253468w = i19;
        this.f253469x = prepareRewardSendInfo;
        this.f253470y = str6;
        this.f253471z = str7;
        this.A = h2Var;
        this.B = new org.json.JSONObject();
        r45.g82 g82Var = new r45.g82();
        this.C = g82Var;
        int i27 = i18 * i17;
        g82Var.set(1, db2.t4.f228171a.b(5891, qt2Var));
        if (num != null) {
            int intValue = num.intValue();
            r45.kv0 kv0Var = (r45.kv0) g82Var.getCustom(1);
            if (kv0Var != null) {
                kv0Var.set(6, java.lang.Integer.valueOf(intValue));
            }
        }
        g82Var.set(4, java.lang.Long.valueOf(j17));
        g82Var.set(3, java.lang.Long.valueOf(j18));
        g82Var.set(5, str);
        g82Var.set(6, java.lang.Integer.valueOf(i17));
        g82Var.set(7, java.lang.Integer.valueOf(i27));
        g82Var.set(2, str2);
        g82Var.set(8, str3);
        g82Var.set(9, str4);
        if (!(sendGiftTargetUserName.length() == 0) && (eVar = dk2.ef.I) != null && (f3Var = ((mm2.n0) eVar.a(mm2.n0.class)).f329271p) != null && (a84Var = (r45.a84) ((kotlinx.coroutines.flow.l2) f3Var).getValue()) != null && (list = a84Var.getList(1)) != null && !list.isEmpty()) {
            for (com.tencent.mm.protocal.protobuf.FinderContact finderContact : list) {
                if (kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, sendGiftTargetUserName)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            this.C.set(21, sendGiftTargetUserName);
        } else {
            this.C.set(12, sendGiftTargetUserName);
        }
        this.C.set(13, str5);
        this.C.set(14, java.lang.Integer.valueOf(this.f253468w));
        this.C.set(15, gVar);
        this.C.set(18, this.f253470y);
        this.C.set(17, this.f253471z);
        this.C.set(10, com.tencent.mm.protobuf.g.b(bArr));
        java.util.LinkedList list2 = this.C.getList(16);
        java.util.List list3 = this.f253469x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list3) {
            r45.e82 e82Var = ((com.tencent.mm.plugin.finder.live.plugin.fo0) obj).f112581b;
            if ((e82Var == null || e82Var.getByteString(1) == null) ? false : true) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r45.e82 e82Var2 = ((com.tencent.mm.plugin.finder.live.plugin.fo0) it.next()).f112581b;
            arrayList2.add(e82Var2 != null ? e82Var2.getByteString(1) : null);
        }
        list2.addAll(arrayList2);
        java.util.List list4 = this.f253469x;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list4) {
            r45.e82 e82Var3 = ((com.tencent.mm.plugin.finder.live.plugin.fo0) obj2).f112581b;
            if ((e82Var3 == null || e82Var3.getList(3) == null) ? false : true) {
                arrayList3.add(obj2);
            }
        }
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.finder.live.plugin.fo0 fo0Var = (com.tencent.mm.plugin.finder.live.plugin.fo0) it6.next();
            java.util.LinkedList list5 = this.C.getList(20);
            r45.e82 e82Var4 = fo0Var.f112581b;
            java.util.List list6 = e82Var4 != null ? e82Var4.getList(3) : null;
            if (list6 == null) {
                list6 = kz5.p0.f313996d;
            }
            list5.addAll(list6);
        }
        this.B.put("reward_product_id", this.C.getString(5));
        this.B.put("reward_product_count", this.C.getInteger(6));
        ce2.i e17 = dk2.u7.f234181a.e(this.f253466u);
        java.lang.String string = (e17 == null || (Q0 = e17.Q0()) == null) ? null : Q0.getString(0);
        this.C.set(19, string);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId:");
        sb6.append(j17);
        sb6.append(" objectId:");
        sb6.append(j18);
        sb6.append(" rewardProductId:");
        sb6.append(this.f253466u);
        sb6.append(" rewardProductCount:");
        sb6.append(this.f253467v);
        sb6.append(" fromUser:");
        sb6.append(str2);
        sb6.append(" toUser:");
        sb6.append(sendGiftTargetUserName);
        sb6.append(" isCoAuthor:");
        sb6.append(z17);
        sb6.append(" requestId:");
        sb6.append(str3);
        sb6.append(" wecoin:");
        sb6.append(i18);
        sb6.append(",amountPrice:");
        sb6.append(i27);
        sb6.append(", reward_type:");
        sb6.append(this.f253468w);
        sb6.append(",reward_ext_info:");
        sb6.append(gVar != null ? gVar.i() : null);
        sb6.append(",live_identity:");
        r45.kv0 kv0Var2 = (r45.kv0) this.C.getCustom(1);
        sb6.append(kv0Var2 != null ? java.lang.Integer.valueOf(kv0Var2.getInteger(6)) : null);
        sb6.append(", pkgBatchId:");
        sb6.append(this.f253470y);
        sb6.append(", pkgDurationId:");
        sb6.append(this.f253471z);
        sb6.append(", skinId:");
        sb6.append(string);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveReward", sb6.toString());
        w04.l.INSTANCE.Ch(540999695, 7);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = this.C;
        r45.h82 h82Var = new r45.h82();
        h82Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) h82Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = h82Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivereward";
        lVar.f70667d = 5891;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        int i27;
        dk2.f4 f4Var;
        r45.h82 resp = (r45.h82) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveReward", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.h2 h2Var = this.A;
        if (h2Var != null) {
            dk2.f4 f4Var2 = (dk2.f4) h2Var;
            com.tencent.mars.xlog.Log.i("FinderLiveAssistant2", "doPostGift errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str + ", bill_no:" + resp.getString(1));
            com.tencent.mm.plugin.finder.assist.y8.f102732a.d(f4Var2.f233434a);
            com.tencent.mm.plugin.finder.live.plugin.jp jpVar = f4Var2.f233435b;
            if (i18 == 0 || i18 == -200042) {
                i19 = 3;
                com.tencent.mm.protobuf.g byteString = resp.getByteString(2);
                byte[] g17 = byteString != null ? byteString.g() : null;
                java.lang.String str2 = f4Var2.f233439f;
                int i28 = f4Var2.f233440g;
                java.lang.String str3 = f4Var2.f233441h;
                dk2.b4 b4Var = new dk2.b4(jpVar, str2, i28, str3);
                dk2.d4 d4Var = new dk2.d4(jpVar, str2, i28, str3);
                dk2.e4 e4Var = new dk2.e4(jpVar, str2, i28, str3);
                com.tencent.mars.xlog.Log.i("FinderLiveAssistant2", "[WeCoin] sessionID:" + f4Var2.f233436c + " consumeGift:" + g17 + " businessId:" + f4Var2.f233438e);
                android.content.Context context = f4Var2.f233437d;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                pr4.l lVar = new pr4.l(1, (androidx.fragment.app.FragmentActivity) context, b4Var, d4Var, e4Var);
                if (g17 == null) {
                    g17 = new byte[0];
                }
                lVar.f358026g = g17;
                ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
                new ls4.u(lVar).f();
            } else {
                if (jpVar != null) {
                    i27 = 1;
                    f4Var = f4Var2;
                    i19 = 3;
                    com.tencent.mm.plugin.finder.live.plugin.jp.b(jpVar, false, i18, com.tencent.mm.plugin.finder.live.plugin.ip.f113001e, null, null, 0, null, str, null, 272, null);
                } else {
                    i27 = 1;
                    f4Var = f4Var2;
                    i19 = 3;
                }
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(22129, java.lang.Integer.valueOf(i27), f4Var.f233436c, "", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), str);
                g0Var.B(com.tencent.mm.plugin.finder.assist.y8.f102739h, 80L);
            }
        } else {
            i19 = 3;
        }
        zl2.r4.f473950a.l1(i17, i18, (r45.qp1) resp.getCustom(i19), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
    }

    @Override // az2.j
    public java.util.List s() {
        return kz5.b0.c(new jz5.l("reward_type", java.lang.String.valueOf(this.C.getInteger(14))));
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.B;
    }
}
