package ub2;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f426052d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f426053e;

    /* renamed from: f, reason: collision with root package name */
    public int f426054f;

    /* renamed from: g, reason: collision with root package name */
    public int f426055g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ub2.k f426056h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f426057i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ub2.k kVar, r45.h70 h70Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426056h = kVar;
        this.f426057i = h70Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ub2.h(this.f426056h, this.f426057i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ub2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c7 -> B:15:0x00ca). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub2.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
