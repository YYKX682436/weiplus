package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f171391d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f171392e;

    /* renamed from: f, reason: collision with root package name */
    public int f171393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym3.c f171394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.m0 f171395h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f171396i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ym3.c cVar, com.tencent.mm.plugin.sns.ui.wsfold.m0 m0Var, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171394g = cVar;
        this.f171395h = m0Var;
        this.f171396i = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$getData$1");
        com.tencent.mm.plugin.sns.ui.wsfold.j0 j0Var = new com.tencent.mm.plugin.sns.ui.wsfold.j0(this.f171394g, this.f171395h, this.f171396i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$getData$1");
        return j0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$getData$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$getData$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.wsfold.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$getData$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$getData$1");
        return invokeSuspend;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:161|(1:163)(2:271|(1:273)(1:274))|164|(2:166|(1:(2:169|(2:171|(1:173)(1:266))(1:267))(1:268))(1:269))(1:270)|174|(1:176)(3:243|(23:(24:246|(2:248|(23:250|(2:254|(2:256|(2:258|(1:260))))|262|178|179|180|181|182|183|(1:239)(10:186|187|188|189|190|191|192|193|(4:195|196|197|198)(1:228)|199)|200|(1:202)(1:223)|203|(1:205)|206|(1:208)|209|(1:211)|212|(1:214)|215|216|217))|263|178|179|180|181|182|183|(0)|239|200|(0)(0)|203|(0)|206|(0)|209|(0)|212|(0)|215|216|217)|264|178|179|180|181|182|183|(0)|239|200|(0)(0)|203|(0)|206|(0)|209|(0)|212|(0)|215|216|217)|265)|177|178|179|180|181|182|183|(0)|239|200|(0)(0)|203|(0)|206|(0)|209|(0)|212|(0)|215|216|217) */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x02fd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x02fe, code lost:
    
        r31 = r3;
        r30 = r4;
        r27 = "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail";
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x019d, code lost:
    
        if (r1 != 11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x07cf, code lost:
    
        if (r0 != r1) goto L251;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0276 A[Catch: all -> 0x023d, TryCatch #12 {all -> 0x023d, blocks: (B:198:0x0236, B:199:0x0247, B:200:0x026c, B:202:0x0276, B:203:0x028e, B:205:0x0294, B:206:0x02a3, B:208:0x02b2, B:209:0x02bc, B:211:0x02c6, B:212:0x02cc, B:214:0x02d2, B:215:0x02d8, B:223:0x0285), top: B:197:0x0236 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0294 A[Catch: all -> 0x023d, TryCatch #12 {all -> 0x023d, blocks: (B:198:0x0236, B:199:0x0247, B:200:0x026c, B:202:0x0276, B:203:0x028e, B:205:0x0294, B:206:0x02a3, B:208:0x02b2, B:209:0x02bc, B:211:0x02c6, B:212:0x02cc, B:214:0x02d2, B:215:0x02d8, B:223:0x0285), top: B:197:0x0236 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b2 A[Catch: all -> 0x023d, TryCatch #12 {all -> 0x023d, blocks: (B:198:0x0236, B:199:0x0247, B:200:0x026c, B:202:0x0276, B:203:0x028e, B:205:0x0294, B:206:0x02a3, B:208:0x02b2, B:209:0x02bc, B:211:0x02c6, B:212:0x02cc, B:214:0x02d2, B:215:0x02d8, B:223:0x0285), top: B:197:0x0236 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c6 A[Catch: all -> 0x023d, TryCatch #12 {all -> 0x023d, blocks: (B:198:0x0236, B:199:0x0247, B:200:0x026c, B:202:0x0276, B:203:0x028e, B:205:0x0294, B:206:0x02a3, B:208:0x02b2, B:209:0x02bc, B:211:0x02c6, B:212:0x02cc, B:214:0x02d2, B:215:0x02d8, B:223:0x0285), top: B:197:0x0236 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d2 A[Catch: all -> 0x023d, TryCatch #12 {all -> 0x023d, blocks: (B:198:0x0236, B:199:0x0247, B:200:0x026c, B:202:0x0276, B:203:0x028e, B:205:0x0294, B:206:0x02a3, B:208:0x02b2, B:209:0x02bc, B:211:0x02c6, B:212:0x02cc, B:214:0x02d2, B:215:0x02d8, B:223:0x0285), top: B:197:0x0236 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0285 A[Catch: all -> 0x023d, TryCatch #12 {all -> 0x023d, blocks: (B:198:0x0236, B:199:0x0247, B:200:0x026c, B:202:0x0276, B:203:0x028e, B:205:0x0294, B:206:0x02a3, B:208:0x02b2, B:209:0x02bc, B:211:0x02c6, B:212:0x02cc, B:214:0x02d2, B:215:0x02d8, B:223:0x0285), top: B:197:0x0236 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06b8  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instructions count: 2021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.wsfold.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
