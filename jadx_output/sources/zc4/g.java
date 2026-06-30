package zc4;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzc4/g;", "Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lxc4/p;", "Ln75/b;", "dbProvider", "<init>", "(Ln75/b;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class g extends com.tencent.mm.sdk.storage.mvvm.MvvmStorage<xc4.p> {

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f471437h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n75.b dbProvider) {
        super(dbProvider);
        kotlin.jvm.internal.o.g(dbProvider, "dbProvider");
        this.f471437h = jz5.h.b(zc4.f.f471436d);
    }

    @Override // com.tencent.mm.sdk.storage.mvvm.MvvmStorage, l75.c1
    /* renamed from: O6 */
    public java.lang.String getF368356h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLogTag", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLogTag", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return "MicroMsg.Improve.DataFlow";
    }

    public final boolean X6(long j17, long j18, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteByLocalId", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        p75.m0 i18 = dm.s6.A.i(java.lang.Long.valueOf(j17));
        p75.n0 n0Var = dm.s6.f239848z;
        n0Var.getClass();
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.b();
        java.lang.String b17 = i18.b();
        java.lang.String[] e17 = i18.e();
        kotlin.jvm.internal.o.g(table, "table");
        l75.k0 Q4 = this.f193147g.Q4();
        boolean z17 = (Q4 != null ? Q4.delete(table, b17, e17) : -1) >= 0;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Improve.DataFlow", "deleteByLocalId localid:" + j17 + " result:" + z17, new java.lang.Object[0]);
        if (z17) {
            xc4.p pVar = new xc4.p();
            pVar.systemRowid = j17;
            pVar.setSnsId(j18);
            pVar.setCreateTime(i17);
            o75.b bVar = o75.b.f343581b;
            o75.b bVar2 = o75.b.f343584e;
            java.lang.String valueOf = java.lang.String.valueOf(j17);
            getF368356h();
            o75.c cVar = new o75.c(bVar2, valueOf, "MicroMsg.Improve.DataFlow");
            cVar.f343590d = pVar;
            dm.s6.f239847x0.notify(cVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteByLocalId", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return z17;
    }

    public final xc4.p Y6(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseImproveSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("snsId", java.lang.Long.valueOf(j17));
        xc4.p pVar = (xc4.p) T6(contentValues, kotlin.jvm.internal.i0.a(xc4.p.class));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseImproveSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return pVar;
    }

    public final xc4.p Z6(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseImproveSnsInfoByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("rowid", java.lang.Long.valueOf(j17));
        xc4.p pVar = (xc4.p) T6(contentValues, kotlin.jvm.internal.i0.a(xc4.p.class));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseImproveSnsInfoByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return pVar;
    }

    public final xc4.p a7(java.lang.String localId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseImproveSnsInfoByLocalIDStr", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        kotlin.jvm.internal.o.g(localId, "localId");
        if (!com.tencent.mm.plugin.sns.storage.w2.g(localId)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseImproveSnsInfoByLocalIDStr", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return null;
        }
        xc4.p Z6 = Z6(com.tencent.mm.plugin.sns.storage.w2.m(localId));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseImproveSnsInfoByLocalIDStr", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return Z6;
    }

    public final xc4.p b7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseImproveSnsInfoByPosition", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        p75.p0 p0Var = new p75.p0(dm.s6.C.z(), 2, 0);
        p75.i0 i18 = dm.s6.f239848z.i();
        i18.f352656c = "MicroMsg.Improve.DataFlow";
        i18.f352657d = p0Var;
        i18.e(new p75.g("createTime", false));
        i18.c(1, i17);
        java.util.List k17 = i18.a().k(this.f193147g.Q4(), xc4.p.class);
        if (((java.util.ArrayList) k17).isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseImproveSnsInfoByPosition", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return null;
        }
        xc4.p pVar = (xc4.p) kz5.n0.X(k17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseImproveSnsInfoByPosition", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return pVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:161|(1:163)|164|165|166|167|(2:168|169)|(3:214|215|(13:218|(16:219|220|221|222|223|224|225|226|227|228|229|230|(1:253)(6:234|235|236|237|238|239)|240|241|(1:244)(1:243))|245|172|173|174|175|(3:177|178|179)|182|183|184|(4:186|(2:189|187)|190|191)|193))|171|172|173|174|175|(0)|182|183|184|(0)|193) */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x044f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0450, code lost:
    
        com.tencent.mars.xlog.Log.e("AdExpireDeleteHelper", "checkContractAd deleteAdWithNoCheck exp=" + r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0424, code lost:
    
        if (r7 == null) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0432 A[Catch: all -> 0x044f, TryCatch #11 {all -> 0x044f, blocks: (B:184:0x042c, B:186:0x0432, B:187:0x0436, B:189:0x043c, B:191:0x044b), top: B:183:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0390 A[LOOP:4: B:219:0x02b5->B:243:0x0390, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x038d A[EDGE_INSN: B:244:0x038d->B:245:0x038d BREAK  A[LOOP:4: B:219:0x02b5->B:243:0x0390], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x063d A[LOOP:1: B:87:0x0481->B:93:0x063d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0637 A[EDGE_INSN: B:94:0x0637->B:95:0x0637 BREAK  A[LOOP:1: B:87:0x0481->B:93:0x063d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c7(ym3.c r46) {
        /*
            Method dump skipped, instructions count: 2177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc4.g.c7(ym3.c):java.util.List");
    }

    public final boolean d7(int i17, o75.b eventID) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postADInfoUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        kotlin.jvm.internal.o.g(eventID, "eventID");
        com.tencent.mm.plugin.sns.storage.AdSnsInfo L0 = com.tencent.mm.plugin.sns.model.l4.Vi().L0(i17);
        if (L0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postADInfoUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        xc4.p pVar = new xc4.p();
        pVar.convertFrom(L0.convertTo(), true);
        g7(pVar, eventID);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postADInfoUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }

    public final boolean e7(long j17, o75.b eventID) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postADInfoUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        kotlin.jvm.internal.o.g(eventID, "eventID");
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(j17);
        if (y07 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postADInfoUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        xc4.p pVar = new xc4.p();
        pVar.convertFrom(y07.convertTo(), true);
        g7(pVar, eventID);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postADInfoUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }

    public final void f7(com.tencent.mm.plugin.sns.storage.SnsInfo info, o75.b eventID) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postEvent", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(eventID, "eventID");
        xc4.p pVar = new xc4.p();
        pVar.convertFrom(info.convertTo(), true);
        java.lang.String valueOf = java.lang.String.valueOf(info.getPrimaryKeyValue());
        getF368356h();
        o75.c cVar = new o75.c(eventID, valueOf, "MicroMsg.Improve.DataFlow");
        cVar.f343590d = pVar;
        dm.s6.f239847x0.notify(cVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postEvent", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
    }

    public final void g7(xc4.p pVar, o75.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postEvent", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        java.lang.String valueOf = java.lang.String.valueOf(pVar.getPrimaryKeyValue());
        getF368356h();
        o75.c cVar = new o75.c(bVar, valueOf, "MicroMsg.Improve.DataFlow");
        cVar.f343590d = pVar;
        dm.s6.f239847x0.notify(cVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postEvent", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
    }

    public final boolean h7(long j17, o75.b eventID) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        kotlin.jvm.internal.o.g(eventID, "eventID");
        xc4.p Z6 = Z6(j17);
        if (Z6 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        g7(Z6, eventID);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }

    public final boolean i7(long j17, o75.b eventID) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        kotlin.jvm.internal.o.g(eventID, "eventID");
        xc4.p Y6 = Y6(j17);
        if (Y6 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        g7(Y6, eventID);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }

    public final boolean k7(long j17, r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postUpdateEventBySnsIDWithComment", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        if (e86Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postUpdateEventBySnsIDWithComment", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        xc4.p Y6 = Y6(j17);
        if (Y6 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postUpdateEventBySnsIDWithComment", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        Y6.D0(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        o75.b bVar = o75.b.f343581b;
        g7(Y6, o75.b.f343583d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postUpdateEventBySnsIDWithComment", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }
}
