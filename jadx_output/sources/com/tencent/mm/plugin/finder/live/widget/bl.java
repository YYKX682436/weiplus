package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117899d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f117900e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f117901f;

    /* renamed from: g, reason: collision with root package name */
    public int f117902g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f117903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hl f117904i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f117905m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.d42 f117906n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ug2.a f117907o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(com.tencent.mm.plugin.finder.live.widget.hl hlVar, boolean z17, r45.d42 d42Var, ug2.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117904i = hlVar;
        this.f117905m = z17;
        this.f117906n = d42Var;
        this.f117907o = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.widget.bl blVar = new com.tencent.mm.plugin.finder.live.widget.bl(this.f117904i, this.f117905m, this.f117906n, this.f117907o, continuation);
        blVar.f117903h = obj;
        return blVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.bl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x024c, code lost:
    
        if (((r25 == null || r25.isEmpty()) ? true : r7) != false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0199 A[Catch: CancellationException -> 0x0445, TryCatch #2 {CancellationException -> 0x0445, blocks: (B:71:0x0092, B:73:0x00a8, B:74:0x00ad, B:77:0x00d4, B:80:0x00e0, B:81:0x0104, B:83:0x012f, B:85:0x0138, B:86:0x0146, B:88:0x014c, B:89:0x0156, B:93:0x0165, B:96:0x016e, B:98:0x018d, B:103:0x0199, B:104:0x0202, B:107:0x020c, B:110:0x0219, B:112:0x0223, B:116:0x022d, B:120:0x0242, B:126:0x024e, B:128:0x0261, B:129:0x0279, B:132:0x0297, B:138:0x02c4, B:140:0x02cf, B:145:0x02db, B:147:0x02e1, B:152:0x02ed, B:154:0x0325, B:166:0x00ed, B:169:0x00f9), top: B:70:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0438 A[Catch: CancellationException -> 0x0446, TryCatch #3 {CancellationException -> 0x0446, blocks: (B:9:0x0027, B:11:0x0421, B:13:0x0438, B:15:0x043f, B:29:0x03f6), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cf A[Catch: CancellationException -> 0x0445, TryCatch #2 {CancellationException -> 0x0445, blocks: (B:71:0x0092, B:73:0x00a8, B:74:0x00ad, B:77:0x00d4, B:80:0x00e0, B:81:0x0104, B:83:0x012f, B:85:0x0138, B:86:0x0146, B:88:0x014c, B:89:0x0156, B:93:0x0165, B:96:0x016e, B:98:0x018d, B:103:0x0199, B:104:0x0202, B:107:0x020c, B:110:0x0219, B:112:0x0223, B:116:0x022d, B:120:0x0242, B:126:0x024e, B:128:0x0261, B:129:0x0279, B:132:0x0297, B:138:0x02c4, B:140:0x02cf, B:145:0x02db, B:147:0x02e1, B:152:0x02ed, B:154:0x0325, B:166:0x00ed, B:169:0x00f9), top: B:70:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02db A[Catch: CancellationException -> 0x0445, TryCatch #2 {CancellationException -> 0x0445, blocks: (B:71:0x0092, B:73:0x00a8, B:74:0x00ad, B:77:0x00d4, B:80:0x00e0, B:81:0x0104, B:83:0x012f, B:85:0x0138, B:86:0x0146, B:88:0x014c, B:89:0x0156, B:93:0x0165, B:96:0x016e, B:98:0x018d, B:103:0x0199, B:104:0x0202, B:107:0x020c, B:110:0x0219, B:112:0x0223, B:116:0x022d, B:120:0x0242, B:126:0x024e, B:128:0x0261, B:129:0x0279, B:132:0x0297, B:138:0x02c4, B:140:0x02cf, B:145:0x02db, B:147:0x02e1, B:152:0x02ed, B:154:0x0325, B:166:0x00ed, B:169:0x00f9), top: B:70:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ed A[Catch: CancellationException -> 0x0445, TryCatch #2 {CancellationException -> 0x0445, blocks: (B:71:0x0092, B:73:0x00a8, B:74:0x00ad, B:77:0x00d4, B:80:0x00e0, B:81:0x0104, B:83:0x012f, B:85:0x0138, B:86:0x0146, B:88:0x014c, B:89:0x0156, B:93:0x0165, B:96:0x016e, B:98:0x018d, B:103:0x0199, B:104:0x0202, B:107:0x020c, B:110:0x0219, B:112:0x0223, B:116:0x022d, B:120:0x0242, B:126:0x024e, B:128:0x0261, B:129:0x0279, B:132:0x0297, B:138:0x02c4, B:140:0x02cf, B:145:0x02db, B:147:0x02e1, B:152:0x02ed, B:154:0x0325, B:166:0x00ed, B:169:0x00f9), top: B:70:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x043f A[Catch: CancellationException -> 0x0446, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0446, blocks: (B:9:0x0027, B:11:0x0421, B:13:0x0438, B:15:0x043f, B:29:0x03f6), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0420 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0390 A[Catch: CancellationException -> 0x0443, TryCatch #1 {CancellationException -> 0x0443, blocks: (B:38:0x005e, B:40:0x0368, B:43:0x038a, B:45:0x0390, B:46:0x03a8, B:48:0x03ae, B:49:0x03b9, B:51:0x03e0, B:57:0x0398, B:58:0x0371, B:60:0x0379, B:62:0x0079, B:64:0x0340, B:66:0x034a), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03ae A[Catch: CancellationException -> 0x0443, TryCatch #1 {CancellationException -> 0x0443, blocks: (B:38:0x005e, B:40:0x0368, B:43:0x038a, B:45:0x0390, B:46:0x03a8, B:48:0x03ae, B:49:0x03b9, B:51:0x03e0, B:57:0x0398, B:58:0x0371, B:60:0x0379, B:62:0x0079, B:64:0x0340, B:66:0x034a), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03e0 A[Catch: CancellationException -> 0x0443, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0443, blocks: (B:38:0x005e, B:40:0x0368, B:43:0x038a, B:45:0x0390, B:46:0x03a8, B:48:0x03ae, B:49:0x03b9, B:51:0x03e0, B:57:0x0398, B:58:0x0371, B:60:0x0379, B:62:0x0079, B:64:0x0340, B:66:0x034a), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0398 A[Catch: CancellationException -> 0x0443, TryCatch #1 {CancellationException -> 0x0443, blocks: (B:38:0x005e, B:40:0x0368, B:43:0x038a, B:45:0x0390, B:46:0x03a8, B:48:0x03ae, B:49:0x03b9, B:51:0x03e0, B:57:0x0398, B:58:0x0371, B:60:0x0379, B:62:0x0079, B:64:0x0340, B:66:0x034a), top: B:2:0x0019 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.h0] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30, types: [kotlin.jvm.internal.h0] */
    /* JADX WARN: Type inference failed for: r4v32, types: [kotlin.jvm.internal.h0] */
    /* JADX WARN: Type inference failed for: r4v33 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 1115
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.bl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
