package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f215106d;

    /* renamed from: e, reason: collision with root package name */
    public int f215107e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f215108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v1 f215109g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215110h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f215109g = v1Var;
        this.f215110h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.zoomimage.subsampling.internal.u1 u1Var = new com.tencent.mm.zoomimage.subsampling.internal.u1(this.f215109g, this.f215110h, continuation);
        u1Var.f215108f = obj;
        return u1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.zoomimage.subsampling.internal.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x040c, code lost:
    
        r14.f215141s.getClass();
        r0 = r23;
        r5 = r25;
        r5.f215108f = r0;
        r5.f215106d = r4;
        r1 = true;
        r5.f215107e = 1;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0424, code lost:
    
        if (kotlinx.coroutines.k1.b(8, r5) != r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0426, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0427, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x043e, code lost:
    
        r7.f215123a.d(new com.tencent.mm.zoomimage.subsampling.internal.t1(r5.f215110h, r4, r2, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x044e, code lost:
    
        return jz5.f0.f302826a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0175, code lost:
    
        throw new java.lang.IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x0427 -> B:5:0x0428). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.zoomimage.subsampling.internal.u1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
