package sc5;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final sc5.f f406567a;

    /* renamed from: b, reason: collision with root package name */
    public static int f406568b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f406569c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f406570d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f406571e;

    static {
        sc5.f fVar = new sc5.f();
        f406567a = fVar;
        fVar.d();
        f406570d = new java.util.HashMap();
        f406571e = new java.util.HashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02de, code lost:
    
        if (r0 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02e1, code lost:
    
        if (r3 == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x030b, code lost:
    
        if (kotlin.jvm.internal.o.b(r1, c01.z1.r()) != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0241, code lost:
    
        if ((r0.field_hbType == 3 && kotlin.jvm.internal.o.b(c01.z1.r(), r0.field_exclusiveUsername)) != false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0191  */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map a(sc5.f r16, com.tencent.mm.storage.f9 r17, int r18) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc5.f.a(sc5.f, com.tencent.mm.storage.f9, int):java.util.Map");
    }

    public static final java.util.Set b(sc5.f fVar, java.lang.String str, java.util.HashMap hashMap) {
        fVar.getClass();
        java.lang.Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new java.util.LinkedHashSet();
            hashMap.put(str, obj);
        }
        return (java.util.Set) obj;
    }

    public static final void c(sc5.f fVar, java.lang.String str, java.util.Map map) {
        fVar.getClass();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, map, 36540);
    }

    public final void d() {
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChattingReportMsgRead());
        long j17 = 60;
        f406568b = (int) ((c17 * (j17 * (j17 * 1000))) / (1 * 1000));
        f406569c = c17 > 0;
    }

    public final void e(com.tencent.mm.storage.f9 msgInfo, int i17) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        if (f406569c) {
            if (i17 == 2) {
                f(kz5.b0.c(msgInfo));
            } else {
                if (g95.e0.i(msgInfo)) {
                    return;
                }
                ((ku5.t0) ku5.t0.f312615d).h(new sc5.c(msgInfo, i17), "ChatMsgReadReportManager");
            }
        }
    }

    public final void f(java.util.List msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        if (f406569c && !msgList.isEmpty()) {
            ((ku5.t0) ku5.t0.f312615d).h(new sc5.d(msgList), "ChatMsgReadReportManager");
        }
    }
}
