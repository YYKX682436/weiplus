package pr0;

/* loaded from: classes14.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357891d;

    /* renamed from: e, reason: collision with root package name */
    public int f357892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pr0.n0 f357893f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f357894g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f357895h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(pr0.n0 n0Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357893f = n0Var;
        this.f357894g = i17;
        this.f357895h = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.m0(this.f357893f, this.f357894g, this.f357895h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
