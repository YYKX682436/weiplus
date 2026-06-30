package rx3;

/* loaded from: classes10.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f401073d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f401074e;

    /* renamed from: f, reason: collision with root package name */
    public int f401075f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f401076g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f401077h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rx3.z f401078i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f401079m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z17, rx3.z zVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401077h = z17;
        this.f401078i = zVar;
        this.f401079m = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        rx3.x xVar = new rx3.x(this.f401077h, this.f401078i, this.f401079m, continuation);
        xVar.f401076g = obj;
        return xVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:8:0x0021, B:10:0x010c, B:17:0x0034, B:19:0x009b, B:20:0x00b7, B:22:0x00bd, B:25:0x00d1, B:30:0x00d5, B:31:0x00e4, B:33:0x00ea, B:35:0x00fc, B:40:0x003f, B:44:0x0074, B:51:0x004f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea A[Catch: Exception -> 0x0043, LOOP:1: B:31:0x00e4->B:33:0x00ea, LOOP_END, TryCatch #0 {Exception -> 0x0043, blocks: (B:8:0x0021, B:10:0x010c, B:17:0x0034, B:19:0x009b, B:20:0x00b7, B:22:0x00bd, B:25:0x00d1, B:30:0x00d5, B:31:0x00e4, B:33:0x00ea, B:35:0x00fc, B:40:0x003f, B:44:0x0074, B:51:0x004f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx3.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
