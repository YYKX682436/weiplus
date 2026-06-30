package xc4;

/* loaded from: classes4.dex */
public class p extends dm.s6 {
    public static final /* synthetic */ int W1 = 0;
    public java.lang.Boolean C1;
    public java.lang.String D1;
    public java.lang.Boolean E1;
    public java.lang.String F1;
    public java.lang.String G1;
    public java.lang.Boolean H1;
    public java.lang.String I1;
    public java.lang.Boolean J1;
    public java.lang.Boolean K1;
    public java.lang.Boolean L1;
    public java.lang.CharSequence M1;
    public java.lang.Boolean N1;
    public java.lang.Boolean O1;
    public long S1;

    /* renamed from: y0, reason: collision with root package name */
    public final jz5.g f453368y0 = jz5.h.b(new xc4.j(this));

    /* renamed from: l1, reason: collision with root package name */
    public final jz5.g f453365l1 = jz5.h.b(new xc4.k(this));

    /* renamed from: p1, reason: collision with root package name */
    public final jz5.g f453366p1 = jz5.h.b(new xc4.m(this));

    /* renamed from: x1, reason: collision with root package name */
    public final jz5.g f453367x1 = jz5.h.b(new xc4.g(this));

    /* renamed from: y1, reason: collision with root package name */
    public final jz5.g f453369y1 = jz5.h.b(new xc4.h(this));

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f453370z1 = jz5.h.b(new xc4.e(this));
    public final jz5.g A1 = jz5.h.b(new xc4.f(this));
    public final jz5.g B1 = jz5.h.b(new xc4.l(this));
    public final jz5.g P1 = jz5.h.b(new xc4.i(this));
    public final jz5.g Q1 = jz5.h.b(new xc4.n(this));
    public final jz5.g R1 = jz5.h.b(new xc4.o(this));
    public final jz5.g T1 = jz5.h.b(new xc4.b(this));
    public final jz5.g U1 = jz5.h.b(new xc4.d(this));
    public final jz5.g V1 = jz5.h.b(new xc4.c(this));

    public p() {
        A0(0);
        F0(0);
    }

