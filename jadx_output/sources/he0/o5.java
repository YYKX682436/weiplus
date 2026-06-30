package he0;

/* loaded from: classes4.dex */
public class o5 extends com.tencent.mm.sdk.event.n {
    public o5() {
        super(0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:(2:38|(3:40|41|(32:46|47|48|49|50|51|52|53|54|(1:56)|57|(2:59|(19:61|62|(1:66)(1:99)|67|(1:69)(1:98)|70|(1:72)(1:97)|73|(1:75)(1:96)|76|(1:78)(1:95)|79|(1:81)(1:94)|82|(1:84)(1:93)|85|(1:87)(2:90|(1:92))|88|89))|100|62|(18:64|66|67|(0)(0)|70|(0)(0)|73|(0)(0)|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|89)|99|67|(0)(0)|70|(0)(0)|73|(0)(0)|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|89)(1:45)))(1:116)|47|48|49|50|51|52|53|54|(0)|57|(0)|100|62|(0)|99|67|(0)(0)|70|(0)(0)|73|(0)(0)|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|89) */
    /* JADX WARN: Can't wrap try/catch for region: R(41:28|(2:30|(1:32))(1:118)|33|(1:35)(1:117)|36|(2:38|(3:40|41|(32:46|47|48|49|50|51|52|53|54|(1:56)|57|(2:59|(19:61|62|(1:66)(1:99)|67|(1:69)(1:98)|70|(1:72)(1:97)|73|(1:75)(1:96)|76|(1:78)(1:95)|79|(1:81)(1:94)|82|(1:84)(1:93)|85|(1:87)(2:90|(1:92))|88|89))|100|62|(18:64|66|67|(0)(0)|70|(0)(0)|73|(0)(0)|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|89)|99|67|(0)(0)|70|(0)(0)|73|(0)(0)|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|89)(1:45)))(1:116)|115|41|(1:43)|46|47|48|49|50|51|52|53|54|(0)|57|(0)|100|62|(0)|99|67|(0)(0)|70|(0)(0)|73|(0)(0)|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|89) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0302, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x031e, code lost:
    
        r7 = r60;
        r22 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x037a, code lost:
    
        com.tencent.mars.xlog.Log.e(r15, "cleanSnsTablesByTimeLimit calcDbExpire delete cancel, e:%s.", r0);
        r9 = 150;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(150, 117);
        r14.f60473d = 6;
        r1.D("SnsMMKVCleanDbReport", r14.m());
        r0 = r2;
        r22 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0300, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x032b, code lost:
    
        com.tencent.mars.xlog.Log.e(r15, "cleanSnsTablesByTimeLimit calcDbExpire delete failed, e:%s.", r0);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(150, 114);
        com.tencent.mm.plugin.sns.model.l4.Ej().p1();
        r14.f60473d = 3;
        r14.f60478i = android.os.SystemClock.uptimeMillis() - r18;
        r14.k();
        r1.A("SnsMMKVCleanDbFailTime", r38 + 1);
        r1.D("SnsMMKVCleanDbReport", r60);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanSnsTablesByTimeLimit", "com.tencent.mm.plugin.sns.clean.SnsCleanStorageManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0304, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0305, code lost:
    
        r38 = r11;
        r60 = "";
        r50 = r14;
        r56 = "SnsMMKVCleanDbIsFirstTime";
        r59 = "SnsMicroMsg.db";
        r54 = r34;
        r57 = r40;
        r28 = r44;
        r40 = r1;
        r15 = "MicroMsg.SnsCleanStorageManager";
        r14 = r9;
        r22 = r10 ? 1 : 0;
        r1 = r12;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0361, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0362, code lost:
    
        r38 = r11;
        r50 = r14;
        r56 = "SnsMMKVCleanDbIsFirstTime";
        r59 = "SnsMicroMsg.db";
        r54 = r34;
        r57 = r40;
        r28 = r44;
        r40 = r1;
        r15 = "MicroMsg.SnsCleanStorageManager";
        r14 = r9;
        r22 = r10 ? 1 : 0;
        r1 = r12;
        r7 = "";
        r2 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0447  */
    @Override // com.tencent.mm.sdk.event.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean callback(com.tencent.mm.sdk.event.IEvent r71) {
        /*
            Method dump skipped, instructions count: 1385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: he0.o5.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
