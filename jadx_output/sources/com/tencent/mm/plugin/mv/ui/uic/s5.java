package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class s5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f151439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.z5 f151440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.q f151441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(com.tencent.mm.plugin.mv.ui.uic.z5 z5Var, fm3.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151440e = z5Var;
        this.f151441f = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.uic.s5(this.f151440e, this.f151441f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.mv.ui.uic.s5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0102, code lost:
    
        if (kotlin.jvm.internal.o.b(((fm3.p) r9).f264096b, ((fm3.p) r10).f264096b) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011b, code lost:
    
        if (kotlin.jvm.internal.o.b(r5.a(), r8.a()) != false) goto L42;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.s5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