    public final int G0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emoticonCmtCnt", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.util.Iterator it = getCommentList().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (com.tencent.mm.plugin.sns.ui.widget.q2.f171251d.n((r45.e86) it.next())) {
                i17++;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emoticonCmtCnt", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return i17;
    }

    public final java.lang.String I0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAddressText", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (this.D1 == null) {
            n1();
        }
        java.lang.String str = this.D1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAddressText", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    public final java.lang.CharSequence J0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppNameText", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (this.M1 == null) {
            o1();
        }
        java.lang.CharSequence charSequence = this.M1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppNameText", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return charSequence;
    }

    public final com.tencent.mm.storage.z3 L0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContact", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(getUserName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContact", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return f07;
    }

    public final java.lang.String P0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentByteMd5", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (this.G1 == null) {
            this.G1 = kk.k.g(v0()) + kk.k.g(u0());
        }
        java.lang.String str = this.G1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentByteMd5", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    public final java.lang.String Q0() {
        java.lang.String userName;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        com.tencent.mm.storage.z3 L0 = L0();
        if (L0 == null || (userName = L0.g2()) == null) {
            userName = getUserName();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return userName;
    }

    public final r45.jj4 R0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFirstMedia", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.util.List a17 = qa4.f.a(h1());
        if (a17.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Improve.SnsInfo", "checkAndLoadThumb error,empty list");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFirstMedia", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            return null;
        }
        r45.jj4 jj4Var = (r45.jj4) kz5.n0.X(a17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFirstMedia", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return jj4Var;
    }

    public final hm5.c T0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeUserList", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.lang.Object value = ((jz5.n) this.U1).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        hm5.c cVar = (hm5.c) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeUserList", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return cVar;
    }

    public long U0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalIDNumber", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        long longValue = ((java.lang.Number) ((jz5.n) this.f453370z1).getValue()).longValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalIDNumber", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return longValue;
    }

    public final java.lang.String W0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalIDString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.lang.Object value = ((jz5.n) this.A1).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.String str = (java.lang.String) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalIDString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    public final java.lang.String Y0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainContent", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.lang.String str = (java.lang.String) ((jz5.n) this.f453367x1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainContent", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    public final java.lang.Boolean Z0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowGroupEnable", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (this.N1 == null) {
            this.N1 = java.lang.Boolean.FALSE;
            com.tencent.mm.protocal.protobuf.SnsObject d17 = d1();
            if (getUserName() != null && kotlin.jvm.internal.o.b(getUserName(), pc4.d.f353410a.o())) {
                boolean z17 = true;
                boolean z18 = (getLocalPrivate() & 1) != 0;
                int i17 = d17.ExtFlag;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                if ((i17 & 3) != 3 && (i17 & 5) != 5 && (i17 & 1025) != 1025 && (i17 & 513) != 513 && (i17 & 4097) != 4097) {
                    z17 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                if (z17 && !z18) {
                    this.N1 = java.lang.Boolean.TRUE;
                }
            }
        }
        java.lang.Boolean bool = this.N1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowGroupEnable", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return bool;
    }

    public final java.lang.String a1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsIDString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.lang.Object value = ((jz5.n) this.f453368y0).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.String str = (java.lang.String) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsIDString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    public final com.tencent.mm.plugin.sns.storage.SnsInfo c1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) ((jz5.n) this.f453365l1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return snsInfo;
    }

    public final com.tencent.mm.protocal.protobuf.SnsObject d1() {
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        java.util.Map map;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsObject", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        int i17 = com.tencent.mm.plugin.sns.model.s5.f164676d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        try {
            map = com.tencent.mm.plugin.sns.model.s5.f164678f;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
            snsObject = new com.tencent.mm.protocal.protobuf.SnsObject();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        }
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(P0())) {
            snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) ((java.util.concurrent.ConcurrentHashMap) map).get(P0());
            if (snsObject != null) {
                com.tencent.mm.plugin.sns.model.l4.xj().s(snsObject);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                kotlin.jvm.internal.o.f(snsObject, "getMergeSnsObject(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsObject", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                return snsObject;
            }
        }
        snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(u0());
        ((java.util.concurrent.ConcurrentHashMap) map).put(P0(), snsObject);
        com.tencent.mm.plugin.sns.model.l4.xj().s(snsObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        kotlin.jvm.internal.o.f(snsObject, "getMergeSnsObject(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsObject", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return snsObject;
    }

    public final java.lang.String e1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTableId", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.lang.Object value = ((jz5.n) this.B1).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.String str = (java.lang.String) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTableId", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    public final java.lang.String f1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.lang.String b17 = com.tencent.mm.plugin.sns.ui.os.b(com.tencent.mm.sdk.platformtools.x2.f193071a, getCreateTime() * 1000);
        kotlin.jvm.internal.o.f(b17, "formatSnsTimeInTimeLine(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return b17;
    }

    public final java.util.LinkedList getCommentList() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentList", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.lang.Object value = ((jz5.n) this.T1).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.util.LinkedList linkedList = (java.util.LinkedList) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentList", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return linkedList;
    }

    public final r45.kj4 getPostInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPostInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        r45.kj4 kj4Var = (r45.kj4) ((jz5.n) this.P1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPostInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return kj4Var;
    }

    public final com.tencent.mm.protocal.protobuf.TimeLineObject h1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineObject", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = (com.tencent.mm.protocal.protobuf.TimeLineObject) ((jz5.n) this.f453366p1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineObject", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return timeLineObject;
    }

    public final com.tencent.mm.plugin.sns.storage.s2 i1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWsFoldDetail", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        com.tencent.mm.plugin.sns.storage.s2 s2Var = (com.tencent.mm.plugin.sns.storage.s2) ((jz5.n) this.Q1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWsFoldDetail", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return s2Var;
    }

    public boolean isAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAd", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSourceExist", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        boolean z17 = (getSourceType() & 32) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSourceExist", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAd", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return z17;
    }

    public final boolean isDieItem() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDieItem", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        boolean z17 = (getLocalFlag() & 32) > 0 && y0() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDieItem", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return z17;
    }

    public final boolean isInValid() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInValid", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        boolean z17 = y0() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInValid", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (getPostInfo().S == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isSecurityNeedVerifyDieItem() {
        /*
            r4 = this;
            java.lang.String r0 = "isSecurityNeedVerifyDieItem"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r4.isDieItem()
            if (r2 == 0) goto L20
            r45.kj4 r2 = r4.getPostInfo()
            int r2 = r2.R
            r3 = 1
            if (r2 != r3) goto L20
            r45.kj4 r2 = r4.getPostInfo()
            boolean r2 = r2.S
            if (r2 != 0) goto L20
            goto L21
        L20:
            r3 = 0
        L21:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xc4.p.isSecurityNeedVerifyDieItem():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (getPostInfo().S != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isSecurityPassDieItem() {
        /*
            r4 = this;
            java.lang.String r0 = "isSecurityPassDieItem"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r4.isDieItem()
            if (r2 == 0) goto L20
            r45.kj4 r2 = r4.getPostInfo()
            int r2 = r2.R
            r3 = 1
            if (r2 != r3) goto L20
            r45.kj4 r2 = r4.getPostInfo()
            boolean r2 = r2.S
            if (r2 == 0) goto L20
            goto L21
        L20:
            r3 = 0
        L21:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xc4.p.isSecurityPassDieItem():boolean");
    }

    public final boolean isWsFold() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWsFold", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        boolean z17 = (getLocalFlag() & 1024) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWsFold", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return z17;
    }

    public final r45.qb6 j1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWsGroupStruct", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        r45.qb6 qb6Var = (r45.qb6) ((jz5.n) this.R1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWsGroupStruct", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return qb6Var;
    }

    public final int k1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("imageCmtCnt", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.util.Iterator it = getCommentList().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (com.tencent.mm.plugin.sns.ui.widget.q2.f171251d.o((r45.e86) it.next())) {
                i17++;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("imageCmtCnt", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return i17;
    }

    public final boolean l1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isMe", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (getUserName() == null || !kotlin.jvm.internal.o.b(getUserName(), pc4.d.f353410a.o())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMe", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMe", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return true;
    }

    public final void n1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupAddressInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        com.tencent.mm.protocal.protobuf.TimeLineObject h17 = h1();
        if (h17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupAddressInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            return;
        }
        r45.ed4 ed4Var = h17.Location;
        java.lang.String str = ed4Var != null ? ed4Var.f373313f : null;
        java.lang.String str2 = ed4Var != null ? ed4Var.f373314g : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            this.D1 = str;
            this.C1 = java.lang.Boolean.FALSE;
        } else {
            if (y0() == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str2 = str + (char) 183 + str2;
            }
            this.D1 = str2;
            this.C1 = java.lang.Boolean.TRUE;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupAddressInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0159, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0130, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o1() {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc4.p.o1():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p1() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc4.p.p1():void");
    }

    public final void q1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupWithUserInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        com.tencent.mm.protocal.protobuf.SnsObject d17 = d1();
        if (d17.WithUserList.size() > 0) {
            if (!kotlin.jvm.internal.o.b(pc4.d.f353410a.o(), d17.Username)) {
                java.util.Iterator<r45.e86> it = d17.WithUserList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(pc4.d.f353410a.o(), it.next().f373126d)) {
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        this.H1 = bool;
                        this.J1 = bool;
                        break;
                    }
                }
            } else {
                this.H1 = java.lang.Boolean.TRUE;
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                java.util.Iterator<r45.e86> it6 = d17.WithUserList.iterator();
                boolean z17 = false;
                while (it6.hasNext()) {
                    r45.e86 next = it6.next();
                    if (z17) {
                        stringBuffer.append(",  ");
                    } else {
                        stringBuffer.append("  ");
                        z17 = true;
                    }
                    java.lang.String str = next.f373127e;
                    if (str != null) {
                        stringBuffer.append(str);
                    } else {
                        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(next.f373126d);
                        stringBuffer.append(f07 == null ? next.f373126d : f07.g2());
                    }
                }
                this.I1 = stringBuffer.toString();
            }
        } else {
            this.H1 = java.lang.Boolean.FALSE;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupWithUserInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
    }

    @Override // dm.s6
    public void setCreateTime(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (i17 - getCreateTime() >= 180 || i17 - getCreateTime() < 0) {
            super.setCreateTime(i17);
            setHead(com.tencent.mm.plugin.sns.storage.SnsInfo.formatUnixTime(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        } else {
            if (getHead() == 0) {
                setHead(com.tencent.mm.plugin.sns.storage.SnsInfo.formatUnixTime(getCreateTime()));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        }
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.lang.String str = "ImproveInfo(name=" + Q0() + ", snsID='" + a1() + "', ad:" + isAd() + ", time:" + f1() + " rowid=" + U0() + ", createTime=" + getCreateTime() + " localFlag=" + getLocalFlag() + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }
}
