package gx0;

/* loaded from: classes5.dex */
public final class q8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f276878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f276879g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(gx0.w8 w8Var, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276877e = w8Var;
        this.f276878f = z17;
        this.f276879g = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.q8(this.f276877e, this.f276878f, this.f276879g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.q8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x010a A[Catch: all -> 0x0134, TryCatch #0 {all -> 0x0134, blocks: (B:9:0x0100, B:11:0x010a, B:12:0x0119, B:14:0x0121, B:15:0x012f), top: B:8:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0121 A[Catch: all -> 0x0134, TryCatch #0 {all -> 0x0134, blocks: (B:9:0x0100, B:11:0x010a, B:12:0x0119, B:14:0x0121, B:15:0x012f), top: B:8:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.q8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
