package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f195255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f195256g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f195257h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f195258i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f195259m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f195260n;

    public r0(java.lang.String str, int i17, com.tencent.mm.storage.l4 l4Var, int i18, long j17, long j18, int i19, kotlin.jvm.internal.h0 h0Var) {
        this.f195253d = str;
        this.f195254e = i17;
        this.f195255f = l4Var;
        this.f195256g = i18;
        this.f195257h = j17;
        this.f195258i = j18;
        this.f195259m = i19;
        this.f195260n = h0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05a6 A[Catch: all -> 0x0728, TryCatch #2 {all -> 0x0728, blocks: (B:39:0x0189, B:176:0x01a7, B:99:0x04b4, B:101:0x058d, B:103:0x0593, B:104:0x0597, B:106:0x05a6, B:107:0x05af, B:109:0x06b4, B:111:0x06ba, B:112:0x06be, B:114:0x06c8, B:115:0x06d1), top: B:38:0x0189 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x06c8 A[Catch: all -> 0x0728, TryCatch #2 {all -> 0x0728, blocks: (B:39:0x0189, B:176:0x01a7, B:99:0x04b4, B:101:0x058d, B:103:0x0593, B:104:0x0597, B:106:0x05a6, B:107:0x05af, B:109:0x06b4, B:111:0x06ba, B:112:0x06be, B:114:0x06c8, B:115:0x06d1), top: B:38:0x0189 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0711 A[Catch: all -> 0x0726, TryCatch #0 {all -> 0x0726, blocks: (B:117:0x06f8, B:120:0x0701, B:122:0x0711, B:161:0x072f, B:164:0x073e, B:166:0x0748, B:167:0x074c), top: B:41:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020c A[Catch: all -> 0x072c, TryCatch #3 {all -> 0x072c, blocks: (B:94:0x0408, B:97:0x04aa, B:181:0x01ed, B:43:0x020c, B:45:0x0214, B:48:0x021e, B:50:0x0241, B:51:0x0245, B:53:0x024b, B:55:0x025b, B:56:0x025f, B:58:0x0267, B:60:0x026b, B:61:0x026f, B:62:0x02ca, B:64:0x02ce, B:65:0x02d2, B:67:0x02de, B:69:0x02e6, B:74:0x02f2, B:76:0x0305, B:79:0x0323, B:87:0x0375, B:89:0x03e1, B:91:0x03e9, B:92:0x03ec, B:131:0x0367, B:132:0x0338, B:133:0x0331, B:134:0x0320, B:138:0x0385, B:140:0x0391, B:144:0x03a6, B:145:0x03a8, B:151:0x03b1, B:153:0x03b5, B:154:0x03bb, B:155:0x03c2), top: B:41:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f2 A[Catch: all -> 0x072c, TryCatch #3 {all -> 0x072c, blocks: (B:94:0x0408, B:97:0x04aa, B:181:0x01ed, B:43:0x020c, B:45:0x0214, B:48:0x021e, B:50:0x0241, B:51:0x0245, B:53:0x024b, B:55:0x025b, B:56:0x025f, B:58:0x0267, B:60:0x026b, B:61:0x026f, B:62:0x02ca, B:64:0x02ce, B:65:0x02d2, B:67:0x02de, B:69:0x02e6, B:74:0x02f2, B:76:0x0305, B:79:0x0323, B:87:0x0375, B:89:0x03e1, B:91:0x03e9, B:92:0x03ec, B:131:0x0367, B:132:0x0338, B:133:0x0331, B:134:0x0320, B:138:0x0385, B:140:0x0391, B:144:0x03a6, B:145:0x03a8, B:151:0x03b1, B:153:0x03b5, B:154:0x03bb, B:155:0x03c2), top: B:41:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04a7  */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.tencent.mm.sdk.platformtools.o, com.tencent.mm.sdk.platformtools.v3, r01.k] */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.r0.run():void");
    }
}
