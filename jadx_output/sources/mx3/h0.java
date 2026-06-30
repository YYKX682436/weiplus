package mx3;

/* loaded from: classes10.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332569d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332571f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332571f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mx3.h0 h0Var = new mx3.h0(this.f332571f, continuation);
        h0Var.f332570e = obj;
        return h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx3.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        if (com.tencent.mm.vfs.w6.k(r5.h()) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (r14 == r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        if (com.tencent.mm.vfs.w6.k(r4.h()) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        if (r14 == r0) goto L63;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx3.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
