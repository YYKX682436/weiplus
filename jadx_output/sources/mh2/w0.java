package mh2;

/* loaded from: classes10.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326481d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f326482e;

    /* renamed from: f, reason: collision with root package name */
    public int f326483f;

    /* renamed from: g, reason: collision with root package name */
    public int f326484g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ om2.d0 f326485h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f326486i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(om2.d0 d0Var, mh2.f1 f1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f326485h = d0Var;
        this.f326486i = f1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mh2.w0(this.f326485h, this.f326486i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mh2.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0091 -> B:12:0x0098). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
