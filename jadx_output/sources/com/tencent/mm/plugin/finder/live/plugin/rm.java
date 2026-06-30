package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f114159d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f114160e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f114161f;

    /* renamed from: g, reason: collision with root package name */
    public int f114162g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f114163h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.bn f114164i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.d42 f114165m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ug2.a f114166n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(com.tencent.mm.plugin.finder.live.plugin.bn bnVar, r45.d42 d42Var, ug2.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114164i = bnVar;
        this.f114165m = d42Var;
        this.f114166n = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.rm rmVar = new com.tencent.mm.plugin.finder.live.plugin.rm(this.f114164i, this.f114165m, this.f114166n, continuation);
        rmVar.f114163h = obj;
        return rmVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.rm) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x019e, code lost:
    
        if ((r22 == null || r22.isEmpty()) != false) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0321 A[Catch: CancellationException -> 0x032d, TryCatch #1 {CancellationException -> 0x032d, blocks: (B:9:0x0026, B:11:0x0310, B:13:0x0321, B:15:0x0328, B:28:0x02e5), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0328 A[Catch: CancellationException -> 0x032d, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x032d, blocks: (B:9:0x0026, B:11:0x0310, B:13:0x0321, B:15:0x0328, B:28:0x02e5), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x030f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0279 A[Catch: CancellationException -> 0x032c, TryCatch #0 {CancellationException -> 0x032c, blocks: (B:37:0x005a, B:39:0x0251, B:42:0x0273, B:44:0x0279, B:45:0x0291, B:47:0x0297, B:48:0x02a2, B:50:0x02c7, B:57:0x0281, B:58:0x025a, B:60:0x0262, B:62:0x0071, B:64:0x0229, B:66:0x0233, B:70:0x0086, B:72:0x0098, B:73:0x009d, B:76:0x00b5, B:79:0x00c1, B:80:0x00e5, B:82:0x010d, B:84:0x0118, B:85:0x0127, B:87:0x012d, B:88:0x0137, B:92:0x0146, B:95:0x014f, B:98:0x015e, B:101:0x016b, B:103:0x0175, B:107:0x017f, B:111:0x0194, B:117:0x01a0, B:119:0x01b3, B:120:0x01cb, B:123:0x01e9, B:129:0x020e, B:139:0x00ce, B:142:0x00da), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0297 A[Catch: CancellationException -> 0x032c, TryCatch #0 {CancellationException -> 0x032c, blocks: (B:37:0x005a, B:39:0x0251, B:42:0x0273, B:44:0x0279, B:45:0x0291, B:47:0x0297, B:48:0x02a2, B:50:0x02c7, B:57:0x0281, B:58:0x025a, B:60:0x0262, B:62:0x0071, B:64:0x0229, B:66:0x0233, B:70:0x0086, B:72:0x0098, B:73:0x009d, B:76:0x00b5, B:79:0x00c1, B:80:0x00e5, B:82:0x010d, B:84:0x0118, B:85:0x0127, B:87:0x012d, B:88:0x0137, B:92:0x0146, B:95:0x014f, B:98:0x015e, B:101:0x016b, B:103:0x0175, B:107:0x017f, B:111:0x0194, B:117:0x01a0, B:119:0x01b3, B:120:0x01cb, B:123:0x01e9, B:129:0x020e, B:139:0x00ce, B:142:0x00da), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c7 A[Catch: CancellationException -> 0x032c, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x032c, blocks: (B:37:0x005a, B:39:0x0251, B:42:0x0273, B:44:0x0279, B:45:0x0291, B:47:0x0297, B:48:0x02a2, B:50:0x02c7, B:57:0x0281, B:58:0x025a, B:60:0x0262, B:62:0x0071, B:64:0x0229, B:66:0x0233, B:70:0x0086, B:72:0x0098, B:73:0x009d, B:76:0x00b5, B:79:0x00c1, B:80:0x00e5, B:82:0x010d, B:84:0x0118, B:85:0x0127, B:87:0x012d, B:88:0x0137, B:92:0x0146, B:95:0x014f, B:98:0x015e, B:101:0x016b, B:103:0x0175, B:107:0x017f, B:111:0x0194, B:117:0x01a0, B:119:0x01b3, B:120:0x01cb, B:123:0x01e9, B:129:0x020e, B:139:0x00ce, B:142:0x00da), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0281 A[Catch: CancellationException -> 0x032c, TryCatch #0 {CancellationException -> 0x032c, blocks: (B:37:0x005a, B:39:0x0251, B:42:0x0273, B:44:0x0279, B:45:0x0291, B:47:0x0297, B:48:0x02a2, B:50:0x02c7, B:57:0x0281, B:58:0x025a, B:60:0x0262, B:62:0x0071, B:64:0x0229, B:66:0x0233, B:70:0x0086, B:72:0x0098, B:73:0x009d, B:76:0x00b5, B:79:0x00c1, B:80:0x00e5, B:82:0x010d, B:84:0x0118, B:85:0x0127, B:87:0x012d, B:88:0x0137, B:92:0x0146, B:95:0x014f, B:98:0x015e, B:101:0x016b, B:103:0x0175, B:107:0x017f, B:111:0x0194, B:117:0x01a0, B:119:0x01b3, B:120:0x01cb, B:123:0x01e9, B:129:0x020e, B:139:0x00ce, B:142:0x00da), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012d A[Catch: CancellationException -> 0x032c, TryCatch #0 {CancellationException -> 0x032c, blocks: (B:37:0x005a, B:39:0x0251, B:42:0x0273, B:44:0x0279, B:45:0x0291, B:47:0x0297, B:48:0x02a2, B:50:0x02c7, B:57:0x0281, B:58:0x025a, B:60:0x0262, B:62:0x0071, B:64:0x0229, B:66:0x0233, B:70:0x0086, B:72:0x0098, B:73:0x009d, B:76:0x00b5, B:79:0x00c1, B:80:0x00e5, B:82:0x010d, B:84:0x0118, B:85:0x0127, B:87:0x012d, B:88:0x0137, B:92:0x0146, B:95:0x014f, B:98:0x015e, B:101:0x016b, B:103:0x0175, B:107:0x017f, B:111:0x0194, B:117:0x01a0, B:119:0x01b3, B:120:0x01cb, B:123:0x01e9, B:129:0x020e, B:139:0x00ce, B:142:0x00da), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015b  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.h0] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.rm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
