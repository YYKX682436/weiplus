package nu0;

/* loaded from: classes5.dex */
public final class x3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f340140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f340142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f340143g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(nu0.b4 b4Var, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340141e = b4Var;
        this.f340142f = z17;
        this.f340143g = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.x3(this.f340141e, this.f340142f, this.f340143g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.x3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x012f A[Catch: all -> 0x0159, TryCatch #0 {all -> 0x0159, blocks: (B:9:0x0125, B:11:0x012f, B:12:0x013e, B:14:0x0146, B:15:0x0154), top: B:8:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0146 A[Catch: all -> 0x0159, TryCatch #0 {all -> 0x0159, blocks: (B:9:0x0125, B:11:0x012f, B:12:0x013e, B:14:0x0146, B:15:0x0154), top: B:8:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.x3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
