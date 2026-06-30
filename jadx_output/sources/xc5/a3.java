package xc5;

/* loaded from: classes12.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f453387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f453388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453389f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xc5.e3 f453390g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453391h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f453392i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f453393m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.storage.f9 f9Var, java.lang.String str, xc5.e3 e3Var, java.lang.String str2, yz5.l lVar, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453388e = f9Var;
        this.f453389f = str;
        this.f453390g = e3Var;
        this.f453391h = str2;
        this.f453392i = lVar;
        this.f453393m = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.a3(this.f453388e, this.f453389f, this.f453390g, this.f453391h, this.f453392i, this.f453393m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.a3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x013e, code lost:
    
        t21.d3.N(r0, (int) com.tencent.mm.vfs.w6.k(((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(r12, false)));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.a3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
