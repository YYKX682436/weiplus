package xe2;

/* loaded from: classes3.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f453922d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f453923e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f453924f;

    /* renamed from: g, reason: collision with root package name */
    public int f453925g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ug2.a f453926h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xe2.b0 f453927i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f453928m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ug2.a aVar, xe2.b0 b0Var, java.lang.Integer num, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453926h = aVar;
        this.f453927i = b0Var;
        this.f453928m = num;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xe2.y(this.f453926h, this.f453927i, this.f453928m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xe2.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0302 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0304 A[Catch: Exception -> 0x02df, TryCatch #2 {Exception -> 0x02df, blocks: (B:12:0x02a7, B:15:0x02cc, B:16:0x02eb, B:22:0x0304, B:24:0x030b, B:26:0x032d, B:28:0x0341, B:60:0x0285), top: B:59:0x0285 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023d A[Catch: Exception -> 0x02e2, TryCatch #3 {Exception -> 0x02e2, blocks: (B:39:0x01d4, B:42:0x01fb, B:44:0x023d, B:46:0x0246, B:48:0x024f, B:50:0x0255, B:55:0x0261, B:93:0x01c7), top: B:92:0x01c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0261 A[Catch: Exception -> 0x02e2, TRY_LEAVE, TryCatch #3 {Exception -> 0x02e2, blocks: (B:39:0x01d4, B:42:0x01fb, B:44:0x023d, B:46:0x0246, B:48:0x024f, B:50:0x0255, B:55:0x0261, B:93:0x01c7), top: B:92:0x01c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
